package aop.annotion;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author yuesj
 * @date 2020/6/26
 */
public class GoodsProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* aop.annotion.Goods.add(..))")
    public void pointDemo(){

    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("afterReturning.........ConfigAop");
    }
}
