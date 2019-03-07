package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 07/03/2019.
 */
public class TwoStepVerification {

    public TwoStepVerification(Database database, String username, String password){
        if(!database.isValidUser(username)||database.isCorrectLogin(username,password)){
            System.out.println("Invalid User and/or Password");
        }else{
            System.out.println("Correct Login");
        }
    }
}
