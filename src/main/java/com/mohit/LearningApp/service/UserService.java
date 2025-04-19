package com.mohit.LearningApp.service;

import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;

import java.util.List;

public interface UserService {

     Integer save(Userdto dto);

     List<User> getALLUser();


}
