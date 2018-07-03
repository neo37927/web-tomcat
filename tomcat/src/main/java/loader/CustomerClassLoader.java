package loader;

import java.io.*;

public class CustomerClassLoader extends ClassLoader{
    private String path;   //类的加载路径
    private String name;   //类加载器的名字

    public CustomerClassLoader() {}
    public CustomerClassLoader(String path,String name){
        this.path = path;
        this.name = name;
    }


    //用于寻找类文件
    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    //用于加载类文件
    private byte[] loadClassData(String name) {

        name = path + name + ".class";
        //使用输入流读取类文件
        InputStream in = null;
        //使用byteArrayOutputStream保存类文件。然后转化为byte数组
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ( (i = in.read()) != -1){
                out.write(i);
            }

        }catch (Exception e){}
        finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return out.toByteArray();

    }

    public String getName() {
        return name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static void main(String[] args) {
        CustomerClassLoader m1 = new CustomerClassLoader("/Users/xiaolin/","classLoad1");
        CustomerClassLoader m2 = new CustomerClassLoader("/Users/xiaolin/","classLoad2");

        Class c1 = m1.findClass("PrimitiveServlet");
        Class c2 = m2.findClass("PrimitiveServlet");
        System.out.println(c1.getClassLoader());
        System.out.println(c2.getClassLoader());
    }
}
