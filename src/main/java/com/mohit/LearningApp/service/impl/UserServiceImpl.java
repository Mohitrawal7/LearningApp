package com.mohit.LearningApp.service.impl;

import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.repository.UserRepository;
import com.mohit.LearningApp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl  implements UserService {


//     private UserRepository userRepo;
//     private final User user = new User();
//    private ModelMapper modelMapper = new ModelMapper();

    private final UserRepository userRepo;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
  public Userdto save(Userdto dto) {
    User user = toEntity(dto);
    userRepo.save(user);
    return toDto(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public void deleteuser(int userid) {
       userRepo.deleteById(userid);
    }

    @Override
    public void deleteUser(int userid){
        userRepo.deleteById(userid);
    }



    private User toEntity(Userdto dto) {
        return User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .active(dto.getActive())
                .build();
    }

    private Userdto toDto(User user) {
        return Userdto.builder()
                .userid(user.getUserid())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .active(user.isActive())
                .build();
    }



}
