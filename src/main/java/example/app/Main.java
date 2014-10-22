package example.app;

import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer;

public class Main {

    public static void main(String... args) {
        URI uri = URI.create("http://localhost:8888/");

        ResourceConfig config = new ResourceConfig();

        config.packages(true, "example.app.resource");

        HttpServer server = JdkHttpServerFactory.createHttpServer(uri, config);
        System.out.println("server started.");
    }
}
