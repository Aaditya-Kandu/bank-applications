package com.aaditya.banking.service.service;

import com.aaditya.banking.service.model.request.User;
import com.aaditya.banking.service.model.response.UserBaseResponse;
import org.springframework.http.ResponseEntity;

public interface IUserService {


  ResponseEntity<UserBaseResponse> addUser(User body);

}
