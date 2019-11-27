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

	
    private void initComponents() {

        stop = new javax.swing.JLabel();
        reproducir = new javax.swing.JLabel();
        pausa = new javax.swing.JLabel();
        anteriorTema = new javax.swing.JLabel();
        proximoTema = new javax.swing.JLabel();
        songDisplayName = new javax.swing.JLabel();
        labelSound = new javax.swing.JLabel();
        labelRepeat = new javax.swing.JLabel();
        openLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        miniaturaLabel = new javax.swing.JLabel();
        labelSoundDown = new javax.swing.JLabel();
        labelSoundUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-center.png"))); // NOI18N
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopMouseReleased(evt);
            }
        });

        reproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-down.png"))); // NOI18N
        reproducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproducirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reproducirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reproducirMouseReleased(evt);
            }
        });

        pausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-up.png"))); // NOI18N
        pausa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pausaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pausaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pausaMouseReleased(evt);
            }
        });

        anteriorTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-upLeft.png"))); // NOI18N
        anteriorTema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anteriorTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorTemaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anteriorTemaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                anteriorTemaMouseReleased(evt);
            }
        });

        proximoTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-uprigth.png"))); // NOI18N
        proximoTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proximoTemaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proximoTemaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                proximoTemaMouseReleased(evt);
            }
        });

        songDisplayName.setBackground(new java.awt.Color(255, 102, 102));
        songDisplayName.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        songDisplayName.setForeground(new java.awt.Color(255, 0, 51));
        songDisplayName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        songDisplayName.setOpaque(true);
        songDisplayName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                songDisplayNameMouseDragged(evt);
            }
        });
        songDisplayName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                songDisplayNameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                songDisplayNameMouseReleased(evt);
            }
        });

        labelSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/sound_ona.png"))); // NOI18N
        labelSound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSoundMouseClicked(evt);
            }
        });

        labelRepeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/no_repeat.png"))); // NOI18N
        labelRepeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRepeatMouseClicked(evt);
            }
        });

        openLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/select.png"))); // NOI18N
        openLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openLabelMouseClicked(evt);
            }
        });

        minLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/pokerFace.png"))); // NOI18N
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minLabelMouseReleased(evt);
            }
        });

        miniaturaLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                miniaturaLabelMouseDragged(evt);
            }
        });
        miniaturaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniaturaLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miniaturaLabelMousePressed(evt);
            }
        });

        labelSoundDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/menos.png"))); // NOI18N
        labelSoundDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSoundDownMouseClicked(evt);
            }
        });

        labelSoundUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/mas.png"))); // NOI18N
        labelSoundUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSoundUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(labelSoundUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(labelSound)
                        .addGap(48, 48, 48)
                        .addComponent(labelRepeat))
                    .addComponent(songDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(proximoTema, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(labelSoundDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(minLabel))
            .addComponent(pausa, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(miniaturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(anteriorTema, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(openLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoundUp)
                            .addComponent(labelSound)
                            .addComponent(labelRepeat))
                        .addGap(3, 3, 3)
                        .addComponent(songDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(proximoTema))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelSoundDown, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(minLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(pausa)))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(reproducir))
                    .addComponent(miniaturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(anteriorTema))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(stop))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>  
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
