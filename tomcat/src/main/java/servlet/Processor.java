package servlet;

import http.Request;
import http.Response;

public interface Processor {

    void process(Request request, Response response);
}
