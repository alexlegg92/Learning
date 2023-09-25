import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

/** To help with the build I'm using Wikipedia to identify the functions of a basic web server program.
1. Starts listening to client connections / requests.
2. Receives client requests (by reading HTTP messages).
3. Replies to client requests sending proper HTTP responses.

The HttpServer class is an abstract class, an abstract class is a restricted class that cannot be used to create objects.
The HttpServer class implements a simple HTTP server.

1. It is bound to an IP address and port number, and listens for incoming TCP connections from client on this address.
2a. One or more HttpHandler objects must be associated with a server in order to process requests.
2b. Each HttpHandler object is registered with a root URI path which represents the location of app or service on server.
3. Mapping of a handler to HttpServer is encapsulated by a HttpContext object, HttpContexts are created by calling createContext(String,HttpHandler).
## CHECK THIS
4. Any request for which no handler can be found is rejected with a 404 response (not sure if this is something I implement?).

What happens ...
HTTP request is received, the appropriate HttpContext (and handler) is located, matching the request URI's path.
When binding address/port, can also specify int backlog, representing max num of incoming TCP connection which the system will queue ...
connections are queued while they are waiting to be accepted by the HttpServer. */

public class WebServer {
    public static void main(String[] args) throws IOException {
        // Let's start the HttpServer, and bind it to an IP address and port, I can use the HttpServer create method for this.
        // The create method create(InetSocketAddress addr, int backlog). The int argument is easy, I can set that to 0, but the first part?
        // It's a class that I see has constructors: .create(InetSocketAddress(InetAddress addr, int port)).
        // "A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
        // It can be used to set initial values for object attributes.". So to call the constructor I need to create an object, and set its initial values:
        // The IP address is a wildcard address meaning any local address, so I only need to set the port.
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0); // The statement wasn't happy, it tells me to include exceptions.

        // Mapping of the handler to HttpServer is encapsulated by a HttpContext object, HttpContexts are created by calling createContext(String, HttpHandler).
        // The String argument maps requests of URI path to handler object.
        // "all requests received by the server for the path will be handled by calling the given HANDLER OBJECT."
        server.createContext("/app", new handler()); // new handler() is an object of handler

        // Just found a missing function; executes. It says it must be established before start() is called.
        server.setExecutor(null);

        server.start();
    }

    public static class handler implements HttpHandler {
        // Associate HttpHandler object with the server in order to process requests.
        // HttpHandler is an interface, so I will need to "implement" this, that includes defining its methods.

        // handle is a method of HttpHandle, the HttpExchange class it's parsed encapsulates a HTTP request received
        // and a response to be generated in one exchange. It provides methods of dealing with requests and responses.
        public void handle(HttpExchange exchange) throws IOException {
            // I start cheating 4.5 hours in with the output and input confusion.
            // Deleted it all, going back to the docs ... I'll try again.
            // Logically, I must need to implement InputStream and OutputStream.

            // "getRequestBody() returns an InputStream for reading the request body ...
            // after reading the request body, the stream should be closed.".
//            InputStream inputStream = exchange.getRequestBody();
            // As the request is already handled by the Handler object, all we need to do is simply respond.

            // Must consume all the data from InputStream before closing the exchange using close() to prevent possible resources issues.
            String response = "This is a response.";
            // "If the call to sendResponseHeaders(int, long) specified a fixed response body length,
            // then the exact number of bytes specified in that call must be written to this stream."
            exchange.sendResponseHeaders(200, response.length()); // 200 = successful response

            // "getResponseBody() to get a OutputStream to send the response body. When the response body has been written,
            // the stream must be closed to terminate the exchange."
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response.getBytes());
            outputStream.close();

            System.out.println(inputStream.read());
        }
    }
}
