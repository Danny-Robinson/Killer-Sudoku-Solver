package test.java;

import main.java.Cage;
import main.java.Grid;
import main.java.SolveStrats;

public class Test4 {	//refactor possibilities after commmitting cell
	public static void main(String[] args){
		Grid g = new Grid();
		Cage cage = new Cage(15, 4);
		cage.addCell(g.getRowList().get(0).getCell(0));
		cage.addCell(g.getRowList().get(0).getCell(1));
		cage.addCell(g.getRowList().get(0).getCell(2));
		cage.addCell(g.getRowList().get(1).getCell(1));		//cage of tetris T at the top of box 0
		g.addCage(cage);
//		System.out.println(g.getCageList().get(0).getList().get(0).getPossibleVals());
		System.out.println(g.getCageList().get(0).getCell(0).getPossibleVals());
		System.out.println(g.getCageList().get(0).getCell(3).getPossibleVals());
		SolveStrats s = new SolveStrats();
		cage.getCell(0).setCommittedVal(3, g);					
		cage.getCell(2).setCommittedVal(7, g);
		System.out.println(g.getCageList().get(0).getCell(0).getPossibleVals());
		System.out.println(g.getCageList().get(0).getCell(1).getPossibleVals());
		s.refactor(g, g.getCageList().get(0).getCell(0));
		s.refactor(g, g.getCageList().get(0).getCell(1)); //breaks after later implementations refine cells into their own cage
		System.out.println(g.getCageList().get(0).getCell(0).getPossibleVals());
		System.out.println(g.getCageList().get(0).getCell(1).getPossibleVals());
	}
}
