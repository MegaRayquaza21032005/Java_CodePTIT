package service;

import model.Role;
import model.User;

import common.AppContext;

public class UserService {

    public boolean checkLogin(User user) {
        if(user.getUsername().equals("admin")) {
            if(user.getPassword().equals("admin")) {
                user.setRole(Role.ADMIN);
                AppContext.setUser(user);
                return true;
            }
            return false;
        }
        else if(user.getUsername().equals("guess")) {
            if(user.getPassword().isEmpty()) {
                user.setRole(Role.GUEST);
                AppContext.setUser(user);
                return true;
            }
            return false;
        }
        return false;
    }

}