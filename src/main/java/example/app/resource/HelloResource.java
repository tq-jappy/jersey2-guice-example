package example.app.resource;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;

@Path("/")
public class HelloResource {

    @Inject
    private String message;

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return Optional.ofNullable(message).orElse("NULL!");
    }
}
