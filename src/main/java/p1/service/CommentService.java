package p5.services;

import org.springframework.stereotype.Service;
import p5.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publish comment: " + comment.getText());
    }

}
