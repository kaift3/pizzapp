package com.capg.pizzapp.Service;

import com.capg.pizzapp.Entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public User createUser(User user);
    public User getUser(int userId);
}
