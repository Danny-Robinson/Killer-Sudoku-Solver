package backend;

import java.util.ArrayList;
import java.util.Iterator;

public class SolveStrats {
	
	public void eliminated(Cell tempCell, Grid g){		//if only poss left in cell
		if (tempCell.getPossibleVals().size() == 1 && !tempCell.isCommitted()){
			//System.out.println("Elimination: "); //+ tempCell.getPossibleVals().get(0) + " at " + tempCell.getCoord());
			tempCell.setCommittedVal(tempCell.getPossibleVals().get(0), g);
		}
	}
	
	public void refineCell(Grid g, Cell cell){	//remove poss where other poss not present
		Cage cage = cell.getCage();
		int cageSize = cage.getCageSize();
		Cell cell2;
		//TODO do for cell cage size 3 and 4
		

		ArrayList<Integer> possVals = cell.getPossibleVals();
		Iterator<Integer> ite = possVals.iterator();
		
		if (cageSize == 2){
			while (ite.hasNext()){
				int poss = ite.next();
				int requiredPoss = cage.getSumVal() - poss; 
				if (cell.equals(cage.getCell(0))){
					cell2 = cage.getCell(1);
				}else{
					cell2 = cage.getCell(0);
				}
				
				if (!cell2.getPossibleVals().contains(requiredPoss)){	//wrapped to Integer by arrayList?!?
					//possValsCopy.remove(requiredPoss);
					//cell.getPossibleVals().remove((Integer) requiredPoss);
					ite.remove();
				}
			}
			//cell.setPossibleVals(possValsCopy);
		}	
	}

	public void refineGrid(Grid g){
		for (Row row: g.getRowList()){
			for (Cell cell: row.getCellList()){
				refineCell(g, cell);
			}
		}
	}
	
	public void refactor(Grid g, Cell cell){	//if cell is committed, remove poss from cells in its row column and box, then elim 
		Row row = cell.getRow();
		Box box = cell.getBox();
		Column col = cell.getColumn();
		int val = cell.getCommittedVal();
		for (Cell tempCell: row.getCellList()){
			tempCell.removePossibleVal(val);
			eliminated(tempCell, g);				
		}
		for (Cell tempCell: col.getCellList()){
			tempCell.removePossibleVal(val);
			eliminated(tempCell, g);
		}
		for (Cell tempCell: box.getCellList()){
			tempCell.removePossibleVal(val);
			eliminated(tempCell, g);
		}
	}
	
	private void boxExclusion(Grid g, Box box) {	//check box for solo or duo excluded cells, create new virtual cage for duo or commit solo 
		int sum = 45;
		Cell tempCell = new Cell("Z9");
		Cell tempCell2 = new Cell("Z9");
		Cell tempCell3 = new Cell("Z9");
		Cell tempCell4 = new Cell("Z9");
		int temps = 0;
		int temps2 = 0;
		
		for (Cage cage: box.getCageList()){
			//if fully included in a row
			int inclusion = getInclusion(cage, box);
			if (cage.getFullInclusion().contains(box)){
				sum -= cage.getSumVal();
			}else if (inclusion == 1 && cage.getCageSize() != 1){
				for (Cell cell: cage.getCellList()){
					if (cell.getBox().equals(box)){
						if (temps == 0){
							tempCell = cell;
							temps++;
						}else if (temps == 1){
							tempCell2 = cell;	
							temps++;
						}else{
							temps++;
						}
					}
				}
			}else if (inclusion == 2){
				for (Cell cell: cage.getCellList()){
					if (cell.getBox().equals(box)){
						if (temps2 == 0){
							tempCell3 = cell;
							temps2++;
						}else if (temps2 == 1){
							tempCell4 = cell;
							temps2++;
						}else {
							temps2++;
						}
					}	
				}
			}
		}	
		if (temps == 1 && temps2 == 0){
			tempCell.setCommittedVal(sum, g);
			System.out.println("Box: 1 Solos found and cell committed " + tempCell.getCoord());
		}
		if (temps == 2 && temps2 == 0){
			Cage Cage = new Cage(sum, 2);
			Cage.addCell(tempCell, 0);
			Cage.addCell(tempCell2, 0);
			Possible p = new Possible();
			p.setPoss(Cage,0);			
			System.out.println("Box: 2 Solos grouped and poss removed");
		}
		if (temps2 == 2 && temps == 0){
			Cage Cage = new Cage(sum, 2);
			Cage.addCell(tempCell3, 0);
			Cage.addCell(tempCell4, 0);
			Possible p = new Possible();
			p.setPoss(Cage,0);
			System.out.println("2 included grouped and poss removed");
		}
		//TODO expand to include 3 solos or double and a single
	}
	
