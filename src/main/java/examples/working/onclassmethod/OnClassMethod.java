package examples.working.onclassmethod;

import examples.Input;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.ExampleObject;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

@Tag(name = "Working")
@Path("/working-because-annotations-on-class-method")
public class OnClassMethod {
    @POST
    @Produces(APPLICATION_XML)
    @Consumes(APPLICATION_JSON)
    public String get(@Valid
               @RequestBody(content = @Content(examples = {@ExampleObject(name = "Invalid Input", value = "{\"value\":null   }")}))
               Input input) {
        return "<tag>Success</tag>";
    }
}
