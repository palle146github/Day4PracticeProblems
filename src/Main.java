public class Main {
    static final int SATRTING_POSITION = 0;
    static final int WINNIG_POSITION = 100;
    static int playerPosition = 0;

    static int dieRolled() {
        int diceNumber = (int) (((Math.random() * 10) % 6) + 1);
        return diceNumber;
    }

    static int getOption() {
        int option = (int) (((Math.random() * 10) % 3));
        return option;
    }

    public static void main(String[] args) {
        while (playerPosition != 100) {
            System.out.println("Snake and Ladder");
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
                    if ( playerPosition + diceNumber <= 100){
                        playerPosition += diceNumber;
                    }
                    break;
                case 2:
                    System.out.println("SNAKE");
                    playerPosition -= diceNumber;
                    if (playerPosition < 0){
                        playerPosition = 0;
                    }
                    break;
            }
            System.out.println("Player position is " + playerPosition);
        }
        System.out.println("Final Player Position " + playerPosition);
    }
}

