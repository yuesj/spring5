package aop.annotion;

import org.springframework.stereotype.Component;

/**
 * @author yuesj
 * @date 2020/6/25
 */
@Component
public class User {

    public void add(){
        System.out.println("add.......");
    }
}
