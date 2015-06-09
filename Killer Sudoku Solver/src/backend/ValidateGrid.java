package backend;

public class ValidateGrid {		//run at end to verify all cells committed, no dupes, 45 sum in all non cage regions

	public boolean isValid(Grid g){		//temporary very basic validation
		int sum = 405;
		for (Row row: g.getRowList()){
			for (Cell cell: row.getCellList()){
				if (cell.isCommitted()){
					sum -= cell.getCommittedVal();
				}
			}
		}
		if (sum == 0){
			return true;
		} else {
			return false;
		}
	}
}
