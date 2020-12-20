package com.app.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5875593774079770757L;

	public void paintComponent(Graphics g) {
		try {
			Image img = ImageIO.read(new File("Background.jfif"));
		    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
