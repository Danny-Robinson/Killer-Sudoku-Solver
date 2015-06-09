package testing;

import backend.EasySudoku;
import backend.Grid;
import backend.SolveStrats;
import backend.ValidateGrid;

public class Test10 {
	public static void main(String [] args){
		EasySudoku ez = new EasySudoku();
		SolveStrats solver = new SolveStrats();
		ValidateGrid vG = new ValidateGrid();
		Grid g = ez.setUp();
		System.out.println(g.getCellA8().getColumn().getColumnVal());
		System.out.println(g.getRowList().get(4).getCellList().get(6).getPossibleVals());
		g.getRowList().get(0).getCellList().get(8).setCommittedVal(4, g);
		System.out.println(g.getRowList().get(4).getCellList().get(6).getPossibleVals());
	}	
}
