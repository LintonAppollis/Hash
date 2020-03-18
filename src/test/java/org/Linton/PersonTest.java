package org.Linton;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class PersonTest
{
    ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
    PersonInterface pInterface = (PersonInterface) appContext.getBean("AliasPerson");

    PersonInterface p = new PersonInterfaceImplementation();

    @Test
    public void testAddFirstName()
    {
        String result = p.addFirstName("Lynne");
        Assert.assertEquals("Lynne", result);
    }

    @Test
    public void testAddLastName()
    {
        String result = p.addLastName("James");
        Assert.assertEquals("James", result);
    }

    @Test
    public void testAddAge()
    {
        int result = p.addAge(37);
        Assert.assertEquals(37, result);
    }
}