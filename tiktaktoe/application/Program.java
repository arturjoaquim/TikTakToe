package tiktaktoe.application;

import java.util.Scanner;

import tiktaktoe.entities.GameBoard;
import tiktaktoe.entities.Player;
import tiktaktoe.services.GameService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameBoard gameBoard = new GameBoard(3);
        GameService game = new GameService();

        System.out.println("Por favor, jogador 1 escreva seu nome: ");
        String nameP1 = sc.nextLine();
        Player p1 = new Player(nameP1, (byte) 1, gameBoard);

        System.out.println("Por favor, jogador 2 escreva seu nome: ")
        String nameP2 = sc.nextLine()
        Player p2 = new Player(nameP2, (byte) 2, gameBoard);

        boolean isMacthing = true;
        while (isMacthing) {
            p1.playRound();
            isMacthing = game.checkWinner();
            p2.playRound();
            isMacthing = game.checkWinner();
        }

        game.gameOver();
    }
}
