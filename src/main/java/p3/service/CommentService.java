package p3.service;

import org.springframework.stereotype.Service;
import p3.Comment;
import p3.ToLog;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Publish comment: " + comment.getText());
        return "SUCCESS";
    }

}
