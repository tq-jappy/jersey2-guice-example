package example.app;

import com.google.inject.AbstractModule;

import example.app.resource.HelloResource;

public class MyModule extends AbstractModule {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configure() {
        bind(HelloResource.class).toInstance(new HelloResource());
        bind(String.class).toInstance("Hello Jersey Guice!");
    }
}
