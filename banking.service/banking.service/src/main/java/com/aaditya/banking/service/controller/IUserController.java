

package com.aaditya.banking.service.controller;

import com.aaditya.banking.service.model.request.User;
import com.aaditya.banking.service.model.response.UserBaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserController {


  @Operation(summary = "Create User for next process of banking service  ")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "201", description = "User created", content = {
          @Content(schema = @Schema(implementation = UserBaseResponse.class))}),
      @ApiResponse(responseCode = "400", description = "bad request", content = {
          @Content(schema = @Schema(implementation = UserBaseResponse.class))}),
      @ApiResponse(responseCode = "409", description = "User exists with same name", content = {
          @Content(schema = @Schema(implementation = UserBaseResponse.class))})})
  @PostMapping(value = {"v1.0/user"}, produces = {"application/json"}, consumes = {
      "application/json"})
  ResponseEntity<UserBaseResponse> addUser(@RequestBody User body);

}
