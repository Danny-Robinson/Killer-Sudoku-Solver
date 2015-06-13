package test.java;

import main.java.Cage;
import main.java.Cell;
import main.java.Grid;
import main.java.SolveStrats;

public class Test7 {	//remove invalid pair poss
	public static void main(String [] args){
		Grid g = new Grid();
		SolveStrats solver = new SolveStrats();
		Cage cage = new Cage(3, 2);
		cage.addCell(g.getRowList().get(0).getCell(0));
		cage.addCell(g.getRowList().get(0).getCell(1));
		g.addCage(cage);
		Cage cage1 = new Cage(7, 2);
		cage1.addCell(g.getRowList().get(0).getCell(2));
		cage1.addCell(g.getRowList().get(0).getCell(3));
		g.addCage(cage1);
		Cage cage2 = new Cage(18, 3);
		cage2.addCell(g.getRowList().get(0).getCell(4));
		cage2.addCell(g.getRowList().get(0).getCell(5));
		cage2.addCell(g.getRowList().get(0).getCell(6));
		g.addCage(cage2);
		Cage cage3 = new Cage(17, 2);
		cage3.addCell(g.getRowList().get(0).getCell(7));
		cage3.addCell(g.getRowList().get(0).getCell(8));
		g.addCage(cage3);
		
		Test7 t7 = new Test7();
		t7.printPoss(g);
		solver.present(g);
		System.out.println();
		t7.printPoss(g);
		System.out.println();
		t7.printPoss(g);
		System.out.println();
		solver.present(g);
		t7.printPoss(g);
		for (Cell cell: g.getRowList().get(0).getCellList()){
			if (cell.isCommitted()) System.out.println("Committed" + cell.getCommittedVal());
		}
		
	}	
	
	private void printPoss(Grid g){
		for (int i = 0; i < 9; i++ ){
			System.out.printf("Row 0, Cell %d: ",i);
			System.out.println(g.getRowList().get(0).getCell(i).getPossibleVals());
		}
	}
}

