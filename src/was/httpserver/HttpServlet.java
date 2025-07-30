package was.httpserver;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface HttpServlet {
    void service(HttpRequest request, HttpResponse response) throws IOException;
}
