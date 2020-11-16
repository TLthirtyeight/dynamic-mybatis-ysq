package com.baomidou.samples.mybatis.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author: ysq
 * @Description: ${description}
 * @Date: 2020/11/10 0:24
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.baomidou.samples.mybatis.controller.*.*(..))")
    public void webLog() {

    }

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) {
        try {
            // 接收到请求，记录请求内容
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            System.out.println("URL: " + request.getRequestURL().toString());
            System.out.println("HTTP_METHOD: " + request.getMethod());
            System.out.println("IP" + request.getRemoteAddr());
            System.out.println("CLASS_METHOD: " + joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getName());
            System.out.println("ARGS: " + Arrays.toString(joinPoint.getArgs()));
        } catch (Exception exec) {

        }
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) {
        // 处理完请求，返回内容
        System.out.println("方法的返回值： " + ret);
    }

    // 后置异常通知
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint joinPoint) {
        System.out.println("方法异常时执行....");
    }

    // 后置最终通知，final增强，不管是抛出异常或者正常退出都会执行
    @After("webLog()")
    public void after(JoinPoint jp) {
        System.out.println("方法最后执行。。。");
    }

    // 环绕通知，环绕增强，相当于MethodInterceptor
    @Around("webLog()")
    public Object arround(ProceedingJoinPoint pjb) {
        System.out.println("方法环绕start.....");
        try {
            Object o = pjb.proceed();
            System.out.println("方法环绕proceed， 结果是 : " + o);
            return o;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

}
