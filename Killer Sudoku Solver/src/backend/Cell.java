package backend;

import java.util.ArrayList;

public class Cell {
	
	private static int cellCount;
	private String coord;
	private boolean committed = false;
	private int committedVal;
	private Column Column;
	private Row Row;
	private Box Box;
	private Cage Cage;
	private ArrayList<Integer> possibleVals = new ArrayList<Integer>();

	
	public Cell(String coord){
		this.coord = coord;
		setCellCount(getCellCount() + 1);
	}
	
	public void setCoord(String coord){
		this.coord = coord;
	}
	
	public String getCoord(){
		return this.coord;
	}

	public static int getCellCount() {
		return cellCount;
	}

	private static void setCellCount(int cellCount) {
		Cell.cellCount = cellCount;
	}

	public int getCommittedVal() {
		return committedVal;
	}

	public void setCommittedVal(int committedVal, Grid g) {
		//System.out.println(g.getRowList().get(4).getCell(6).getPossibleVals());
		if (committedVal > 0 && committedVal < 10 && !this.isCommitted()){	
			this.setCommitted(true);
			this.committedVal = committedVal;
			SolveStrats s = new SolveStrats();
			s.refactor(g, this);
			//System.out.println(g.getRowList().get(4).getCell(6).getPossibleVals());
			Cage newCage = new Cage(committedVal, 1); //create copy
			Cage oldCage = this.getCage();
			oldCage.decCageSize();
			oldCage.setSumVal(oldCage.getSumVal() - committedVal);
			oldCage.removeCell(this);
			//newCage.setSumVal(committedVal);
			newCage.addCell(this);		
			g.addCage(newCage);
			System.out.println("Committed val: " + committedVal + " at " + this.getCoord());
	//		System.out.println("Cage Sum: " + cage.getSumVal());
			//TODO ADD CAGE TO REGIONLISTS
			//this.setCage(new Cage(this.getCommittedVal(), 1));
			oldCage.refreshCage();
		}else {
			System.out.println("commit attempt: " + committedVal + " at " + this.getCoord());
		}
			
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean isCommitted) {
		this.committed = isCommitted;
	}

	public ArrayList<Integer> getPossibleVals() {
		return possibleVals;
	}

	public void setPossibleVals(ArrayList<Integer> possibleVals) {
		this.possibleVals = possibleVals;
	}
	
	public void addPossibleVal(int poss){
		possibleVals.add(poss);
	}
	
	public void removePossibleVal(int poss){
		int index = possibleVals.indexOf(poss);
		if (index > - 1) possibleVals.remove(index);
	}

	public Column getColumn() {
		return Column;
	}

	public void setColumn(Column column) {
		Column = column;
	}

	public Row getRow() {
		return Row;
	}

	public void setRow(Row row) {
		Row = row;
	}

	public Box getBox() {
		return Box;
	}

	public void setBox(Box box) {
		Box = box;
	}

	public Cage getCage() {
		return Cage;
	}

	public void setCage(Cage cage) {
		Cage = cage;
	}
}
