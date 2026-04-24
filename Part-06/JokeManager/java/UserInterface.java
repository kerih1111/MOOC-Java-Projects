
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erich
 */
public class UserInterface {
    private Scanner scanner;
    private JokeManager joker;

    public UserInterface(JokeManager joker, Scanner scanner) {
        this.joker = joker;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {            
            String command;
            System.out.println("Commands: \n1 - add a joke \n2 - draw a joke"
                    + "\n3 - list jokes \nX - stop");
            command = scanner.nextLine();
            if(command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                joker.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(joker.drawJoke());
            } else if (command.equals("3")) {
                joker.printJokes();
            } else if (command.equals("X")) {
                break;
            }
            
        }
    }
 
}
