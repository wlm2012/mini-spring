package org.springframework.test.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.ioc.bean.Car;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryBeanTest {

    @Test
    public void testFactoryBean() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:factory-bean.xml");

        Car car = applicationContext.getBean("car", Car.class);
        assertEquals(car.getBrand(), "porsche");
    }
}