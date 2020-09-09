package com.uspehgp.robotspring;

import com.uspehgp.robotspring.impls.robot.ModelT1000;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RobotspringApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();

//        ((ConfigurableApplicationContext)context).close();
    }

}
