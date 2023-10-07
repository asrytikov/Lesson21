package p1.service;

import org.springframework.stereotype.Service;
import p1.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publish comment: " + comment.getText());
        return "SUCCESS";
    }

}
