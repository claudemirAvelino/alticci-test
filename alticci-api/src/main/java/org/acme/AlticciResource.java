package org.acme;

import com.alticci.service.CalculoService;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci/{number}")
public class AlticciResource {

    @Inject
    CalculoService calculoService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Integer alticci(String number) {
        return calculoService.alticciSequence(Integer.parseInt(number));
    }
}