	private void colExclusion(Grid g, Column col) { //check col for solo or duo excluded cells, create new virtual cage for duo or commit solo 
		int sum = 45;
		Cell tempCell = new Cell("Z9");
		Cell tempCell2 = new Cell("Z9");
		Cell tempCell3 = new Cell("Z9");
		Cell tempCell4 = new Cell("Z9");
		int temps = 0;
		int temps2 = 0;
		
		for (Cage cage: col.getCageList()){		//TODO committed cell cages must be added to the col row and box cagelists
			int inclusion = getInclusion(cage, col);
			if (cage.getFullInclusion().contains(col)){
				sum -= cage.getSumVal();
			}else if (inclusion == 1 && cage.getCageSize() != 1){
				for (Cell cell: cage.getCellList()){
					if (cell.getColumn().equals(col)){
						if (temps == 0){
							tempCell = cell;
							temps++;
						}else if (temps == 1){
							tempCell2 = cell;	
							temps++;
						}else{
							temps++;
						}
					}
				}
			}else if (inclusion == 2){
				for (Cell cell: cage.getCellList()){
					if (cell.getColumn().equals(col)){
						if (temps2 == 0){
							tempCell3 = cell;
							temps2++;
						}else if (temps2 == 1){
							tempCell4 = cell;
							temps2++;
						}else {
							temps2++;
						}
					}	
				}
			}
		}	
		if (temps == 1 && temps2 == 0){
			tempCell.setCommittedVal(sum, g);
			System.out.println("Column: 1 Solos found and cell committed " + tempCell.getCoord());
		}
		if (temps == 2 && temps2 == 0){
			Cage Cage = new Cage(sum, 2);
			Cage.addCell(tempCell, 0);
			Cage.addCell(tempCell2, 0);
			Possible p = new Possible();
			p.setPoss(Cage,0);
			System.out.println("2 Solos grouped and poss removed");
		}
		if (temps2 == 2 && temps == 0){
			Cage Cage = new Cage(sum, 2);
			Cage.addCell(tempCell3, 0);
			Cage.addCell(tempCell4, 0);
			Possible p = new Possible();
			p.setPoss(Cage,0);
			System.out.println("2 included grouped and poss removed");
		}
		//TODO expand to include 3 solos
	}
	
	public void rowExclusion(Grid g, Row row) { //check row for solo or duo excluded cells, create new virtual cage for duo or commit solo 
		int sum = 45;
		Cell tempCell = new Cell("Z9");
		Cell tempCell2 = new Cell("Z9");
		Cell tempCell3 = new Cell("Z9");
		Cell tempCell4 = new Cell("Z9");
		int temps = 0;
		int temps2 = 0;
		
		for (Cage cage: row.getCageList()){
			//if fully included in a row
			int inclusion = getInclusion(cage, row);
			if (cage.getFullInclusion().contains(row)){
				sum -= cage.getSumVal();
			}else if (inclusion == 1 && cage.getCageSize() != 1){
				for (Cell cell: cage.getCellList()){
					if (cell.getRow().equals(row)){
						if (temps == 0){
							tempCell = cell;
							temps++;
						}else if (temps == 1){
							tempCell2 = cell;	
							temps++;
						}else{
							temps++;
						}
					}
				}
			}else if (inclusion == 2){
				for (Cell cell: cage.getCellList()){
					if (cell.getRow().equals(row)){
						if (temps2 == 0){
							tempCell3 = cell;
							temps2++;
						}else if (temps2 == 1){
							tempCell4 = cell;
							temps2++;
						}else {
							temps2++;
						}
					}	
				}
			}
		}	
		if (temps == 1 && temps2 == 0){
			tempCell.setCommittedVal(sum, g);
			System.out.println("Row: 1 Solos found and cell committed " + tempCell.getCoord());
		}
		if (temps == 2 && temps2 == 0){
			Cage Cage = new Cage(sum, 2);
			Cage.addCell(tempCell, 0);
			Cage.addCell(tempCell2, 0);
			Possible p = new Possible();
			p.setPoss(Cage,0);
			System.out.println("2 Solos grouped and poss removed");
		}
		if (temps2 == 2 && temps == 0){
			Cage Cage = new Cage(sum, 2);
			Cage.addCell(tempCell3, 0);
			Cage.addCell(tempCell4, 0);
			Possible p = new Possible();
			p.setPoss(Cage,0);
			System.out.println("2 included grouped and poss removed");
		}
		//TODO expand to include 3 solos
	}
	
