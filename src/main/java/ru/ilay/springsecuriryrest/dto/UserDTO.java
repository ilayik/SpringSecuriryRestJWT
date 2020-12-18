package ru.ilay.springsecuriryrest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String login;
    private String password;
    private String rpassword;
    private String email;
    private String firstName;
    private String lastName;
}
