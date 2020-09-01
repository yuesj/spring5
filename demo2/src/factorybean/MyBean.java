package factorybean;

import collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {


    //定义返回bean
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
