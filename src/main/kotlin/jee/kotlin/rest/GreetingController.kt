package jee.kotlin.rest

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

class GreetingController

@GET
@Path("greeting")
fun getHtml()= "Greetings"
