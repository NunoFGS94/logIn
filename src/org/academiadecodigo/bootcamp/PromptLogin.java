package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

/**
 * Created by codecadet on 07/03/2019.
 */
public class PromptLogin {

    public void start(){

        Prompt prompt = new Prompt(System.in,System.out);
        Database database = new Database();

        StringInputScanner initialMessage = new StringInputScanner();
        initialMessage.setMessage("Insert your login credentials below");

        StringInputScanner usernameMsg = new StringInputScanner();
        usernameMsg.setMessage("Username: ");

        StringInputScanner passwordMsg = new StringInputScanner();
        passwordMsg.setMessage("Password: ");

        String username = prompt.getUserInput(usernameMsg);
        String password = prompt.getUserInput(passwordMsg);

        if(!database.isValidUser(username)||database.isCorrectLogin(username,password)){
            System.out.println("Invalid User");
        }else{
            System.out.println("Correct Login");
        }
    }
}
