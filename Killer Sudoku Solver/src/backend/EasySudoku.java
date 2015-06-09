package backend;

public class EasySudoku {

	public Grid setUp(){
		Grid g = new Grid();
		Cage cage0 = new Cage(6, 2);
		cage0.addCell(g.getRowList().get(0).getCell(0));
		cage0.addCell(g.getRowList().get(0).getCell(1));
		g.addCage(cage0);
		Cage cage1 = new Cage(15, 3);
		cage1.addCell(g.getRowList().get(0).getCell(2));
		cage1.addCell(g.getRowList().get(0).getCell(3));
		cage1.addCell(g.getRowList().get(0).getCell(4));
		g.addCage(cage1);
		Cage cage2 = new Cage(20, 3);
		cage2.addCell(g.getRowList().get(0).getCell(5));
		cage2.addCell(g.getRowList().get(0).getCell(6));
		cage2.addCell(g.getRowList().get(0).getCell(7));
		g.addCage(cage2);
		Cage cage3 = new Cage(13, 3);
		cage3.addCell(g.getRowList().get(0).getCell(8));
		cage3.addCell(g.getRowList().get(1).getCell(8));
		cage3.addCell(g.getRowList().get(2).getCell(8));
		
		g.addCage(cage3);
		Cage cage4 = new Cage(12, 3);
		cage4.addCell(g.getRowList().get(1).getCell(0));
		cage4.addCell(g.getRowList().get(2).getCell(0));
		cage4.addCell(g.getRowList().get(3).getCell(0));
		g.addCage(cage4);
		Cage cage5 = new Cage(11, 2);
		cage5.addCell(g.getRowList().get(1).getCell(1));
		cage5.addCell(g.getRowList().get(2).getCell(1));
		g.addCage(cage5);
		Cage cage6 = new Cage(3,2);
		cage6.addCell(g.getRowList().get(1).getCell(2));
		cage6.addCell(g.getRowList().get(1).getCell(3));
		g.addCage(cage6);
		Cage cage7 = new Cage(20,3);
		cage7.addCell(g.getRowList().get(1).getCell(4));
		cage7.addCell(g.getRowList().get(2).getCell(4));	
		cage7.addCell(g.getRowList().get(3).getCell(4));
		g.addCage(cage7);
		Cage cage8 = new Cage(13,2);
		cage8.addCell(g.getRowList().get(1).getCell(5));
		cage8.addCell(g.getRowList().get(1).getCell(6));
		g.addCage(cage8);
		Cage cage9 = new Cage(10,3);
		cage9.addCell(g.getRowList().get(1).getCell(7));
		cage9.addCell(g.getRowList().get(2).getCell(7));
		cage9.addCell(g.getRowList().get(2).getCell(6));
		g.addCage(cage9);
		Cage cage10 = new Cage(22, 3);
		cage10.addCell(g.getRowList().get(2).getCell(2));
		cage10.addCell(g.getRowList().get(2).getCell(3));
		cage10.addCell(g.getRowList().get(3).getCell(3));
		g.addCage(cage10);
		Cage cage11 = new Cage(13, 2);
		cage11.addCell(g.getRowList().get(2).getCell(5));
		cage11.addCell(g.getRowList().get(3).getCell(5));
		g.addCage(cage11);
		Cage cage12 = new Cage(10, 2);
		cage12.addCell(g.getRowList().get(3).getCell(1));
		cage12.addCell(g.getRowList().get(3).getCell(2));
		g.addCage(cage12);
		Cage cage13 = new Cage(5, 2);
		cage13.addCell(g.getRowList().get(3).getCell(6));
		cage13.addCell(g.getRowList().get(4).getCell(6));
		g.addCage(cage13);
		Cage cage14 = new Cage(9, 2);
		cage14.addCell(g.getRowList().get(3).getCell(7));
		cage14.addCell(g.getRowList().get(4).getCell(7));
		g.addCage(cage14);
		Cage cage15 = new Cage(13, 2);
		cage15.addCell(g.getRowList().get(3).getCell(8));
		cage15.addCell(g.getRowList().get(4).getCell(8));
		g.addCage(cage15);
		Cage cage16 = new Cage(13,2);
		cage16.addCell(g.getRowList().get(4).getCell(0));
		cage16.addCell(g.getRowList().get(5).getCell(0));
		g.addCage(cage16);
		Cage cage17 = new Cage(14,2);
		cage17.addCell(g.getRowList().get(4).getCell(1));
		cage17.addCell(g.getRowList().get(5).getCell(1));
		g.addCage(cage17);
		Cage cage18 = new Cage(7,2);
		cage18.addCell(g.getRowList().get(4).getCell(2));
		cage18.addCell(g.getRowList().get(5).getCell(2));
		g.addCage(cage18);
		Cage cage19 = new Cage(11,3);
		cage19.addCell(g.getRowList().get(4).getCell(3));
		cage19.addCell(g.getRowList().get(4).getCell(4));
		cage19.addCell(g.getRowList().get(4).getCell(5));
		g.addCage(cage19);
		Cage cage20 = new Cage(17,2);
		cage20.addCell(g.getRowList().get(5).getCell(3));
		cage20.addCell(g.getRowList().get(6).getCell(3));
		g.addCage(cage20);
		Cage cage21 = new Cage(13,3);
		cage21.addCell(g.getRowList().get(5).getCell(4));
		cage21.addCell(g.getRowList().get(6).getCell(4));
		cage21.addCell(g.getRowList().get(7).getCell(4));
		g.addCage(cage21);
		Cage cage22 = new Cage(12,3);
		cage22.addCell(g.getRowList().get(5).getCell(5));
		cage22.addCell(g.getRowList().get(6).getCell(5));
		cage22.addCell(g.getRowList().get(6).getCell(6));
		g.addCage(cage22);
		Cage cage23 = new Cage(11,2);
		cage23.addCell(g.getRowList().get(5).getCell(6));
		cage23.addCell(g.getRowList().get(5).getCell(7));
		g.addCage(cage23);
		Cage cage24 = new Cage(10,3);
		cage24.addCell(g.getRowList().get(5).getCell(8));
		cage24.addCell(g.getRowList().get(6).getCell(8));
		cage24.addCell(g.getRowList().get(7).getCell(8));
		g.addCage(cage24);
		Cage cage25 = new Cage(15,3);
		cage25.addCell(g.getRowList().get(6).getCell(0));
		cage25.addCell(g.getRowList().get(7).getCell(0));
		cage25.addCell(g.getRowList().get(8).getCell(0));
		g.addCage(cage25);
		Cage cage26 = new Cage(16,3);
		cage26.addCell(g.getRowList().get(6).getCell(1));
		cage26.addCell(g.getRowList().get(6).getCell(2));
		cage26.addCell(g.getRowList().get(7).getCell(1));
		g.addCage(cage26);
		Cage cage27 = new Cage(13,2);
		cage27.addCell(g.getRowList().get(6).getCell(7));
		cage27.addCell(g.getRowList().get(7).getCell(7));
		g.addCage(cage27);
		Cage cage28 = new Cage(5,2);
		cage28.addCell(g.getRowList().get(7).getCell(2));
		cage28.addCell(g.getRowList().get(7).getCell(3));
		g.addCage(cage28);
		Cage cage29 = new Cage(10,2);
		cage29.addCell(g.getRowList().get(7).getCell(5));
		cage29.addCell(g.getRowList().get(7).getCell(6));
		g.addCage(cage29);
		Cage cage30 = new Cage(16,3);
		cage30.addCell(g.getRowList().get(8).getCell(1));
		cage30.addCell(g.getRowList().get(8).getCell(2));
		cage30.addCell(g.getRowList().get(8).getCell(3));
		g.addCage(cage30);
		Cage cage31 = new Cage(14,3);
		cage31.addCell(g.getRowList().get(8).getCell(4));
		cage31.addCell(g.getRowList().get(8).getCell(5));
		cage31.addCell(g.getRowList().get(8).getCell(6));
		g.addCage(cage31);
		Cage cage32 = new Cage(13,2);
		cage32.addCell(g.getRowList().get(8).getCell(7));
		cage32.addCell(g.getRowList().get(8).getCell(8));
		g.addCage(cage32);
		return g;
	}
}











