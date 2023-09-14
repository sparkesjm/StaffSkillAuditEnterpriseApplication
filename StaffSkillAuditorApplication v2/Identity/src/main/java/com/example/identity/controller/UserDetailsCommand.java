package com.example.identity.controller;

import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
public class UserDetailsCommand {
    private String username;
    private String password;
}
