import java.util.Scanner;

public class animalPicker {
    public static void main(String[] args){

        // instance variables
        Scanner scanoTron9000 = new Scanner(System.in);
        String choice = "";
        String options = "\nType \"canine\", \"feline\", or \"swimmer\":";
        String introMsg = "Howdy. Would you like to see a canine, a feline, or a swimmer?" + options;
        String modernLingo = "We don't call them that in these parts" + options;
        String invalidInput = "That ain't no canine, feline, or swimmer" + options;

        // ASCII art
        String canine = "        __      _\n        \\.\'---.//|\n         |\\./|  \\/\n        _|.|.|_  \\\n       /(  ) \' \'  \\\n      |  \\/   . |  \\\n       \\_/\\__/| |\n        V  /V / |\n          /__/ /\n          \\___/\\";
        String feline = " ,_     _\n |\\\\_,-~/\n / _  _ |    ,--.\n(  O  O )   / ,-\'\n \\  _T_/-._( (\n /         `. \\\n|         _  \\ |\n \\ \\ ,  /      |\n  || |-_\\__   /\n ((_/`(____,-\'";
        String swimmer = " o\no     ______/~/~/~/__           /(\n  o  / __            ====__    /_(\n o  /  C))       ))))      ===/__(\n    )           )))))))        __(\n    \\     \\)     ))))    __===\\ _(\n     \\_______________====      \\_(\n                                \\(";

        // asks user what animal they would like to see
        System.out.println(introMsg);
        
        // user input loop
        while(!choice.equalsIgnoreCase("canine") && !choice.equalsIgnoreCase("feline") && !choice.equalsIgnoreCase("swimmer")){
            choice = scanoTron9000.nextLine();
            if(choice.equalsIgnoreCase("dog") || choice.equalsIgnoreCase("cat") || choice.equalsIgnoreCase("fish")){System.out.println(modernLingo);}
            else if(!choice.equalsIgnoreCase("canine") && !choice.equalsIgnoreCase("feline") && !choice.equalsIgnoreCase("swimmer")){System.out.println(invalidInput);}
        }        

        // output
        if(choice.equalsIgnoreCase("canine")){System.out.println(canine);}
        else if(choice.equalsIgnoreCase("feline")){System.out.println(feline);}
        else{System.out.println(swimmer);}
    }
}