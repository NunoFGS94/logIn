package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 07/03/2019.
 */
public class NewUser {

    public NewUser(Database database, String username, String password){
        database.newUser(username,password);
    }
}
