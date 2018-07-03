package servlet.processor;

import http.Request;
import http.Response;
import servlet.Processor;

import java.io.IOException;

public class StaticResourceProcessor implements Processor{
    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
