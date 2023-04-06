package com.webapp.bumble.bee.util;

import com.webapp.bumble.bee.model.Admin;


public class Util {
    
    public static Admin[] getAdmins() {
        Admin[] admin = new Admin[1];
        admin[0] = new Admin(0, "samhan_6", "adminSamhan");
        
        return admin;
    }
    
    public static boolean authenticate(String username, String password) {
        if (username == null && password == null) {
           return false;
        }
        return username.equals(username) && password.equals(password);
    }
    
}
