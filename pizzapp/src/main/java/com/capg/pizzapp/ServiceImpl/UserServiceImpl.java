package com.capg.pizzapp.ServiceImpl;

import com.capg.pizzapp.Entity.User;
import com.capg.pizzapp.Repository.UserRepository;
import com.capg.pizzapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User getUser(int userId) {
        return null;
    }
}
