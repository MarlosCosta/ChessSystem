package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	
	public int getRow() {
		return row;
	}
	
	//Essa opera��o converte a posi��o do Xadrez para a Matriz
	protected Position toPosition() {
		return new Position (8 - row, column - 'a');
	}
	//Essa opera��o converte a posi��o da Matriz para a porsi��o no Xadrez
	protected static ChessPosition fromPosition (Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
