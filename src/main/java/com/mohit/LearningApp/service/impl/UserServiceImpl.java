package com.mohit.LearningApp.service.impl;

import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.repository.UserRepository;
import com.mohit.LearningApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class UserServiceImpl  implements UserService {

    final private PasswordEncoder passwordEncoder;
    final private UserRepository userRepo;
    final private User user = new User();

    // Constructor injection
    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;  // Spring will inject the repository here
    }
    public UserServiceImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder=passwordEncoder;  // Spring will inject the repository here
    }

    private ModelMapper modelMapper = new ModelMapper();

    @Override
  public Integer save(Userdto userdto) {
    User user = modelMapper.map(userdto,User.class);

    user.setPassword(encodePassword(userdto.getPassword()));
    user = userRepo.save(user);
    return user.getUserid();
}


    public String encodePassword(String plainPassword) {
        return passwordEncoder.encode(plainPassword);
    }



}
