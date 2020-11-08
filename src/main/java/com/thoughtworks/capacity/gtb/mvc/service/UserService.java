package com.thoughtworks.capacity.gtb.mvc.service;

import com.thoughtworks.capacity.gtb.mvc.bo.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> userList = initial_list();
    public static List<User> initial_list() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"dgf","dgf19981229","a@b.com"));
        return userList;
    }

    public static void addUser(User user) {
        userList.add(user);
    }

    public static List<User> returnUserList() {
        return userList;
    }

    public static User returnUser(String username, String password) {
        int userIndex = getUser(username,password);
        if(userIndex == -1){

        }
        else
        return userList.get(userIndex);
    }

    private static int getUser(String username, String password) {
        int userIndex = -1;
        for(int i = 0;i < userList.size();i++){
            if(userList.get(i).getUsername() == username && userList.get(i).getPassword() == password){
                userIndex = i;
                break;
            }
        }
        return userIndex;
    }
}
