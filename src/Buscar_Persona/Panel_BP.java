
package Buscar_Persona;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import proyecto2_progra2.User_Menu;


public class Panel_BP extends javax.swing.JPanel {

    String User,nombre,Edad,Genero,imgurl;
    boolean EstaSiguiendo;
    User_Menu user_Menu;
    public Panel_BP(String User,String nombre, String edad, String Genero ,boolean EstaSiguiendo,String imgurl,User_Menu user_Menu) {
        initComponents();
        this.User = User;
        this.nombre = nombre;
        Edad = edad;
        this.Genero = Genero;
        this.EstaSiguiendo = EstaSiguiendo;
        this.imgurl = imgurl;
        this.user_Menu = user_Menu;
        CargarDatos();
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbimg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbuser = new javax.swing.JLabel();
        txtsiguiendo = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JLabel();
        txtedad = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1030, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbimg.setBackground(new java.awt.Color(255, 255, 255));
        jlbimg.setOpaque(true);
        add(jlbimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 80));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("GENERO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 50, 20));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setText("Se esta Siguiendo ?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 110, 20));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setText("EDAD");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 40, 20));

        jlbuser.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jlbuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbuser.setText("USER");
        add(jlbuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        txtsiguiendo.setBackground(new java.awt.Color(255, 51, 51));
        txtsiguiendo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsiguiendo.setForeground(new java.awt.Color(255, 255, 255));
        txtsiguiendo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtsiguiendo.setText("NO");
        txtsiguiendo.setOpaque(true);
        add(txtsiguiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 60, 40));

        txtnombre.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtnombre.setText("NOMBRE");
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 60, 20));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setText("NOMBRE");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, 20));

        txtGenero.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtGenero.setText("NOMBRE");
        add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, 20));

        txtedad.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtedad.setText("NOMBRE");
        add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 60, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlbimg;
    private javax.swing.JLabel jlbuser;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtedad;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JLabel txtsiguiendo;
    // End of variables declaration//GEN-END:variables

    private void CargarDatos() {

        txtnombre.setText(nombre);
        txtedad.setText(Edad);
        txtGenero.setText(Genero);
        
        ImageIcon image = new ImageIcon(imgurl);
        ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(60,58,Image.SCALE_DEFAULT));
        
        jlbimg.setIcon(image2);
        jlbuser.setText(User);
        
        if (EstaSiguiendo == true) {
            txtsiguiendo.setText("SI");
            txtsiguiendo.setBackground(Color.green);
        }else{
            txtsiguiendo.setText("NO");
            txtsiguiendo.setBackground(Color.RED);
        }
        
        user_Menu.information.UpdateInformation();
        
        
    }
}
