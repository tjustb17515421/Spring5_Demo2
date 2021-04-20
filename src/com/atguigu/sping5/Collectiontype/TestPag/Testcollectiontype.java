package com.atguigu.sping5.Collectiontype.TestPag;

import com.atguigu.sping5.BeanLife.Orders;
import com.atguigu.sping5.Collectiontype.Book;
import com.atguigu.sping5.Collectiontype.Course;
import com.atguigu.sping5.Collectiontype.Stu;
import com.atguigu.sping5.Factorybean.MyBean;
import com.atguigu.sping5.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcollectiontype {
    @Test
    public void test()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        Stu stu=context.getBean("stu",Stu.class);
        stu.show();
    }
    @Test
    public void test1()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");

        Book book =context.getBean("book",Book.class);
        book.show();
    }
    @Test
    public void test3()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");

        Course course=context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    @Test
    public void test4()
    {
        // ApplicationContext context =
        // new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(orders);
        //手动让 bean 实例销毁
        context.close();
    }
    @Test
    public void test5()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp =context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
