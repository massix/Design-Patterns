import java.util.Collection;
import java.util.Iterator;


public abstract class Matrix {
	private int rows, cols;
	private Collection<MatrixCell> data;
	
	protected Matrix(int rows, int cols, Collection<MatrixCell> collection) {
		this.rows = rows;
		this.cols = cols;
		this.data = collection;
	}
	
	protected MatrixCell createPosition(int row, int col) throws MatrixIndexOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		if (mc == null)
			mc = new MatrixCell(row, col);
		data.add(mc);
		return mc;
	}
	
	protected void deletePosition(MatrixCell toDelete) {
		data.remove(toDelete);
	}
	
	protected MatrixCell getPosition(int row, int col) throws MatrixIndexOutOfBoundsException {
		if (row < 0 || row >= this.rows || col < 0 || col >= this.cols)
			throw new MatrixIndexOutOfBoundsException();
		
		Iterator<MatrixCell> it = data.iterator();
		while (it.hasNext()) {
			MatrixCell mc = (MatrixCell) it.next();
			if (mc.row == row && mc.col == col)
				return mc;
		}
		
		return null;
	}
	
	public abstract void put(int row, int col, int value) throws MatrixIndexOutOfBoundsException;
	public abstract int get(int row, int col) throws MatrixIndexOutOfBoundsException;
}
