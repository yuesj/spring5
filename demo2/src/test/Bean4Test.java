package test;

import bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuesj
 * @date 2020/6/18
 */
public class Bean4Test {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(orders);
        //手动让 bean 实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }
}
