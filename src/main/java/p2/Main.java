package p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import p1.service.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Alex");

        String value = service.publishComment(comment);
        logger.info(value);
    }

}
