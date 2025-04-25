import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Methods{

    public static void main(String[] args){

        //create an array of options
        //Take input from the user
        //compare the inputs with the computer

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};
        String computerInput = options[random.nextInt(options.length)];
        String playAgain;

        do{
            System.out.print("Choose one \n Rock Paper Scissors: ");
            String userInput = scanner.nextLine().toLowerCase();
            //System.out.println(userInput);

            if(userInput.equals("rock") && computerInput.equals("rock")){
                System.out.println("Computer input is: " + computerInput);
                System.out.println("It's a tie");
            }
            else if(userInput.equals("rock") && computerInput.equals("scissors") ||
                    userInput.equals("scissors") && computerInput.equals("paper") ||
                    userInput.equals("paper") && computerInput.equals("rock")){

                System.out.println("Computer input is: " + computerInput);
                System.out.println("You win");

            }

            else{
                System.out.println("Computer input is: " + computerInput);
                System.out.println("You lose");
            }

            System.out.print("Do you want to Play Again? Yes/No: ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));





    }
}