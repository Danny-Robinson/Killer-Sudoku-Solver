package test.java;

import main.java.Cage;
import main.java.Grid;
import main.java.SolveStrats;

public class Test6 { 
	//cage size two fully included: remove common possvals from row
	public static void main(String [] args){
		Grid g = new Grid();
		SolveStrats solver = new SolveStrats();
		Cage cage = new Cage(22, 4);
		cage.addCell(g.getRowList().get(0).getCell(0));
		cage.addCell(g.getRowList().get(0).getCell(1));
		cage.addCell(g.getRowList().get(0).getCell(2));
		cage.addCell(g.getRowList().get(0).getCell(3));
		g.addCage(cage);
		Cage cage2 = new Cage(20, 3);
		cage2.addCell(g.getRowList().get(0).getCell(4));
		cage2.addCell(g.getRowList().get(0).getCell(5));
		cage2.addCell(g.getRowList().get(0).getCell(6));
		g.addCage(cage2);
		Cage cage3 = new Cage(3, 2);
		cage3.addCell(g.getRowList().get(0).getCell(7));
		cage3.addCell(g.getRowList().get(0).getCell(8));
		g.addCage(cage3);
		solver.present(g);
		System.out.println("Row 0, Cell 1: " + g.getRowList().get(0).getCell(1).getPossibleVals());
		System.out.println("Row 0, Cell 7: " + g.getRowList().get(0).getCell(7).getPossibleVals());
		System.out.println("Row 0, Cell 8: " + g.getRowList().get(0).getCell(8).getPossibleVals());
		
	}	
}
