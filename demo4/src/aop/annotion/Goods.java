package aop.annotion;

import org.springframework.stereotype.Component;

/**
 * @author yuesj
 * @date 2020/6/26
 */
@Component
public class Goods {

    public void add(){
        System.out.println("add......");
    }
}
