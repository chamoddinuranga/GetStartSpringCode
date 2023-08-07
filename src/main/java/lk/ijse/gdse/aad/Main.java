package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
                ctx.register(ApplicationConfig.class);
                ctx.refresh();
                ctx.registerShutdownHook();
    }
}