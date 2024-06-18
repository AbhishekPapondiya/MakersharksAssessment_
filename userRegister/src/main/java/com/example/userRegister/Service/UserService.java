package com.example.userRegister.Service;

import com.example.userRegister.Entity.UserEntry;

public interface UserService {
    UserEntry  registerUser(UserEntry userEntry);
    
    UserEntry getUserByUsername(String username);
}
