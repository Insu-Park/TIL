package client;

import java.awt.*;
import java.awt.event.*;

import javafx.scene.control.RadioButton;

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
		
		RadioButton rb1=new RadioButton("1");
		RadioButton rb2=new RadioButton("1");
		RadioButton rb3=new RadioButton("1");
		Radio
		
		
		
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
		p2.setLayout(new BorderLayout());
		p2.add(b2, BorderLayout.NORTH);
		p2.add(b3);
		
		p1.setBackground(Color.gray);
		p2.setBackground(Color.gray);
		
		
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

}