package p2.service;

import org.springframework.stereotype.Service;
import p2.Comment;
import p2.ToLog;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publish comment: " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment comment){
        logger.info("Editing comment:" + comment.getText());
    }

}
