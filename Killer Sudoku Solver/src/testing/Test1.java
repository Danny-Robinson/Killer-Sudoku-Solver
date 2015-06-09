package testing;
import java.util.ArrayList;

import backend.Box;
import backend.Cell;
import backend.Column;
import backend.Row;

public class Test1 {	//create grid of cells
	
	Column column1; Column column2; Column column3;	Column column4;	Column column5;	Column column6;	Column column7;	Column column8; Column column9;
	Row rowA; Row rowB;	Row rowC; Row rowD;	Row rowE; Row rowF;	Row rowG; Row rowH;	Row rowI;
	Box box1; Box box2; Box box3; Box box4; Box box5; Box box6; Box box7; Box box8; Box box9;
	private ArrayList<Row> rowList = new ArrayList<Row>();
	private ArrayList<Column> colList = new ArrayList<Column>();
	private ArrayList<Box> boxList = new ArrayList<Box>();
	
	public static void main(String [] args){
		Test1 td1 = new Test1(); 
		td1.setUpGrid();
		System.out.println("Grid instantiated");
		td1.printRows();
		System.out.println("Grid printed");
	}

	private void printRows(){
		for (Row datRow: rowList ){
			ArrayList<Cell> cellList = datRow.getCellList();
			for (Cell datCell: cellList){
				System.out.println(datCell.getCoord());
			}	
		}
	}
	private void setUpGrid() {
		formRows();
		formColumns();
		formBoxes();
		formCells();
	}

	private void formBoxes() {
		box1 = new Box(1);
		box2 = new Box(2);
		box3 = new Box(3);
		box4 = new Box(4);
		box5 = new Box(5);
		box6 = new Box(6);
		box7 = new Box(7);
		box8 = new Box(8);
		box9 = new Box(9);
	}

	private void formColumns() {
		column1 = new Column(1);
		column2 = new Column(2);
		column3 = new Column(3);
		column4 = new Column(4);
		column5 = new Column(5);
		column6 = new Column(6);
		column7 = new Column(7);
		column8 = new Column(8);
		column9 = new Column(9);
		colList.add(column1);
		colList.add(column2);
		colList.add(column3);
		colList.add(column4);
		colList.add(column5);
		colList.add(column6);
		colList.add(column7);
		colList.add(column8);
		colList.add(column9);
		
	}

	private void formRows() {
		rowA = new Row('a');
		rowB = new Row('b');
		rowC = new Row('c');
		rowD = new Row('d');
		rowE = new Row('e');
		rowF = new Row('f');
		rowG = new Row('g');
		rowH = new Row('h');
		rowI = new Row('i');
		rowList.add(rowA);
		rowList.add(rowB);
		rowList.add(rowC);
		rowList.add(rowD);
		rowList.add(rowE);
		rowList.add(rowF);
		rowList.add(rowG);
		rowList.add(rowH);
		rowList.add(rowI);
	}
	
	private void formCells() {
		for (char row = 'a'; row <= 'i'; row++){
			for (int i = 1; i <=9; i++){
				String coord = "" + row + i;
				Cell cell = new Cell(coord);
				int index = (int) row - 97;
				Row rowRef = rowList.get(index);
				rowRef.addCell(cell);
//				Column colRef = colList.get(i);
//				colRef.addCell(cell);
			}
		}
	}

	public ArrayList<Box> getBoxList() {
		return boxList;
	}

	public void setBoxList(ArrayList<Box> boxList) {
		this.boxList = boxList;
	}
}
