package com.example.userRegister.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.userRegister.Entity.UserEntry;
import com.example.userRegister.Repository.UserRepository;
@Service
public class UserServiceImp implements UserService{
    
    @Autowired
    private UserRepository userRepository; 
 
    @Autowired
    private BCryptPasswordEncoder bcp;

    @Override
    public UserEntry registerUser(UserEntry userEntry) {
        userEntry.setPassword(bcp.encode(userEntry.getPassword()));
        return userRepository.save(userEntry);
    }

    @Override
    public UserEntry getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
}
