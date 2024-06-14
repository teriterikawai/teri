package com.training.book.service;

import com.training.book.dto.UserDto;
import com.training.book.entity.Role;
import com.training.book.entity.User;
import com.training.book.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public void registration(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setLastname(userDto.getLastname());

        user.setPhone(userDto.getPhone());
        user.setEmail(userDto.getEmail());

        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);
    }

    public User findUserInfo(org.springframework.security.core.userdetails.User user){
        return userRepo.findByUsername(user.getUsername());
    }
}
