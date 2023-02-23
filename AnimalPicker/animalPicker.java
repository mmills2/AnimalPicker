import java.util.Scanner;

public class animalPicker {
    public static void main(String[] args){

        // instance variables
        Scanner scanoTron9000 = new Scanner(System.in);
        String choice = "";
        String introMsg = "Howdy. Would you like to see a canine or a feline?\nType \"canine\" or \"feline\":";
        String modernLingo = "We don't call them that in these parts\nType \"canine\" or \"feline\":";
        String invalidInput = "That ain't no canine or feline\nType \"canine\" or \"feline\":";
        String canine = "Imagine a canine chasing it's tail or something";
        String feline = "Look up a picture of a feline on the interwebs";

        // asks user what animal they would like to see
        System.out.println(introMsg);
        
        // user input loop
        while(!choice.equalsIgnoreCase("canine") && !choice.equalsIgnoreCase("feline")){
            choice = scanoTron9000.nextLine();
            if(choice.equalsIgnoreCase("dog") || choice.equalsIgnoreCase("cat")){System.out.println(modernLingo);}
            else if(!choice.equalsIgnoreCase("canine") && !choice.equalsIgnoreCase("feline")){System.out.println(invalidInput);}
        }        

        // placeholder output
        if(choice.equalsIgnoreCase("canine")){System.out.println(canine);}
        else if(choice.equalsIgnoreCase("feline")){System.out.println(feline);}
    }
}