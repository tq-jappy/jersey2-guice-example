package example.app;

import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static Injector injector;

    public static void main(String... args) {
        injector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(String.class).toInstance("Hello Jersey Guice!");
            }
        });

        URI uri = URI.create("http://localhost:8888/");

        ResourceConfig config = new ResourceConfig();

        config.packages(true, "example.app.resource");

        JdkHttpServerFactory.createHttpServer(uri, config);
        System.out.println("server started.");
    }
}
