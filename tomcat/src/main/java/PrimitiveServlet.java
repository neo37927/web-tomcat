
import servlet.Servlet;
import servlet.ServletConfig;
import servlet.ServletRequest;
import servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet{
    public void init(ServletConfig config) {
        System.out.println("init");
    }

    public void service(ServletRequest request, ServletResponse response) {
        try {
            System.out.println("service");
            PrintWriter out = response.getWriter();
            out.println("OK");
            out.println();
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void destory() {
        System.out.println("destory");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }
}
