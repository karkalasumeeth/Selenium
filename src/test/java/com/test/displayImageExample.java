package com.test;

import javax.swing.*;
import java.awt.*;

public class displayImageExample {

	public static void main(String[] args) {
		// Create a new frame (window)
		JFrame frame = new JFrame("Display Image Example");

		// Load the image
		ImageIcon imageIcon = new ImageIcon("com.test/ExtractTextFromImage/cropped_image.png1"); // Adjust path to your image

		// Create a label and set the icon (image) on it
		JLabel label = new JLabel(imageIcon);

		// Set up the frame layout and add the label to the frame
		frame.setLayout(new FlowLayout());
		frame.add(label);

		// Set default close operation and size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500); // You can adjust the frame size as needed
		frame.setVisible(true); // Make the frame visible
	}
}
