package tiktaktoe;

public class TikTakToe {
    
    private Player[] players;
    private GameBoard board;

    public TikTakToe(Player[] players, GameBoard board) {
        this.players = players;
        this.board = board;
    }

    public void initGame () {
        this.showInitMessage();
        this.initTurns();
    }

    public void initTurns() {
        for (Player player : players) {
            this.showTurnMessage(player);
            int chosenField = player.playRound();
            this.saveOnBoard(chosenField);
            boolean isGameOver = this.checkWinner();

            if (isGameOver) {
                this.GameOver(Player winner)
            }
        }
    }

    public void GameOver(Player winner) {
        this.showGameOverMessage();
        this.showWinnerMessage(winner);
        this.saveStatistics();
        this.offerRematch();
    }

    public void offerRematch() {
        
    }

    public static void main(String[] args) {
        Player firstPlayer = new Player("Artur");
        Player secondPlayer = new Player("João");

        GameBoard board = new GameBoard(3);
        
        TikTakToe game = new TikTakToe(new Player[] {firstPlayer, secondPlayer}, board);


    }
}
