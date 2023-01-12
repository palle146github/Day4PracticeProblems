public class Main {
    static final int SATRTING_POSITION = 0;
    static int dieRolled(){
        int diceNumber = (int)(((Math.random() * 10) % 6) + 1);
        return diceNumber;
    }
    
    public static void main(String[] args) {
        System.out.println("Snake and Ladder");
        int diceNumber = dieRolled();
        System.out.println(" Dice number " + diceNumber);
    }
}

