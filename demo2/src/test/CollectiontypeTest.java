package test;


import collectiontype.Book;
import collectiontype.Course;
import collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 基于 xml 方式创建对象
 * @author yuesj
 * @date 2020/6/5
 */
public class CollectiontypeTest {




    @Test
    public void test1(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.courseTest();
        stu.listTest();
        stu.setTest();
        stu.courseListTest();
    }

    @Test
    public void test2(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean2.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    



}
