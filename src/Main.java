public class Main {
    static final int SATRTING_POSITION = 0;
    static int playerPosition = 0;
    static int dieRolled(){
        int diceNumber = (int)(((Math.random() * 10) % 6) + 1);
        return diceNumber;
    }
    static int getOption(){
        int option = (int)(((Math.random() * 10) % 3));
        return option;
    }
    public static void main(String[] args) {
        System.out.println("Snake and Ladder");
        int diceNumber = dieRolled();
        System.out.println(" Dice number " + diceNumber);
        int option = getOption();
        System.out.println(" Dice number " + option);
        switch (option){
            case 0:
                System.out.println("NO PLAY");
                break;
            case 1:
                System.out.println("LADDER");
                playerPosition += diceNumber;
                break;
            case 2:
                System.out.println("SNAKE");
                playerPosition -= diceNumber;
                break;
        }
    }
}

