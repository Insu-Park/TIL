package client;

import java.awt.*;

public class ClientUI {

	public static void main(String[] args) {
		Frame f=new Frame();
		Panel p=new Panel();
		Button b1=new Button("전송1");
		TextField tf=new TextField();
		TextArea ta=new TextArea();	

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

}
