package com.mohit.LearningApp.service.impl;



import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.repository.UserRepository;
import com.mohit.LearningApp.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userrepo;
    private User user;

    @Override
    public Integer save(Userdto dto) {
//        User user = toEntity(dto);
        Userdto user1 = dto;
         user = userrepo.save(user);
        return user.getUserid();
    }

    @Override
    public List<User> getAllUser() {
        return userrepo.findAll();
    }

    @Override
    public void deleteuser(int userid) {
         userrepo.deleteById(userid);
    }

//    private User toEntity(Userdto dto){
//        User.builder()
//                .userid(dto.getUserid())
//                .username(dto.getUsername())
//                .email(dto.getEmail())
//                .password(dto.getPassword())
//                .active(dto.getActive())
//                .build();
//        return null;
//    }

//    private Userdto toDto(User user){
//        Userdto.builder()
//                .username(user.getUsername())
//                .email(user.getEmail())
//                .password(user.getPassword())
//                .active(user.getActive())
//                .build();
//        return null;
//    }



}