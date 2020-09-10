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
        ModelT1000 model1 = (ModelT1000) context.getBean("model1");
        ModelT1000 model2 = (ModelT1000) context.getBean("model2");
        // ModelT1000 model3 = (ModelT1000) context.getBean("model1");
        model1.action();
        model2.action();
        // System.out.println(model3);

        ((ConfigurableApplicationContext)context).close();
    }

}
