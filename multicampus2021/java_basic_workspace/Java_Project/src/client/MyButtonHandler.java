package client;

import java.awt.*;
import java.awt.event.*;

public class MyButtonHandler implements ActionListener{

	private TextArea ta;
	private TextField tf;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 하고 싶은 일
		ta.append(tf.getText() + "\n");
		tf.setText("");
	}

	public void setTextArea(TextArea ta) {
		this.ta = ta;
	}
	
	public void setTextField(TextField tf) {
		this.tf = tf;
	}
}