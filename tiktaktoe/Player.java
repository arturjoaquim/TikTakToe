package tiktaktoe;
import java.util.Scanner;

class Player {
    
    private static int playersAmount = 0; 

    private byte wins;
    private byte loses;
    private int id;
    private String name;
    private byte team;

    public Player(String name) {
        playersAmount++;
        this.name = name;
        this.wins = 0;
        this.loses = 0;
        this.id = playersAmount;
    }

    public int playRound() {
        Scanner scan = new Scanner(System.in);
        int chosenField = scan.nextInt();
        scan.close();
        return chosenField;
    }

    public int getId() {
        return id;
    }

    public byte getWins() {
        return wins;
    }

    public byte getLoses() {
        return loses;
    }

    public String getName() {
        return name;
    }

    public static int getPlayersAmount() {
        return playersAmount;
    }

    public byte getTeam() {
        return team;
    }

    public static void main (String[] args) {
    }
}
