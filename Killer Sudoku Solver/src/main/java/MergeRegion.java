package main.java;

public class MergeRegion {

	public Row mergeRegions(Row row1, Row row2){
		Row row3 = new Row('z');
		//TODO append all relevant row1/row2 attributes and save to row3
		//run exclusion rules on row3
		//getInclusion needs to be altered at .equals(region)
		//create array of contained rows; if (mergedRow.getRowList().contains(cell.getRow)) inRow++;
		return row3;
	}
	
	public Column mergeRegions(Column col1, Column col2){
		Column col3 = new Column('z');
		return col3;
	}
	
	public Box mergeRegions(Box box1, Box box2){
		Box box3 = new Box('z');
		return box3;
	}
}
