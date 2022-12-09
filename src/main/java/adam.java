import javax.swing.event.SwingPropertyChangeSupport;

import java.util.Scanner;
public class adam {
     Scanner scan = new Scanner(System.in);
     Random rnd = new Random();
     private String response = " ";
     private String name;
     private String dayOfWeek;
     public bored(String n, String day){
         name = n;
         dayOfWeek = day;
     }
     public void play(){
         System.out.println("Hey " + name);
         while (response.equalsIgnoreCase("exit") == false){
             spacerAbove();
             System.out.println("What can I do for you? " + "\n" +
                                 "Or you can exit by typing exit");
             spacerUnder();
             response = scan.nextLine();
             if(response.contains("exit")){
                 System.out.println("Bye bye!");
                 break;
             }
             else if(response.contains("help")){
                 spacerAbove();
                 System.out.println("Here is what I can do:" + "\n" +
                                     "Say you name" + "\n" +
                                     "Tell you the day of the week" + "\n" +
                                     "Play guess the number" + "\n" +
                                     "Play higher or lower");
                 spacerUnder();   
             }
             else if (response.contains("name") || response.contains("my name")){
                 spacerAbove();
                 getName();
                 reminder();
                 spacerUnder();
             }
             else if(response.contains("day") || response.contains("week")){
                 spacerAbove();
                 System.out.println(returnDOF());
                 reminder();
                 spacerUnder();
             }
             else if(response.contains("guess the number")){
                 spacerAbove();
                 numberGame();
                 reminder();
                 spacerUnder();
             }
             else if(response.contains("higher or lower")){
                 spacerAbove();
                 higherLower();
                 reminder();
                 spacerUnder();
             }
             else{
                 spacerAbove();
                 System.out.println("I am having some trouble understanding " +
                 "what you want. Try to be more specific and adhere to the way " +
                 "it is said in the help menu. You can type help to view this");
                 spacerUnder();
             }
         }
     }
     public String returnDOF(){
         return "Today is " + dayOfWeek + "!";
     }
     public void getName(){
         System.out.println("Your name is " + name + "!");
     }
     public String myName(){
         return "My name bored. I was programmed " +
                 "because my creator was bored on a plane flight";
     }
     public void reminder(){
         System.out.println("If this wasn't the response you wanted, " +
                 "try to be more specific with you response. " + " \n" +
                 "It helps me understand what you want.");
 
     }
     public void spacerAbove(){
         System.out.println("\n" + "--------------------------------------------------------------" + "\n");
     }
     public void spacerUnder(){
         System.out.println("\n" + "--------------------------------------------------------------");
     }
     public void numberGame(){
         String startNumberGame = "no";
         System.out.println("Ready to play guess the number?");
         startNumberGame = scan.nextLine();
         if(startNumberGame.equalsIgnoreCase("yes")){
             String playAgain = "yes";
             int actual = 1;
             int numAMT = 0;
             System.out.println("You are guessing between 1 and what number?");
             while (numAMT < 1){
                 numAMT = scan.nextInt();
                 if(numAMT == 0){
                     System.out.println("I said higher than 1!");
                     System.out.println("Re-Enter your response...");
                     System.out.println("You are guessing between 1 and what number?"); 
                 }
                 if(numAMT == 1){
                     System.out.println("Guessing between 1 and 1 means you'll win everytime. That's no fun!");
                     System.out.println("Re-Enter your response...");
                     System.out.println("You are guessing between 1 and what number?"); 
                 }
             }
             System.out.println("Awesome! I am thinking of a number between 1 and " + numAMT);
             System.out.println("Enter your guess " + name);
             actual = rnd.nextInt(numAMT) + 1;
             while (playAgain.compareToIgnoreCase("yes") != -1){
                 int guess = scan.nextInt();
                 if (guess == actual){
                     System.out.println("Master Guesser! You got it!");
                     System.out.print("Wanna play again?");
                     playAgain = scan.nextLine();
                 }
                 if (guess != actual){
                     System.out.println("Wrong. Try again.");
                 }
             }
         }
         else{
             System.out.println("Sorry that isn't what you wanted.");
         }
     }
     public void higherLower(){
         String startHighLowGame = "no";
         System.out.println("Ready to play higher or lower?");
         startHighLowGame = scan.nextLine();
         if(startHighLowGame.equalsIgnoreCase("yes")){
             String playAgain = "yes";
             int actual = 1;
             int numAMT = 0;
             System.out.println("You are guessing between 1 and what number?");
             while (numAMT < 1){
                 numAMT = scan.nextInt();
                 if(numAMT == 0){
                     System.out.println("I said higher than 1!");
                     System.out.println("Re-Enter your response...");
                     System.out.println("You are guessing between 1 and what number?"); 
                 }
                 if(numAMT == 1){
                     System.out.println("Guessing between 1 and 1 means you'll win everytime. That's no fun!");
                     System.out.println("Re-Enter your response...");
                     System.out.println("You are guessing between 1 and what number?"); 
                 }
             }
             System.out.println("Awesome! I am thinking of a number between 1 and " + 
                                 numAMT + " and I'll tell you if it's higher or lower.");
             System.out.println("Enter your guess " + name);
             actual = rnd.nextInt(numAMT) + 1;
             while (playAgain.compareToIgnoreCase("yes") != -1){
                 int guess = scan.nextInt();
                 if (guess == actual){
                     System.out.println("Master Guesser! You got it!");
                     System.out.println("Wanna play again?");
                     playAgain = scan.nextLine();
                 }
                 if (guess < actual){
                     System.out.println("The number is higher than that. Try again.");
                 }
                 if (guess > actual){
                     System.out.println("The number is lower than that. Try again.");
                 }
             }
         }
         else{
             System.out.println("Sorry that isn't what you wanted.");
         }
     }
 
}