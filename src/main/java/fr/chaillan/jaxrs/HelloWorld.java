package fr.chaillan.jaxrs;

import jakarta.json.Json;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/")
public class HelloWorld {

    @GET
    public Response helloworld() {
        return Response.ok(Json.createObjectBuilder().add("hello", "world").build()).build();
    }

}
