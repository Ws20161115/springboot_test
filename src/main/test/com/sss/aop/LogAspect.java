package com.sss.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ClassName LogAspect
 * @Desprition 编写切面
 * @Author shishanshan
 * @Date 2019/3/15 16:09
 * @Version 1.0
 **/
@Aspect//声明此类是一个切面
@Component//让切面成为spring容器管理的Bean
public class LogAspect {
    //通过PointCut注解声明切点
    @Pointcut("@annotation(com.sss.aop.Action)")
    public void annotationPointCut(){}

    //通过@After注解声明一个建言 并且使用@pointCut定义的切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        //通过反射可获得注解上的属性 然后做日志记录和相关的操作
        System.out.println("注解式拦截"+action.name());
    }
    //通过@before注解声明一个建言 此建言直接使用拦截规则作为参数
    @Before("execution(*com.sss.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        //通过反射可获得注解上的属性 然后做日志记录和相关的操作
        System.out.println("注解式拦截"+method.getName());
    }
}
