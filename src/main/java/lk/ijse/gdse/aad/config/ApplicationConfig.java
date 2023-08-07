package lk.ijse.gdse.aad.config;

import lk.ijse.gdse.aad.sample.MyBean;
import lk.ijse.gdse.aad.sample.MyComponent;
import lk.ijse.gdse.aad.sample.Sample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {MyComponent.class,Sample.class})

public class ApplicationConfig {
    //This class tell us how to create a bean
    @Bean
    public MyBean myBean (){
        return new MyBean();
    }

    public Sample sample () {
        return new Sample();
    }

}
