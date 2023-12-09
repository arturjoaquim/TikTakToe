package tiktaktoe;

public class Player {
    
    private static int playersAmount = 0; 

    private int wins;
    private int loses;
    private int id;
    private String name;

    public Player(String name) {
        this.wins = 0;
        this.loses = 0;
        this.id = playersAmount++;
    }

    public int getId() {
        return id;
    }

    public static void main (String[] args) {
        Player firstPlayer = new Player("Artur");
        var playerID = get   
        
    }
}
