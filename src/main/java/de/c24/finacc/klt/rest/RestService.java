package de.c24.finacc.klt.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Jörn Schricker
 */
@Component
@Path("/")
public class RestService {

    /**
     * testmap
     *
     * @return map containing fisch and suppe
     */
    @GET
    @Path("/testit")
    @Produces(APPLICATION_JSON_VALUE)
    public Map<String, String> getTestMap() {
        Map<String, String> returnMap = new HashMap<>();

        returnMap.put("fisch", "suppe");

        return returnMap;
    }
}
