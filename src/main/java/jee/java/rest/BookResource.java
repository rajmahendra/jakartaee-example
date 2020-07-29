package jee.java.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jee.java.entity.Book;
import jee.java.entity.service.Catalog;

import java.util.List;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    @Inject
    private Catalog bookCatalog;

    @GET
    public Book getABook() {
        return bookCatalog.getAllBook(1);
    }

    @GET
    @Path("/all")
    public List<Book> getAllBook() {
        return bookCatalog.getAllBooks();
    }


}