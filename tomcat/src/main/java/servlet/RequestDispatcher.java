package servlet;

import java.io.IOException;

public interface RequestDispatcher {
    void forward(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

    void include(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;
}
