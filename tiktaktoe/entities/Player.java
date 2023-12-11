package tiktaktoe.entities;

public class Player {

    private String name;
    private Integer wins;
    private Integer losses;
    private byte team;
    private GameBoard gameBoard;

    public Player(String name, byte team, GameBoard gameBoard) {
        this.name = name;
        this.team = team;
        this.gameBoard = gameBoard;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWins() {
        return this.wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return this.losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public byte getTeam() {
        return this.team;
    }

    public void setTeam(byte team) {
        this.team = team;
    }
}
