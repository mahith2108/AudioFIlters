/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;


import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import sun.audio.AudioPlayer;
import static sun.audio.AudioPlayer.player;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncoderProgressListener;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.MultimediaInfo;
import it.sauronsoftware.jave.Encoder;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayInputStream;
import static java.lang.System.in;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author mahith
 */
public class NewJFrame extends javax.swing.JFrame  implements MouseListener {

    static void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form NewJFrame
     */
    String s;
    InputStream in;
    AudioPlayer a;
    InputStream is;
    InputStream ins;
    SimpleSoundPlayer sound;
   
    
    
    public NewJFrame() {
        initComponents();
    }
    
    public String get(){
    
    String s=jTextField1.getText();
        return s;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Attach");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Play (Mp3/wav files)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Echo filter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Lowpas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("High pass");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton6)
                                .addGap(31, 31, 31)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new  JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        System.out.println(filename);
        String filename1 = filename.replace("\\", "\\\\"); 
        jTextField1.setText(filename1); 
        
        if(filename1.endsWith(".mp3")){
        
            File source = new File(filename1);
            s=filename1.replace(".mp3", ".wav");
            File target = new File(s);
            jTextField1.setText(s);  
            //System.out.println(s);
            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("pcm_s16le");
            audio.setBitRate(128000);
            audio.setChannels(2);
            audio.setSamplingRate(44100);
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("wav");
            attrs.setAudioAttributes(audio);
            Encoder en = new Encoder();
           try {   
               en.encode(source,target,attrs);
           } catch (IllegalArgumentException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (EncoderException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            String s=jTextField1.getText();
            File f1=new File(s);
            System.out.print(f1);
            
            // check wav file
           try {
               in = new FileInputStream(f1);
               AudioPlayer.player.start(in);
               
        } catch (FileNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
               /* catch (IOException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
               }*/
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
           AudioPlayer.player.stop(in);
           
            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         
          // EchoFilterTest e1=new EchoFilterTest();
           
         // load the sound
      
        
         sound = new SimpleSoundPlayer(jTextField1.getText());

         // create the sound stream
         is = new ByteArrayInputStream(sound.getSamples());

         // create an echo with a 11025-sample buffer
         // (1/4 sec for 44100Hz sound) and a 60% decay
         EchoFilter filter = new EchoFilter(11025, .6f);

         // create the filtered sound stream
         is = new FilteredSoundStream(is, filter);
         
        System.out.print(is.getClass());

          // play the sound
         sound.play(is);

        // due to bug in Java Sound, explicitly exit the VM.
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         String s2=jTextField1.getText();
         System.out.print(s2);
         LowPass l1=new LowPass();
        try {
            l1.fil(s2);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s="C:\\Users\\mahith\\Desktop\\razorlamepack\\audio2.mp3";
        if(s.endsWith(".mp3")){
        
            File source = new File(s);
            s=s.replace(".mp3", ".wav");
            File target = new File(s);
            jTextField1.setText(s);  
            System.out.println(s);
            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("pcm_s16le");
            audio.setBitRate(128000);
            audio.setChannels(2);
            audio.setSamplingRate(44100);
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("wav");
            attrs.setAudioAttributes(audio);
            Encoder en = new Encoder();
            
         try {   
               en.encode(source,target,attrs);
           } catch (IllegalArgumentException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (EncoderException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
           AudioSpectrum as=new AudioSpectrum(); 
        try {
            as.fill(s);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner in = new Scanner(System.in);
 
        System.out.println("Enter a string");
        s = in.nextLine();
        if(s!=null){
         
            System.out.print("succes");
            
            String s1=jTextField1.getText();
            File f2=new File(s1);
            System.out.print(f2);
            
            // check wav file
           try {
               InputStream in1 = new FileInputStream(f2);
               AudioPlayer.player.start(in1);
               
        } catch (FileNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }  
           
          Example ex1=new Example();
             try {
                 ex1.spectrum();
             } catch (IOException ex) {
                 Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
         String s3=jTextField1.getText();
         System.out.print(s3);
         HighPass h1=new HighPass();
        try {
            h1.fil(s3);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String s="C:\\Users\\mahith\\Desktop\\razorlamepack\\audio3.mp3";
         if(s.endsWith(".mp3")){
        
            File source = new File(s);
            s=s.replace(".mp3", ".wav");
            File target = new File(s);
            jTextField1.setText(s);  
            System.out.println(s);
            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("pcm_s16le");
            audio.setBitRate(128000);
            audio.setChannels(2);
            audio.setSamplingRate(44100);
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("wav");
            attrs.setAudioAttributes(audio);
            Encoder en = new Encoder();
           try {   
               en.encode(source,target,attrs);
           } catch (IllegalArgumentException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (EncoderException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
        
        AudioSpectrum as=new AudioSpectrum();
        try {
            as.fill(s);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a string");
        s = in.nextLine();
        if(s!=null){
        //System.out.print("succes");
         //String s="C:\\Users\\mahith\\Desktop\\razorlamepack\\audio3.mp3";
           String s1=jTextField1.getText();
            File f2=new File(s1);
            System.out.print(f2);
            
            // check wav file
           try {
               InputStream in1 = new FileInputStream(f2);
               AudioPlayer.player.start(in1);
               
        } catch (FileNotFoundException ex) {
               Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_jButton5ActionPerformed
             try {
                Example ex=new Example();
                ex.spectrum();
             } catch (IOException ex1) {
                 Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex1);
             }
        
        }
}      
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

   
    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
        try {
            in.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
