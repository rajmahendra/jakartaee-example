package myapp.view.controller;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@Controller
@RequestScoped
public class MyDefaultController {

    @GET
    @View("hello.jsp")
    public void voidController() {
    }

}
