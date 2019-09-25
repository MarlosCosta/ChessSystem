package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//apenas classes do mesmo pacote e subclasses podem acessar esse get
	protected Board getBoard() {
		return board;
	}
	//set é apagado para não permitir que o tabuleiro seja alterado
	
}
