

package com.aaditya.banking.service.controller.impl;

import com.aaditya.banking.service.controller.IUserController;
import com.aaditya.banking.service.model.request.User;
import com.aaditya.banking.service.model.response.UserBaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController implements IUserController {

  @Override
  public ResponseEntity<UserBaseResponse> addUser(User body)  {




    return null;
  }
}
