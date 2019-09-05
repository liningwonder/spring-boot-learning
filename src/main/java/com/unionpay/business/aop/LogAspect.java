package com.unionpay.business.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void controllerAspect() {
    }

    @Before(value = "controllerAspect()")
    public void methodBefore(JoinPoint joinPoint) {
        String requestId = UUID.randomUUID().toString();
        MDC.put("REQUEST_ID", requestId);
    }
}
