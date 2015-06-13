package main.java;

import java.util.ArrayList;

public class Row extends Region{

	private char rowVal;
	private final static String REGION_TYPE = "Row";
			
	public Row(char rowVal){
		this.setRowVal(rowVal);
		cells = new ArrayList<Cell>();
		setSumVal(45);
	}
	
	public char getRowVal() {
		return rowVal;
	}

	public void setRowVal(char rowVal) {
		this.rowVal = rowVal;
	}

	public static String getRegionType() {
		return REGION_TYPE;
	}
	
}
