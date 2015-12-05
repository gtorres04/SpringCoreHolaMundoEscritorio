/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import beans.BeanSpring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author GerlinOTorresS
 */
public class PruebaSpring {
    public static void main(String[] org){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory=context;
        BeanSpring miBean=(BeanSpring)factory.getBean("beanSpring");
        System.out.println(miBean.getMensaje());
    }
}
