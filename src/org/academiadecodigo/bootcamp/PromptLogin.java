package org.academiadecodigo.bootcamp;


/**
 * Created by codecadet on 07/03/2019.
 */
public class PromptLogin {

    public void start(){

        Prompt prompt = new Prompt(System.in,System.out);
        Messages messages = new Messages();
        Database database = new Database();
        Menu menu = new Menu();

        while (true) {

            int option = menu.start(prompt);

            if (option == 1) {
                messages.loginInMessage();
                new TwoStepVerification(database, messages.username(prompt), messages.password(prompt));
            }
            if (option == 2) {
                messages.signInMessage();
                new NewUser(database, messages.username(prompt), messages.password(prompt));

            }
            if (option == 3) {
                System.exit(0);
            }
        }

    }
}
