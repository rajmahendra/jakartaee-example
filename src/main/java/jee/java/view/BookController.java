package jee.java.view;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("book")
@Controller
public class BookController {


    @Inject
    private Models models;


    @GET
    @Produces("text/html")
    public String welcome() {
        return "book.xhtml";
    }
}
