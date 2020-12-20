package com.app.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.app.entity.RH;

import listeners.LoginListner;

public class Authentication extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -109322306736405915L;
	private JPanel contentPane;
	private JLabel authentication;
	private JLabel loginPersonnel;
	private JTextField loginField;
	private JLabel passwordPersonnel;
	private JPasswordField passwordField;
	private JLabel passwordforgotten;
	private JButton loginAuth;
	private LoginListner controller;

	public Authentication() {
		setTitle("Authentication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		contentPane = new Panneau();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		authentication = new JLabel("Authentication");
		authentication.setForeground(Color.BLACK);
		authentication.setFont(new Font("Helvetica", Font.BOLD, 24));
		authentication.setBounds(110, 25, 183, 23);
		contentPane.add(authentication);

		loginPersonnel = new JLabel("Login");
		loginPersonnel.setForeground(Color.BLACK);
		loginPersonnel.setFont(new Font("Helvetica", Font.BOLD, 14));
		loginPersonnel.setBounds(27, 85, 52, 17);
		contentPane.add(loginPersonnel);

		passwordPersonnel = new JLabel("Password");
		passwordPersonnel.setForeground(Color.BLACK);
		passwordPersonnel.setFont(new Font("Helvetica", Font.BOLD, 14));
		passwordPersonnel.setBounds(27, 140, 75, 14);
		contentPane.add(passwordPersonnel);
		loginField = new JTextField();
		loginField.setBounds(116, 85, 180, 20);
		contentPane.add(loginField);
		loginField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(116, 140, 180, 20);
		contentPane.add(passwordField);

		passwordforgotten=new JLabel("Mot de passe oublié?");
		passwordforgotten.setForeground(Color.BLACK);
		passwordforgotten.setFont(new Font("Helvetica", Font.BOLD, 14));
		passwordforgotten.setBounds(45, 185, 300, 25);
		contentPane.add(passwordforgotten);
		passwordforgotten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                    Password pass=new Password();
                    pass.setVisible(true);
   	     }
            }
        );
		loginAuth = new ButtonColor("Login", Color.BLACK);
		loginAuth.setFont(new Font("Helvetica", Font.BOLD, 14));
		loginAuth.setBounds(250, 220, 123, 23);

		loginAuth.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				if (controller != null)
					controller
							.loginPerformed(new RH(loginField.getText(), String.valueOf(passwordField.getPassword())));

			}
		});
		contentPane.add(loginAuth);
	}


	    public void setLoginListner(LoginListner controller) {
		this.controller = controller;
	    }

}
