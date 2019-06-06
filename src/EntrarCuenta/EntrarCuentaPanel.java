
package EntrarCuenta;

import Clases_Aux.Seguidores;
import Clases_Aux.Siguiendo;
import Clases_Aux.twits_Escritos;
import Information_Manager.Information;
import MenuP.Twit_Panel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyecto2_progra2.User_Menu;


public class EntrarCuentaPanel extends javax.swing.JPanel {

    User_Menu user_Menu;
    int indice,userlogIndice;
    Information information = new Information();
    boolean siguiendo ;
    ArrayList<twits_Escritos> twits = new ArrayList<>();
    ArrayList<twits_Escritos> twitsOrdenados = new ArrayList<>();
    public EntrarCuentaPanel(int indice,boolean siguiendo,int userlogIndice,User_Menu user_Menu) {
        initComponents();
        this.indice = indice;
        this.siguiendo  =siguiendo;
        this.userlogIndice = userlogIndice;
        this.user_Menu = user_Menu;
        CargarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbimg = new javax.swing.JLabel();
        btnseguir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtedad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        btntwits = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbimg.setOpaque(true);
        add(jlbimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 160));

        btnseguir.setBackground(new java.awt.Color(61, 159, 28));
        btnseguir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnseguir.setForeground(new java.awt.Color(255, 255, 255));
        btnseguir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnseguir.setText("Seguir");
        btnseguir.setOpaque(true);
        btnseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnseguirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnseguirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnseguirMousePressed(evt);
            }
        });
        add(btnseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 120, 30));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRE :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 60, 20));

        txtnombre.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtnombre.setText("TXTNOMBRE");
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 340, 20));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setText("EDAD :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 20));

        txtedad.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtedad.setText("TXTEDAD");
        add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 370, 20));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setText("GENERO :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 70, 20));

        txtGenero.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtGenero.setText("TXTGENERO");
        add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 220, 20));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, 20));

        txtUsuario.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtUsuario.setText("TXTUSUARIO");
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 230, 20));

        btntwits.setBackground(new java.awt.Color(51, 153, 255));
        btntwits.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btntwits.setForeground(new java.awt.Color(255, 255, 255));
        btntwits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btntwits.setText("Desplegar twits");
        btntwits.setOpaque(true);
        btntwits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntwitsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntwitsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btntwitsMousePressed(evt);
            }
        });
        add(btntwits, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnseguirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnseguirMouseEntered

    }//GEN-LAST:event_btnseguirMouseEntered

    private void btnseguirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnseguirMouseExited
        // TODO add your handling code here:[204,204,204]
        
        
    }//GEN-LAST:event_btnseguirMouseExited

    private void btnseguirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnseguirMousePressed

        if (user_Menu.information.Usuarios.get(indice).getUser().equals(information.Usuarios.get(userlogIndice).getUser())) {
            JOptionPane.showMessageDialog(this, "NO SE PUEDE SEGUIR A UNO MISMO!!");
            return;
        }
        
        if (siguiendo == false) {
            siguiendo = true;
            boolean existe = false;
            
            for (int i = 0; i < information.Usuarios.get(userlogIndice).siguiendo.size(); i++) {
                if (information.Usuarios.get(userlogIndice).siguiendo.get(i).User.equals(information.Usuarios.get(indice).getUser())) {
                    information.Usuarios.get(userlogIndice).siguiendo.get(i).SiguiendoActualmente = siguiendo;
                    
                    for (int j = 0; j < information.Usuarios.get(indice).Seguidores.size(); j++) {
                        if (information.Usuarios.get(indice).Seguidores.get(j).getUser().equals(information.Usuarios.get(userlogIndice).getUser())) {
                            information.Usuarios.get(indice).Seguidores.get(j).setSiguiendoActualmente(true);
                        }
                    }
                    
                    existe = true;
                    btnseguir.setText("Dejar de seguir");
                    btnseguir.setBackground(Color.red);
                }
                
            }
            
            if (existe == false) {
                information.Usuarios.get(userlogIndice).siguiendo.add(new Siguiendo(information.Usuarios.get(indice).getUser(),true ));
                information.Usuarios.get(indice).Seguidores.add(new Seguidores(information.Usuarios.get(userlogIndice).getUser(), true));
            btnseguir.setText("Dejar de seguir");
            btnseguir.setBackground(Color.red);
            }
            
            
        }else{
            siguiendo = false;
            for (int i = 0; i < information.Usuarios.get(userlogIndice).siguiendo.size(); i++) {
                 
                if (information.Usuarios.get(userlogIndice).siguiendo.get(i).User.equals(information.Usuarios.get(indice).getUser())) {
                    information.Usuarios.get(userlogIndice).siguiendo.get(i).SiguiendoActualmente = siguiendo;}
                
            for (int j = 0; j < information.Usuarios.get(indice).Seguidores.size(); j++) {
                        if (information.Usuarios.get(indice).Seguidores.get(j).getUser().equals(information.Usuarios.get(userlogIndice).getUser())) {
                            information.Usuarios.get(indice).Seguidores.get(j).setSiguiendoActualmente(false);
                        }
                    }    
            btnseguir.setText("seguir");
            btnseguir.setBackground(new Color(61,159,28));
            }

            
        
        }
        
        information.SobreEscribir();
        information.UpdateInformation();
        user_Menu.information.UpdateInformation();
        user_Menu.following();

        
    }//GEN-LAST:event_btnseguirMousePressed

    private void btntwitsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntwitsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btntwitsMouseEntered

    private void btntwitsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntwitsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btntwitsMouseExited

    private void btntwitsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntwitsMousePressed
        // TODO add your handling code here:
        twits.clear();
        twitsOrdenados.clear();
        for (int i = 0; i < information.Usuarios.get(indice).twits.size(); i++) {
            twits.add(information.Usuarios.get(indice).twits.get(i));
        }
         
        OrdenarTwits();
        MostrarTwits();
    }//GEN-LAST:event_btntwitsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnseguir;
    private javax.swing.JLabel btntwits;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlbimg;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtedad;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

    private void CargarDatos() {

        txtnombre.setText(information.Usuarios.get(indice).getNombre());
        txtedad.setText(information.Usuarios.get(indice).getEdad());
        txtUsuario.setText(information.Usuarios.get(indice).getUser());
        txtGenero.setText(String.valueOf(information.Usuarios.get(indice).getGenero()));
        
       ImageIcon image = new ImageIcon(information.Usuarios.get(indice).getImg_Url());
       ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(215,261,Image.SCALE_DEFAULT));

        jlbimg.setIcon(image2);
        
        if (siguiendo == true) {
            btnseguir.setText("Dejar de seguir");
            btnseguir.setBackground(Color.red);
        }
        
        
    }

    private void MostrarTwits() {
       
        int altura = 264;//760, 460
        int anchura = 760;
        int ditanciaX=0 , distanciaY = 0;
        
         for (int i = 0; i < twitsOrdenados.size(); i++) {
            String Fecha = twitsOrdenados.get(i).date.getDate() + "/" + twitsOrdenados.get(i).date.getMonth() + "/" + (twitsOrdenados.get(i).date.getYear()+1900);
            Twit_Panel twit_Panel = new Twit_Panel(twitsOrdenados.get(i).nombre, twitsOrdenados.get(i).twit,twitsOrdenados.get(i).imgurl , Fecha);
            twit_Panel.setVisible(true);
            twit_Panel.setBounds(ditanciaX, distanciaY, anchura, altura);
            user_Menu.container.add(twit_Panel);
            user_Menu.container.updateUI();
            user_Menu.container.repaint();
            distanciaY = distanciaY +260;
            
        }
        
        user_Menu.container.setPreferredSize(new Dimension(400, distanciaY));
        user_Menu.container.updateUI();
        user_Menu.container.repaint();
       user_Menu.jScrollPane1.updateUI();
       user_Menu.jScrollPane1.repaint();
    }

    private void OrdenarTwits() {
    if (twits.isEmpty() == false) {
            
        
        long milisecond = twits.get(0).date.getTime();
        long orden[] = new long[twits.size()];
        long ordenCorrecto[] = new long[twits.size()];
        
        //orden inverso
        
       
        
        for (int i = 0; i < orden.length; i++) {
            orden[i] = twits.get(i).date.getTime();
        }
        
        Arrays.sort(orden);
        
        //Arreglando orden
        
        int contador = 0;
        for (int i = orden.length-1; i != -1; i--) {
             ordenCorrecto[i] = orden[contador];
             contador++;
        }
        /*
        for (int i = 0; i < ordenCorrecto.length; i++) {
            System.out.println(ordenCorrecto[i]);
        }
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < ordenCorrecto.length; i++) {
            System.out.println(orden[i]);
        }
        */
        
        for (int i = 0; i < twits.size(); i++) {
            for (int j = 0; j <  twits.size(); j++) {
                if (ordenCorrecto[i] == twits.get(j).date.getTime()) {
                    twitsOrdenados.add(twits.get(j));
                }
            }
        }
        
        
        
        
    }
    }
}
