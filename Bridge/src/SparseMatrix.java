import java.util.Collection;


public class SparseMatrix extends Matrix {
	public SparseMatrix(int rows, int cols, Collection<MatrixCell> collection) {
		super(rows, cols, collection);
	}
	
	public void put(int row, int col, int value) throws MatrixIndexOutOfBoundsException {
		MatrixCell cell = getPosition(row, col);
		if (cell != null) {
			if (value == 0) { 
				deletePosition(cell);
			}
			else {
				cell.value = value;
			}
		}
		else {
			if (value != 0) {
				cell = createPosition(row, col);
				cell.value = value;
			}
		}
	}
	
	public int get(int row, int col) throws MatrixIndexOutOfBoundsException {
		MatrixCell cell = getPosition(row, col);
		if (cell == null) 
			return 0;
		else
			return cell.value;
	}
}
