package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import element.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import java.awt.Cursor;
import javax.swing.JLabel;


public class Tableau_Periodique {

	private JFrame frame;
	private final Canvas canvas = new Canvas();
	private JTextField Textlanthanides;
	private JTextField TextActinides;
	private JTextField EntrerDeMolecule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tableau_Periodique window = new Tableau_Periodique();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tableau_Periodique() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setAlwaysOnTop(true);
		frame.setBackground(Color.black);
		frame.setBackground(new Color(240,240,240));
		frame.setBounds(100, 100, 1082, 882);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(206, 508, 10, 140);
		frame.getContentPane().add(canvas);

		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.white);
		canvas_1.setBounds(206, 641, 66, 11);
		frame.getContentPane().add(canvas_1);

		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.white);
		canvas_2.setBounds(244, 585, 10, 150);
		frame.getContentPane().add(canvas_2);

		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(Color.white);
		canvas_1_1.setBounds(244, 724, 31, 11);
		frame.getContentPane().add(canvas_1_1);

		Textlanthanides = new JTextField();
		Textlanthanides.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		Textlanthanides.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Textlanthanides.setHorizontalAlignment(SwingConstants.CENTER);
		Textlanthanides.setText("57-71");
		Textlanthanides.setBounds(189, 437, 88, 70);
		frame.getContentPane().add(Textlanthanides);
		Textlanthanides.setSelectedTextColor(Color.WHITE);
		Textlanthanides.setColumns(10);

		TextActinides = new JTextField();
		TextActinides.setText("89-103");
		TextActinides.setHorizontalAlignment(SwingConstants.CENTER);
		TextActinides.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TextActinides.setColumns(10);
		TextActinides.setBounds(218, 517, 57, 70);
		TextActinides.setSelectedTextColor(Color.WHITE);
		frame.getContentPane().add(TextActinides);

		JInternalFrame internalFrame = new JInternalFrame();
		internalFrame.getContentPane().setBackground(Color.white);
		internalFrame.setBounds(0, 0, 1521, 882);
		frame.getContentPane().add(internalFrame);
		internalFrame.setOpaque(true);
		internalFrame.getContentPane().setLayout(null);

		JLabel AffichageSymbole = new JLabel("");
		AffichageSymbole.setBounds(73, 202, 346, 329);
		AffichageSymbole.setFont(new Font("Tahoma", Font.PLAIN, 150));
		internalFrame.getContentPane().add(AffichageSymbole);

		JLabel AffichageCharge = new JLabel("");
		AffichageCharge.setBounds(247, 244, 78, 127);
		AffichageCharge.setFont(new Font("Tahoma", Font.PLAIN, 50));
		internalFrame.getContentPane().add(AffichageCharge);

		
		EntrerDeMolecule = new JTextField();
		EntrerDeMolecule.setFont(new Font("Tahoma", Font.PLAIN, 31));
		EntrerDeMolecule.setBounds(372, 312, 516, 127);
		internalFrame.getContentPane().add(EntrerDeMolecule);
		EntrerDeMolecule.setColumns(10);

		JLabel NbMolecule = new JLabel("Entrer le nombre d'atomes:");
		NbMolecule.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NbMolecule.setBounds(372, 265, 514, 37);
		internalFrame.getContentPane().add(NbMolecule);

		JButton Calculer = new JButton("Calcul");
		Calculer.setFont(new Font("Tahoma", Font.PLAIN, 39));
		Calculer.setBounds(898, 312, 155, 127);
		internalFrame.getContentPane().add(Calculer);
		
		JLabel Resultat = new JLabel();
		Resultat.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Resultat.setBounds(20, 270, 1050, 169);
		internalFrame.getContentPane().add(Resultat);
		
		JLabel NbElectron = new JLabel();
		NbElectron.setFont(new Font("Tahoma", Font.PLAIN, 30));
		NbElectron.setBounds(296, 440, 828, 127);
		internalFrame.getContentPane().add(NbElectron);


		internalFrame.setVisible(false);
		AffichageSymbole.setVisible(false);


		String[][] tab = new String[9][18];
		JButton[] button = new JButton[118];


		int x;
		int y;
		for (int col = 0; col < tab[0].length; col++) {
			for (int i = 0; i < tab.length; i++) {
				switch (i) {
				case 0 -> {
					if (col != 0 && col != 17) {
						tab[i][col] = "0";
					} else {
						tab[i][col] = "1";
					}
				}
				case 1, 2 -> {
					if (col > 1 && col < 12) {
						tab[i][col] = "0";
					} else {
						tab[i][col] = "1";
					}
				}
				case 5, 6 -> {
					if (col == 2) {
						tab[i][col] = "0";
					} else {
						tab[i][col] = "1";
					}
				}
				case 7, 8 -> {
					if (col < 3) {
						tab[i][col] = "0";
					} else {
						tab[i][col] = "1";
					}
				}
				default -> tab[i][col] = "1";
				}
			}
		}
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(Elements.getSymbol(i+1));

		}

		int numero = 0;
		for (int lig = 0; lig < tab.length-2; lig++) {
			for (int col = 0; col < tab[0].length; col++){
				button[numero].setBackground(Color.white);
				if (tab[lig][col].equals("0")){
					if ((numero >= 56 && numero <= 70) || (numero >= 88 && numero <= 102)) {
						for (int i = col; i < tab[0].length-1; i++) {                            
							x = 31+(68+15)*(i+1);
							y = 22+(68+15)*(lig+2);
							button[numero].setBounds(x, y, 68, 68);
							button[numero].setBackground(Color.yellow);
							numero++;
						}
					}
				} else {
					x = 31+(68+15)*col;
					y = 22+(68+15)*lig;
					button[numero].setBounds(x, y, 68, 68);
					numero++;
				}
			}
		}


		for (int i = 0; i < button.length; i++) {
			frame.getContentPane().add(button[i]);
		}


		for (int i = 0; i < button.length; i++) {
			final int index = i+1;
			button[i].addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					Commande.setElement(index);
					
					NbElectron.setVisible(false);
					Resultat.setVisible(false);
					Calculer.setVisible(false);
					button[index-1].setVisible(false);
					button[0].setVisible(false);
					button[1].setVisible(false);
					internalFrame.setVisible(true);
					canvas_1.setVisible(false);
					canvas_1_1.setVisible(false);
					canvas_2.setVisible(false);
					Textlanthanides.setVisible(false);
					TextActinides.setVisible(false);
					canvas.setVisible(false);
					EntrerDeMolecule.setVisible(false);
					NbMolecule.setVisible(false);
					AffichageSymbole.setVisible(true);
					AffichageSymbole.setText(Elements.getSymbol(index));
					charge(internalFrame, AffichageCharge, EntrerDeMolecule, NbMolecule, Calculer, AffichageSymbole, NbElectron, Resultat, Elements.getElement(index));


				}


			} );


		}
	}
	public static void charge(JInternalFrame internalFrame, JLabel AffichageCharge, JTextField EntrerDeMolecule, JLabel NbMolecule, JButton Calculer, JLabel AffichageSymbole, JLabel NbElectron, JLabel Resultat, Element getcharge){
		int x,y;
		x= 300;
		y= 350;

		JButton[] button = new JButton[3];
		for (int i =0; i<button.length; i++) {
			final int index = i+1;
			button[i]=new JButton("-"+(i+1)+"");
			button[i].setBounds(x, y, 68, 68);
			button[i].setVisible(true);
			internalFrame.getContentPane().add(button[i]);
			x=x+100;
			button[i].setBackground(Color.LIGHT_GRAY);
			button[i].addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					Commande.setCharge(-index);
					getcharge.ion(-index);
					AffichageCharge.setText("-"+index+"");
					button[0].setVisible(false);
					button[1].setVisible(false);
					button[2].setVisible(false);
					EntrerDeMolecule.setVisible(true);
					NbMolecule.setVisible(true);
					Calculer.setVisible(true);
					Calculer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Commande.setQuantity(EntrerDeMolecule.getText());
							EntrerDeMolecule.setVisible(false);
							NbMolecule.setVisible(false);
							Calculer.setVisible(false);
							AffichageSymbole.setVisible(false);
							AffichageCharge.setVisible(false);
							NbElectron.setText(Commande.getResult()+ " électrons");
							NbElectron.setVisible(true);
							Resultat.setText("Dans " + EntrerDeMolecule.getText() + " atomes de " + getcharge.getNom() + " avec une charge de " + getcharge.charge() + ", il y a :");
							Resultat.setVisible(true);
						}
					});
				}


			});
		}




	}
}



