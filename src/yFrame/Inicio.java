/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yFrame;

/**
 *
 * @author DGB
 */
import Class.Slide;
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    Slide slide;
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        slide = new Slide();
    }
    
    public void apagarBarras(){
        lblBarraHome.setVisible(false);
        lblBarraKeyb.setVisible(false);
        lblBarraMonitor.setVisible(false);
        lblBarraMouse.setVisible(false);
        lblBarraCart.setVisible(false);
        lblBarraStats.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlControlPanel = new javax.swing.JPanel();
        lblControlPanel = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblHomeIcon = new javax.swing.JLabel();
        lblKeyboards = new javax.swing.JLabel();
        lblBarraKeyb = new javax.swing.JLabel();
        lblMonitors = new javax.swing.JLabel();
        lblMouse = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblHomeIcon1 = new javax.swing.JLabel();
        lblHomeIcon2 = new javax.swing.JLabel();
        lblHomeIcon3 = new javax.swing.JLabel();
        lblHomeIcon4 = new javax.swing.JLabel();
        lblHomeIcon5 = new javax.swing.JLabel();
        lblBarraMonitor = new javax.swing.JLabel();
        lblBarraMouse = new javax.swing.JLabel();
        lblBarraCart = new javax.swing.JLabel();
        lblBarraStats = new javax.swing.JLabel();
        lblBarraHome = new javax.swing.JLabel();
        lblSelectedHome = new javax.swing.JLabel();
        lblSelectedKeyb = new javax.swing.JLabel();
        lblSelectedMonitors = new javax.swing.JLabel();
        lblSelectedMouse = new javax.swing.JLabel();
        lblSelectedCart = new javax.swing.JLabel();
        lblSelectedStats = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlPerfil = new javax.swing.JPanel();
        lblPerfil = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        pnlBackground = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil-botton_off.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil-botton_on.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil-botton_on.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil-botton_on.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/config-botton.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/config-botton_on.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/config-botton_on.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/config-botton_on.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 50, 50));

        pnlControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblControlPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Menu_32px.png"))); // NOI18N
        lblControlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblControlPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblControlPanelMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lblHome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHome.setForeground(new java.awt.Color(111, 174, 2));
        lblHome.setText("Home");
        pnlControlPanel.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lblHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Keyboard_32px.png"))); // NOI18N
        pnlControlPanel.add(lblHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 30));

        lblKeyboards.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblKeyboards.setForeground(new java.awt.Color(111, 174, 2));
        lblKeyboards.setText("Keyboards");
        pnlControlPanel.add(lblKeyboards, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblBarraKeyb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line2.png"))); // NOI18N
        pnlControlPanel.add(lblBarraKeyb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 150, 20));

        lblMonitors.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMonitors.setForeground(new java.awt.Color(111, 174, 2));
        lblMonitors.setText("Monitors");
        pnlControlPanel.add(lblMonitors, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblMouse.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMouse.setForeground(new java.awt.Color(111, 174, 2));
        lblMouse.setText("Mouse");
        pnlControlPanel.add(lblMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(111, 174, 2));
        jLabel6.setText("Cart");
        pnlControlPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(111, 174, 2));
        jLabel9.setText("Stadistics");
        pnlControlPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Sign_Out_32px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Sign_Out_32px_1.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Sign_Out_32px_1.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Sign_Out_32px_1.png"))); // NOI18N
        pnlControlPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 40, 30));

        lblHomeIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Monitor_32px.png"))); // NOI18N
        pnlControlPanel.add(lblHomeIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 30, 30));

        lblHomeIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Mouse_32px.png"))); // NOI18N
        pnlControlPanel.add(lblHomeIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 30, 30));

        lblHomeIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Shopping_Cart_32px.png"))); // NOI18N
        pnlControlPanel.add(lblHomeIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, 30));

        lblHomeIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Bar_Chart_32px.png"))); // NOI18N
        pnlControlPanel.add(lblHomeIcon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 30, 30));

        lblHomeIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Home_32px.png"))); // NOI18N
        pnlControlPanel.add(lblHomeIcon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 30, 30));

        lblBarraMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line2.png"))); // NOI18N
        pnlControlPanel.add(lblBarraMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 200, 150, 20));

        lblBarraMouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line2.png"))); // NOI18N
        pnlControlPanel.add(lblBarraMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 260, 150, 20));

        lblBarraCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line2.png"))); // NOI18N
        pnlControlPanel.add(lblBarraCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 310, 150, 20));

        lblBarraStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line2.png"))); // NOI18N
        pnlControlPanel.add(lblBarraStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 370, 150, 20));

        lblBarraHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line2.png"))); // NOI18N
        pnlControlPanel.add(lblBarraHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 90, 150, 20));

        lblSelectedHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSelectedHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedHomeMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblSelectedHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 50));

        lblSelectedKeyb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSelectedKeyb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedKeybMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblSelectedKeyb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 50));

        lblSelectedMonitors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSelectedMonitors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedMonitorsMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblSelectedMonitors, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 50));

        lblSelectedMouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSelectedMouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedMouseMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblSelectedMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 50));

        lblSelectedCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSelectedCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedCartMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblSelectedCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 50));

        lblSelectedStats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSelectedStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectedStatsMouseClicked(evt);
            }
        });
        pnlControlPanel.add(lblSelectedStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PANEL.png"))); // NOI18N
        pnlControlPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 497));

        getContentPane().add(pnlControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 2, 230, 497));

        pnlHome.setOpaque(false);
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");
        pnlHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator1.setForeground(new java.awt.Color(111, 174, 2));
        pnlHome.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 810, 10));

        jSeparator2.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator2.setForeground(new java.awt.Color(111, 174, 2));
        pnlHome.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 810, 10));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, 130));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 130, 130));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 130, 130));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 130, 130));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 130, 130));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 130));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 130, 130));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 130, 130));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 130, 130));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlHome.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 130, 130));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DESTACADO");
        pnlHome.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DESTACADO");
        pnlHome.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        getContentPane().add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pnlPerfil.setOpaque(false);
        pnlPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wc.png"))); // NOI18N
        pnlPerfil.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 160));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/portada.png"))); // NOI18N
        pnlPerfil.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 950, 120));

        jSeparator3.setBackground(new java.awt.Color(33, 33, 33));
        jSeparator3.setForeground(new java.awt.Color(33, 33, 33));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlPerfil.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 20, 150));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email:");
        pnlPerfil.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("País:");
        pnlPerfil.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre:");
        pnlPerfil.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre:");
        pnlPerfil.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Numero:");
        pnlPerfil.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(111, 174, 2));
        pnlPerfil.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 860, 20));

        getContentPane().add(pnlPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_32px.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        pnlBackground.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 40, 40));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        pnlBackground.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        pnlBackground.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        setState(Inicio.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void lblControlPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblControlPanelMouseClicked
        slide.jPanelXDerecha(-180, 0, 10, 5, pnlControlPanel);
        slide.jPanelXIzquierda(0, -180, 10, 5, pnlControlPanel);
    }//GEN-LAST:event_lblControlPanelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        apagarBarras();
        lblBarraHome.setVisible(true);
        
        pnlHome.setVisible(true);
        pnlPerfil.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void lblSelectedHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedHomeMouseClicked
        apagarBarras();
        lblBarraHome.setVisible(true);
        pnlHome.setVisible(true);
        pnlPerfil.setVisible(false);
    }//GEN-LAST:event_lblSelectedHomeMouseClicked

    private void lblSelectedKeybMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedKeybMouseClicked
        apagarBarras();
        lblBarraKeyb.setVisible(true);
    }//GEN-LAST:event_lblSelectedKeybMouseClicked

    private void lblSelectedMonitorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedMonitorsMouseClicked
        apagarBarras();
        lblBarraMonitor.setVisible(true);
    }//GEN-LAST:event_lblSelectedMonitorsMouseClicked

    private void lblSelectedMouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedMouseMouseClicked
        apagarBarras();
        lblBarraMouse.setVisible(true);
    }//GEN-LAST:event_lblSelectedMouseMouseClicked

    private void lblSelectedCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedCartMouseClicked
        apagarBarras();
        lblBarraCart.setVisible(true);
    }//GEN-LAST:event_lblSelectedCartMouseClicked

    private void lblSelectedStatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectedStatsMouseClicked
        apagarBarras();
        lblBarraStats.setVisible(true);
    }//GEN-LAST:event_lblSelectedStatsMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        pnlHome.setVisible(false);
        pnlPerfil.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        pnlHome.setVisible(true);
        pnlPerfil.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

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
                if ("Windows".equals(info.getName())) {//Nimbus
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBarraCart;
    private javax.swing.JLabel lblBarraHome;
    private javax.swing.JLabel lblBarraKeyb;
    private javax.swing.JLabel lblBarraMonitor;
    private javax.swing.JLabel lblBarraMouse;
    private javax.swing.JLabel lblBarraStats;
    private javax.swing.JLabel lblControlPanel;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomeIcon;
    private javax.swing.JLabel lblHomeIcon1;
    private javax.swing.JLabel lblHomeIcon2;
    private javax.swing.JLabel lblHomeIcon3;
    private javax.swing.JLabel lblHomeIcon4;
    private javax.swing.JLabel lblHomeIcon5;
    private javax.swing.JLabel lblKeyboards;
    private javax.swing.JLabel lblMonitors;
    private javax.swing.JLabel lblMouse;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSelectedCart;
    private javax.swing.JLabel lblSelectedHome;
    private javax.swing.JLabel lblSelectedKeyb;
    private javax.swing.JLabel lblSelectedMonitors;
    private javax.swing.JLabel lblSelectedMouse;
    private javax.swing.JLabel lblSelectedStats;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlControlPanel;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlPerfil;
    // End of variables declaration//GEN-END:variables
}
