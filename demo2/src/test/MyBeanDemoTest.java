package test;

import collectiontype.Course;
import factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuesj
 * @date 2020/6/13
 */
public class MyBeanDemoTest {

    @Test
    public void test1(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
