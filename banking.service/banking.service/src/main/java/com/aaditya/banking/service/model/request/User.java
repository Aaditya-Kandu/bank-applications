package com.aaditya.banking.service.model.request;

import com.aaditya.banking.service.enums.State;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty(message = "Name cannot be null")
    private String name;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email cannot be null")
    private String email;

    @NotEmpty(message = "Password cannot be null")
    private String password;

    @NotEmpty(message = "Role cannot be null")
    private String role;

    @NotEmpty(message = "Mobile cannot be null")
    private String mobile;

    @NotEmpty(message = "Address cannot be null")
    private String address;

    @NotEmpty(message = "City cannot be null")
    private String city;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @NotEmpty(message = "Country cannot be null")
    private String country;
    @NotEmpty(message = "PinCode cannot be null")
    private String pipCode;
    @NotEmpty(message = "PanCard cannot be null")
    private String panCard;
    @NotEmpty(message = "Aadhar pCard cannot be null")
    private String aadharCard;
    @NotEmpty(message = "DateOfBirth cannot be null")
    private String dateOfBirth;

}
