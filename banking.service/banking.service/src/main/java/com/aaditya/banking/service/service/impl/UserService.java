package com.aaditya.banking.service.service.impl;

import com.aaditya.banking.service.model.request.User;
import com.aaditya.banking.service.model.response.UserBaseResponse;
import com.aaditya.banking.service.repository.UserRepository;
import com.aaditya.banking.service.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService implements IUserService {

  private final UserRepository userRepository;

  @Override
  public ResponseEntity<UserBaseResponse> addUser(User body) {
    return null;
  }
}



//  public String add(User body) throws Exception {
//    if (body != null) {
//      body.setName(Masking.encrypt(body.getName()));
//      body.setEmail(Masking.encrypt(body.getEmail()));
//      userRepository.save(body);
//      log.info("User added successfully", body.getName());
//    }
//    return "User added successfully";
//  }
//
//  public List<User> get() {
//    List<User> users = userRepository.findAll();
//    return users.stream().map(user -> {
//      try {
//        user.setName(Masking.decrypt(user.getName()));
//        user.setEmail(Masking.decrypt(user.getEmail()));
//      } catch (Exception e) {
//        throw new RuntimeException("Decryption failed", e);
//      }
//      return user;
//    }).collect(Collectors.toList());
//  }