package aop.annotion;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author yuesj
 * @date 2020/6/25
 */
@Component
@Aspect //生成代理对象
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* aop.annotion.User.add(..))")
    public void pointDemo(){

    }
    //前置通知
    //@Before 注解表示作为前置通知
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before......");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("afterReturning.........");
    }

    //最终通知
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after......");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }

    @Around(value = "execution(* aop.annotion.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");

    }
}
