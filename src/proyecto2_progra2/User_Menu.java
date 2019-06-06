package proyecto2_progra2;

import AppPackage.AnimationClass;
import Buscar_Persona.Panel_BP;
import Clases_Aux.Personas_Buscadas;
import Clases_Aux.twits_Escritos;
import EntrarCuenta.EntrarCuentaPanel;
import Information_Manager.Information;
import MenuP.Twit_Panel;
import MenuP.Write_Twit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class User_Menu extends javax.swing.JFrame {

    public Information information = new Information();
    File file = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\users.twc");

    File twits;
    RandomAccessFile Twits;
    AnimationClass animationClass = new AnimationClass();

    public ArrayList<twits_Escritos> twits_esc = new ArrayList<>();
    ArrayList<twits_Escritos> OrdentwEscritos = new ArrayList<>();

    ArrayList<twits_Escritos> twitsEncontrados = new ArrayList<>();
    ArrayList<twits_Escritos> OrdentwitsEncontrados = new ArrayList<>();

    int indice;
    public String Nombre, Usuario, imgruta;
    char Genero;
    int Edad;
    boolean Estado,infomenuact = false;

    public User_Menu(int Indice) {
        initComponents();
        indice = Indice;

        try {
            CargarDatos();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        twits = new File("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\Data Center\\USUARIOS\\" + Usuario + "\\twits.twc");

        try {
            Twits = new RandomAccessFile(twits, "rw");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        CargarPantallaPrincipal();
        following();
        followers();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JLabel();
        btnBPersona = new javax.swing.JLabel();
        btnBEntrarCuenta = new javax.swing.JLabel();
        PanelUserMenu = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        jlbnombre = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnDesplegarBuscar = new javax.swing.JLabel();
        jlbnombre1 = new javax.swing.JLabel();
        menuButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OptMenu = new javax.swing.JPanel();
        btnEditProfile = new javax.swing.JLabel();
        btnBuscarPersonas = new javax.swing.JLabel();
        btnEntrarCuenta = new javax.swing.JLabel();
        btnDescActCuenta = new javax.swing.JLabel();
        btncerrarSesion = new javax.swing.JLabel();
        User_Inf = new javax.swing.JPanel();
        imginfo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnombreinfo = new javax.swing.JLabel();
        txtgeneroinfo = new javax.swing.JLabel();
        txtestadoinfo = new javax.swing.JLabel();
        txtfechainfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        container = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        container2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        followingList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        followerlist = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        texto_opt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1170, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBackground(new java.awt.Color(87, 184, 134));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("BUSCAR");
        btnBuscar.setOpaque(true);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -50, 130, 40));

        btnBPersona.setBackground(new java.awt.Color(48, 216, 134));
        btnBPersona.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnBPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBPersona.setText("BUSCAR");
        btnBPersona.setOpaque(true);
        btnBPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBPersonaMousePressed(evt);
            }
        });
        getContentPane().add(btnBPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -50, 130, 40));

        btnBEntrarCuenta.setBackground(new java.awt.Color(244, 174, 79));
        btnBEntrarCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBEntrarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnBEntrarCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBEntrarCuenta.setText("BUSCAR");
        btnBEntrarCuenta.setOpaque(true);
        btnBEntrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBEntrarCuentaMousePressed(evt);
            }
        });
        getContentPane().add(btnBEntrarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -50, 130, 40));

        PanelUserMenu.setBackground(new java.awt.Color(24, 67, 113));
        PanelUserMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setBackground(new java.awt.Color(255, 255, 255));
        picture.setOpaque(true);
        PanelUserMenu.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 40, 40));

        jlbnombre.setBackground(new java.awt.Color(51, 51, 51));
        jlbnombre.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jlbnombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbnombre.setText("jLabel1");
        jlbnombre.setOpaque(true);
        jlbnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbnombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbnombreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbnombreMousePressed(evt);
            }
        });
        PanelUserMenu.add(jlbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 230, 40));

        Home.setBackground(new java.awt.Color(24, 67, 113));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/home.png"))); // NOI18N
        Home.setOpaque(true);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });
        PanelUserMenu.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, 30));

        txtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(null);
        PanelUserMenu.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 15, 270, 30));

        btnDesplegarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/finder.png"))); // NOI18N
        btnDesplegarBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDesplegarBuscarMousePressed(evt);
            }
        });
        PanelUserMenu.add(btnDesplegarBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 15, 30, 30));

        jlbnombre1.setBackground(new java.awt.Color(24, 67, 113));
        jlbnombre1.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 36)); // NOI18N
        jlbnombre1.setForeground(new java.awt.Color(255, 255, 255));
        jlbnombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbnombre1.setText("TWIT");
        jlbnombre1.setOpaque(true);
        jlbnombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbnombre1MousePressed(evt);
            }
        });
        PanelUserMenu.add(jlbnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 40));

        menuButton.setBackground(new java.awt.Color(24, 67, 113));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CmenuR.png"))); // NOI18N
        menuButton.setOpaque(true);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuButtonMousePressed(evt);
            }
        });
        PanelUserMenu.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("@ / #");
        PanelUserMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 15, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/logo.png"))); // NOI18N
        PanelUserMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 42));

        getContentPane().add(PanelUserMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 60));

        OptMenu.setBackground(new java.awt.Color(67, 158, 217));
        OptMenu.setVerifyInputWhenFocusTarget(false);
        OptMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditProfile.setBackground(new java.awt.Color(50, 217, 255));
        btnEditProfile.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditProfile.setText("EDITAR PROFILE");
        btnEditProfile.setOpaque(true);
        btnEditProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditProfileMousePressed(evt);
            }
        });
        OptMenu.add(btnEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 50, 50));

        btnBuscarPersonas.setBackground(new java.awt.Color(48, 216, 134));
        btnBuscarPersonas.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnBuscarPersonas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarPersonas.setText("BUSCAR PERSONAS");
        btnBuscarPersonas.setAutoscrolls(true);
        btnBuscarPersonas.setOpaque(true);
        btnBuscarPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarPersonasMousePressed(evt);
            }
        });
        OptMenu.add(btnBuscarPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        btnEntrarCuenta.setBackground(new java.awt.Color(244, 174, 79));
        btnEntrarCuenta.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnEntrarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrarCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrarCuenta.setText("ENTRAR A UNA CUENTA ");
        btnEntrarCuenta.setOpaque(true);
        btnEntrarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntrarCuentaMousePressed(evt);
            }
        });
        OptMenu.add(btnEntrarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 40));

        btnDescActCuenta.setBackground(new java.awt.Color(227, 122, 218));
        btnDescActCuenta.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnDescActCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnDescActCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDescActCuenta.setText("ON / OFF CUENTA ");
        btnDescActCuenta.setOpaque(true);
        btnDescActCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDescActCuentaMousePressed(evt);
            }
        });
        OptMenu.add(btnDescActCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 40));
        btnDescActCuenta.getAccessibleContext().setAccessibleName("ON / OFF CUENTA");
        btnDescActCuenta.getAccessibleContext().setAccessibleDescription("");

        btncerrarSesion.setBackground(new java.awt.Color(240, 128, 128));
        btncerrarSesion.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btncerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btncerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncerrarSesion.setText("CERRAR SESION");
        btncerrarSesion.setOpaque(true);
        btncerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncerrarSesionMousePressed(evt);
            }
        });
        OptMenu.add(btncerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 40));

        getContentPane().add(OptMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, -200, 240, 190));

        User_Inf.setBackground(new java.awt.Color(255, 255, 255));

        imginfo.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("INFORMACION");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        jLabel12.setText("GENERO :");

        jLabel13.setText("FECHA DE CREACION :");

        jLabel14.setText("ESTADO :");

        jLabel15.setText("NOMBRE:");

        javax.swing.GroupLayout User_InfLayout = new javax.swing.GroupLayout(User_Inf);
        User_Inf.setLayout(User_InfLayout);
        User_InfLayout.setHorizontalGroup(
            User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_InfLayout.createSequentialGroup()
                .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(User_InfLayout.createSequentialGroup()
                        .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(User_InfLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(imginfo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(User_InfLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(User_InfLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtgeneroinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(User_InfLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnombreinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(User_InfLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtestadoinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(User_InfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfechainfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        User_InfLayout.setVerticalGroup(
            User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(User_InfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imginfo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtnombreinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtgeneroinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(User_InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestadoinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfechainfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(User_Inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -290, 230, 290));

        jScrollPane1.setBackground(new Color
            (255, 255, 255, 50)
        );
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        container.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                containerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(container);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 760, 460));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 740, 440));

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout container2Layout = new javax.swing.GroupLayout(container2);
        container2.setLayout(container2Layout);
        container2Layout.setHorizontalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        container2Layout.setVerticalGroup(
            container2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(container2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 760, 210));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/tape.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, 100, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/tape.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 100, 90));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PERSONAS A LAS QUE SIGO");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        jScrollPane2.setBorder(null);

        followingList.setBackground(new java.awt.Color(240, 240, 240));
        followingList.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        followingList.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        followingList.setEnabled(false);
        followingList.setName(""); // NOI18N
        jScrollPane2.setViewportView(followingList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 290, 300));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("PERSONAS QUE ME SIGUEN");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        jScrollPane3.setBorder(null);

        followerlist.setBackground(new java.awt.Color(240, 240, 240));
        followerlist.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        followerlist.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        followerlist.setEnabled(false);
        followerlist.setName(""); // NOI18N
        jScrollPane3.setViewportView(followerlist);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, -1, 360));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 740, 210));

        texto_opt.setBackground(new java.awt.Color(255, 255, 255));
        texto_opt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        texto_opt.setForeground(new java.awt.Color(255, 255, 255));
        texto_opt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        texto_opt.setText("TWITS");
        texto_opt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.add(texto_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 760, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/dark-wood-1920x1080.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1170, 890));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesplegarBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesplegarBuscarMousePressed

        //jPanel3.removeAll();
        AnimationClass animationClass = new AnimationClass();
        animationClass.jLabelYDown(-50, 10, 10, 5, btnBuscar);
        //animationClass.jTextFieldYDown(-50, 10, 5, 5, txtBuscar);

        animationClass.jLabelYUp(10, -50, 10, 5, btnBuscar);
        //animationClass.jTextFieldYUp(10, -50, 5, 5, txtBuscar);


    }//GEN-LAST:event_btnDesplegarBuscarMousePressed

    private void btnEditProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditProfileMousePressed

        animationClass.jLabelYDown(100, 190, 5, 5, btncerrarSesion);
        animationClass.jLabelYDown(10, 100, 10, 5, btnBuscarPersonas);
        animationClass.jLabelYDown(10, 130, 10, 5, btnEntrarCuenta);
        animationClass.jLabelYDown(10, 160, 10, 5, btnDescActCuenta);

        /*
             animationClass.jLabelYDown(10, 70, 10, 5, btnEditProfile);
             animationClass.jLabelYDown(10, 100, 5, 5, btncerrarSesion);
         */
        animationClass.jLabelYUp(190, 100, 5, 5, btncerrarSesion);
        animationClass.jLabelYUp(100, 10, 10, 5, btnBuscarPersonas);
        animationClass.jLabelYUp(130, 10, 10, 5, btnEntrarCuenta);
        animationClass.jLabelYUp(160, 10, 10, 5, btnDescActCuenta);

    }//GEN-LAST:event_btnEditProfileMousePressed

    private void btnBuscarPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPersonasMousePressed
        // TODO add your handling code here:

        AnimationClass animationClass = new AnimationClass();
        animationClass.jLabelYDown(-50, 10, 10, 5, btnBPersona);

        animationClass.jLabelYUp(10, -50, 10, 5, btnBPersona);

        /*
        container.setPreferredSize(new Dimension(400, 80000));
        container.updateUI();
        container.repaint();
       jScrollPane1.updateUI();
       jScrollPane1.repaint();
         */
    }//GEN-LAST:event_btnBuscarPersonasMousePressed

    private void btnEntrarCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarCuentaMousePressed
        AnimationClass animationClass = new AnimationClass();
        animationClass.jLabelYDown(-50, 10, 10, 5, btnBEntrarCuenta);
  

        animationClass.jLabelYUp(10, -50, 10, 5, btnBEntrarCuenta);
  
    }//GEN-LAST:event_btnEntrarCuentaMousePressed

    private void btnDescActCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescActCuentaMousePressed

        try {
            if (information.Usuarios.get(indice).getEstado() == true) {

                int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de desactivar su cuenta ?");

                if (respuesta == JOptionPane.YES_OPTION) {
                    information.Usuarios.get(indice).setEstado(false);
                    information.SobreEscribirEstado();
                    information.UpdateInformation();

                }
            } else {

                int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de Activar su cuenta ?");

                if (respuesta == JOptionPane.YES_OPTION) {
                    information.Usuarios.get(indice).setEstado(true);
                    information.SobreEscribirEstado();
                    information.UpdateInformation();
                }

            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnDescActCuentaMousePressed

    private void btncerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarSesionMousePressed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btncerrarSesionMousePressed

    private void btnBPersonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBPersonaMousePressed
        animationClass.jLabelYUp(50, -50, 10, 5, btnBPersona);
        animationClass.jTextFieldYUp(10, -50, 5, 5, txtBuscar);

        int DistanciaY = 30;
        container.removeAll();
        container2.removeAll();
        container2.updateUI();
                container2.repaint();
        int Resultados = 0;
        for (int i = 0; i < information.Usuarios.size(); i++) {
            Boolean Siguiendo = false;

            if (information.Usuarios.get(i).getUser().contains(txtBuscar.getText()) && information.Usuarios.get(i).getEstado() == true) {
                Resultados++;

                for (int j = 0; j < information.Usuarios.get(indice).siguiendo.size(); j++) {
                    if (information.Usuarios.get(indice).siguiendo.get(j).User.equals(information.Usuarios.get(i).getUser())
                            && information.Usuarios.get(indice).siguiendo.get(j).SiguiendoActualmente == true) {

                        Siguiendo = true;

                    }
                }

                Panel_BP panel_BP = new Panel_BP(information.Usuarios.get(i).getUser(), information.Usuarios.get(i).getNombre(), information.Usuarios.get(i).getEdad(), String.valueOf(information.Usuarios.get(i).getGenero()), Siguiendo, information.Usuarios.get(i).getImg_Url(), this);
                panel_BP.setVisible(true);
                panel_BP.setBounds(10, DistanciaY, 662, 135);
                
                
                container.add(panel_BP);
                container.updateUI();
                container.repaint();

                
                
                DistanciaY = DistanciaY + 155;
                container.setPreferredSize(new Dimension(400, DistanciaY));

            }
        }

        if (Resultados == 0) {
            Not_Found not_Found = new Not_Found();
            not_Found.setBounds(350, 0, 500, 800);
            not_Found.setVisible(true);

            container.add(not_Found);
            container.updateUI();
            container.repaint();
            container.setPreferredSize(new Dimension(400, DistanciaY));

        }


    }//GEN-LAST:event_btnBPersonaMousePressed

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
   texto_opt.setText("TWITS ");
            texto_opt.updateUI();        
        container2.removeAll();
        container.removeAll();
        CargarPantallaPrincipal();
        

    }//GEN-LAST:event_HomeMousePressed

    private void btnBEntrarCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBEntrarCuentaMousePressed

           texto_opt.setText("BUSCADOR USUARIO");
            texto_opt.updateUI();
        animationClass.jLabelYUp(50, -50, 10, 5, btnBEntrarCuenta);
        

        container.removeAll();
        container2.removeAll();
        String usuariobuscar = txtBuscar.getText();

        for (int i = 0; i < information.Usuarios.size(); i++) {

            if (usuariobuscar.equals(information.Usuarios.get(i).getUser()) && information.Usuarios.get(i).getEstado() == true) {
                boolean siguiendo = false;
                for (int j = 0; j < information.Usuarios.get(indice).siguiendo.size(); j++) {
                    if (information.Usuarios.get(indice).siguiendo.get(j).User.equals(usuariobuscar) && information.Usuarios.get(indice).siguiendo.get(j).SiguiendoActualmente == true) {
                        siguiendo = true;
                    }
                }
                EntrarCuentaPanel entrarCuentaPanel = new EntrarCuentaPanel(i, siguiendo, indice, this);
                entrarCuentaPanel.setVisible(true);
                entrarCuentaPanel.setBounds(20, 0, 760, 210);

                container.setPreferredSize(new Dimension(800, 500));

                
                container2.add(entrarCuentaPanel);
                container2.updateUI();
                container2.repaint();
                return;
            }

        }
        
        container2.updateUI();
        container2.repaint();
        
         Not_Found not_Found = new Not_Found();
            not_Found.setBounds(0, 0, 500, 800);
            not_Found.setVisible(true);

            container.add(not_Found);
            container.updateUI();
            container.repaint();
            container.setPreferredSize(new Dimension(400, 500));
        
          
    }//GEN-LAST:event_btnBEntrarCuentaMousePressed

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        // TODO add your handling code here:
        container.removeAll();
        container.updateUI();
        container.repaint();
        twitsEncontrados.clear();
        OrdentwitsEncontrados.clear();
        String textoBuscar = txtBuscar.getText();

        if (textoBuscar.contains("@")) {

            for (int i = 0; i < information.Usuarios.size(); i++) {
                for (int j = 0; j < information.Usuarios.get(i).twits.size(); j++) {
                    if (information.Usuarios.get(i).twits.get(j).twit.contains(textoBuscar) && information.Usuarios.get(i).getEstado() == true) {
                        twitsEncontrados.add(information.Usuarios.get(i).twits.get(j));
                    }

                }
            }

             OrdenarTwitsEncontrados();
        CargarListaDeTwitsEncontrados();
        }else if(textoBuscar.contains("#")){
        
        for (int i = 0; i < information.Usuarios.size(); i++) {
                for (int j = 0; j < information.Usuarios.get(i).twits.size(); j++) {
                    if (information.Usuarios.get(i).twits.get(j).twit.contains(textoBuscar) && information.Usuarios.get(i).getEstado() == true) {
                        twitsEncontrados.add(information.Usuarios.get(i).twits.get(j));
                    }

                }
            }
        
          OrdenarTwitsEncontrados();
        CargarListaDeTwitsEncontrados();
        }else{
        
            JOptionPane.showMessageDialog(this, "Buscador solamente de # y @");
        }

       
    }//GEN-LAST:event_btnBuscarMousePressed

    private void jlbnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbnombreMousePressed
     
    }//GEN-LAST:event_jlbnombreMousePressed

    private void containerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_containerMousePressed

    private void jlbnombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbnombre1MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jlbnombre1MousePressed

    private void menuButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMousePressed
        // TODO add your handling code here:
        //  OptMenu.setLocation(OptMenu.getX(), OptMenu.getY()+260);
       
        

        if (OptMenu.getY() == -200) {
            menuButton.setIcon(new ImageIcon("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\src\\Recursos_Proyecto\\CmenuR2.png"));
            Timer t = new Timer();
            TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    if (OptMenu.getY() < 60) {
                        //System.out.println("funciona");
                        int yy = OptMenu.getY() + 5;
                        OptMenu.setLocation(OptMenu.getX(), yy);
                    } else {
                        t.cancel();

                    }

                }
            };
            t.schedule(tt, 100, 10);
        } else if (OptMenu.getY() == 60) {
            menuButton.setIcon(new ImageIcon("C:\\Users\\SkyWalker\\Documents\\NetBeansProjects\\Proyecto2_Progra2\\src\\Recursos_Proyecto\\CmenuR.png"));
            Timer t = new Timer();
            TimerTask tt = new TimerTask() {
                @Override
                public void run() {
                    if (OptMenu.getY() > -200) {
                      //  System.out.println("funciona");
                        int yy = OptMenu.getY() - 5;
                        OptMenu.setLocation(OptMenu.getX(), yy);
                    } else {
                        t.cancel();

                    }

                }
            };t.schedule(tt, 100,10);

        }

    }//GEN-LAST:event_menuButtonMousePressed

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered

        Home.setBackground(new Color(141, 148, 179));
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setBackground(new Color(31, 106, 185));
    }//GEN-LAST:event_HomeMouseExited

    private void jlbnombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbnombreMouseEntered
        // TODO add your handling code here:
        
        
         Timer tinfo = new Timer();
            TimerTask ttinfo = new TimerTask() {
                @Override
                public void run() {
                    if (User_Inf.getY() < 60 && !infomenuact ) {
                        System.out.println("funciona");
                        int yy = User_Inf.getY() + 5;
                        User_Inf.setLocation(User_Inf.getX(), yy);
                    } else {
                        
                        infomenuact = true;
                        tinfo.cancel();

                    }

                }
            };tinfo.schedule(ttinfo, 0, 10);
    }//GEN-LAST:event_jlbnombreMouseEntered

    private void jlbnombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbnombreMouseExited
        // TODO add your handling code here:
         Timer tinfo = new Timer();
            TimerTask ttinfo = new TimerTask() {
                @Override
                public void run() {
                    if (User_Inf.getY() > -290 && infomenuact) {
                        System.out.println("funciona");
                        int yy = User_Inf.getY() - 5;
                        User_Inf.setLocation(User_Inf.getX(), yy);
                    } else {
                        infomenuact = false;
                        tinfo.cancel();

                    }

                }
            };tinfo.schedule(ttinfo, 0, 10);
    }//GEN-LAST:event_jlbnombreMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JPanel OptMenu;
    private javax.swing.JPanel PanelUserMenu;
    private javax.swing.JPanel User_Inf;
    private javax.swing.JLabel btnBEntrarCuenta;
    private javax.swing.JLabel btnBPersona;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnBuscarPersonas;
    private javax.swing.JLabel btnDescActCuenta;
    private javax.swing.JLabel btnDesplegarBuscar;
    private javax.swing.JLabel btnEditProfile;
    private javax.swing.JLabel btnEntrarCuenta;
    private javax.swing.JLabel btncerrarSesion;
    public javax.swing.JPanel container;
    private javax.swing.JPanel container2;
    private javax.swing.JList<String> followerlist;
    private javax.swing.JList<String> followingList;
    private javax.swing.JLabel imginfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JLabel jlbnombre1;
    private javax.swing.JLabel menuButton;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel texto_opt;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtestadoinfo;
    private javax.swing.JLabel txtfechainfo;
    private javax.swing.JLabel txtgeneroinfo;
    private javax.swing.JLabel txtnombreinfo;
    // End of variables declaration//GEN-END:variables

    //MENU PRINCIPAL - CARGAR TWITS
    //------------------------------------------------------------------------------------------------------------------------------
    private void CargarDatos() throws FileNotFoundException, IOException {

        Nombre = information.Usuarios.get(indice).getNombre();//nombre de usuario
        Usuario = information.Usuarios.get(indice).getUser();//Usuario
        imgruta = information.Usuarios.get(indice).getImg_Url();//Ruta de Imagen
        ImageIcon image = new ImageIcon(imgruta);
        ImageIcon image2 = new ImageIcon(image.getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_DEFAULT));

        jlbnombre.setText(Nombre);
        picture.setIcon(image2);

    }

    public void CargarPantallaPrincipal() {
        Write_Twit write_Twit = new Write_Twit(Usuario, this);
        write_Twit.setBounds(0, 0, 1060, 254);
        write_Twit.setVisible(true);

        container2.add(write_Twit);
        container2.updateUI();
        container2.repaint();
        cargarTwits();
    }

    public void cargarTwits() {
        OrdentwEscritos.clear();
        twits_esc.clear();
        int altura = 264;//760, 460
        int anchura = 760;
        int ditanciaX = 0, distanciaY = 0;

        AñadirTwits();
        OrdenarTwits();

        for (int i = 0; i < OrdentwEscritos.size(); i++) {
            String Fecha = OrdentwEscritos.get(i).date.getDate() + "/" + OrdentwEscritos.get(i).date.getMonth() + "/" + (OrdentwEscritos.get(i).date.getYear() + 1900);
            Twit_Panel twit_Panel = new Twit_Panel(OrdentwEscritos.get(i).nombre, OrdentwEscritos.get(i).twit, OrdentwEscritos.get(i).imgurl, Fecha);
            twit_Panel.setVisible(true);
            twit_Panel.setBounds(ditanciaX, distanciaY, anchura, altura);
            container.add(twit_Panel);
            container.updateUI();
            container.repaint();
            distanciaY = distanciaY + 260;

        }

        container.setPreferredSize(new Dimension(400, distanciaY));
        container.updateUI();
        container.repaint();
        jScrollPane1.updateUI();
        jScrollPane1.repaint();

    }

    private void OrdenarTwits() {
        if (twits_esc.isEmpty() == false) {

            long milisecond = twits_esc.get(0).date.getTime();
            long orden[] = new long[twits_esc.size()];
            long ordenCorrecto[] = new long[twits_esc.size()];

            //orden inverso
            for (int i = 0; i < orden.length; i++) {
                orden[i] = twits_esc.get(i).date.getTime();
            }

            Arrays.sort(orden);

            //Arreglando orden
            int contador = 0;
            for (int i = orden.length - 1; i != -1; i--) {
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

            for (int i = 0; i < twits_esc.size(); i++) {
                for (int j = 0; j < twits_esc.size(); j++) {
                    if (ordenCorrecto[i] == twits_esc.get(j).date.getTime()) {
                        OrdentwEscritos.add(twits_esc.get(j));
                    }
                }
            }

        }
    }

    private void AñadirTwits() {

        for (int i = 0; i < information.Usuarios.get(indice).twits.size(); i++) {
            twits_esc.add(information.Usuarios.get(indice).twits.get(i));
        }

        //añadiendo twits de los usuarios que sigo
        for (int i = 0; i < information.Usuarios.get(indice).siguiendo.size(); i++) {
            if (information.Usuarios.get(indice).siguiendo.get(i).SiguiendoActualmente == true) {

                for (int j = 0; j < information.Usuarios.size(); j++) {
                    if (information.Usuarios.get(indice).siguiendo.get(i).User.equals(information.Usuarios.get(j).getUser()) && information.Usuarios.get(j).getEstado() == true) {

                        for (int k = 0; k < information.Usuarios.get(j).twits.size(); k++) {
                            twits_esc.add(information.Usuarios.get(j).twits.get(k));
                        }

                    }
                }

            }
        }

    }

    //---------------------------------------------------------------------------------------------------------------------------------
    //Buscar Twits con nombre de alguien 
    private void CargarListaDeTwitsEncontrados() {

        int altura = 264;
        int anchura = 760;
        int ditanciaX = 0, distanciaY = 0;

        for (int i = 0; i < OrdentwitsEncontrados.size(); i++) {
            String Fecha = OrdentwitsEncontrados.get(i).date.getDate() + "/" + OrdentwitsEncontrados.get(i).date.getMonth() + "/" + (OrdentwitsEncontrados.get(i).date.getYear() + 1900);
            Twit_Panel twit_Panel = new Twit_Panel(OrdentwitsEncontrados.get(i).nombre, OrdentwitsEncontrados.get(i).twit, OrdentwitsEncontrados.get(i).imgurl, Fecha);
            twit_Panel.setVisible(true);
            twit_Panel.setBounds(ditanciaX, distanciaY, anchura, altura);
            container.add(twit_Panel);
            container.updateUI();
            container.repaint();
            distanciaY = distanciaY + 260;

        }
        container2.removeAll();
        container2.updateUI();
        
        if (OrdentwitsEncontrados.size() == 0) {
              Not_Found not_Found = new Not_Found();
            not_Found.setBounds(0, 0, 500, 800);
            not_Found.setVisible(true);

            container.add(not_Found);
        }
        container.setPreferredSize(new Dimension(400, distanciaY));
        container.updateUI();
        container.repaint();
        jScrollPane1.updateUI();
        jScrollPane1.repaint();

    }

    private void OrdenarTwitsEncontrados() {
        if (twitsEncontrados.isEmpty() == false) {

            long milisecond = twitsEncontrados.get(0).date.getTime();
            long orden[] = new long[twitsEncontrados.size()];
            long ordenCorrecto[] = new long[twitsEncontrados.size()];

            //orden inverso
            for (int i = 0; i < orden.length; i++) {
                orden[i] = twitsEncontrados.get(i).date.getTime();
            }

            Arrays.sort(orden);

            //Arreglando orden
            int contador = 0;
            for (int i = orden.length - 1; i != -1; i--) {
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

            for (int i = 0; i < twitsEncontrados.size(); i++) {
                for (int j = 0; j < twitsEncontrados.size(); j++) {
                    if (ordenCorrecto[i] == twitsEncontrados.get(j).date.getTime()) {
                        OrdentwitsEncontrados.add(twitsEncontrados.get(j));
                    }
                }
            }

        }
    }

    //Buscar Twits con # determinados (extra)
    
    
    
    
    //Buscar personas a las que sigo
    
    public void following(){
   String[] following = new String[information.Usuarios.get(indice).siguiendo.size()];
        for (int i = 0; i < information.Usuarios.get(indice).siguiendo.size(); i++) {
            if (information.Usuarios.get(indice).siguiendo.get(i).SiguiendoActualmente == true) {
                following[i] = information.Usuarios.get(indice).siguiendo.get(i).User;
            }
            
        }
    followingList.setListData(following);
    
    
    
    
    }

    private void followers() {
        String[] followers = new String[information.Usuarios.get(indice).Seguidores.size()];
        for (int i = 0; i < information.Usuarios.get(indice).Seguidores.size(); i++) {
            if (information.Usuarios.get(indice).Seguidores.get(i).isSiguiendoActualmente() == true) {
                followers[i] = information.Usuarios.get(indice).Seguidores.get(i).getUser();
            }
            
        }
    followerlist.setListData(followers);
    
    
    
    }
}
