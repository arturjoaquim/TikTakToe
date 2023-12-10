package tiktaktoe;

public class TikTakToe {
    
    private Player[] players;
    private GameBoard board;

    public TikTakToe(Player[] players, GameBoard board) {
        this.players = players;
        this.board = board;
    }

    public static void main(String[] args) {
        Player firstPlayer = new Player("Artur");
        Player secondPlayer = new Player("João");

        GameBoard board = new GameBoard();

        System.out.println(secondPlayer.getId());
    }
}
