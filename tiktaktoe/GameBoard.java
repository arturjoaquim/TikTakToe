package tiktaktoe;

class GameBoard {

    private byte[][] gameTable;
    private int boardSize;

    public GameBoard(int boardSize) {
        this.boardSize = boardSize;
        this.gameTable = new byte[boardSize][boardSize];
    }

    public byte getLineByIndex() {
        return 0;
    }

    public byte[] getColumnByIndex(int index) {
        return gameTable[index];
    }

    public static void main (String[] args) {
       GameBoard tabuleiro = new GameBoard(3);

        int[][] array;
        array = new int[5][5];
        
        for (int[] column : array) {
            for (int item : column) {
                System.out.println(item);
            }
        }
    }

    
}
