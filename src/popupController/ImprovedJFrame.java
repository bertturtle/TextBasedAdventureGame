package popupController;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import playerController.Main;

public class ImprovedJFrame extends JFrame {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JLabel eventDescriptionLabel = new JLabel();

	public ImprovedJFrame(String title, String eventDescription, String firstButtonText, String secondButtonText,
			String thirdButtonText) {
		super(title);
		setBounds(0, 0, 600, 400);
		setLayout(new BorderLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel descriptionPanel = new JPanel();
		eventDescriptionLabel.setText(eventDescription);
		descriptionPanel.add(eventDescriptionLabel);
		add(descriptionPanel, BorderLayout.NORTH);

		JPanel optionPanel = new JPanel();

		button1.setText(firstButtonText);
		button2.setText(secondButtonText);
		button3.setText(thirdButtonText);
		
		setOnClickListener();

		optionPanel.add(button1);
		optionPanel.add(button2);
		optionPanel.add(button3);

		if (button3.getText().equals("")) {
			button3.setVisible(false);
		}

		add(optionPanel);

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

		if (button3.getText().equals("")) {
			button3.setVisible(false);
		} else {
			button3.setVisible(true);
		}
	}
	
	public void gameEnd(String description)
	{
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		
		eventDescriptionLabel.setText(description);
	}
}