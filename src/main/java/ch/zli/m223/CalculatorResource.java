package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestPath;

@Path("/calculator/add/{number1}/{number2}")
public class CalculatorResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@RestPath int number1, @RestPath int number2) {
        int result1 = number1 + number2;
        return String.valueOf(result1);
    }
}
