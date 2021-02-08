package client;

import java.awt.*;
import java.awt.event.*;


public class ClientUI {

	public static void main(String[] args) {
		Frame f=new Frame("나의 채팅");
		Panel p1=new Panel();
		Panel p2=new Panel();
		Button b1=new Button("전송1");
		Button b2=new Button("버튼1");
		Button b3=new Button("버튼2");
		
		TextField tf=new TextField(20);
		TextArea ta=new TextArea();	
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox checkBox1=new Checkbox("A", cbg, false);
		Checkbox checkBox2=new Checkbox("B", cbg, false);
		Checkbox checkBox3=new Checkbox("A", false);
		Checkbox checkBox4=new Checkbox("B", false);
		
		WindowListener fHandler=new MyFrameHandler();
		f.addWindowListener(fHandler);
		
		MyButtonHandler b1Handler=new MyButtonHandler();
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		tf.addActionListener(b1Handler);

		f.add(ta,BorderLayout.CENTER);
		f.add(p1,BorderLayout.SOUTH);
		f.add(p2,BorderLayout.EAST);
		
		p1.add(tf);
		p1.add(b1);
		p2.setLayout(new GridLayout(6, 1));
		
		p2.add(b2);
		p2.add(b3);
		p2.add(checkBox1);
		p2.add(checkBox2);
		p2.add(checkBox3);
		p2.add(checkBox4);
		
		p1.setBackground(Color.gray);
		p2.setBackground(Color.white);
		
		
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

}