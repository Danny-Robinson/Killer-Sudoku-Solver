package backend;
import java.util.ArrayList;


public class Column extends Region{
	
	private int columnVal;
	private final static String REGION_TYPE = "Column";
	
	
	public Column(int columnVal){
		this.setColumnVal(columnVal);
		cells = new ArrayList<Cell>();
		setSumVal(45);
	}

	public int getColumnVal() {
		return columnVal;
	}

	public void setColumnVal(int columnVal) {
		this.columnVal = columnVal;
	}

	public static String getRegionType() {
		return REGION_TYPE;
	}
}