	public int getInclusion(Cage cage, Region region){	//returns included cells of cage in region. applies full inclusion where appropriate
		int inRow = 0;
		int inColumn = 0;
		int inBox = 0;
		int type = -1;
		try {							//TODO must be a cleaner solution
			region = (Row) region;
			type = 0;
		} catch (ClassCastException cce){
			try {
				region = (Column) region;
				type = 1;
			} catch (ClassCastException cce1){
				region = (Box) region;
				type = 2;
			} finally {
				//System.out.println("Type: " + type);
			}
			
		}
		switch (type){
		 case 0:
			 region = (Row) region;
			 break;
		 case 1:
			 region = (Column) region;
			 break;
		 case 2:
			 region = (Box) region;
			 break;
		}
		
		
		
		for (Cell cell: cage.getCellList()){
			if (cell.getRow().equals(region)){
				inRow++; 
			 } 
			 if (cell.getColumn().equals(region)){
				inColumn++; 
			 }
			 if (cell.getBox().equals(region)){
				inBox++; 
			 }
		}
		if (inRow == cage.getCageSize() && type == 0){
			cage.addFullInclusion((Row) region);
		}
		if (inColumn == cage.getCageSize() && type == 1){
			cage.addFullInclusion((Column) region);
		}
		if (inBox == cage.getCageSize() && type == 2){
			cage.addFullInclusion((Box) region);
		}
		
		switch (type){
		 case 0:
			 return inRow;
		 case 1:
			 return inColumn;
		case 2:
			 return inBox;
		}
		return 0;
		
		
		//TODO work out why I thought this was a good idea
//		if ( inRow > inColumn && inRow > inBox )
//	         return inRow;
//	      else if ( inColumn > inRow && inColumn > inBox )
//	         return inColumn;
//	      else if ( inBox > inRow && inBox > inColumn )
//	         return inBox;
//	      else   
//	         return 0;
	}

	public void present(Grid g) {	//where cage has monopoly over values - do for whole grid. elim after each run
		rowPresent(g);
		elimGrid(g);
		colPresent(g);
		elimGrid(g);
		boxPresent(g);
		elimGrid(g);
	}

	private void boxPresent(Grid g) {		//if fully included, all poss the same and poss == cagesize. remove posses from box
		for (Box box: g.getBoxList()){
			for (Cage cage: box.getCageList()){
				int inc = getInclusion(cage, box);
				if (inc == cage.getCageSize()){
					switch (cage.getCageSize()){
						case 2:
							if (cage.getCell(0).getPossibleVals().equals(cage.getCell(1).getPossibleVals())
								&& cage.getCell(0).getPossibleVals().size() == 2){
								for (Integer poss: cage.getCell(0).getPossibleVals()){
									for (Cell cell: box.getCellList()){
										if (!(cell.equals(cage.getCellList().get(0)) || cell.equals(cage.getCellList().get(1)))){
											cell.removePossibleVal(poss);
										}	
									}
								}
							}
							break;
						case 3:
							//TODO write for cell size 3
							//below solution should be expanded for 3 and 4
//							ArrayList<Integer> common = new ArrayList<Integer>(cage.getCellList().get(0).getPossibleVals());
//							common.retainAll(cage.getCellList().get(1).getPossibleVals());
//							if (common.size() == cage.getCageSize()){
//								for (Integer int1: common){
//									for (Cell cell: box.getCellList()){
//										if (!(cell.equals(cage.getCellList().get(0)) || cell.equals(cage.getCellList().get(1)))){
//											cell.removePossibleVal(int1);
//										}
//									}
//								}
//							}
							break;
						case 4:
							//TODO write for cell size 4
							break;
					}
				}	
			}
		}
	}

	private void colPresent(Grid g) {
		for (Column col: g.getColList()){
			for (Cage cage: col.getCageList()){
				int inc = getInclusion(cage, col);
				if (inc == cage.getCageSize()){
					switch (cage.getCageSize()){
						case 2:
							if (cage.getCell(0).getPossibleVals().equals(cage.getCell(1).getPossibleVals())
								&& cage.getCell(0).getPossibleVals().size() == 2){
								for (Integer poss: cage.getCell(0).getPossibleVals()){
									for (Cell cell: col.getCellList()){
										if (!(cell.equals(cage.getCellList().get(0)) || cell.equals(cage.getCellList().get(1)))){
											cell.removePossibleVal(poss);
										}	
									}
								}
							}
							break;
						case 3:
							//TODO write for cell size 3
							break;
						case 4:
							//TODO write for cell size 4
							break;
					}
				}	
			}
		}
				
	}

