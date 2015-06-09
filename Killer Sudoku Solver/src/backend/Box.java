package backend;

import java.util.ArrayList;

public class Box extends Region{

	private int boxVal;
	private final static String REGION_TYPE = "Box";
	
	public Box(int boxVal){
		this.setBoxVal(boxVal);
		cells = new ArrayList<Cell>();
		setSumVal(45);
	}

	public int getBoxVal() {
		return boxVal;
	}

	public void setBoxVal(int boxVal) {
		this.boxVal = boxVal;
	}

	public static String getRegionType() {
		return REGION_TYPE;
	}
}
