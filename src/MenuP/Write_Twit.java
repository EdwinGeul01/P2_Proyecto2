
package MenuP;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import proyecto2_progra2.User_Menu;


public class Write_Twit extends javax.swing.JPanel {
 int caracteres= 10;
 File twits ;
 int ncaracteres;
    RandomAccessFile randomAccessFile;
    Date calendar ;
    User_Menu user_Menu;

    public Write_Twit(String user,User_Menu user_Menu) {
        initComponents();
        Listeners();
        twits = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\" +user + "\\twits.twc");
        this.user_Menu = user_Menu;
        
        
     try {
         randomAccessFile = new RandomAccessFile(twits, "rw");
     } catch (FileNotFoundException ex) {
         JOptionPane.showMessageDialog(this, ex);
     }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnenviar = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jlbnombre = new javax.swing.JLabel();
        Ncaracteres = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1030, 222));
        setMinimumSize(new java.awt.Dimension(1030, 222));
        setPreferredSize(new java.awt.Dimension(1030, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnenviar.setBackground(new java.awt.Color(39, 162, 39));
        btnenviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnenviar.setForeground(new java.awt.Color(255, 255, 255));
        btnenviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnenviar.setText("ENVIAR");
        btnenviar.setOpaque(true);
        btnenviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnenviarMousePressed(evt);
            }
        });
        add(btnenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 140, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 204, 255)));
        jTextArea2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jTextArea2HierarchyChanged(evt);
            }
        });
        jTextArea2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextArea2InputMethodTextChanged(evt);
            }
        });
        jTextArea2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextArea2PropertyChange(evt);
            }
        });
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea2KeyTyped(evt);
            }
        });
        jTextArea2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTextArea2VetoableChange(evt);
            }
        });
        add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 690, 90));

        jlbnombre.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jlbnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbnombre.setText("¿Que pasa ?");
        add(jlbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        Ncaracteres.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Ncaracteres.setForeground(new java.awt.Color(102, 102, 102));
        Ncaracteres.setText("140");
        add(Ncaracteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyPressed

        if (jTextArea2.getText().length() >= 140) {
                       String texto = jTextArea2.getText() ;
                       jTextArea2.setText(texto.substring(0, texto.length()-1));
                       
        
}

        
    }//GEN-LAST:event_jTextArea2KeyPressed

    private void jTextArea2HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jTextArea2HierarchyChanged
        // TODO add your handling code here:

    
    }//GEN-LAST:event_jTextArea2HierarchyChanged

    private void jTextArea2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextArea2KeyReleased

    private void jTextArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyTyped
        // TODO add your handling code here:
               
    }//GEN-LAST:event_jTextArea2KeyTyped

    private void jTextArea2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextArea2InputMethodTextChanged
        // TODO add your handling code here:
  

    }//GEN-LAST:event_jTextArea2InputMethodTextChanged

    private void btnenviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenviarMousePressed
     calendar=new Date();
        try {
         randomAccessFile.seek(randomAccessFile.length());
     } catch (IOException ex) {

     }
     try {
         
         boolean SeEncontroUsuario = false;
         boolean SeEncontroArr = false;

         String texto  = jTextArea2.getText();
         
         String palabras[] = texto.split(" ");
         
         for (int i = 0; i < palabras.length; i++) {
             if (!palabras[i].isEmpty()) {
                 
             
             if (palabras[i].charAt(0) == '@'){
                 SeEncontroArr = true;
                 for (int j = 0; j < user_Menu.information.Usuarios.size(); j++) {
                     if (palabras[i].substring(1).equals(user_Menu.information.Usuarios.get(j).getUser())) {
                         SeEncontroUsuario = true;
                     }
                 }
             }
             
         }
         }
         
         if (SeEncontroArr == true) {
             if (SeEncontroUsuario == true) {
                    randomAccessFile.writeUTF(user_Menu.Nombre);
                    randomAccessFile.writeUTF(user_Menu.imgruta);
                    randomAccessFile.writeUTF(texto);
                    randomAccessFile.writeUTF(String.valueOf(calendar.getYear()));
                    randomAccessFile.writeUTF(String.valueOf(calendar.getMonth()));
                    randomAccessFile.writeUTF(String.valueOf(calendar.getDate()));
                    randomAccessFile.writeUTF(String.valueOf(calendar.getHours()));
                    randomAccessFile.writeUTF(String.valueOf(calendar.getMinutes()));
                    randomAccessFile.writeUTF(String.valueOf(calendar.getSeconds()));
                    UpdateMenu();
             }else{
             
                 JOptionPane.showMessageDialog(this, "NO SE ENCONTRO AL USUARIO MENCIONADO!!");
                 
             }
         }else{
                randomAccessFile.writeUTF(user_Menu.Nombre);
                randomAccessFile.writeUTF(user_Menu.imgruta);
                randomAccessFile.writeUTF(texto);
                randomAccessFile.writeUTF(String.valueOf(calendar.getYear()));
                randomAccessFile.writeUTF(String.valueOf(calendar.getMonth()));
                randomAccessFile.writeUTF(String.valueOf(calendar.getDate()));
                randomAccessFile.writeUTF(String.valueOf(calendar.getHours()));
                randomAccessFile.writeUTF(String.valueOf(calendar.getMinutes()));
                randomAccessFile.writeUTF(String.valueOf(calendar.getSeconds()));
         
                UpdateMenu();
         }
         
         
     } catch (IOException ex) {
         JOptionPane.showMessageDialog(this, "ALGO FALLO : " + ex);
     }

    
        
    }//GEN-LAST:event_btnenviarMousePressed

    private void jTextArea2VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTextArea2VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2VetoableChange

    private void jTextArea2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextArea2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ncaracteres;
    private javax.swing.JLabel btnenviar;
    public javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jlbnombre;
    // End of variables declaration//GEN-END:variables

    private void UpdateMenu() {
             
    user_Menu.twits_esc.clear();
    user_Menu.information.UpdateInformation();
    user_Menu.container.removeAll();
    user_Menu.CargarPantallaPrincipal();
   
    }

    private void Listeners() {
        
         jTextArea2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                
                ncaracteres = 140;
                    ncaracteres = ncaracteres - (jTextArea2.getText().length());
                    Ncaracteres.setText(String.valueOf(ncaracteres));
                    
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                ncaracteres = 140;
                    ncaracteres = ncaracteres - (jTextArea2.getText().length());
                    Ncaracteres.setText(String.valueOf(ncaracteres));
                    
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
    }
}
