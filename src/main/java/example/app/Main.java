package example.app;

import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.google.inject.Guice;
import com.google.inject.Injector;

import example.app.resource.HelloResource;

public class Main {

    public static void main(String... args) {
        URI uri = URI.create("http://localhost:8888/");

        ResourceConfig config = new ResourceConfig();

        Injector injector = Guice.createInjector(new MyModule());
        config.register(injector.getInstance(HelloResource.class));

        JdkHttpServerFactory.createHttpServer(uri, config);
        System.out.println("server started.");
    }
}
