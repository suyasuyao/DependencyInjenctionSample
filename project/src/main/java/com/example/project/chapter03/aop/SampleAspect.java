package com.example.project.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

//Aspect指向であることを明記
@Aspect
@Component
public class SampleAspect {

    @Before("execution(* com.example.project.chapter03.used.*Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("=========Before Advice===========");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format((new java.util.Date())));
        System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
    }

    @After("execution(* com.example.project.chapter03.used.*Greet.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println(" ========= After Advice ==========");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
        System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
    }

    @Around("execution(* com.example.project.chapter03.used.*Greet.*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(" ========= Around Advice ==========");
        System.out.println(" ========= 処理前 ==========");
        joinPoint.proceed();
        System.out.println(" ========= 処理後 ==========");

    }
}

