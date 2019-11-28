package grupo2reproductor;

import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

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
 //Se crean varaibles que se usaran para propositos varios
    
    MP3Player player;
    File songFile;
    String currentDirectory="home.user";
    String imagePath;
    String currentPath;
    boolean repeat=false;
    boolean isMute=false;
    boolean windowsCollapse=false;
    int xMouse, yMouse;
    int anteriorY, anteriorX, miniaturaAnteriorX=150, miniaturaAnteriorY=500;
    
    //creamos el contrusctor de nuestra ventana e inicializamos algunas variables
    public Grupo2Reproductor () {
    	initComponents(); //Llamamos a initComponent la cual instancia nuestros JLabel y asigna sus propiedades

        AWTUtilities.setWindowOpaque(this, false);

    	songFile = new File("");
    	
    	String fileName=songFile.getName();
    	
    	songDisplayName.setText(fileName);
    	
    	player=mp3Player();
    	
    	player.addToPlayList(songFile);
    	
    	currentPath=Paths.get(".").toAbsolutePath().normalize().toString();
    	
    	imagePath="\\ZimIcon";
    }
    
    //Construimos nuestro propio objeto reproductor
    private MP3Player mp3Player() {
    	
    	MP3Player mp3Player =new MP3Player();
    	return mp3Player;
    }

	
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
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stopMousePressed(evt);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopMouseReleased(evt);
            }
        });

        reproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-down.png"))); // NOI18N
        reproducir.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproducirMouseClicked(evt);
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reproducirMousePressed(evt);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reproducirMouseReleased(evt);
            }
        });

        pausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-up.png"))); // NOI18N
        pausa.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pausaMouseClicked(evt);
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pausaMousePressed(evt);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pausaMouseReleased(evt);
            }
        });

        anteriorTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-upLeft.png"))); // NOI18N
        anteriorTema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        anteriorTema.addMouseListener(new java.awt.event.MouseAdapter() {
           
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anteriorTemaMousePressed(evt);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                anteriorTemaMouseReleased(evt);
            }
        });

        proximoTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/zim-uprigth.png"))); // NOI18N
        proximoTema.addMouseListener(new java.awt.event.MouseAdapter() {
          
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proximoTemaMousePressed(evt);
            }
            @Override
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
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                songDisplayNameMouseDragged(evt);
            }
        });
        songDisplayName.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                songDisplayNameMousePressed(evt);
            }
            
        });

        labelSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/sound_ona.png"))); // NOI18N
        labelSound.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSoundMouseClicked(evt);
            }
        });

        labelRepeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/no_repeat.png"))); // NOI18N
        labelRepeat.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRepeatMouseClicked(evt);
            }
        });

        openLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/select.png"))); // NOI18N
        openLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openLabelMouseClicked(evt);
            }
        });

        minLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/pokerFace.png"))); // NOI18N
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minLabelMousePressed(evt);
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minLabelMouseReleased(evt);
            }
        });

        miniaturaLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                miniaturaLabelMouseDragged(evt);
            }
        });
        miniaturaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniaturaLabelMouseClicked(evt);
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miniaturaLabelMousePressed(evt);
            }
        });

        labelSoundDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZimIcon/menos.png"))); // NOI18N
        labelSoundDown.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
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
	
    
    //Acciones de mouse
    private void anteriorTemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorTemaMousePressed
        // TODO add  handling code here:
        System.out.println("Estas presionando el boton para ir un tema atras");
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-upLeft-Pressed.png"));
        anteriorTema.setIcon(icono);
        anteriorTema.repaint();
        
    }

    private void proximoTemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proximoTemaMousePressed
        // TODO add your handling code here:
        System.out.println("Estas presionando el boton para ir un tema adelante");
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-uprigth_pressed.png"));
        proximoTema.setIcon(icono);
        proximoTema.repaint();
    }
    
    private void pausaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausaMousePressed
        // TODO add your handling code here:
        
        System.out.println("Estas presionando el boton de arriba");
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-up_pressed.png"));
        pausa.setIcon(icono);
        pausa.repaint();
    }

    private void reproducirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproducirMousePressed
        // TODO add your handling code here:
        System.out.println("Estas presionando el boton de play/stop");
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-down_pressed.png"));
        reproducir.setIcon(icono);
        reproducir.repaint();
    }

 
    private void anteriorTemaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorTemaMouseReleased
        // TODO add your handling code here:
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-upLeft.png"));
        anteriorTema.setIcon(icono);
        anteriorTema.repaint();

    }

    private void proximoTemaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proximoTemaMouseReleased
        // TODO add your handling code here:
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-uprigth.png"));
        proximoTema.setIcon(icono);
        proximoTema.repaint();
    }

   

    private void pausaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausaMouseReleased
        // TODO add your handling code here:
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-up.png"));
        pausa.setIcon(icono);
        pausa.repaint();
    }

    private void pausaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pausaMouseClicked
        // TODO add your handling code here:
        player.pause();
    }

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        // TODO add your handling code here: //para cargar seleccion multiple de temas
        player.stop();
    }
     private void stopMouseReleased(java.awt.event.MouseEvent evt) {                                   
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-center.png"));
        pausa.setIcon(icono);
        pausa.repaint();
    }                                  

    private void stopMousePressed(java.awt.event.MouseEvent evt) {                                  
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-center_pressed.png"));
        pausa.setIcon(icono);
        pausa.repaint();    }  

    private void reproducirMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.out.println("Estas presionando el boton de abajo");
        Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/zim-down.png"));
        reproducir.setIcon(icono);
        reproducir.repaint();
    }

    private void reproducirMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        player.play();
    }
    
  private void labelSoundMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        if (!isMute) {
            isMute=true;
            volumeControl(0.0);
            Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/sound_off.png"));
            labelSound.setIcon(icono);
        }else{
            isMute=false;
            volumeControl(1.0);
            Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/sound_ona.png"));
            labelSound.setIcon(icono);
        }
    }                                       

    private void labelRepeatMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        if(!repeat){
            repeat=true;
            player.setRepeat(repeat);
            Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/repeat.png"));
            labelRepeat.setIcon(icono);
        }else {
            repeat=false;
            player.setRepeat(repeat);
            Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/no_repeat.png"));
            labelRepeat.setIcon(icono);
        }
    }                                        

    private void songDisplayNameMousePressed(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        xMouse=evt.getX()+90;
        yMouse=evt.getY()+90;
        System.out.println("Al presionar: X: "+(xMouse)+", Y: "+(yMouse));

    }                                            

                                            

    private void songDisplayNameMouseDragged(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        System.out.println("X: "+(x-xMouse)+", Y: "+(y-yMouse));
    }                                            

    private void openLabelMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        JFileChooser openFileChooser= new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter("mp3", "Open MP3 Files Only!!"));
        int result=openFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            songFile=openFileChooser.getSelectedFile();
            player.addToPlayList(songFile);
            player.skipForward();
            currentDirectory=songFile.getAbsolutePath();
            songDisplayName.setText("Playing:"+songFile.getName()+"---");
        }
    }                                      

    private void minLabelMousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
            Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/face.png"));
            minLabel.setIcon(icono);
    }                                     

    private void minLabelMouseReleased(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
            Icon icono =new ImageIcon(getClass( ).getResource("/ZimIcon/pokerFace.png"));
            minLabel.setIcon(icono);
            if (!windowsCollapse) {
                windowsCollapse=true;
                minLabel.setVisible(false);
                labelRepeat.setVisible(false);
                stop.setVisible(false);
                reproducir.setVisible(false);
                pausa.setVisible(false);
                anteriorTema.setVisible(false);
                proximoTema.setVisible(false);
                songDisplayName.setVisible(false);
                labelSound.setVisible(false);
                labelRepeat.setVisible(false);
                openLabel.setVisible(false);
                labelSoundDown.setVisible(false);
                labelSoundUp.setVisible(false);
                
                Icon iconoMiniatura =new ImageIcon(getClass( ).getResource("/ZimIcon/miniatura-irken.png"));
                miniaturaLabel.setIcon(iconoMiniatura);
                anteriorX=evt.getXOnScreen();
                anteriorY=evt.getYOnScreen();
                this.setLocation(miniaturaAnteriorX-200,miniaturaAnteriorY-300);
                miniaturaLabel.setVisible(true);
                
            }
            
    }                                      

    private void miniaturaLabelMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        if (windowsCollapse) {
                
                windowsCollapse=false;
                minLabel.setVisible(true);
                labelRepeat.setVisible(true);
                stop.setVisible(true);
                reproducir.setVisible(true);
                pausa.setVisible(true);
                anteriorTema.setVisible(true);
                proximoTema.setVisible(true);
                songDisplayName.setVisible(true);
                labelSound.setVisible(true);
                labelRepeat.setVisible(true);
                openLabel.setVisible(true);
                labelSoundUp.setVisible(true);
                labelSoundDown.setVisible(true);
                miniaturaAnteriorX=evt.getXOnScreen();
                miniaturaAnteriorY=evt.getYOnScreen();
                this.setLocation(anteriorX-200,anteriorY-20);
                miniaturaLabel.setVisible(false);
            }
    }                                           

    private void labelSoundDownMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }                                           

    private void labelSoundUpMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }                                         

    private void miniaturaLabelMousePressed(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        xMouse=evt.getX()+180;
            yMouse=evt.getY()+240;

    }                                           

    private void miniaturaLabelMouseDragged(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
         int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        System.out.println("X: "+(x-xMouse)+", Y: "+(y-yMouse));
    }                                           

    
    
    
    //metodo personalizado apra bajar el volumen
    private void volumeDownControl(Double valueToPlusMinus){
        //obtenemos informacion del mixer del sistema de audio
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        
        //listamos todos los mixers
        for (Mixer.Info mixerInfo : mixers) {
            //obtenemos el mixer
            Mixer mixer =AudioSystem.getMixer(mixerInfo);
            
            //Obtejemos la linea que es objetivo 
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            
            //Usamos un ciclo para listar las lineas
            for (Line.Info lineInfo : lineInfos) {
                //hacemos una linea nula
                Line line=null;
                //hacemos un buleano si fue abierto
                boolean opened= true;
                
                //ahora usamos una excepcion para abrir una linea
                try {
                    line=mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    
                    //ahora chequeamos que n oes te abierta
                    if (!opened) {
                        line.open();
                    }
                    //hacemos un control flotante
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    
                    //obtenemos el volumen actual
                    float currentVolume = volControl.getValue();
                    
                    //hacemos una variable doble temporal y guardamos el valuePlusMinus
                    Double volumeToCut=valueToPlusMinus;
                    
                    //hacemos un flotante y calculamos la adicion o sustracion del volumen
                    
                    float changedCalc = (float) ((float)currentVolume-(double)volumeToCut);
                    
                    //ahora seteamos el volumen cambiado dentro de la linea de volumen
                    volControl.setValue(changedCalc);
                            
                } catch (LineUnavailableException e) {
                } catch(IllegalArgumentException e){
                }  finally{
                    //cerramos las lineas abierta
                    if (line !=null && !opened) {
                        line.close();
                    }
                
                }
            }
            
            
        }
    }
        //metodo para subir el volumen
     private void volumeUpControl(Double valueToPlusMinus){
        //obtenemos informacion del mixer del sistema de audio
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        
        //listamos todos los mixers
        for (Mixer.Info mixerInfo : mixers) {
            //obtenemos el mixer
            Mixer mixer =AudioSystem.getMixer(mixerInfo);
            
            //Obtejemos la linea que es objetivo 
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            
            //Usamos un ciclo para listar las lineas
            for (Line.Info lineInfo : lineInfos) {
                //hacemos una linea nula
                Line line=null;
                //hacemos un buleano si fue abierto
                boolean opened= true;
                
                //ahora usamos una excepcion para abrir una linea
                try {
                    line=mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    
                    //ahora chequeamos que n oes te abierta
                    if (!opened) {
                        line.open();
                    }
                    //hacemos un control flotante
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    
                    //obtenemos el volumen actual
                    float currentVolume = volControl.getValue();
                    
                    //hacemos una variable doble temporal y guardamos el valuePlusMinus
                    Double volumeToCut=valueToPlusMinus;
                    
                    //hacemos un flotante y calculamos la adicion o sustracion del volumen
                    
                    float changedCalc = (float) ((float)currentVolume+(double)volumeToCut);
                    
                    //ahora seteamos el volumen cambiado dentro de la linea de volumen
                    volControl.setValue(changedCalc);
                            
                } catch (LineUnavailableException e) {
                } catch(IllegalArgumentException e){
                }  finally{
                    //cerramos las lineas abierta
                    if (line !=null && !opened) {
                        line.close();
                    }
                
                }
            }
            
            
        }
    }
        //metodo de contro lde volumen
      private void volumeControl(Double valueToPlusMinus){
        //obtenemos informacion del mixer del sistema de audio
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        
        //listamos todos los mixers
        for (Mixer.Info mixerInfo : mixers) {
            //obtenemos el mixer
            Mixer mixer =AudioSystem.getMixer(mixerInfo);
            
            //Obtejemos la linea que es objetivo 
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            
            //Usamos un ciclo para listar las lineas
            for (Line.Info lineInfo : lineInfos) {
                //hacemos una linea nula
                Line line=null;
                //hacemos un buleano si fue abierto
                boolean opened= true;
                
                //ahora usamos una excepcion para abrir una linea
                try {
                    line=mixer.getLine(lineInfo);
                    
                    opened = line.isOpen() || line instanceof Clip;
                    
                    //ahora chequeamos que n oes te abierta
                    if (!opened) {
                        line.open();
                    }
                    //hacemos un control flotante
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    
                    //obtenemos el volumen actual
                    float currentVolume = volControl.getValue();
                    
                    //hacemos una variable doble temporal y guardamos el valuePlusMinus
                    Double volumeToCut=valueToPlusMinus;
                    
                    //hacemos un flotante y calculamos la adicion o sustracion del volumen
                    
                    float changedCalc = (float) ((double)volumeToCut);
                    
                    //ahora seteamos el volumen cambiado dentro de la linea de volumen
                    volControl.setValue(changedCalc);
                            
                } catch (LineUnavailableException e) {
                } catch(IllegalArgumentException e){
                }  finally{
                    //cerramos las lineas abierta
                    if (line !=null && !opened) {
                        line.close();
                    }
                
                }
            }
            
            
        }
    }
    
    //Metodo main
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
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
