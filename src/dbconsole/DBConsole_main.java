package dbconsole;

import java.awt.Label;
import java.sql.ResultSet;
import java.sql.SQLException;

import lib1.FrameSystemController;
import lib1.FrameSystemView;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Label total1, year1, heisei1, nin1;
		int total, year;
		String heisei, nin;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		FrameSystemController controller = new FrameSystemController();
		FrameSystemView frame = new FrameSystemView(controller);
		frame.setBounds(10,10,255,955);
		frame.setVisible(true);
try {
	while(rs.next()){	
		total = rs.getInt("total");
		heisei = rs.getString("heisei");	
		year = rs.getInt("year");
		nin = rs.getString("nin");	
	    System.out.println("heisei：" + heisei);
	    System.out.println("year：" + year); 
	    System.out.println("total：" + total);
	    System.out.println("nin：" + nin); 
		System.out.println("\n");
	    total1 = new Label(String.valueOf(total));
	    year1 = new Label(String.valueOf(year));
	    heisei1 = new Label(String.valueOf(heisei));
	    nin1 = new Label(String.valueOf(nin));	    
	    frame.add(heisei1);                
	    frame.add(year1);
	    frame.add(total1);
	    frame.add(nin1);	    
	  }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 

	}


}
