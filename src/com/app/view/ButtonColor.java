package com.app.view;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

public class ButtonColor extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1211784599446103723L;
	String name;
	Color color;

	public ButtonColor(String str, Color color) {
		super(str);
		this.name = str;
		this.color = color;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
		

	}

}
