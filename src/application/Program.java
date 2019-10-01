package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//UI = User Interface
		UserInterface.printBoard(chessMatch.getPieces());
	}

}
