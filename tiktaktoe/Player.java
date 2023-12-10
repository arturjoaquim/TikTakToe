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
        return scan.nextInt();
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
        Player firstPlayer = new Player("Artur");
        var playerID = firstPlayer.getId();
        System.out.println("O ID do player 1 é " + playerID);
        System.out.println("Quantia de players " + Player.getPlayersAmount());
        Player secondPlayer = new Player("João");
        System.out.println(getPlayersAmount());
    }
}
