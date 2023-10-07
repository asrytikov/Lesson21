package p3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class SecurityAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Security Aspect: Calling method");
        Object retByMethod = joinPoint.proceed();
        logger.info("Security Aspect: Method executed and returned " + retByMethod);
        return retByMethod;
    }

}
