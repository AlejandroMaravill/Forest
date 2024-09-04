/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.FlatDarkLaf;
import SwingComponents.TextPrompt;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.scene.control.TextField;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author LabsPab2
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form LoginExpo
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Img/IconoITRSP.PNG")).getImage());
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/Img/Logo2.PNG");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "src/Img/fondo.PNG");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel10, "src/Img/bg_login.PNG");
        Vista.settings.leer();
               
        JCheckBox checkbox = new JCheckBox("Enable Logging", true);
        
        TextPrompt ph = new TextPrompt("codigo@ricaldone.edu.sv", jTextField1);
        
        TextPrompt ph2 = new TextPrompt("**********", jPasswordField1);
        jCheckBox1.setCursor(new Cursor(HAND_CURSOR));
        jButton2.setCursor(new Cursor(HAND_CURSOR));
        jLabel11.setCursor(new Cursor(HAND_CURSOR));
        jTextField1.setBorder(null);
        jTextField1.setBackground(null);
        jPasswordField1.setBorder(null);
        jPasswordField1.setBackground(null);
        jLabel8.setCursor(new Cursor(HAND_CURSOR));
        jButton1.setCursor(new Cursor(HAND_CURSOR));
        readpassword();
    }
     int i;
     String name = "password.txt";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITR");
        setBounds(new java.awt.Rectangle(490, 170, 0, 0));
        setIconImages(null);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 405, 74));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingresa tus credenciales para acceder al sistema");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo Electronico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextField1.setBackground(new java.awt.Color(22, 49, 57));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 259, 30));

        jPasswordField1.setBackground(new java.awt.Color(22, 49, 57));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 259, 31));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordarme");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Establecer servidor");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("¿Olvido su contraseña?");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(196, 152, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Iniciar Sesión");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 120, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 940, 83));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 10));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 460, 580));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 10));

        jButton1.setBackground(new java.awt.Color(196, 152, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Test Connection");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
       
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (i == 1) {
            savepassword();
            Vista.settings.ocultar(name);
        }
        
        Home abrir = new Home();
        
        abrir.setVisible(true);
        
        dispose();
        
        if(jTextField1.getText().length()==0)
        {
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

    }//GEN-LAST:event_jTextField1FocusGained

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        RememberPassword abrir = new RememberPassword();
        
        abrir.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        settings open = new settings();
        open.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (Controlador.ConexionControlador.getConnection() != null) {
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }else{
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:       
        if (jCheckBox1.isSelected()) {
            if (jTextField1.getText().trim().equals("")||jPasswordField1.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor completar todos los campos requeridos");
                jCheckBox1.setSelected(false);
            } else {
                i = 1;
            }
            
        }else{
            i = 0;
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked
    
    void savepassword(){
        try {
            ProcessBuilder password = new ProcessBuilder("cmd.exe", "/c", "cd");
            password.redirectErrorStream(true);
            Process a = password.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(a.getInputStream()));
            String line;
            while (true) {                
                line = reader.readLine();
                if (line == null) {break;}
                try {
                    PrintWriter print = new PrintWriter(line + "/" + name);
                    print.println(jTextField1.getText());
                    print.println(jPasswordField1.getText());
                    print.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    /**
     * @param args the command line arguments
     */
    
    void readpassword(){
        try {
            ProcessBuilder path = new ProcessBuilder("cmd.exe", "/c", "cd"); 
            path.redirectErrorStream(true);
            Process a = path.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(a.getInputStream()));
            String line;
            while (true) {                
                line = reader.readLine();
                if(line == null) {break; }
                try {
                    Scanner input = new Scanner(new File(line + "/" + name));
                    int j = 0;
                    while (input.hasNextLine()) {                        
                        String space = input.nextLine();
                        switch(j){
                            case 0:
                                jTextField1.setText(space);
                                break;
                            case 1:
                                jPasswordField1.setText(space);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error en la lectura");
                                break;
                        }
                        j++;
                    }
                    input.close();
                    jCheckBox1.setSelected(true);
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
        } catch (Exception e) {
            System.out.println("mal");
        }
    }
    
    public static void delete(String name){
        File file = new File(name);
        if (file.isFile()) {
            try {
                file.delete();
            } catch (Exception e) {
                System.out.println("Error al eliminar el archivo");
            }
        }
    }
    
    public static void main(String args[]) {  
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            UIManager.put( "TextComponent.arc", 15 );
            UIManager.put( "CheckBox.arc", 15 );
            UIManager.put( "Button.arc", 15 );
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
