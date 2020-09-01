package test;

import aop.annotion.Goods;
import aop.annotion.User;
import aop.xml.Book;
import com.spring.config.SpringConfig;
import config.ConfigAop;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author yuesj
 * @date 2020/6/25
 */
public class AopTest {

    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.add();
    }

    @Test
    public void test3(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigAop.class);
        Goods goods = context.getBean("goods", Goods.class);
        goods.add();
    }





}
