package main.java;

public class ValidateGrid {		//run at end to verify all cells committed, no dupes, 45 sum in all non cage regions

	public boolean isValid(Grid g){		//temporary very basic validation
		for (Row row: g.getRowList()){
			if (row.getSumVal() != 0){
				System.out.println("Row sum: "+ row.getSumVal());
				return false;
			}
		}
		for (Column col: g.getColList()){
			if (col.getSumVal() != 0){
				System.out.println("Column sum: " + col.getSumVal());
				return false;
			}
		}
		for (Box box: g.getBoxList()){
			if (box.getSumVal() != 0){
				System.out.println("Box sum: " + box.getSumVal());
				return false;
			}
		}
		return true;
	}
}

