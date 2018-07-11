package com.lvb.docmgr.Service;

import com.lvb.docmgr.Model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByPid(int pid);
    int comment(int pid, int uid, String content, String opinion);
}
