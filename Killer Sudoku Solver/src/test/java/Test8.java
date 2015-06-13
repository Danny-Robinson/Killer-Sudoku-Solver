package test.java;

import main.java.Cage;
import main.java.Grid;
import main.java.SolveStrats;

public class Test8 {	//for row exlusion 2 included, passes for 2 of same cage and of diff cages (dont have to be adjacent)

	public static void main(String [] args){
		Grid g = new Grid();
		SolveStrats solver = new SolveStrats();
		Cage cage = new Cage(6, 2);
		cage.addCell(g.getRowList().get(0).getCell(0));
		cage.addCell(g.getRowList().get(0).getCell(1));
		g.addCage(cage);
		Cage cage1 = new Cage(15, 3);
		cage1.addCell(g.getRowList().get(0).getCell(2));
		cage1.addCell(g.getRowList().get(0).getCell(3));
		cage1.addCell(g.getRowList().get(0).getCell(4));
		g.addCage(cage1);
		Cage cage2 = new Cage(17, 2);
		cage2.addCell(g.getRowList().get(0).getCell(5));
		cage2.addCell(g.getRowList().get(0).getCell(6));
		g.addCage(cage2);
		Cage cage3 = new Cage(8, 2);
		cage3.addCell(g.getRowList().get(2).getCell(7));
		cage3.addCell(g.getRowList().get(1).getCell(7));
		g.addCage(cage3);
		Cage cage4 = new Cage(22, 4);
		cage4.addCell(g.getRowList().get(0).getCell(7));
		cage4.addCell(g.getRowList().get(0).getCell(8));
		cage4.addCell(g.getRowList().get(2).getCell(8));
		cage4.addCell(g.getRowList().get(3).getCell(8));
		g.addCage(cage4);
		
		Test8 t8 = new Test8();
		t8.printPoss(g);
		solver.rowExclusion(g, g.getRowList().get(0));
		t8.printPoss(g);
	}	
	
	private void printPoss(Grid g){
		for (int i = 0; i < 9; i++ ){
			System.out.printf("Row 0, Cell %d: ",i);
			System.out.println(g.getRowList().get(0).getCell(i).getPossibleVals());
		}
		System.out.println();
	}	
}
