package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

/**
 * Created by codecadet on 07/03/2019.
 */
public class Menu {

    public int start(Prompt prompt){
        String[] options = {"Log in", "Sign in","Exit"};

        MenuInputScanner menuScanner = new MenuInputScanner(options);
        menuScanner.setMessage("Choose a option:");

        return prompt.getUserInput(menuScanner);
    }
}
