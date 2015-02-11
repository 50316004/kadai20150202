package lib1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//import org.jfree.chart.ChartPanel;

import dbconsole.MySQL;
public class FrameSystemView extends Frame implements ActionListener, WindowListener {
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		String total, year;
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		MySQL clib = new MySQL();		
//		add(text1);
//		add(text2);
//	      clib.setText(String.valueOf(total));
//	      text2.setText(String.valueOf(2));
//	    ChartPanel cpanel = new ChartPanel(chart);
//		    add(cpanel, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource() == button1){			
//		int val1 = Integer.parseInt(text1.getText());
//		int val2 = Integer.parseInt(text2.getText());

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
