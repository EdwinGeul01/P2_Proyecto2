
package MenuP;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Twit_Panel extends javax.swing.JPanel {


    String nombre, twit , urlimg, fecha;
    
    public Twit_Panel(String nombre , String twit , String urlImg, String fecha) {
        initComponents();
        this.nombre = nombre;
        this.twit = twit;
        urlimg = urlImg;
        this.fecha = fecha;
        AsignarDatos();
    }


    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlbtwit = new javax.swing.JTextArea();
        jlb_img = new javax.swing.JLabel();
        jlbnombre = new javax.swing.JLabel();
        jlbfecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(42, 78, 186)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jlbtwit.setEditable(false);
        jlbtwit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jlbtwit.setLineWrap(true);
        jlbtwit.setRows(5);
        jlbtwit.setBorder(null);
        jlbtwit.setCaretColor(new java.awt.Color(255, 255, 255));
        jlbtwit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jlbtwit.setPreferredSize(new java.awt.Dimension(710, 110));
        jScrollPane1.setViewportView(jlbtwit);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 110));

        jlb_img.setBackground(new java.awt.Color(51, 51, 255));
        add(jlb_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 50));

        jlbnombre.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbnombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbnombre.setText("NOMBRE DE LA PERSONA");
        jlbnombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(jlbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 182, 40));

        jlbfecha.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbfecha.setText("FECHA");
        add(jlbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 170, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb_img;
    private javax.swing.JLabel jlbfecha;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JTextArea jlbtwit;
    // End of variables declaration//GEN-END:variables

    private void AsignarDatos() {

        ImageIcon image = new ImageIcon(urlimg);
        ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(60,58,Image.SCALE_DEFAULT));
        
        jlb_img.setIcon(image2);
        jlbnombre.setText(nombre);
        jlbfecha.setText(fecha);
        jlbtwit.setText(twit);

    }
}
