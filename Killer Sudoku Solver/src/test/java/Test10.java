package test.java;
import main.java.Grid;
import main.java.MediumSudoku;
import main.java.SolveStrats;
import main.java.ValidateGrid;

import org.junit.Assert;

public class Test10 {	//test medium sudoku
	public static void main(String [] args){
		MediumSudoku ez = new MediumSudoku();
		SolveStrats solver = new SolveStrats();
		ValidateGrid vG = new ValidateGrid();
		Grid g = ez.setUp();
		g.getRowList().get(6).getCell(1).setCommittedVal(3, g);		//simulates 1 cell missing from 2 cols
		g.getRowList().get(2).getCell(7).setCommittedVal(6, g);		//simulates 1 cell missing from 2 cols
		g.getRowList().get(5).getCell(6).setCommittedVal(8, g);		//simulates 1 cell missing from 2 boxes
		g.getRowList().get(3).getCell(2).setCommittedVal(9, g);		//simulates 1 cell missing from 2 boxes
		solver.go(g);
		boolean valid = vG.isValid(g);
		Assert.assertFalse("Sudoku Solved!!!", valid);
		//Assert.assertTrue("Failed", valid);
	}
}
