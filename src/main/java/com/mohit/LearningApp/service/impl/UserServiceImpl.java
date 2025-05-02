package com.mohit.LearningApp.service.impl;



import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.repository.UserRepository;
import com.mohit.LearningApp.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userrepo;

    @Override
    public Userdto save(Userdto dto) {
        User user = toEntity(dto);
        userrepo.save(user);
        return toDto(user);
    }

    @Override
    public List<User> getAllUser() {
        return userrepo.findAll();
    }

    @Override
    public void deleteuser(int userid) {
        return userrepo.deleteById(userid);
    }

    private User toEntity(Userdto dto){
        User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .active(dto.getActive())
                .build();
        return null;
    }

    private Userdto toDto(User user){
        Userdto.builder()
                .userid(user.getUserid())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
//                .active()getPassword
                .build();
        return null;
    }


}