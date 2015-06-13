package test.java;
import main.java.EasySudoku;
import main.java.Grid;
import main.java.SolveStrats;
import main.java.ValidateGrid;

import org.junit.Assert;

public class Test9 {	//TODO find out why currently stuck in virtual cage loop
	public static void main(String [] args){
		EasySudoku ez = new EasySudoku();
		SolveStrats solver = new SolveStrats();
		ValidateGrid vG = new ValidateGrid();
		Grid g = ez.setUp();
		solver.go(g);
		boolean valid = vG.isValid(g);
		Assert.assertFalse("Sudoku Solved!!!", valid);
		//Assert.assertTrue("Failed", valid);
	}
}
