package tiktaktoe;

public class GameBoard {

    private int[][] gameTable = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    public static void main (String[] args) {
        GameBoard tabuleiro = new GameBoard();
        System.out.println(getTableSize());

    }

    
}
