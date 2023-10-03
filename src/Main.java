import java.util.Scanner;
public class Main
{
    //here you go//
    public static void main(String[] args)
    {
        String playerA = "";
        String playerB = "";
        String playerATryAgain = "Y";
        String playerBTryAgain = "Y";
        String playAgain = "Y";
        Scanner in = new Scanner(System.in);

        do
        {
            do
            {
                System.out.println("Player A, what is your move? [R, P, S]: ");
                playerA = in.next();

                if(playerA.equalsIgnoreCase(anotherString: "R") || playerA.equalsIgnoreCase(String anotherString: "P") || playerA.equalsIgnoreCase(anotherString: "S"))
                {
                    playerATryAgain = "N";
                }

                else
                {
                    System.out.println("You entered an incorrect input. Please try again.");
                }
            } while(!playerATryAgain.equalsIgnoreCase(anotherString: "n"));

            do
            {
                System.out.println("Player B, what is your move? [R, P, S]: ");
                playerB = in.next();

                if(playerB.equalsIgnoreCase(anotherString: "R") || playerB.equalsIgnoreCase(anotherString: "P") || playerB.equalsIgnoreCase(anotherString: "S") )
                {
                    playerBTryAgain = "N";
                }

                else
                {
                    System.out.println("You entered an incorrect input. Please try again.");
                }
            }while(!playerBTryAgain.equalsIgnoreCase(anotherString: "N"));

            if(playerA.equalsIgnoreCase(anotherString: "R"))
            {
                if(playerB.equalsIgnoreCase(anotherString: "R"))
                {
                    System.out.println("You both played rock! It's a tie!");
                }
                if(playerB.equalsIgnoreCase(anotherString: "P"))
                {
                    System.out.println("Paper covers rock, Player B wins!");
                }
                else
                {
                    System.out.println("Rock smashes scissors, Player A wins!");
                }
            }
            if(playerA.equalsIgnoreCase(anotherString: "P"))
            {
                if(playerB.equalsIgnoreCase(anotherString: "R"))
                {
                    System.out.println("Paper covers rock, Player A wins!");
                }
                if(playerB.equalsIgnoreCase(anotherString: "P"))
                {
                    System.out.println("You both played paper, it's a tie!");
                }
                else
                {
                    System.out.println("Scissors cuts paper, Player B wins!");
                }
            }
            if(playerA.equalsIgnoreCase(anotherString: "S"))
            {
                if(playerB.equalsIgnoreCase(anotherString: "R"))
                {
                    System.out.println("Rock smashes scissors, Player B wins!");
                }
                if(playerB.equalsIgnoreCase(anotherString: "P"))
                {
                    System.out.println("Scissors cuts paper, Player A wins!");
                }
                else
                {
                    System.out.println("You both played scissors, it's a tie!");
                }
            }
            System.out.println("Do you want to play again? [Y, N]: ");
            playAgain = in.next();
            playerATryAgain = "Y";
            playerBTryAgain = "Y";

        }while(!playAgain.equalsIgnoreCase(anotherString: "N"));
    }
}





