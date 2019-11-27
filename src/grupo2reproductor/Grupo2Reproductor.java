package grupo2reproductor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Grupo2Reproductor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grupo2Reproductor frame = new Grupo2Reproductor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grupo2Reproductor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ImagenCentro = new JLabel("");
		ImagenCentro.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\zim-center.png"));
		ImagenCentro.setBounds(10, 193, 200, 200);
		contentPane.add(ImagenCentro);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\mas.png"));
		lblNewLabel.setBounds(29, 33, 36, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\menos.png"));
		lblNewLabel_1.setBounds(29, 81, 38, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\miniatura-irken.png"));
		lblNewLabel_2.setBounds(136, 44, 48, 74);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\pokerFace.png"));
		lblNewLabel_3.setBounds(305, 44, 36, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\no_repeat.png"));
		lblNewLabel_4.setBounds(305, 92, 36, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\select.png"));
		lblNewLabel_5.setBounds(215, 33, 36, 37);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\sound_ona.png"));
		lblNewLabel_6.setBounds(214, 92, 38, 26);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\zim-down.png"));
		lblNewLabel_7.setBounds(392, 44, 106, 155);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\zim-up.png"));
		lblNewLabel_8.setBounds(10, 129, 262, 155);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\zim-upLeft.png"));
		lblNewLabel_9.setBounds(272, 140, 82, 125);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Mauri\\Desktop\\ReproductorGrupo2\\src\\ZimIcon\\zim-uprigth.png"));
		lblNewLabel_10.setBounds(364, 220, 87, 125);
		contentPane.add(lblNewLabel_10);
	}
}
