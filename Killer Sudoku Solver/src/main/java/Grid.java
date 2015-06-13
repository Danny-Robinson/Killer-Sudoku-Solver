package main.java;

import java.util.ArrayList;

public class Grid {
	
	public Grid() {
		createGrid();
	}
	
	public void createGrid(){
		fillRegionLists();
		fillRows();
		fillCols();
		fillBoxes();
	}
	
	//ArrayList<Cell> cellList = new ArrayList<Cell>();
	private Cell cellA0 = new Cell("A0"); private Cell cellA1 = new Cell("A1"); private Cell cellA2 = new Cell("A2"); Cell cellA3 = new Cell("A3"); Cell cellA4 = new Cell("A4"); Cell cellA5 = new Cell("A5"); Cell cellA6 = new Cell("A6"); Cell cellA7 = new Cell("A7"); private Cell cellA8 = new Cell("A8");
	Cell cellB0 = new Cell("B0"); Cell cellB1 = new Cell("B1"); Cell cellB2 = new Cell("B2"); Cell cellB3 = new Cell("B3"); Cell cellB4 = new Cell("B4"); Cell cellB5 = new Cell("B5"); Cell cellB6 = new Cell("B6"); Cell cellB7 = new Cell("B7"); Cell cellB8 = new Cell("B8");
	Cell cellC0 = new Cell("C0"); Cell cellC1 = new Cell("C1"); Cell cellC2 = new Cell("C2"); Cell cellC3 = new Cell("C3"); Cell cellC4 = new Cell("C4"); Cell cellC5 = new Cell("C5"); Cell cellC6 = new Cell("C6"); Cell cellC7 = new Cell("C7"); Cell cellC8 = new Cell("C8");
	Cell cellD0 = new Cell("D0"); Cell cellD1 = new Cell("D1"); Cell cellD2 = new Cell("D2"); Cell cellD3 = new Cell("D3"); Cell cellD4 = new Cell("D4"); Cell cellD5 = new Cell("D5"); Cell cellD6 = new Cell("D6"); Cell cellD7 = new Cell("D7"); Cell cellD8 = new Cell("D8");
	Cell cellE0 = new Cell("E0"); Cell cellE1 = new Cell("E1"); Cell cellE2 = new Cell("E2"); Cell cellE3 = new Cell("E3"); Cell cellE4 = new Cell("E4"); Cell cellE5 = new Cell("E5"); Cell cellE6 = new Cell("E6"); Cell cellE7 = new Cell("E7"); Cell cellE8 = new Cell("E8");
	Cell cellF0 = new Cell("F0"); Cell cellF1 = new Cell("F1"); Cell cellF2 = new Cell("F2"); Cell cellF3 = new Cell("F3"); Cell cellF4 = new Cell("F4"); Cell cellF5 = new Cell("F5"); Cell cellF6 = new Cell("F6"); Cell cellF7 = new Cell("F7"); Cell cellF8 = new Cell("F8");
	Cell cellG0 = new Cell("G0"); Cell cellG1 = new Cell("G1"); Cell cellG2 = new Cell("G2"); Cell cellG3 = new Cell("G3"); Cell cellG4 = new Cell("G4"); Cell cellG5 = new Cell("G5"); Cell cellG6 = new Cell("G6"); Cell cellG7 = new Cell("G7"); Cell cellG8 = new Cell("G8");
	Cell cellH0 = new Cell("H0"); Cell cellH1 = new Cell("H1"); Cell cellH2 = new Cell("H2"); Cell cellH3 = new Cell("H3"); Cell cellH4 = new Cell("H4"); Cell cellH5 = new Cell("H5"); Cell cellH6 = new Cell("H6"); Cell cellH7 = new Cell("H7"); Cell cellH8 = new Cell("H8");
	Cell cellI0 = new Cell("I0"); Cell cellI1 = new Cell("I1"); Cell cellI2 = new Cell("I2"); Cell cellI3 = new Cell("I3"); Cell cellI4 = new Cell("I4"); Cell cellI5 = new Cell("I5"); Cell cellI6 = new Cell("I6"); Cell cellI7 = new Cell("I7"); Cell cellI8 = new Cell("I8");
	
	
	private void fillRows(){
		for (Row row: getRowList()){
			switch (getRowList().indexOf(row)){
				case 0:
					row.addCell(getCellA0());
					row.addCell(getCellA1());
					row.addCell(getCellA2());
					row.addCell(cellA3);
					row.addCell(cellA4);
					row.addCell(cellA5);
					row.addCell(cellA6);
					row.addCell(cellA7);
					row.addCell(cellA8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 1:
					row.addCell(cellB0);
					row.addCell(cellB1);
					row.addCell(cellB2);
					row.addCell(cellB3);
					row.addCell(cellB4);
					row.addCell(cellB5);
					row.addCell(cellB6);
					row.addCell(cellB7);
					row.addCell(cellB8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 2:
					row.addCell(cellC0);
					row.addCell(cellC1);
					row.addCell(cellC2);
					row.addCell(cellC3);
					row.addCell(cellC4);
					row.addCell(cellC5);
					row.addCell(cellC6);
					row.addCell(cellC7);
					row.addCell(cellC8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 3:
					row.addCell(cellD0);
					row.addCell(cellD1);
					row.addCell(cellD2);
					row.addCell(cellD3);
					row.addCell(cellD4);
					row.addCell(cellD5);
					row.addCell(cellD6);
					row.addCell(cellD7);
					row.addCell(cellD8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 4:
					row.addCell(cellE0);
					row.addCell(cellE1);
					row.addCell(cellE2);
					row.addCell(cellE3);
					row.addCell(cellE4);
					row.addCell(cellE5);
					row.addCell(cellE6);
					row.addCell(cellE7);
					row.addCell(cellE8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 5:
					row.addCell(cellF0);
					row.addCell(cellF1);
					row.addCell(cellF2);
					row.addCell(cellF3);
					row.addCell(cellF4);
					row.addCell(cellF5);
					row.addCell(cellF6);
					row.addCell(cellF7);
					row.addCell(cellF8);
					row.addCell(cellF1);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 6:
					row.addCell(cellG0);
					row.addCell(cellG1);
					row.addCell(cellG2);
					row.addCell(cellG3);
					row.addCell(cellG4);
					row.addCell(cellG5);
					row.addCell(cellG6);
					row.addCell(cellG7);
					row.addCell(cellG8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 7:
					row.addCell(cellH0);
					row.addCell(cellH1);
					row.addCell(cellH2);
					row.addCell(cellH3);
					row.addCell(cellH4);
					row.addCell(cellH5);
					row.addCell(cellH6);
					row.addCell(cellH7);
					row.addCell(cellH8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
				case 8:
					row.addCell(cellI0);
					row.addCell(cellI1);
					row.addCell(cellI2);
					row.addCell(cellI3);
					row.addCell(cellI4);
					row.addCell(cellI5);
					row.addCell(cellI6);
					row.addCell(cellI7);
					row.addCell(cellI8);
					for (Cell cell: row.getCellList()){
						cell.setRow(row);
					}
				break;
			}
		}
	}
	
	private void fillCols(){
		for (Column col: getColList()){
			switch (getColList().indexOf(col)){
				case 0:
					col.addCell(getCellA0());
					col.addCell(cellB0);
					col.addCell(cellC0);
					col.addCell(cellD0);
					col.addCell(cellE0);
					col.addCell(cellF0);
					col.addCell(cellG0);
					col.addCell(cellH0);
					col.addCell(cellI0);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 1:
					col.addCell(getCellA1());
					col.addCell(cellB1);
					col.addCell(cellC1);
					col.addCell(cellD1);
					col.addCell(cellE1);
					col.addCell(cellF1);
					col.addCell(cellG1);
					col.addCell(cellH1);
					col.addCell(cellI1);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 2:
					col.addCell(getCellA2());
					col.addCell(cellB2);
					col.addCell(cellC2);
					col.addCell(cellD2);
					col.addCell(cellE2);
					col.addCell(cellF2);
					col.addCell(cellG2);
					col.addCell(cellH2);
					col.addCell(cellI2);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 3:
					col.addCell(cellA3);
					col.addCell(cellB3);
					col.addCell(cellC3);
					col.addCell(cellD3);
					col.addCell(cellE3);
					col.addCell(cellF3);
					col.addCell(cellG3);
					col.addCell(cellH3);
					col.addCell(cellI3);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 4:
					col.addCell(cellA4);
					col.addCell(cellB4);
					col.addCell(cellC4);
					col.addCell(cellD4);
					col.addCell(cellE4);
					col.addCell(cellF4);
					col.addCell(cellG4);
					col.addCell(cellH4);
					col.addCell(cellI4);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 5:
					col.addCell(cellA5);
					col.addCell(cellB5);
					col.addCell(cellC5);
					col.addCell(cellD5);
					col.addCell(cellE5);
					col.addCell(cellF5);
					col.addCell(cellG5);
					col.addCell(cellH5);
					col.addCell(cellI5);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 6:
					col.addCell(cellA6);
					col.addCell(cellB6);
					col.addCell(cellC6);
					col.addCell(cellD6);
					col.addCell(cellE6);
					col.addCell(cellF6);
					col.addCell(cellG6);
					col.addCell(cellH6);
					col.addCell(cellI6);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 7:
					col.addCell(cellA7);
					col.addCell(cellB7);
					col.addCell(cellC7);
					col.addCell(cellD7);
					col.addCell(cellE7);
					col.addCell(cellF7);
					col.addCell(cellG7);
					col.addCell(cellH7);
					col.addCell(cellI7);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
					}
					break;
				case 8:
					col.addCell(cellA8);
					col.addCell(cellB8);
					col.addCell(cellC8);
					col.addCell(cellD8);
					col.addCell(cellE8);
					col.addCell(cellF8);
					col.addCell(cellG8);
					col.addCell(cellH8);
					col.addCell(cellI8);
					for (Cell cell: col.getCellList()){
						cell.setColumn(col);
//						System.out.println(cell.getCoord());
//						System.out.println(cell.getColumn().getColumnVal());
					}
					break;
			}
		}
	}
	
	private void fillBoxes(){
		for (Box box: getBoxList()){
			switch (getBoxList().indexOf(box)){
				case 0:
					box.addCell(getCellA0());
					box.addCell(getCellA1());
					box.addCell(getCellA2());
					box.addCell(cellB0);
					box.addCell(cellB1);
					box.addCell(cellB2);
					box.addCell(cellC0);
					box.addCell(cellC1);
					box.addCell(cellC2);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 1:
					box.addCell(cellA3);
					box.addCell(cellA4);
					box.addCell(cellA5);
					box.addCell(cellB3);
					box.addCell(cellB4);
					box.addCell(cellB5);
					box.addCell(cellC3);
					box.addCell(cellC4);
					box.addCell(cellC5);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 2:
					box.addCell(cellA6);
					box.addCell(cellA7);
					box.addCell(cellA8);
					box.addCell(cellB6);
					box.addCell(cellB7);
					box.addCell(cellB8);
					box.addCell(cellC6);
					box.addCell(cellC7);
					box.addCell(cellC8);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 3:
					box.addCell(cellD0);
					box.addCell(cellD1);
					box.addCell(cellD2);
					box.addCell(cellE0);
					box.addCell(cellE1);
					box.addCell(cellE2);
					box.addCell(cellF0);
					box.addCell(cellF1);
					box.addCell(cellF2);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 4:
					box.addCell(cellD3);
					box.addCell(cellD4);
					box.addCell(cellD5);
					box.addCell(cellE3);
					box.addCell(cellE4);
					box.addCell(cellE5);
					box.addCell(cellF3);
					box.addCell(cellF4);
					box.addCell(cellF5);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 5:
					box.addCell(cellD6);
					box.addCell(cellD7);
					box.addCell(cellD8);
					box.addCell(cellE6);
					box.addCell(cellE7);
					box.addCell(cellE8);
					box.addCell(cellF6);
					box.addCell(cellF7);
					box.addCell(cellF8);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 6:
					box.addCell(cellG0);
					box.addCell(cellG1);
					box.addCell(cellG2);
					box.addCell(cellH0);
					box.addCell(cellH1);
					box.addCell(cellH2);
					box.addCell(cellI0);
					box.addCell(cellI1);
					box.addCell(cellI2);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 7:
					box.addCell(cellG3);
					box.addCell(cellG4);
					box.addCell(cellG5);
					box.addCell(cellH3);
					box.addCell(cellH4);
					box.addCell(cellH5);
					box.addCell(cellI3);
					box.addCell(cellI4);
					box.addCell(cellI5);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
				case 8:
					box.addCell(cellG6);
					box.addCell(cellG7);
					box.addCell(cellG8);
					box.addCell(cellH6);
					box.addCell(cellH7);
					box.addCell(cellH8);
					box.addCell(cellI6);
					box.addCell(cellI7);
					box.addCell(cellI8);
					for (Cell cell: box.getCellList()){
						cell.setBox(box);
					}
					break;
			}
		}
	}
	
	private ArrayList<Row> rowList = new ArrayList<Row>();
	Row rowA = new Row('A');
	Row rowB = new Row('B'); 
	Row rowC = new Row('C'); 
	Row rowD = new Row('D');
	Row rowE = new Row('E'); 
	Row rowF = new Row('F');
	Row rowG = new Row('G');
	Row rowH = new Row('H'); 
	Row rowI = new Row('I');
	
	private ArrayList<Column> colList = new ArrayList<Column>();
	Column col0 = new Column(0);
	Column col1 = new Column(1);
	Column col2 = new Column(2); 
	Column col3 = new Column(3); 
	Column col4 = new Column(4);
	Column col5 = new Column(5); 
	Column col6 = new Column(6);
	Column col7 = new Column(7);
	Column col8 = new Column(8);
	
	private ArrayList<Box> boxList = new ArrayList<Box>();
	Box box0 = new Box(0);
	Box box1 = new Box(1);
	Box box2 = new Box(2);
	Box box3 = new Box(3);
	Box box4 = new Box(4);
	Box box5 = new Box(5);
	Box box6 = new Box(6);
	Box box7 = new Box(7);
	Box box8 = new Box(8);
	
	private ArrayList<Cage> cageList = new ArrayList<Cage>();
	
	
	private void fillRegionLists(){
		getRowList().add(rowA);
		getRowList().add(rowB);
		getRowList().add(rowC);
		getRowList().add(rowD);
		getRowList().add(rowE);
		getRowList().add(rowF);
		getRowList().add(rowG);
		getRowList().add(rowH);
		getRowList().add(rowI);
		getColList().add(col0);
		getColList().add(col1);
		getColList().add(col2);
		getColList().add(col3);
		getColList().add(col4);
		getColList().add(col5);
		getColList().add(col6);
		getColList().add(col7);
		getColList().add(col8);
		getBoxList().add(box0);
		getBoxList().add(box1);
		getBoxList().add(box2);
		getBoxList().add(box3);
		getBoxList().add(box4);
		getBoxList().add(box5);
		getBoxList().add(box6);
		getBoxList().add(box7);
		getBoxList().add(box8);
	}

	
	public ArrayList<Row> getRowList() {
		return rowList;
	}

	public void setRowList(ArrayList<Row> rowList) {
		this.rowList = rowList;
	}

	public ArrayList<Column> getColList() {
		return colList;
	}

	public void setColList(ArrayList<Column> colList) {
		this.colList = colList;
	}

	public ArrayList<Box> getBoxList() {
		return boxList;
	}

	public void setBoxList(ArrayList<Box> boxList) {
		this.boxList = boxList;
	}

	public ArrayList<Cage> getCageList() {
		return cageList;
	}

	public void setCageList(ArrayList<Cage> cageList) {
		this.cageList = cageList;
	}
	
	public void addCage(Cage cage){
		cageList.add(cage);
		for (Cell cell: cage.getCellList()){
			if (!cell.getRow().getCageList().contains(cage))
				cell.getRow().addCage(cage);
			if (!cell.getColumn().getCageList().contains(cage))
				cell.getColumn().addCage(cage);
			if (!cell.getBox().getCageList().contains(cage))
				cell.getBox().addCage(cage);
		}
 	}
	
	public void removeCage(Cage cage){
		cageList.remove(cage);
	}

	public Cell getCellA0() {
		return cellA0;
	}

	public void setCellA0(Cell cellA0) {
		this.cellA0 = cellA0;
	}

	public Cell getCellA1() {
		return cellA1;
	}

	public void setCellA1(Cell cellA1) {
		this.cellA1 = cellA1;
	}

	public Cell getCellA2() {
		return cellA2;
	}

	public void setCellA2(Cell cellA2) {
		this.cellA2 = cellA2;
	}

	public Cell getCellA8() {
		return cellA8;
		
	}

	public void addCage(Cage cage, int i) {   //add virtual cage
		// TODO Auto-generated method stub
		
	}
}
