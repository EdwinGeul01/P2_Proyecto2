
package proyecto2_progra2;

import java.awt.Color;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btningresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fnodoblanco1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(11, 11, 11));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btningresar.setBackground(new java.awt.Color(49, 158, 249));
        btningresar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btningresar.setForeground(new java.awt.Color(255, 255, 255));
        btningresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btningresar.setText("INGRESAR ");
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
        jPanel2.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 320, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TWIT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 420, 60));

        btnRegistro.setBackground(new java.awt.Color(255, 59, 136));
        btnRegistro.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("SALIR");
        btnRegistro.setAutoscrolls(true);
        btnRegistro.setOpaque(true);
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistroMousePressed(evt);
            }
        });
        jPanel2.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 320, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/buho.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 560, 490));

        jLabel2.setBackground(new java.awt.Color(176, 176, 176));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/giphy.gif"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 310));

        fnodoblanco1.setBackground(new java.awt.Color(255, 255, 255));
        fnodoblanco1.setOpaque(true);
        jPanel2.add(fnodoblanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 380, 310));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("V 0.2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseEntered
    btningresar.setBackground(new Color(34,115,182));
    }//GEN-LAST:event_btningresarMouseEntered

    private void btningresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseExited
        // TODO add your handling code here:[204,204,204]
        btningresar.setBackground(new Color(49,158,249));
    }//GEN-LAST:event_btningresarMouseExited

    private void btningresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMousePressed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btningresarMousePressed

    private void btnRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnRegistroMousePressed

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        btnRegistro.setBackground(new Color(249,181,47));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
        btnRegistro.setBackground(new Color(184,134,35));
    }//GEN-LAST:event_btnRegistroMouseEntered



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel btningresar;
    private javax.swing.JLabel fnodoblanco1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
