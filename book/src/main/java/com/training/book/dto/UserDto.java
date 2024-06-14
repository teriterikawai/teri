package com.training.book.dto;

import com.training.book.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    private String name;
    private String surname;
    private String lastname;

    private String phone;
    private String email;

    private String username;
    private String password;

    private Set<Role> roles;
}
