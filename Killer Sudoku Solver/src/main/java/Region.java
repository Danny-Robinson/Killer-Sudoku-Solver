package main.java;
import java.util.ArrayList;


public abstract class Region {   //superclass for cell/cage containers, N.B cages should never contain cages
	protected int sumVal;
	protected ArrayList<Cell> cells;
	protected ArrayList<Cage> cages = new ArrayList<Cage>();
	
	public ArrayList<Cell> getCellList(){
		return cells;
	}
	
	public ArrayList<Cage> getCageList(){
		return cages;
	}
	
	public void setSumVal(int sumVal){
		this.sumVal = sumVal;
	}
	
	public int getSumVal(){
		return sumVal;
	}
	
	public Cell getCell(int regionIndex){
		return getCellList().get(regionIndex);
	}
	
	public Cell getCell(char regionIndex){
		return getCellList().get(regionIndex);
	}
	
	public void addCell(Cell cell){
		cells.add(cell);
	}
	
	public void removeCell(Cell cell){
		cells.remove(cell);
	}
	
	public void addCage(Cage cage){
		cages.add(cage);
	}
	
	public void removeCage(Cage cage){
		cages.remove(cage);
	}
}
