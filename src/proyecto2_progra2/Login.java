
package proyecto2_progra2;

import java.awt.Color;
import AppPackage.AnimationClass;
import Information_Manager.Information;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Information information = new Information();
    File file  = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\users.twc");
    String ruta = "C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\src\\Recursos_Proyecto\\default_image.jpg";
    RandomAccessFile randomAccessFile ;

    public Login() {
        
        initComponents();
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreateAcount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btningresar = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnCreateAcount1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(37, 79, 136));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        txtusuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtusuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtusuario.setDoubleBuffered(true);
        txtusuario.setOpaque(false);
        txtusuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtusuario.setSelectionColor(new java.awt.Color(153, 212, 189));
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 213, 192));
        jLabel5.setText("CONTRASEÑA :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnCreateAcount.setBackground(new java.awt.Color(0, 188, 230));
        btnCreateAcount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateAcount.setForeground(new java.awt.Color(102, 102, 102));
        btnCreateAcount.setText("Crear Cuenta");
        btnCreateAcount.setDoubleBuffered(true);
        btnCreateAcount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateAcountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateAcountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCreateAcountMousePressed(evt);
            }
        });
        jPanel1.add(btnCreateAcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/icons8_User_96px_2.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(121, 218, 195));
        jLabel6.setText("USUARIO :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        btningresar.setBackground(new java.awt.Color(49, 158, 249));
        btningresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btningresar.setForeground(new java.awt.Color(255, 255, 255));
        btningresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btningresar.setText("INGRESAR");
        btningresar.setOpaque(true);
        btningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btningresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btningresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btningresarMousePressed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 160, 40));

        txtpass.setBackground(new java.awt.Color(102, 102, 102));
        txtpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpass.setAutoscrolls(false);
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        txtpass.setOpaque(false);
        txtpass.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtpass.setSelectionColor(new java.awt.Color(153, 212, 189));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        btnCreateAcount1.setBackground(new java.awt.Color(0, 188, 230));
        btnCreateAcount1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateAcount1.setForeground(new java.awt.Color(102, 102, 102));
        btnCreateAcount1.setText("Salir");
        btnCreateAcount1.setDoubleBuffered(true);
        btnCreateAcount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateAcount1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateAcount1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCreateAcount1MousePressed(evt);
            }
        });
        jPanel1.add(btnCreateAcount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 330, 440));

        jLabel1.setBackground(new java.awt.Color(61, 61, 61));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 68, 330, 440));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 990, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAcountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAcountMouseEntered
        btnCreateAcount.setForeground(new Color(0,188,230));
    }//GEN-LAST:event_btnCreateAcountMouseEntered

    private void btnCreateAcountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAcountMouseExited
        btnCreateAcount.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_btnCreateAcountMouseExited

    private void btnCreateAcountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAcountMousePressed
        CrearCuenta crear_Cuenta = new CrearCuenta(this);
        crear_Cuenta.setVisible(true);
        crear_Cuenta.setLocationRelativeTo(null);
      
  
      
    }//GEN-LAST:event_btnCreateAcountMousePressed

    private void btningresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseEntered
        // TODO add your handling code here:
        btningresar.setBackground(new Color(34,115,182));
    }//GEN-LAST:event_btningresarMouseEntered

    private void btningresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseExited
      btningresar.setBackground(new Color(49,158,249));
    }//GEN-LAST:event_btningresarMouseExited

    private void btningresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMousePressed
          
        for (int i = 0; i < information.Usuarios.size(); i++) {
            System.out.println(information.Usuarios.get(i).getUser());
            System.out.println(information.Usuarios.get(i).getPass());
            
            if (information.Usuarios.get(i).getUser().equals(txtusuario.getText()) && information.Usuarios.get(i).getPass().equals(String.valueOf(txtpass.getPassword())) ) {
                this.dispose();
               User_Menu menu = new User_Menu(i);
               menu.setVisible(true);
               menu.setLocationRelativeTo(null);
               return;
                
            }
        }
        
        JOptionPane.showMessageDialog(this,"Usuario o Contraseña Incorrecta!!");
        
    }//GEN-LAST:event_btningresarMousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
 
    }//GEN-LAST:event_jLabel9MousePressed

    private void btnCreateAcount1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAcount1MouseEntered
        // TODO add your handling code here:
                btnCreateAcount1.setForeground(Color.red);

    }//GEN-LAST:event_btnCreateAcount1MouseEntered

    private void btnCreateAcount1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAcount1MouseExited
        // TODO add your handling code here:
              btnCreateAcount1.setForeground(new Color(102,102,102));

    }//GEN-LAST:event_btnCreateAcount1MouseExited

    private void btnCreateAcount1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAcount1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCreateAcount1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCreateAcount;
    private javax.swing.JLabel btnCreateAcount1;
    private javax.swing.JLabel btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
