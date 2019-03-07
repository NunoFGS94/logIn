package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

/**
 * Created by codecadet on 07/03/2019.
 */
public class Messages {

    public void loginInMessage(){
        StringInputScanner initialMessage = new StringInputScanner();
        initialMessage.setMessage("Insert your login credentials below");
    }

    public String username(Prompt prompt){

        StringInputScanner usernameMsg = new StringInputScanner();
        usernameMsg.setMessage("Username: ");

        return prompt.getUserInput(usernameMsg);
    }

    public String password(Prompt prompt){
        StringInputScanner passwordMsg = new StringInputScanner();
        passwordMsg.setMessage("Password: ");

        return prompt.getUserInput(passwordMsg);
    }
}
