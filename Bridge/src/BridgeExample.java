import java.util.ArrayList;
import java.util.Vector;


public class BridgeExample {
	public static final int ROWS = 3;
	public static final int COLS = 4;
	
	public static void main(String[] args) {
		CompleteMatrix matrixCV = new CompleteMatrix(ROWS, COLS, new Vector<MatrixCell>());
		System.out.println("CompleteMatrix with Vector");
		matrixCV.put(1, 2, 1);
		matrixCV.put(2, 1, 2);
		matrixCV.put(0, 3, 3);
		matrixCV.put(1, 2, 0);
		
		for (int i = 0; i < ROWS; i++) { 
			for (int j = 0; j < COLS; j++) 
				System.out.print(matrixCV.get(i, j) + " ");
			System.out.println();
		}
		System.out.println();
		
		SparseMatrix matrixSV = new SparseMatrix(ROWS, COLS, new Vector<MatrixCell>());
		System.out.println("SparseMatrix with Vector");
		matrixSV.put(1, 2, 1);
		matrixSV.put(2, 1, 2);
		matrixSV.put(0, 3, 3);
		matrixSV.put(1, 2, 0);
		
		for (int i = 0; i < ROWS; i++) { 
			for (int j = 0; j < COLS; j++) 
				System.out.print(matrixSV.get(i, j) + " ");
			System.out.println();
		}
		System.out.println();
		
		CompleteMatrix matrixCA = new CompleteMatrix(ROWS, COLS, new ArrayList<MatrixCell>());
		System.out.println("CompleteMatrix with ArrayList");
		matrixCA.put(1, 2, 1);
		matrixCA.put(2, 1, 2);
		matrixCA.put(0, 3, 3);
		matrixCA.put(1, 2, 0);
		
		for (int i = 0; i < ROWS; i++) { 
			for (int j = 0; j < COLS; j++) 
				System.out.print(matrixCA.get(i, j) + " ");
			System.out.println();
		}
		System.out.println();
		
		SparseMatrix matrixSA = new SparseMatrix(ROWS, COLS, new ArrayList<MatrixCell>());
		System.out.println("SparseMatrix with ArrayList");
		matrixSA.put(1, 2, 1);
		matrixSA.put(2, 1, 2);
		matrixSA.put(0, 3, 3);
		matrixSA.put(1, 2, 0);
		
		for (int i = 0; i < ROWS; i++) { 
			for (int j = 0; j < COLS; j++) 
				System.out.print(matrixSA.get(i, j) + " ");
			System.out.println();
		}
	
	}
}
