package aretche.springdidemo;

import aretche.springdidemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

    }

}
