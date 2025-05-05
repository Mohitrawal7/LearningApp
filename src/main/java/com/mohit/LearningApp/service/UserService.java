package com.mohit.LearningApp.service;

import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface UserService {

     Userdto save(Userdto dto);

     List<User> getAllUser();

     void deleteuser(int userid);

}
