package jee.java.view;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import javax.mvc.Controller;
import javax.mvc.Models;

@Path("book")
@Controller
public class BookController {


    @Inject
    private Models models;


    @GET
    @Produces("text/html")
    public String view1() {
    //    models.put("book", catalog.getBook(id));
        return "book.xhtml";
    }
}
