package p1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

   /* @Around("execution(* *.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + " with params " + Arrays.asList(arguments) + " will execute");
        Object retByMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + retByMethod);
        return retByMethod;
    }*/

    @Around("execution(* *.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + " with params " + Arrays.asList(arguments) + " will execute");

        Comment comment = new Comment();
        comment.setText("Other text");
        Object[] newArgs = {comment};

        Object retByMethod = joinPoint.proceed(newArgs);
        logger.info("Method executed and returned " + retByMethod);
        return "FAILED";
    }

}
