package game;

import game.player.Equipment;
import game.player.Inventory;
import game.player.Player;
import game.rooms.Room00;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{System.out.println("\nWELCOME!\n");
            displayMenu();

            int menuOption = getOption();

            if(menuOption == 1){
                newGame();
            }

            else if (menuOption == 2){
                break;
            }

            else {
                System.out.println("Wrong Option. Try again.");
            }
        }
        while (true);

    }

    static void displayMenu(){
        System.out.println("OPTIONS: \n");
        System.out.println("1. Start a New Game.");
        System.out.println("2. Exit.");
        System.out.println();
    }

    static int getOption(){
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }

    static void newGame(){


        Player player = new Player();
        Equipment playerEq = new Equipment();
        Inventory playerInv = new Inventory();

        int currentStr = player.getPlayerStr();
        int currentInt = player.getPlayerInt();
        int currentDex = player.getPlayerDex();
        int currentVit = player.getPlayerVit();
        int currentMaxhealth = player.getPlayerHealth() + currentVit  * 2;
        int currentHealth = currentMaxhealth;
        int currentDmg = player.getPlayerDamage() + currentStr / 2;
        int currentSpDmg = player.getPlayerSpellDmg();

            getRoom();



    }

    static void getRoom(){
         Room00 room = new Room00();

        System.out.println(room.getName());
        System.out.println(room.getDescription());
    }

}
