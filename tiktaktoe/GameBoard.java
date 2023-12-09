package tiktaktoe;

public class GameBoard {

    private int[][] gameTable = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    public int[][] getGameTable() {
        return gameTable;
    }

    public static void main (String[] args) {
        GameBoard tabuleiro = new GameBoard();
        int[][] table = tabuleiro.getGameTable();
        System.out.println(table.length);
        System.out.println(table[0][1] == 1);
    }

    
}
