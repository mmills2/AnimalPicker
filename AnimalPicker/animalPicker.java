import java.util.Scanner;

public class animalPicker {
    public static void main(String[] args){

        // instance variables
        Scanner scanoTron9000 = new Scanner(System.in);
        String choice = "";

        // asks user what animal they would like to see
        System.out.println("Howdy. Would you like to see a canine or a feline?\nType \"canine\" or \"feline\":");
        
        // user input
        choice = scanoTron9000.nextLine();

        // placeholder output
        if(choice.equalsIgnoreCase("canine")){System.out.println("Imagine a canine chasing it's tail or something");}
        else if(choice.equalsIgnoreCase("feline")){System.out.println("Look up a picture of a feline on the interwebs");}
    }
}