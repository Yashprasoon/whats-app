package com.driver;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class WhatsappRepository {

    //Assume that each user belongs to at most one group
    //You can use the below mentioned hashmaps or delete these and create your own.
    private final HashMap<Group, List<User>> groupUserMap;
    private final HashMap<Group, List<Message>> groupMessageMap;
    private final HashMap<Message, User> senderMap;
    private final HashMap<Group, User> adminMap;
    private final HashMap<String,String> userMap;
    private final int customGroupCount;
    private final int messageId;

    public WhatsappRepository(){
        this.groupMessageMap = new HashMap<Group, List<Message>>();
        this.groupUserMap = new HashMap<Group, List<User>>();
        this.senderMap = new HashMap<Message, User>();
        this.adminMap = new HashMap<Group, User>();
        this.userMap = new HashMap<String,String>();
        this.customGroupCount = 0;
        this.messageId = 0;
    }

    public HashMap<Group, List<User>> getGroupUserMap() {
        return groupUserMap;
    }

    public HashMap<Group, List<Message>> getGroupMessageMap() {
        return groupMessageMap;
    }

    public HashMap<Message, User> getSenderMap() {
        return senderMap;
    }

    public HashMap<Group, User> getAdminMap() {
        return adminMap;
    }

    public HashSet<String> getUserMobile() {
        return userMobile;
    }

    public int getCustomGroupCount() {
        return customGroupCount;
    }

    public int getMessageId() {
        return messageId;
    }

   public void addToUserMap(String name, String mobile) {
       userMap.put(name, mobile);
   }




}
