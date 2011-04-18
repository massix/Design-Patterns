import java.util.Collection;


public class CompleteMatrix extends Matrix {
	public CompleteMatrix(int rows, int cols, Collection<MatrixCell> collection) {
		super(rows, cols, collection);
		for(int i = 0; i < rows; i++) 
			for(int j = 0; j < cols; j++) 
				createPosition(i, j);
	}
	
	public void put(int row, int col, int value) throws MatrixIndexOutOfBoundsException {
		MatrixCell cell = getPosition(row, col);
		cell.value = value;
	}
	
	public int get(int row, int col) throws MatrixIndexOutOfBoundsException {
		return getPosition(row, col).value;
	}
}
