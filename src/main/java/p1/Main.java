package p5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import p5.services.CommentService;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Alex");

        service.publishComment(comment);
    }

}
