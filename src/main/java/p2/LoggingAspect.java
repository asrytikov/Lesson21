package p2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

   @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + " with params " + Arrays.asList(arguments) + " will execute");
        Object retByMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + retByMethod);
        return retByMethod;
    }

    //@Before()
    //@After()
    //@AfterReturning
    //@AfterThrowing

}
