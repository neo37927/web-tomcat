package servlet;

public interface Servlet {
    /**
     * 一次性初始化
     * @param config
     */
    void init(ServletConfig config);

    /**
     * 去依赖耦合
     * @param request
     * @param response
     */
    void service(ServletRequest request, ServletResponse response);

    /**
     * 清理自身占用资源，如内存、文件句柄和线程等
     */
    void destory();

    ServletConfig getServletConfig();

    String getServletInfo();
}
