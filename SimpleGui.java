package training;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleGui extends Frame  {

	private Label labelInput;  
	private Label labelOutput;  
	private TextField textInput;  
	private TextField textOutput;

	public SimpleGui() {
		setSize(600, 100);
		setLayout(new FlowLayout());
		setVisible(true);

		labelInput  = new Label("Input: ");
		textInput = new TextField("                    ");
		textInput.setSize(200,  20);
		labelOutput = new Label("Output:");
		textOutput = new TextField("                   ");
		textOutput.setSize(200,  20);
		
		add(labelInput);
		add(textInput);
		add(labelOutput);
		add(textOutput);
		
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

}
