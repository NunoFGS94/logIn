package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.HashMap;

/**
 * Created by codecadet on 07/03/2019.
 */
public class Database {

    HashMap<String,String> users = new HashMap<>();

    public Database(){
        users.put("Nuno","123456");
        users.put("Fire","blood");
        users.put("Database","login");
    }

    public boolean isValidUser(String user){
        return users.containsKey(user);
    }

    public boolean isCorrectLogin(String user, String pass){
        return users.get(user).equals(pass);
    }



}
