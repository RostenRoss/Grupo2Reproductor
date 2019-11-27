package grupo2reproductor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Grupo2Reproductor extends JFrame {

    //Declaracion de varaibles JLabel que funcionaran como botones.                     
    private javax.swing.JLabel anteriorTema;
    private javax.swing.JLabel labelRepeat;
    private javax.swing.JLabel labelSound;
    private javax.swing.JLabel labelSoundDown;
    private javax.swing.JLabel labelSoundUp;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel miniaturaLabel;
    private javax.swing.JLabel openLabel;
    private javax.swing.JLabel pausa;
    private javax.swing.JLabel proximoTema;
    private javax.swing.JLabel reproducir;
    private javax.swing.JLabel songDisplayName;
    private javax.swing.JLabel stop;

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

	
	
}
