package test;

import bean.Book;
import bean.Orders;
import bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 基于 xml 方式创建对象
 * @author yuesj
 * @date 2020/6/5
 */
public class Spring5Test {
    ApplicationContext context
            = new ClassPathXmlApplicationContext("bean1.xml");

    /**
     * 创建对象
     */
    @Test
    public void test1(){
        System.out.println(context);
        User user = (User) context.getBean("user");
        user.add();
    }


    /**
     * set方法注入
     */
    @Test
    public void test2(){
        Book book = (Book) context.getBean("book");
        System.out.println(book.getBname()+":"+book.getBauthor()+":"+book.getAddress());
    }

    /**
     * 构造函数注入
     */
    @Test
    public void test3(){
        Orders order = context.getBean("orders",Orders.class);
        System.out.println(order);
        order.testOrders();
    }

    /**
     * p空间注入
     */
    @Test
    public void test4(){
        Book book = context.getBean("book1",Book.class);
        System.out.println(book.getBname()+":"+book.getBauthor()+":"+book.getAddress());
    }
}
