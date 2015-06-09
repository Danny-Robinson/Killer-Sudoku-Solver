package testing;

import backend.Cage;
import backend.Grid;
import backend.SolveStrats;

public class Test5 {	//exclusion rule for row
	public static void main(String [] args){
		Grid g = new Grid();
		SolveStrats solver = new SolveStrats();
		Cage cage = new Cage(23, 4);
		cage.addCell(g.getRowList().get(0).getCell(0));
		cage.addCell(g.getRowList().get(0).getCell(1));
		cage.addCell(g.getRowList().get(0).getCell(2));
		cage.addCell(g.getRowList().get(0).getCell(3));
		g.addCage(cage);
		Cage cage2 = new Cage(20, 4);
		cage2.addCell(g.getRowList().get(0).getCell(4));
		cage2.addCell(g.getRowList().get(0).getCell(5));
		cage2.addCell(g.getRowList().get(0).getCell(6));
		cage2.addCell(g.getRowList().get(0).getCell(7));
		g.addCage(cage2);
		Cage cage3 = new Cage(3, 2);
		cage3.addCell(g.getRowList().get(0).getCell(8));
		cage3.addCell(g.getRowList().get(1).getCell(8));
		g.addCage(cage3);
//		for (Cage tempCage: g.getCageList()){
//			for (Cell cell: tempCage.getList()){
//				System.out.print("Cage: " + tempCage.getCageNum() + ": ");
//				System.out.println(cell.getCoord());
//			}
//		}
		
		solver.rowExclusion(g, g.getRowList().get(0));
		System.out.println("Row 0, Cell 8, Committed: " + g.getRowList().get(0).getCell(8).getCommittedVal());
		System.out.println("Row 0, Cell 8, Committed: " + g.getRowList().get(1).getCell(8).getCommittedVal());
		System.out.println("Row 0, Cell 1: " + g.getRowList().get(0).getCell(1).getPossibleVals());
		System.out.println("Row 0, Cell 3: " + g.getRowList().get(0).getCell(7).getPossibleVals());
		System.out.println("Row 0, Cell 8: " + g.getRowList().get(0).getCell(8).getPossibleVals());
		System.out.println("Row 1, Cell 8: " + g.getRowList().get(1).getCell(8).getPossibleVals());
	}
}
