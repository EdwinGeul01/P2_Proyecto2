
package proyecto2_progra2;

import Information_Manager.Information;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto2_progra2.config;

public class CrearCuenta extends javax.swing.JFrame {
    File file  = new File(config.directory + "\\Proyecto2_Progra2\\Data Center\\users.twc");
    String ruta = config.directory + "\\Proyecto2_Progra2\\src\\Recursos_Proyecto\\default_image.jpg";
    Information information = new Information();
    RandomAccessFile randomAccessFile ;
 
    Login login ;
   
 
    public CrearCuenta(Login login)   {
        initComponents();
        
        this.login = login;
        
        
        try {
            ConectarDatos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtnombreUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jcbGenero = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        img_profile = new javax.swing.JLabel();
        btnCrearCuenta1 = new javax.swing.JLabel();
        btnCrearCuenta2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(37, 79, 136));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setBackground(new java.awt.Color(224, 224, 224));
        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(51, 51, 51));
        txtusuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtusuario.setDoubleBuffered(true);
        txtusuario.setSelectionColor(new java.awt.Color(0, 153, 255));
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 300, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 111, 111));
        jLabel5.setText("CONTRASEÑA :");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(231, 111, 111));
        jLabel6.setText("USUARIO :");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        btnCrearCuenta.setBackground(new java.awt.Color(49, 158, 249));
        btnCrearCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCrearCuenta.setText("CREAR CUENTA");
        btnCrearCuenta.setOpaque(true);
        btnCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMousePressed(evt);
            }
        });
        jPanel1.add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 160, 40));

        txtpass.setBackground(new java.awt.Color(224, 224, 224));
        txtpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(51, 51, 51));
        txtpass.setAutoscrolls(false);
        txtpass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtpass.setSelectionColor(new java.awt.Color(0, 153, 255));
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 300, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(231, 111, 111));
        jLabel7.setText("GENERO :");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 20));

        txtnombreUsuario.setBackground(new java.awt.Color(224, 224, 224));
        txtnombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtnombreUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtnombreUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnombreUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtnombreUsuario.setDoubleBuffered(true);
        txtnombreUsuario.setSelectionColor(new java.awt.Color(0, 153, 255));
        txtnombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(txtnombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(231, 111, 111));
        jLabel8.setText("EDAD :");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        txtedad.setBackground(new java.awt.Color(224, 224, 224));
        txtedad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtedad.setForeground(new java.awt.Color(51, 51, 51));
        txtedad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtedad.setCaretColor(new java.awt.Color(255, 255, 255));
        txtedad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtedad.setDoubleBuffered(true);
        txtedad.setSelectionColor(new java.awt.Color(0, 153, 255));
        txtedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 300, 30));

        jcbGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jcbGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(jcbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 300, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(231, 111, 111));
        jLabel11.setText("NOMBRE DE USUARIO :");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusuarioMouseEntered(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        img_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/default_image.jpg"))); // NOI18N
        jPanel1.add(img_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 100));

        btnCrearCuenta1.setBackground(new java.awt.Color(238, 158, 0));
        btnCrearCuenta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrearCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCrearCuenta1.setText("CAMBIAR FOTO DE PERFIL");
        btnCrearCuenta1.setOpaque(true);
        btnCrearCuenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCuenta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCuenta1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearCuenta1MousePressed(evt);
            }
        });
        jPanel1.add(btnCrearCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 20));

        btnCrearCuenta2.setBackground(new java.awt.Color(255, 51, 51));
        btnCrearCuenta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCrearCuenta2.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCrearCuenta2.setText("SALIR");
        btnCrearCuenta2.setOpaque(true);
        btnCrearCuenta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCuenta2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearCuenta2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCrearCuenta2MousePressed(evt);
            }
        });
        jPanel1.add(btnCrearCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 130, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 350, 550));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 330, 550));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1090, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtusuarioMouseEntered

    private void btnCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseEntered
        btnCrearCuenta.setBackground(new Color(34,115,182));
    }//GEN-LAST:event_btnCrearCuentaMouseEntered

    private void btnCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseExited
        btnCrearCuenta.setBackground(new Color(49,158,249));

    }//GEN-LAST:event_btnCrearCuentaMouseExited

    private void btnCrearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMousePressed

        
        for (int i = 0; i < information.Usuarios.size(); i++) {
            if (information.Usuarios.get(i).getUser().equals(txtusuario.getText())) {
                JOptionPane.showMessageDialog(this, "USUARIO YA OCUPADO!!! porfavor selecciones otro");
                return;
            }
        }
        
        
        
        
        
        
        
        try {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeUTF(txtnombreUsuario.getText());
            randomAccessFile.writeUTF(txtusuario.getText());
            randomAccessFile.writeUTF(String.valueOf(txtpass.getPassword()));
            try {
               randomAccessFile.writeInt(Integer.valueOf(txtedad.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en el dato de edad , se establecera como 0");
                randomAccessFile.writeInt(0);
            }
            if (jcbGenero.getSelectedItem().toString().equals("M")) {
               randomAccessFile.writeChar('M'); 
            }else{
                randomAccessFile.writeChar('F'); 
            }
            randomAccessFile.writeBoolean(true);
            randomAccessFile.writeUTF(ruta);
             
            File Directorio = new File(config.directory +  "\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+txtusuario.getText());
            Directorio.mkdir();
            File following = new File(config.directory +  "\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+txtusuario.getText()+"\\following.twc");
            following.createNewFile();
            File followers = new File(config.directory +  "\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+txtusuario.getText()+"\\followers.twc");
            followers.createNewFile();
            File twits = new File(config.directory +  "\\Proyecto2_Progra2\\Data Center\\USUARIOS\\"+txtusuario.getText()+"\\twits.twc");
            twits.createNewFile();
            randomAccessFile.close();
        } catch (IOException ex) {
        }
        
        login.information.UpdateInformation();
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnCrearCuentaMousePressed

    private void btnCrearCuenta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuenta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCuenta1MouseEntered

    private void btnCrearCuenta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuenta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCuenta1MouseExited

    private void btnCrearCuenta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuenta1MousePressed
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
       chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
       
        if (chooser.getSelectedFile() != null) {
             ruta = chooser.getSelectedFile().toString();
            ImageIcon image = new ImageIcon(ruta);
            ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(img_profile.getWidth(),img_profile.getHeight(),Image.SCALE_DEFAULT));
             img_profile.setIcon(image2);
             
        }
        System.out.println(chooser.getCurrentDirectory().toString());

    }//GEN-LAST:event_btnCrearCuenta1MousePressed

    private void btnCrearCuenta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuenta2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCuenta2MouseEntered

    private void btnCrearCuenta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuenta2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCuenta2MouseExited

    private void btnCrearCuenta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuenta2MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCrearCuenta2MousePressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCrearCuenta;
    private javax.swing.JLabel btnCrearCuenta1;
    private javax.swing.JLabel btnCrearCuenta2;
    private javax.swing.JLabel img_profile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombreUsuario;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void ConectarDatos() throws FileNotFoundException, IOException, ClassNotFoundException  {

        
        randomAccessFile= new RandomAccessFile(file, "rw");
        
           
    }
}
