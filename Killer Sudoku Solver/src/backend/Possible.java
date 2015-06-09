package backend;

import java.util.ArrayList;

public class Possible {

	Possible(){
		fillCagePoss();		
	}
	
	public void setPoss(Cage cage) {
		int size = cage.getCageSize();
		ArrayList<Integer> cagePoss = new ArrayList<Integer>();
		boolean done = false;
		switch (size){
			case 1:
				done = true;
		 	case 2:
		 		cagePoss = cageSize2;
		 		break;
		 	case 3:
		 		cagePoss = cageSize3;
		 		break;
		 	case 4:
		 		cagePoss = cageSize4;
		 		break;
		}
		int sum = cage.getSumVal();
		if (!done){
			for (Cell cell: cage.getCellList()){		//TODO update poss not reset
				cell.getPossibleVals().clear();
				int num = cagePoss.get(sum);
				String strNum = "" + num;
				int strLength = strNum.length();
				for (int i = 0; i < strLength; ++i) {
					  int digit = Integer.parseInt(Character.toString(strNum.charAt(i)));
					  cell.addPossibleVal(digit);
	//				  System.out.println("Possible digit: " + digit + " added to Cell: " + cell.getCoord());
				}	  
			}
		} else {
			cage.getCellList().get(0).getPossibleVals().clear();
			cage.getCellList().get(0).addPossibleVal(cage.getSumVal());
		}
	}	
	
	
	public void fillCagePoss(){
		
		initialise();
		cageSize2.add(3,  12);
		cageSize2.add(4,  13);
		cageSize2.add(5,  1234);
		cageSize2.add(6,  1245);
		cageSize2.add(7,  123456);
		cageSize2.add(8,  123567);
		cageSize2.add(9,  12345678);
		cageSize2.add(10, 12346789);
		cageSize2.add(11, 23456789);
		cageSize2.add(12, 345789);
		cageSize2.add(13, 456789);
		cageSize2.add(14, 5689);
		cageSize2.add(15, 6789);
		cageSize2.add(16, 79);
		cageSize2.add(17, 89);
		
		cageSize3.add(6,  123);
		cageSize3.add(7,  124);
		cageSize3.add(8,  12345);
		cageSize3.add(9,  123456);
		cageSize3.add(10, 1234567);
		cageSize3.add(11, 12345678);
		cageSize3.add(12, 123456789);
		cageSize3.add(13, 123456789);
		cageSize3.add(14, 123456789);
		cageSize3.add(15, 123456789);
		cageSize3.add(16, 123456789);
		cageSize3.add(17, 123456789);
		cageSize3.add(18, 123456789);
		cageSize3.add(19, 23456789);
		cageSize3.add(20, 3456789);
		cageSize3.add(21, 456789);
		cageSize3.add(22, 56789);
		cageSize3.add(23, 689);
		cageSize3.add(24, 789);
		
		cageSize4.add(10, 1234);
		cageSize4.add(11, 1235);
		cageSize4.add(12, 123456);
		cageSize4.add(13, 1234567);
		cageSize4.add(14, 12345678);
		cageSize4.add(15, 123456789);
		cageSize4.add(16, 123456789);
		cageSize4.add(17, 123456789);
		cageSize4.add(18, 123456789);
		cageSize4.add(19, 123456789);
		cageSize4.add(20, 123456789);
		cageSize4.add(21, 123456789);
		cageSize4.add(22, 123456789);
		cageSize4.add(23, 123456789);
		cageSize4.add(24, 123456789);
		cageSize4.add(25, 123456789);
		cageSize4.add(26, 23456789);
		cageSize4.add(27, 3456789);
		cageSize4.add(28, 456789);
		cageSize4.add(29, 56789);
		cageSize4.add(30, 6789);
		

	}
	private void initialise() {
		cageSize2.add(0); cageSize2.add(0); cageSize2.add(0);
		cageSize3.add(0); cageSize3.add(0); cageSize3.add(0); cageSize3.add(0); cageSize3.add(0); cageSize3.add(0);
		cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0); cageSize4.add(0);  
	}
	
	private ArrayList<Integer> cageSize2 = new ArrayList<Integer>();
	private ArrayList<Integer> cageSize3 = new ArrayList<Integer>();
	private ArrayList<Integer> cageSize4 = new ArrayList<Integer>();
	
	public void setPoss(Cage cage, int i) {			//SET POSS FOR VIRTUAL CAGE
		int size = cage.getCageSize();
		ArrayList<Integer> cagePoss = new ArrayList<Integer>();
		switch (size){
		 	case 2:
		 		cagePoss = cageSize2;
		 		break;
		 	case 3:
		 		cagePoss = cageSize3;
		 		break;
		 	case 4:
		 		cagePoss = cageSize4;
		 		break;
		}
		int sum = cage.getSumVal();
		ArrayList<Integer> possA = new ArrayList<Integer>();
		//System.out.println("Cage: " + cage.getCageNum() + "Sum: " + sum);
		System.out.println("Virtual Cage - Sum: " + sum + " Size: " + cage.getCageSize());
		System.out.println(cage.getCellList().get(0).getCoord());
		System.out.println(cage.getCellList().get(1).getCoord());
		int num = cagePoss.get(sum);
		String strNum = "" + num;
		int strLength = strNum.length();
		for (int k = 0; k < strLength; ++k) {
			  int digit = Integer.parseInt(Character.toString(strNum.charAt(k)));
			  possA.add(digit);
		}
		for (Cell cell: cage.getCellList()){
			ArrayList<Integer> common = new ArrayList<Integer>(cell.getPossibleVals());
			common.retainAll(possA);
			cell.getPossibleVals().clear();
			cell.setPossibleVals(common);  
		}
	} 
}
