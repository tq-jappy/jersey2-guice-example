package example.app;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configure() {
        bind(String.class).toInstance("Hello Jersey Guice!");
    }
}
