package com.accenture.prebootcamp.objects.exercises.exercise4;

// 3 . Create class "Game" with main method. In this main method we will create (instantiate)
//     our objects and use them to battle (attack each other).
//       a. create two weapons (choose power and name as you wish)
//       b. Create two players with the previously created weapons

//       d. call the "battle" method in main method and pass to it the players you previously created.
//       e. implement a method "determineWinner" which has two parameters (both are of type Player).
//          The purpose  of this method is to print out who won the battle (to determine that
//           you need to compare the health points of both players) and who has how many points.
//          example of message:
//                 "John won Jane by 140 points." (so in this case John had 140 points more than Jane
//                      after all of the battles)
public class Game {

    public static void main(String[] args) {
        Weapon axe = new Weapon("Axe", 10);
        Player john = new Player("John", axe);
        Player jane = new Player("Jane", new Weapon("Sword", 3));

        battle(john, jane);

        System.out.println("\n\n\n **************** ");
        determineWinner(john, jane);
    }

    // c. Implement a method "battle" which makes the players attack each other 30 times. Method has
    //    two parameters (both are of type Player). To make players attack each other, use previously
    //    created "attack" method for attacking. Example of players attacking each other:
    //         player1.attack(player2); //player1 is attacking player2 (both variables are of type Player)
    //         player2.attack(player1); //player2 is attacking player2 (both variables are of type Player)
    static void battle(Player player1, Player player2) {
        for (int i = 0; i < 30; i++) {
            player1.attack(player2);
            player2.attack(player1);
        }
    }

    static void determineWinner(Player player1, Player player2) {
        int health1 = player1.getHealth();
        int health2 = player2.getHealth();

        int diff = health1 - health2;
        Player winner, looser;
        if (health1 > health2) {
            winner = player1;
            looser = player2;
        } else if (health2 > health1) {
            winner = player2;
            looser = player1;
        } else {
            System.out.println("Battle was a draw!");
            return;
        }
        System.out.println(winner.getName() + " won " + looser.getName() + " by " + Math.abs(diff)
                + " points.");
    }
}
