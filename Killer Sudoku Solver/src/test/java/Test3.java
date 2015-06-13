package test.java;

import main.java.Cage;
import main.java.Cell;
import main.java.Grid;

public class Test3 {	//create cage
	public static void main(String [] args){
		Grid g = new Grid();
		Cage cage = new Cage(6, 3);
		Cell tempCell = g.getCellA0();
		cage.addCell(g.getRowList().get(0).getCell(0));
		tempCell = g.getCellA1();
		cage.addCell(tempCell);
		tempCell = g.getCellA2();
		cage.addCell(tempCell);
		g.addCage(cage);
		System.out.println(g.getCageList().get(0).getCellList().get(0).getPossibleVals());
		System.out.println(g.getCageList().get(0).getCell(0).getPossibleVals());
	}
	
}
