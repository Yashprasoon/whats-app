package com.driver;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class WhatsappService {
    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name ,String mobile){
        if(whatsappRepository.getUserMobile().contains(mobile)){
            throw new IllegalArgumentException("User already exists.");
        }
        User user = new User(name, mobile);
        whatsappRepository.addToUserMap(name,mobile);
        return "SUCCESS";
    }

    public Group createGroup(List<User> users){

        if(users.size() == 2){
            for(int i = 0; i < users.size())
            Group group = new Group(users.get(1).getName(),users.size());
            HashMap<Group, List<User>> groupUserMap = new HashMap<>();
            groupUserMap.put(group,users);
            whatsappRepository.setGroupUserMap(groupUserMap);
            HashMap<Group , User> adminMap = new HashMap<>();
            adminMap.put(group,users.get(0));
            whatsappRepository.setAdminMap(adminMap);
            return group;

        }
        else{


        }
    }
}
