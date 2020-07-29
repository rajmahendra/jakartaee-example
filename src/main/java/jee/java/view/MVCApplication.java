package jee.java.view;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("/view")
public class MVCApplication  extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(BookController.class);
    }
}
