import java.awt.Color;

import javax.swing.JFrame;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Endika
 */
public class Game2 extends javax.swing.JFrame {

	public static void main(String[] args) {
		GamePanel gp = new GamePanel();
		JFrame f = new JFrame();
		f.add(gp);
		f.setVisible(true);
		f.setSize(new Dimension(500, 500));
	}
}

