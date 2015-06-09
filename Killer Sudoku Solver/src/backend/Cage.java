package backend;

import java.util.ArrayList;

public class Cage extends Region{
	private static int cageCount;
	private int cageNum;
	private int cageSize;
	private int cellCount;
	private final static String REGION_TYPE = "Cage";
	private ArrayList<Region> fullInclusion = new ArrayList<Region>();
	
	
	public Cage(int inputSum, int cageSize){
		cageNum = cageCount;
		setCageCount(getCageCount() + 1);
		cells = new ArrayList<Cell>();
		setSumVal(inputSum);
		setCageSize(cageSize);
	}
	
	Cage(int cageSize){
		cageNum = cageCount;
		setCageCount(getCageCount() + 1);
		cells = new ArrayList<Cell>();
		setCageSize(cageSize);
	}
	
	public Cage(int sum, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public void addCell(Cell cell){
		super.addCell(cell);
		this.cellCount++;
		if (cellCount == cageSize){
			Possible poss = new Possible();
			poss.setPoss(this);
		}
		cell.setCage(this);
	}

	public void refreshCage(){
		Possible poss = new Possible();
		if (this.getCageSize() > 1){
			poss.setPoss(this, 0);
		} else if (this.getCageSize() ==1 ){
			poss.setPoss(this);
		}
	}
	
	public int getCageSize(){
		cageSize = this.getCellList().size();
		return cageSize;
	}
	
	public void setCageSize(int cageSize){
		this.cageSize = cageSize;
	}

	public static String getRegionType() {
		return REGION_TYPE;
	}

	public ArrayList<Region> getFullInclusion() {
		return fullInclusion;
	}

	public void setFullInclusion(ArrayList<Region> fullInclusion) {
		this.fullInclusion = fullInclusion;
	}
	
	public void addFullInclusion(Region region){
		fullInclusion.add(region);
	}
	
	public void removeFullInclusion(Region region){
		fullInclusion.remove(region);
	}

	public static int getCageCount() {
		return cageCount;
	}

	public static void setCageCount(int cageCount) {
		Cage.cageCount = cageCount;
	}

	public int getCageNum() {
		return cageNum;
	}

	public void setCageNum(int cageNum) {
		this.cageNum = cageNum;
	}
	
	public void decCageSize(){
		cageSize = getCageSize() - 1;
	}

	public void addCell(Cell tempCell2, int i) { //for adding to tempCage
		super.addCell(tempCell2);
		this.cellCount++;
		if (cellCount == cageSize){
			Possible poss = new Possible();
			poss.setPoss(this, 0);
		}
	}

}
