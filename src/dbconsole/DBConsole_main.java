package dbconsole;

import java.awt.Label;
import java.sql.ResultSet;
import java.sql.SQLException;

import lib1.FrameSystemController;
import lib1.FrameSystemView;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Label total1, year1, heisei1;
		int total, year;
		String heisei;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		FrameSystemController controller = new FrameSystemController();
		FrameSystemView frame = new FrameSystemView(controller);
		frame.setBounds(10,10,655,455);
		frame.setVisible(true);
try {
	while(rs.next()){	
		total = rs.getInt("total");
		heisei = rs.getString("heisei");	
		year = rs.getInt("year");
	    System.out.println("totalÅF" + total);
	    System.out.println("heiseiÅF" + heisei);
	    System.out.println("yearÅF" + year); 
	    total1 = new Label(String.valueOf(total));
	    year1 = new Label(String.valueOf(year));
	    heisei1 = new Label(String.valueOf(heisei));
	    frame.add(heisei1);                
	    frame.add(year1);
	    frame.add(total1);
	  }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 

	}


}
