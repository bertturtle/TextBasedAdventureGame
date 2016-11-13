package popupController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import playerController.Main;

public class ImprovedJFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JTextArea eventDescriptionLabel = new JTextArea();

	public ImprovedJFrame(String title, String eventDescription) {
		super(title);
		setBounds(0, 0, 1600, 1000);
		setLayout(new BorderLayout());
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel descriptionPanel = new JPanel();
		eventDescriptionLabel.setText(eventDescription);
		descriptionPanel.add(eventDescriptionLabel);  
		eventDescriptionLabel.setLineWrap(true);
		eventDescriptionLabel.setWrapStyleWord(true);
		eventDescriptionLabel.setEditable(false);
		eventDescriptionLabel.setBounds(10, 10, 1580, 980);
		eventDescriptionLabel.setBackground(new Color(238, 238, 238));
		
		add(descriptionPanel, BorderLayout.NORTH);
		
		JPanel optionPanel = new JPanel();
		
//		button1.setText(firstButtonText);
//		button2.setText(secondButtonText);
//		button3.setText(thirdButtonText);
		
		setOnClickListener();
		
		optionPanel.add(button1);
		optionPanel.add(button2);
		optionPanel.add(button3);

		add(optionPanel);
		
		showDescriptiveDialog(eventDescription, false);
		
		setVisible(true);
	}
	
	public void setOnClickListener()
	{
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.buttonPressed = 1;
				System.out.println("Button 1 Pressed");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.buttonPressed = 2;
				System.out.println("Button 2 Pressed");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.buttonPressed = 3;
				System.out.println("Button 3 Pressed");
			}
		});
	}
	
	public void setText(String title, String eventDescription, String buttonOneText, String buttonTwoText,
			String buttonThreeText) {
		Main.buttonPressed = 0;
		
		eventDescriptionLabel.setText(eventDescription);
		button1.setText(buttonOneText);
		button2.setText(buttonTwoText);
		button3.setText(buttonThreeText);
		button1.setVisible(true);
		button2.setVisible(true);

		if (button3.getText().equals("")) {
			button3.setVisible(false);
		} else {
			button3.setVisible(true);
		}
	}
	
	public void showDescriptiveDialog(String description, boolean death)
	{
		Main.buttonPressed = 0;
		button1.setVisible(true);
		button2.setVisible(false);
		button3.setVisible(false);
		
		button1.setText("Okay");
		
		if (death)
		{
			button1.setText("Quit");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					dispose();
				}
			});
		}
		eventDescriptionLabel.setText(description);
	}
	
	public void showFinalPart()
	{
		button1.setVisible(true);
		button2.setVisible(false);
		button3.setVisible(false);
		
		eventDescriptionLabel.setText("RIP Harambe");
		
		button1.setText("RIP Harambe");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}