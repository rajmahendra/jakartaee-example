package jee.java.rest;

import jee.java.entity.Book;
import jee.java.entity.service.Catalog;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_HTML})
@ApplicationScoped
public class BookResource {

    @Inject
    private Catalog bookCatalog;

    @GET
    public Response getABook() {
        return Response.ok(bookCatalog.getAllBook(1)).build();
    }

    @GET
    @Path("/all")
    public Response getAllBook() {
        return Response.ok(bookCatalog.getAllBooks()).build();
    }


}