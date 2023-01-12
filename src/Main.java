public class Main {
    static final int SATRTING_POSITION = 0;
    static final int WINNIG_POSITION = 100;
    static int diceCount = 0;
    static int playerPosition = 0;
    static int player1Position = SATRTING_POSITION;
    static int player2Position = SATRTING_POSITION;



    static int dieRolled() {
        int diceNumber = (int) (((Math.random() * 10) % 6) + 1);
        diceCount++;
        return diceNumber;
    }

    static int getOption() {
        int option = (int) (((Math.random() * 10) % 3));
        return option;
    }
    static int getToss(){
        int toss = (int) (((Math.random() * 10) % 2));
        return toss;
    }

    static int playGame(int playerPosition) {
            int diceNumber = dieRolled();
            System.out.println(" Dice number " + diceNumber);
            int option = getOption();
            System.out.println(" Game option " + option);
            switch (option) {
                case 0:
                    System.out.println("NO PLAY");
                    break;
                case 1:
                    System.out.println("LADDER");
                    if (playerPosition + diceNumber <= 100) {
                        playerPosition += diceNumber;
                    }
                    playGame(playerPosition);
                    break;
                case 2:
                    System.out.println("SNAKE");
                    playerPosition -= diceNumber;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }
            return playerPosition;
        }


    public static void main(String[] args) {
        System.out.println("Snake and Ladder");
        int toss = getToss();
        System.out.println("The toss " + toss);
        while (player1Position < 100 && player2Position < 100) {
            if( toss == 0){
                System.out.println("Player1 is Playing game");
                player1Position = playGame(player1Position);
                System.out.println("Player1 Position is " + player1Position);
                if (player1Position == 100){
                    System.out.println("Player1 wins the game");
                    break;
                }
                toss = 1;
            }
            else {
                System.out.println("Player2 is Playing game");
                player2Position = playGame(player2Position);
                System.out.println("Player2 Position is " + player2Position);
                if (player2Position == 100) {
                    System.out.println("Player2 wins the game");
                    break;
                }
                toss = 0;
            }
        }
        System.out.println("Total number of times the Die Rolled " + diceCount);
    }
}

