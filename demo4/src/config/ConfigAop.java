package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 完全注解开发Aop
 * @author yuesj
 * @date 2020/6/26
 */
@Configuration
//自动扫描
@ComponentScan(basePackages = {"aop.annotion"})
//开启 Aspect 生成代理对象
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {


}
