package socket;

import java.io.*;
import java.net.Socket;

public class SocketAdapter {
    public static void main(String[] args) throws IOException,InterruptedException{
        Socket socket = new Socket("192.168.3.20",8080);
        OutputStream os = socket.getOutputStream();
        Boolean autoFlush = Boolean.TRUE;
        PrintWriter out = new PrintWriter(socket.getOutputStream(),autoFlush);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //HTTP request
        out.println("GET /crd-app/monitor HTTP/1.1");
        out.println("Host: 127.0.0.1:8080");
        out.println("Connection: Close");
        out.println();
        //read response
        Boolean loop = Boolean.TRUE;
        StringBuffer sb = new StringBuffer(8096);
        while (loop){
            if (in.ready()){
                int i = 0 ;
                while (i != -1){
                    i = in.read();
                    sb.append((char)i);
                }
                loop = Boolean.FALSE;
            }
            Thread.sleep(50);
        }
        //display the response to the out console
        System.out.println(sb.toString());
        socket.close();
    }
}
