package aop.annotion;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author yuesj
 * @date 2020/6/25
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* aop.annotion.User.add(..))")
    public void pointDemo(){

    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("afterReturning.........PersonProxy");
    }
}
