package test.java;

import main.java.Cell;
import main.java.Grid;

public class Test2 {	//allocate cells to regions
	
	public static void main(String [] args){
		Grid g = new Grid();
		Test2 td2 = new Test2();
		td2.printRowCells(g);
		td2.printColCells(g);
		td2.printBoxCells(g);

		System.out.println(" \n Total cell count: " + Cell.getCellCount());
	}

	private void printColCells(Grid g) {
		System.out.println("Printing cells in columns");
		for (int i = 0; i < 9; i ++){
			for (int j = 0; j < 9; j ++){
				System.out.print("Cell in column " + i + " position " + j + ": ");
				System.out.println(g.getColList().get(i).getCellList().get(j).getCoord());	
			}
		}
	}

	private void printBoxCells(Grid g) {
		System.out.println("Printing cells in boxes");
		for (int i = 0; i < 9; i ++){
			for (int j = 0; j < 9; j ++){
				System.out.print("Cell in box " + i + " position " + j + ": ");
				System.out.println(g.getBoxList().get(i).getCellList().get(j).getCoord());
			}
		}
	}

	private void printRowCells(Grid g) {
		System.out.println("Printing cells in rows");
		for (int i = 0; i < 9; i ++){
			for (int j = 0; j < 9; j ++){
				System.out.print("Cell in row " + Character.toUpperCase((char)(i + 97)) + " position " + j + ": ");
				System.out.println(g.getRowList().get(i).getCellList().get(j).getCoord());	
			}
		}
	}
}
