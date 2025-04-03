package com.mohit.LearningApp.service.impl;

import com.mohit.LearningApp.dto.Userdto;
import com.mohit.LearningApp.model.User;
import com.mohit.LearningApp.repository.UserRepository;
import com.mohit.LearningApp.service.UserService;
import lombok.*;
import org.modelmapper.ModelMapper;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Getter
@Setter
@AllArgsConstructor
//@RequiredArgsConstructor
@Service
public class UserServiceImpl  implements UserService {


     private UserRepository userRepo;
    final private User user = new User();



    private ModelMapper modelMapper = new ModelMapper();

    @Override
  public Integer save(Userdto userdto) {
    User user = modelMapper.map(userdto,User.class);
    user.setPassword((userdto.getPassword()));
    user = userRepo.save(user);
    return user.getUserid();
}


}
