package com.lvb.docmgr.Service;

import com.lvb.docmgr.Model.User;
import com.lvb.docmgr.Result.MultiResult;

import java.util.List;

public interface UserService {
    MultiResult<User> login(String username, String password);

    String register(User user);

    void changeStatus(int uid, int status);

    User getUserByUid(int uid);

    List<User> getAllUsers();

    List<User> getUnVerifyUsers();
}
