package collectiontype;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yuesj
 * @date 2020/6/9
 */
public class Stu {
    //1 数组类型属性
    private String[] courses;
    //2 list 集合类型属性
    private List<String> list;
    //3 map 集合类型属性
    private Map<String,String> maps;
    //4 set 集合类型属性
    private Set<String> sets;
    //5 List 对象
    private List<Course> courseList;


    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }



    public void courseTest(){
        for(String s:courses){
            System.out.println(s);
        }
    }

    public void listTest(){
        for(String s:list){
            System.out.println(s);
        }
    }

    public void setTest(){
        for(String s:sets){
            System.out.println(s);
        }
    }

    public void courseListTest(){
        for(Course course:courseList){
            System.out.println(course.getCname());
        }
    }


}
