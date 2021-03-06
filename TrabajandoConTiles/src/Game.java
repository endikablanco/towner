import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Endika
 */
public class Game extends javax.swing.JFrame {

	/**
	 * Creates new form frame
	 */
	public Game() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		GamePanel g = new GamePanel();
		jMenu1 = new javax.swing.JMenu();
		fecha = new javax.swing.JLabel();
		labelFecha = new javax.swing.JLabel();
		fondos = new javax.swing.JLabel();
		labelFondos = new javax.swing.JLabel();
		habitantes = new javax.swing.JLabel();
		labelHabitantes = new javax.swing.JLabel();
		minimapa = new javax.swing.JPanel();
		spJuego = new javax.swing.JScrollPane();
		spLista = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jList1.addListSelectionListener(new ListSelectionListener() {




			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub

				String item = (String) jList1.getSelectedValue();
				if(item == "Item 1")
					variable = 1;
				if(item == "Item 2")
					variable = 2;

			}
		});


		jMenu1.setText("jMenu1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		fecha.setText("Fecha: ");

		fondos.setText("Fondos:");

		habitantes.setText("Habitantes");

		javax.swing.GroupLayout minimapaLayout = new javax.swing.GroupLayout(minimapa);
		minimapa.setLayout(minimapaLayout);
		minimapaLayout.setHorizontalGroup(
				minimapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 147, Short.MAX_VALUE)
				);
		minimapaLayout.setVerticalGroup(
				minimapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 132, Short.MAX_VALUE)
				);

		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
			public int getSize() { return strings.length; }
			public Object getElementAt(int i) { return strings[i]; }
		});
		spLista.setViewportView(jList1);


		spJuego.setViewportBorder(BorderFactory.createLineBorder(Color.red));
		spJuego.add(g);
		spJuego.setViewportView(g);
		spJuego.getViewport().setView(g);
		spJuego.setVisible(true);
		g.setPreferredSize(new Dimension(578, 40*15));


		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(minimapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(142, 142, 142))
														.addGroup(layout.createSequentialGroup()
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(fondos)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(labelFondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																				.addGroup(layout.createSequentialGroup()
																						.addComponent(fecha)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																						.addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGap(43, 43, 43)
																						.addComponent(habitantes)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(labelHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(42, 42, 42))))
																						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																								.addGap(196, 196, 196)
																								.addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(56, 56, 56)))
																								.addComponent(spJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addContainerGap(20, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(26, 26, 26)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(fecha)
								.addComponent(habitantes)
								.addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(spJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(labelFondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(fondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(10, 10, 10)
														.addComponent(spLista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(minimapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, Short.MAX_VALUE)))
														.addContainerGap())
				);

		pack();
		g.setPreferredSize(new Dimension(480,600));
		spJuego.setPreferredSize(new Dimension(480,600));
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		/*
		JFrame window = new JFrame("Prueba");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new GamePanel());
		window.pack();
		window.setVisible(true);*/
		
		
		

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				

			}
		});
		Game f = new Game();
		f.setSize(1000, 1000);
		f.setVisible(true);
		Fechas fech = new Fechas();
		Thread t = new Thread();
		int i = 0;
		t.start();
		while(true){
			f.fecha.setText("Fecha: " + fech.mensaje());
			f.fecha.repaint();
			try {
				t.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



	// Variables declaration - do not modify//GEN-BEGIN:variables
	public javax.swing.JLabel fecha;
	private javax.swing.JLabel fondos;
	private javax.swing.JLabel habitantes;
	private javax.swing.JList jList1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JLabel labelFecha;
	private javax.swing.JLabel labelFondos;
	private javax.swing.JLabel labelHabitantes;
	private javax.swing.JPanel minimapa;
	private javax.swing.JScrollPane spJuego;
	private javax.swing.JScrollPane spLista;
	public static int variable;
	// End of variables declaration//GEN-END:variables
}
