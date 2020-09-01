package test;

import bean.Emp;
import bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/** 基于 xml 方式创建对象
 * @author yuesj
 * @date 2020/6/5
 */
public class BeanTest {

    /**
     * 外部bean测试
     */
    @Test
    public void test1(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    
    @Test
    public void test2(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();

    }

    /**
     * 级联赋值测试
     */
    @Test
    public void test3(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();

    }





}
