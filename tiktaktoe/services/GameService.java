package tiktaktoe.services;

import tiktaktoe.entities.GameBoard;

public class GameService {
    private GameBoard gameBoard;

    public GameService (GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public checkLines() {
        int size = gameBoard.boardSize;

        for (byte index = 0; index < size; index++) {
            byte[] line = gameBoard.getLineByIndex(index);
        }

    }

    public checkWinner () {
        this.checkLines();
        this.checkColumns();
        this.checkDiagonals();
    }
}
