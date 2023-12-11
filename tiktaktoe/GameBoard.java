package tiktaktoe;

class GameBoard {

    private byte[][] gameTable;
    private int boardSize;

    public GameBoard(int boardSize) {
        this.boardSize = boardSize;
        this.gameTable = new byte[boardSize][boardSize];
    }

    protected byte[] getLineByIndex(int lineIndex) {
        byte[] line = new byte[boardSize];

        var index = 0;
        for (byte[] column : gameTable) {
            line[index] = column[lineIndex];
            index++;
        }

        return line;
    }

    protected byte[] getColumnByIndex(int index) {
        return gameTable[index];
    }

    protected byte[] getFirstDiagonal() {
        byte[] diagonal = new byte[boardSize];

        for (int index = 0; index < boardSize; index++) {
            diagonal[index] = gameTable[index][index];
        }

        return diagonal;
    }

    protected byte[] getSecondDiagonal() {
        byte[] diagonal = new byte[boardSize];
        int lineIndex = (boardSize - 1);

        for (int index = 0; index < boardSize; index++) {
            diagonal[index] = gameTable[index][lineIndex];
            lineIndex--;
        }
        return diagonal;
    }

    protected void setPoint(byte team, int columnIndex, int lineIndex) {
        gameTable[columnIndex][lineIndex] = team;
    }

    public static void main (String[] args) {
       GameBoard tabuleiro = new GameBoard(5);

       byte[] line = tabuleiro.getLineByIndex(0);
       byte[] diagonal = tabuleiro.getSecondDiagonal();
       
       for (byte item : diagonal) {
            System.out.println(item);
       }
    }
}
