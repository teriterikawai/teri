package com.training.book.entity;

import lombok.Getter;

@Getter
public enum Role {
    USER("Пользователь"),
    ADMIN("Администратор");

    private String name;

    Role(String name) {
        this.name = name;
    }
}
