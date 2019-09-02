import java.util.HashMap;
import java.util.Scanner;

public class Exercise19 {

    public static void clearScreen(){
        for (int i = 0; i < 100; ++i){
            System.out.println();  
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choosen, player1Score, player2Score;
        HashMap<String, Integer> Player1 = new HashMap<String, Integer>();
        HashMap<String, Integer> Player2 = new HashMap<String, Integer>();
        player1Score = 0;
        player2Score = 0;
        System.out.println("Janken-po Game!\nThe first player to get 3 poins win the game!\n\n---------------------------");
        do{
            System.out.println("\n\nPLAYER 1\nChoose a number:\n1-Rock\n2-Paper\n3-Scissor");
            choosen = sc.nextInt();
            Player1.put("Choosen", choosen);
            clearScreen();
    
    
            System.out.println("\n\nPLAYER 2\nChoose a number:\n1-Rock\n2-Paper\n3-Scissor");
            choosen = sc.nextInt();
            Player2.put("Choosen", choosen);
            clearScreen();
    
            if(Player1.get("Choosen") == 1){
                if(Player2.get("Choosen") == 1){
                    System.out.println("Draw");
                }
                else if(Player2.get("Choosen") == 2){
                    System.out.println("Player 2 Wins");
                    player2Score++;
                }
                else if(Player2.get("Choosen") == 3){
                    System.out.println("Player 1 Wins");
                    player1Score++;
                }
            }
            else if(Player1.get("Choosen") == 2){
                if(Player2.get("Choosen") == 1){
                    System.out.println("Player 1 Wins");
                    player1Score++;
                }
                else if(Player2.get("Choosen") == 2){
                    System.out.println("Draw");
                }
                else if(Player2.get("Choosen") == 3){
                    System.out.println("Player 2 Wins");
                    player2Score++;
                }
            }
            else if(Player1.get("Choosen") == 3){
                if(Player2.get("Choosen") == 1){
                    System.out.println("Player 2 Wins");
                    player2Score++;
                }
                else if(Player2.get("Choosen") == 2){
                    System.out.println("Player 1 Wins");
                    player1Score++;
                }
                else if(Player2.get("Choosen") == 3){
                    System.out.println("Draw");
                }
            }

        } while(player1Score < 3 && player2Score < 3);

        System.out.println("------------------------");
        if(player1Score == 3){
            System.out.println("Player 1 Won the game");
        }
        if(player2Score == 3){
            System.out.println("Player 2 Won the game");
        }
        System.out.println("------------------------");
        sc.close();
    }
}
