package loader;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

public class LoaderClass {
    public static void oldMain(String[] args) throws IOException,ClassNotFoundException{
        URL[] urls = new URL[1];
        URLStreamHandler streamHandler = null;
        File classPath = new File(System.getProperty("user.dir") + File.separator  + "tomcat/target/classes/servlet/impl");
        String repository = (new URL("file", null, classPath.getCanonicalPath() + File.separator)).toString() ;
        urls[0] = new URL(null, repository, streamHandler);
        URLClassLoader loader = new URLClassLoader(urls);
        Class c = loader.loadClass("PrimitiveServlet");
        System.out.println(c.getClasses());
    }

    public static void older_main(String[] args) throws MalformedURLException,ClassNotFoundException {

        URL u = new URL("file:"+"/Users/xiaolin/");
        URLClassLoader loader = new URLClassLoader(new URL[] {u});
        Class c = loader.loadClass("PrimitiveServlet");
        System.out.println(c.getClasses());
    }

    public static void main(String[] args) throws MalformedURLException,ClassNotFoundException {

        URL u = new URL("file:"+"/Users/xiaolin/");
        URLClassLoader loader = new URLClassLoader(new URL[] {u});
        Class c = loader.loadClass("PrimitiveServlet");
        System.out.println(c.getClasses());
    }
}
