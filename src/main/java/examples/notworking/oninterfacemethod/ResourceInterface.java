package examples.notworking.oninterfacemethod;

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

@Tag(name = "Not Working")
@Path("/not-working-because-annotations-on-interface-method")
public interface ResourceInterface {

    @POST
    @Produces(APPLICATION_XML)
    @Consumes(APPLICATION_JSON)
    String get(@Valid
               @RequestBody(content = @Content(examples = {@ExampleObject(name = "Invalid Input", value = "{\"value\":null   }")}))
               Input input);

}
