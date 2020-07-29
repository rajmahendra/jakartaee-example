package jee.java.view;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.Collections;
import java.util.Set;

@ApplicationPath("/view")
public class MVCApplication  extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(BookController.class);
    }
}
