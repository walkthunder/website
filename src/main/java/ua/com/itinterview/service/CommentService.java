package ua.com.itinterview.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import ua.com.itinterview.dao.CommentDao;
import ua.com.itinterview.web.command.CommentCommand;

public class CommentService {

    @Autowired
    CommentDao commentDao;

    public CommentCommand addCommentForQuestion(Integer questionId,
	    CommentCommand comment) {
	return comment;

    }
    public List<CommentCommand> getCommentListForQuestion(int questionId) {
	return null;
    }
}
