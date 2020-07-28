package jeee.rest.kotlin

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

class GreetingController

@GET
@Path("greeting")
fun getHtml(): String? {
    return "Greetings"
}