	private void rowPresent(Grid g) {
		for (Row row: g.getRowList()){
			for (Cage cage: row.getCageList()){
				int inc = getInclusion(cage, row);
				if (inc == cage.getCageSize()){
					switch (cage.getCageSize()){
						case 2:
							if (cage.getCell(0).getPossibleVals().equals(cage.getCell(1).getPossibleVals())
								&& cage.getCell(0).getPossibleVals().size() == 2){
								for (Integer poss: cage.getCell(0).getPossibleVals()){
									for (Cell cell: row.getCellList()){
										if (!(cell.equals(cage.getCellList().get(0)) || cell.equals(cage.getCellList().get(1)))){
											cell.removePossibleVal(poss);
										}	
									}
								}
							}
							break;
						case 3:
							//TODO write for cell size 3
							//below solution should be expanded for 3 and 4
//							ArrayList<Integer> common = new ArrayList<Integer>(cage.getCellList().get(0).getPossibleVals());
//							common.retainAll(cage.getCellList().get(1).getPossibleVals());
//							if (common.size() == cage.getCageSize()){
//								for (Integer int1: common){
//									for (Cell cell: box.getCellList()){
//										if (!(cell.equals(cage.getCellList().get(0)) || cell.equals(cage.getCellList().get(1)))){
//											cell.removePossibleVal(int1);
//										}
//									}
//								}
//							}
							break;
						case 4:
							//TODO write for cell size 4
							break;
					}
				}	
			}
		}
	}	


	public void go(Grid g) {
		ValidateGrid vG = new ValidateGrid();
		boolean valid = vG.isValid(g);
		while (!valid){
			exclusionGrid(g);
			refineGrid(g);
			present(g);
			valid = vG.isValid(g);
		}
	}
	
	public void exclusionGrid(Grid g){
		SolveStrats s = new SolveStrats();
		for (Row row: g.getRowList())	
			s.rowExclusion(g, row);
		elimGrid(g);
		for (Column col: g.getColList())	
			s.colExclusion(g, col);
		elimGrid(g);
		for (Box box: g.getBoxList())	
			s.boxExclusion(g, box);
		elimGrid(g);
	}

	public void elimGrid(Grid g){
		for (Row row :g.getRowList())
			for (Cell cell: row.getCellList())
				eliminated(cell, g);
	}


}

//public void possExclusion(Grid g) {   //initially used to call exclusion in testing
//	//TODO do for other rows, col and box and greater cell sizes
//	for (Row row: g.getRowList()){
//		for (Cell cell: row.getCellList()){
//			//for (Integer int1: cell.getPossibleVals()){
//			int size= cell.getPossibleVals().size();
//			switch (cell.getCage().getCageSize()){
//				case 2:
//					for (int i=size-1; i> -1; i--) {
//						int int1 = cell.getPossibleVals().get(i);
//						if (!cell.getPossibleVals().contains(cell.getCage().getSumVal() - int1)){
//							cell.removePossibleVal(int1);
//						}
//					}	
//					break;
//				case 3:
//					break;
//				case 4:
//					break;
//			}
//		}
//	}	
//}





//old implementation of colPresent(Grid g), use for rollback if neccessarry
//for (Column col: g.getColList()){
//	for (Cage cage: g.getCageList()){
//		//System.out.println("Cage: " + cage.getCageNum());
//		int inc = getInclusion(cage, col);
//		//System.out.println(inc);
//		if (inc == cage.getCageSize()){
//			//System.out.println("fully included in col" + col.getColumnVal());
//			switch (cage.getCageSize()){
//				case 2:
//					ArrayList<Integer> common = new ArrayList<Integer>(cage.getCellList().get(0).getPossibleVals());
//					common.retainAll(cage.getCellList().get(1).getPossibleVals());
//					if (common.size() == cage.getCageSize()){
//						for (Integer int1: common){
//							for (Cell cell: col.getCellList()){
//								if (!(cell.equals(cage.getCellList().get(0)) || cell.equals(cage.getCellList().get(1)))){
//									cell.removePossibleVal(int1);
//								}
//							}
//						}
//					}
//					break;
//				case 3:
//					//TODO write for cell size 3
//					break;
//				case 4:
//					//TODO write for cell size 4
//					break;
//			}
//		}	
//	}
//}