package org.academiadecodigo.bootcamp;


/**
 * Created by codecadet on 07/03/2019.
 */
public class PromptLogin {

    public void start(){

        Prompt prompt = new Prompt(System.in,System.out);
        Database database = new Database();
        Messages messages = new Messages();

        messages.loginInMessage();
        String username = messages.username(prompt);
        String password = messages.password(prompt);

        TwoStepVerification verification = new TwoStepVerification(database,username,password);

    }
}
