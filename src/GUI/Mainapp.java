package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import Data.Database;
import Data.Penjualan;
import Data.Restock;
import Data.Stock;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Mainapp extends javax.swing.JFrame {
    
    private int totalAyamPenj = 0;
    private int totalHargaRestock = 0;
    private int totalHargaPenj = 0;
    private int w12 = 60000,
            w13 = 65000,
            w14 = 70000,
            w15 = 75000,
            fildada = 80000,
            filpaha = 80000;
    
    /**
     * Creates new form Mainapp
     */
    public Mainapp() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
    }
    
    private int getTotalAyam() {
        int item1 = Integer.parseInt(spnPenBerat1_2.getValue().toString()),
                item2 = Integer.parseInt(spnPenBerat1_3.getValue().toString()),
                item3 = Integer.parseInt(spnPenBerat1_4.getValue().toString()),
                item4 = Integer.parseInt(spnPenBerat1_5.getValue().toString()),
                item5 = Integer.parseInt(spnPenFilletDada.getValue().toString()),
                item6 = Integer.parseInt(spnPenFilletPaha.getValue().toString());
        int total = item1 + item2 + item3 + item4 + item5 + item6;
        return total;
    }
    
    private int getTotalHarga(String jenis) {
        int total = 0;
        int item1 = 0, item2 = 0, item3 = 0, item4 = 0, item5 = 0, item6 = 0;
        
        if (jenis.equals("pen")) {
            item1 = Integer.parseInt(spnPenBerat1_2.getValue().toString());
            item2 = Integer.parseInt(spnPenBerat1_3.getValue().toString());
            item3 = Integer.parseInt(spnPenBerat1_4.getValue().toString());
            item4 = Integer.parseInt(spnPenBerat1_5.getValue().toString());
            item5 = Integer.parseInt(spnPenFilletDada.getValue().toString());
            item6 = Integer.parseInt(spnPenFilletPaha.getValue().toString());
        } else {
            w12 = 55000;
            w13 = 60000;
            w14 = 65000;
            w15 = 70000;
            fildada = 75000;
            filpaha = 75000;
            item1 = Integer.parseInt(spnResBerat1_2.getValue().toString());
            item2 = Integer.parseInt(spnResBerat1_3.getValue().toString());
            item3 = Integer.parseInt(spnResBerat1_4.getValue().toString());
            item4 = Integer.parseInt(spnResBerat1_5.getValue().toString());
            item5 = Integer.parseInt(spnResFilletDada.getValue().toString());
            item6 = Integer.parseInt(spnResFilletPaha.getValue().toString());
        }
        total = w12 * item1 + w13 * item2 + w14 * item3 + w15 * item4 + fildada * item5 + filpaha * item6;
        return total;
    }
    
    private void clearForm(String jenis) {
        if (jenis.equals("pen")) {
            chkPenBerat1_2.setSelected(false);
            chkPenBerat1_3.setSelected(false);
            chkPenBerat1_4.setSelected(false);
            chkPenBerat1_5.setSelected(false);
            chkPenFilletDada.setSelected(false);
            chkPenFilletPaha.setSelected(false);
            
            txtInputPenNamaPenjual.setText("");
            calTglPenjualan.setDate(null);
            
            spnPenBerat1_2.setEnabled(false);
            spnPenBerat1_2.setValue(0);
            spnPenBerat1_3.setEnabled(false);
            spnPenBerat1_3.setValue(0);
            spnPenBerat1_4.setEnabled(false);
            spnPenBerat1_4.setValue(0);
            spnPenBerat1_5.setEnabled(false);
            spnPenBerat1_5.setValue(0);
            spnPenFilletDada.setEnabled(false);
            spnPenFilletDada.setValue(0);
            spnPenFilletPaha.setEnabled(false);
            spnPenFilletPaha.setValue(0);
        } else {
            chkResBerat1_2.setSelected(false);
            chkResBerat1_3.setSelected(false);
            chkResBerat1_4.setSelected(false);
            chkResBerat1_5.setSelected(false);
            chkResFilletDada.setSelected(false);
            chkResFilletPaha.setSelected(false);
            
            calTglRestock.setDate(null);
            
            spnResBerat1_2.setEnabled(false);
            spnResBerat1_2.setValue(0);
            spnResBerat1_3.setEnabled(false);
            spnResBerat1_3.setValue(0);
            spnResBerat1_4.setEnabled(false);
            spnResBerat1_4.setValue(0);
            spnResBerat1_5.setEnabled(false);
            spnResBerat1_5.setValue(0);
            spnResFilletDada.setEnabled(false);
            spnResFilletDada.setValue(0);
            spnResFilletPaha.setEnabled(false);
            spnResFilletPaha.setValue(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bodypanel = new javax.swing.JPanel();
        Menupanel = new javax.swing.JPanel();
        lblMainMenu = new javax.swing.JLabel();
        lblInputData = new javax.swing.JLabel();
        lblTampilData = new javax.swing.JLabel();
        lblStatistik = new javax.swing.JLabel();
        lblSetelan = new javax.swing.JLabel();
        lblTentang = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        Mainpanel = new javax.swing.JPanel();
        pnlMainMenu = new javax.swing.JPanel();
        iconAyam = new javax.swing.JLabel();
        lblMainMenuIntro = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pnlInputData = new javax.swing.JPanel();
        tabInputData = new javax.swing.JTabbedPane();
        pnlInputPenjualan = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        chkPenBerat1_4 = new javax.swing.JCheckBox();
        chkPenBerat1_2 = new javax.swing.JCheckBox();
        spnPenBerat1_4 = new javax.swing.JSpinner();
        spnPenBerat1_3 = new javax.swing.JSpinner();
        spnPenFilletPaha = new javax.swing.JSpinner();
        chkPenBerat1_3 = new javax.swing.JCheckBox();
        spnPenBerat1_5 = new javax.swing.JSpinner();
        chkPenFilletDada = new javax.swing.JCheckBox();
        chkPenFilletPaha = new javax.swing.JCheckBox();
        spnPenBerat1_2 = new javax.swing.JSpinner();
        chkPenBerat1_5 = new javax.swing.JCheckBox();
        spnPenFilletDada = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtInputPenNamaPenjual = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        calTglPenjualan = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblItungPenTotalAyam = new javax.swing.JLabel();
        lblItungPenTotalHarga = new javax.swing.JLabel();
        lblInputPenjualan = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblClearPenj = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        pnlInputRestock = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        calTglRestock = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblItungResTotalHarga = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        chkResBerat1_4 = new javax.swing.JCheckBox();
        chkResBerat1_2 = new javax.swing.JCheckBox();
        spnResBerat1_4 = new javax.swing.JSpinner();
        spnResBerat1_3 = new javax.swing.JSpinner();
        spnResFilletPaha = new javax.swing.JSpinner();
        chkResBerat1_3 = new javax.swing.JCheckBox();
        spnResBerat1_5 = new javax.swing.JSpinner();
        chkResFilletDada = new javax.swing.JCheckBox();
        chkResFilletPaha = new javax.swing.JCheckBox();
        spnResBerat1_2 = new javax.swing.JSpinner();
        chkResBerat1_5 = new javax.swing.JCheckBox();
        spnResFilletDada = new javax.swing.JSpinner();
        lblInputRestock = new javax.swing.JLabel();
        lblClearRest = new javax.swing.JLabel();
        pnlTampilData = new javax.swing.JPanel();
        tabTampilData = new javax.swing.JTabbedPane();
        pnlTampilPenjualan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblReportPenj = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenjualan = new javax.swing.JTable();
        pnlTampilRestock = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestock = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblReportRest = new javax.swing.JLabel();
        pnlStatistik = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlSetelan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnresetdatabase = new javax.swing.JButton();
        btnresetpassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi");

        Bodypanel.setBackground(new java.awt.Color(0, 204, 51));
        Bodypanel.setForeground(new java.awt.Color(0, 102, 51));

        Menupanel.setBackground(new java.awt.Color(153, 255, 153));
        Menupanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Menupanel.setForeground(new java.awt.Color(0, 102, 0));

        lblMainMenu.setBackground(Menupanel.getBackground());
        lblMainMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMainMenu.setForeground(Menupanel.getForeground());
        lblMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menuround.png"))); // NOI18N
        lblMainMenu.setText("Main menu");
        lblMainMenu.setDisplayedMnemonicIndex(3);
        lblMainMenu.setOpaque(true);
        lblMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseExited(evt);
            }
        });

        lblInputData.setBackground(Menupanel.getBackground());
        lblInputData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInputData.setForeground(new java.awt.Color(0, 102, 0));
        lblInputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-database.png"))); // NOI18N
        lblInputData.setText("Input data");
        lblInputData.setOpaque(true);
        lblInputData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInputDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInputDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInputDataMouseExited(evt);
            }
        });

        lblTampilData.setBackground(Menupanel.getBackground());
        lblTampilData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTampilData.setForeground(new java.awt.Color(0, 102, 0));
        lblTampilData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/big-data.png"))); // NOI18N
        lblTampilData.setText("Tampil data");
        lblTampilData.setOpaque(true);
        lblTampilData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTampilDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTampilDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTampilDataMouseExited(evt);
            }
        });

        lblStatistik.setBackground(Menupanel.getBackground());
        lblStatistik.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblStatistik.setForeground(new java.awt.Color(0, 102, 0));
        lblStatistik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistics.png"))); // NOI18N
        lblStatistik.setText("Statistik");
        lblStatistik.setOpaque(true);
        lblStatistik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStatistikMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStatistikMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStatistikMouseExited(evt);
            }
        });

        lblSetelan.setBackground(Menupanel.getBackground());
        lblSetelan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSetelan.setForeground(new java.awt.Color(0, 102, 0));
        lblSetelan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings.png"))); // NOI18N
        lblSetelan.setText("Setelan");
        lblSetelan.setOpaque(true);
        lblSetelan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetelanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSetelanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSetelanMouseExited(evt);
            }
        });

        lblTentang.setBackground(Menupanel.getBackground());
        lblTentang.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTentang.setForeground(new java.awt.Color(0, 102, 0));
        lblTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/about.png"))); // NOI18N
        lblTentang.setText("Tentang");
        lblTentang.setOpaque(true);
        lblTentang.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTentangAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblTentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTentangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTentangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTentangMouseExited(evt);
            }
        });

        lblLogOut.setBackground(Menupanel.getBackground());
        lblLogOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(0, 102, 0));
        lblLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        lblLogOut.setText("LogOut");
        lblLogOut.setOpaque(true);
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogOutMouseExited(evt);
            }
        });

        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(0, 102, 0));
        lblAdmin.setText("Admin");

        iconAdmin.setForeground(new java.awt.Color(0, 102, 0));
        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin.png"))); // NOI18N

        javax.swing.GroupLayout MenupanelLayout = new javax.swing.GroupLayout(Menupanel);
        Menupanel.setLayout(MenupanelLayout);
        MenupanelLayout.setHorizontalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTampilData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatistik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSetelan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTentang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenupanelLayout.setVerticalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTampilData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatistik, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSetelan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTentang, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        Mainpanel.setBackground(new java.awt.Color(205, 209, 228));
        Mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Mainpanel.setLayout(new java.awt.CardLayout());

        pnlMainMenu.setBackground(new java.awt.Color(153, 255, 153));
        pnlMainMenu.setLayout(null);

        iconAyam.setForeground(new java.awt.Color(0, 102, 0));
        iconAyam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chicken.png"))); // NOI18N
        pnlMainMenu.add(iconAyam);
        iconAyam.setBounds(290, 240, 64, 65);

        lblMainMenuIntro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMainMenuIntro.setForeground(new java.awt.Color(0, 51, 0));
        lblMainMenuIntro.setText("<html>\n<style>\ndiv {\ntext-align: center;\nline-height: 1;\n}\n</style>\n<div>Sistem Manajemen</div>\n<div>Ayam Organik Frozen<div>\n<br>\n<h3>By Kel 7</h3>\n</html>");
        lblMainMenuIntro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMainMenuIntro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlMainMenu.add(lblMainMenuIntro);
        lblMainMenuIntro.setBounds(200, 320, 255, 124);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/com.png"))); // NOI18N
        pnlMainMenu.add(jLabel34);
        jLabel34.setBounds(220, 50, 214, 270);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bgmenu.png"))); // NOI18N
        jLabel28.setText("jLabel28");
        pnlMainMenu.add(jLabel28);
        jLabel28.setBounds(-70, -10, 730, 620);

        Mainpanel.add(pnlMainMenu, "MainMenu");

        tabInputData.setBackground(Bodypanel.getBackground());
        tabInputData.setForeground(new java.awt.Color(0, 102, 51));
        tabInputData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabInputData.setName(""); // NOI18N
        tabInputData.setOpaque(true);

        pnlInputPenjualan.setBackground(Menupanel.getBackground());
        pnlInputPenjualan.setForeground(Bodypanel.getForeground());
        pnlInputPenjualan.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 0));
        jLabel20.setText("Input Data Penjualan");
        pnlInputPenjualan.add(jLabel20);
        jLabel20.setBounds(16, 15, 256, 29);

        jPanel1.setOpaque(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Pilih Ayam");

        chkPenBerat1_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkPenBerat1_4.setText("1.4");
        chkPenBerat1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPenBerat1_4ActionPerformed(evt);
            }
        });

        chkPenBerat1_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkPenBerat1_2.setText("1.2");
        chkPenBerat1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPenBerat1_2ActionPerformed(evt);
            }
        });

        spnPenBerat1_4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPenBerat1_4.setEnabled(false);
        spnPenBerat1_4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPenBerat1_4StateChanged(evt);
            }
        });

        spnPenBerat1_3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPenBerat1_3.setEnabled(false);
        spnPenBerat1_3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPenBerat1_3StateChanged(evt);
            }
        });

        spnPenFilletPaha.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPenFilletPaha.setEnabled(false);
        spnPenFilletPaha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPenFilletPahaStateChanged(evt);
            }
        });

        chkPenBerat1_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkPenBerat1_3.setText("1.3");
        chkPenBerat1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPenBerat1_3ActionPerformed(evt);
            }
        });

        spnPenBerat1_5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPenBerat1_5.setEnabled(false);
        spnPenBerat1_5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPenBerat1_5StateChanged(evt);
            }
        });

        chkPenFilletDada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkPenFilletDada.setText("Fillet dada");
        chkPenFilletDada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPenFilletDadaActionPerformed(evt);
            }
        });

        chkPenFilletPaha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkPenFilletPaha.setText("Fillet paha");
        chkPenFilletPaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPenFilletPahaActionPerformed(evt);
            }
        });

        spnPenBerat1_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPenBerat1_2.setEnabled(false);
        spnPenBerat1_2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPenBerat1_2StateChanged(evt);
            }
        });
        spnPenBerat1_2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnPenBerat1_2PropertyChange(evt);
            }
        });

        chkPenBerat1_5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkPenBerat1_5.setText("1.5");
        chkPenBerat1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPenBerat1_5ActionPerformed(evt);
            }
        });

        spnPenFilletDada.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPenFilletDada.setEnabled(false);
        spnPenFilletDada.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPenFilletDadaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkPenBerat1_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnPenBerat1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPenBerat1_3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkPenBerat1_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnPenBerat1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnPenBerat1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkPenFilletPaha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnPenFilletPaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chkPenBerat1_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkPenFilletDada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spnPenFilletDada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(spnPenBerat1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkPenFilletPaha)
                            .addComponent(spnPenFilletPaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkPenFilletDada)
                            .addComponent(spnPenFilletDada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkPenBerat1_2)
                            .addComponent(spnPenBerat1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkPenBerat1_3)
                            .addComponent(spnPenBerat1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkPenBerat1_4)
                            .addComponent(spnPenBerat1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPenBerat1_5)
                            .addComponent(spnPenBerat1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        pnlInputPenjualan.add(jPanel1);
        jPanel1.setBounds(259, 79, 342, 177);

        jPanel2.setOpaque(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Nama Penjual");

        txtInputPenNamaPenjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputPenNamaPenjualActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Tanggal Penjualan");

        calTglPenjualan.setDateFormatString("yyyy-MM-dd");
        calTglPenjualan.setName("calTglPenjualan"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calTglPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtInputPenNamaPenjual, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(txtInputPenNamaPenjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(calTglPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlInputPenjualan.add(jPanel2);
        jPanel2.setBounds(16, 62, 225, 194);

        jPanel4.setOpaque(false);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setText("Rp.");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setText("Total Harga:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Total Ayam:");

        lblItungPenTotalAyam.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblItungPenTotalAyam.setText("0");

        lblItungPenTotalHarga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblItungPenTotalHarga.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItungPenTotalAyam)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItungPenTotalHarga))
                    .addComponent(jLabel26))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItungPenTotalAyam)
                    .addComponent(jLabel27)
                    .addComponent(lblItungPenTotalHarga))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInputPenjualan.add(jPanel4);
        jPanel4.setBounds(16, 269, 332, 105);

        lblInputPenjualan.setBackground(new java.awt.Color(102, 102, 255));
        lblInputPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInputPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInputPenjualan.setText("Input");
        lblInputPenjualan.setOpaque(true);
        lblInputPenjualan.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lblInputPenjualanComponentAdded(evt);
            }
        });
        lblInputPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInputPenjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInputPenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInputPenjualanMouseExited(evt);
            }
        });
        pnlInputPenjualan.add(lblInputPenjualan);
        lblInputPenjualan.setBounds(16, 390, 86, 34);

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("List Harga Ayam");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(17, 18, 172, 32);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("1.5: 75k");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(17, 182, 81, 32);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setText("Fillet Paha: 80k");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(17, 264, 159, 32);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Fillet Dada: 80k");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(17, 223, 163, 32);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("1.4: 70k");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(17, 141, 81, 32);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("1.2: 60k");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(17, 59, 81, 32);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("1.3: 65k");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(17, 100, 81, 32);

        pnlInputPenjualan.add(jPanel7);
        jPanel7.setBounds(470, 260, 206, 314);

        lblClearPenj.setBackground(new java.awt.Color(102, 102, 255));
        lblClearPenj.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClearPenj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClearPenj.setText("Clear");
        lblClearPenj.setOpaque(true);
        lblClearPenj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClearPenjMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClearPenjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClearPenjMouseExited(evt);
            }
        });
        pnlInputPenjualan.add(lblClearPenj);
        lblClearPenj.setBounds(117, 390, 86, 34);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bgmenu.png"))); // NOI18N
        jLabel33.setOpaque(true);
        pnlInputPenjualan.add(jLabel33);
        jLabel33.setBounds(-70, 0, 750, 580);

        tabInputData.addTab("Penjualan", pnlInputPenjualan);

        pnlInputRestock.setBackground(Menupanel.getBackground());
        pnlInputRestock.setForeground(Bodypanel.getForeground());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Input Data Restock");

        jPanel3.setOpaque(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Tanggal Restock");

        calTglRestock.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calTglRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(calTglRestock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Total Harga:");

        lblItungResTotalHarga.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblItungResTotalHarga.setText("0");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Rp.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItungResTotalHarga)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblItungResTotalHarga))
                .addContainerGap())
        );

        jPanel5.setOpaque(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setText("Pilih Ayam");

        chkResBerat1_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkResBerat1_4.setText("1.4");
        chkResBerat1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResBerat1_4ActionPerformed(evt);
            }
        });

        chkResBerat1_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkResBerat1_2.setText("1.2");
        chkResBerat1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResBerat1_2ActionPerformed(evt);
            }
        });

        spnResBerat1_4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnResBerat1_4.setEnabled(false);
        spnResBerat1_4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnResBerat1_4StateChanged(evt);
            }
        });

        spnResBerat1_3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnResBerat1_3.setEnabled(false);
        spnResBerat1_3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnResBerat1_3StateChanged(evt);
            }
        });

        spnResFilletPaha.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnResFilletPaha.setEnabled(false);
        spnResFilletPaha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnResFilletPahaStateChanged(evt);
            }
        });

        chkResBerat1_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkResBerat1_3.setText("1.3");
        chkResBerat1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResBerat1_3ActionPerformed(evt);
            }
        });

        spnResBerat1_5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnResBerat1_5.setEnabled(false);
        spnResBerat1_5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnResBerat1_5StateChanged(evt);
            }
        });

        chkResFilletDada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkResFilletDada.setText("Fillet dada");
        chkResFilletDada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResFilletDadaActionPerformed(evt);
            }
        });

        chkResFilletPaha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkResFilletPaha.setText("Fillet paha");
        chkResFilletPaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResFilletPahaActionPerformed(evt);
            }
        });

        spnResBerat1_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnResBerat1_2.setEnabled(false);
        spnResBerat1_2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnResBerat1_2StateChanged(evt);
            }
        });

        chkResBerat1_5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkResBerat1_5.setText("1.5");
        chkResBerat1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkResBerat1_5ActionPerformed(evt);
            }
        });

        spnResFilletDada.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnResFilletDada.setEnabled(false);
        spnResFilletDada.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnResFilletDadaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(chkResBerat1_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnResBerat1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkResBerat1_3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(chkResBerat1_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnResBerat1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnResBerat1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(chkResFilletPaha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnResFilletPaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chkResBerat1_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkResFilletDada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spnResFilletDada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(spnResBerat1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel29))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkResFilletPaha)
                            .addComponent(spnResFilletPaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkResFilletDada)
                            .addComponent(spnResFilletDada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkResBerat1_2)
                            .addComponent(spnResBerat1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkResBerat1_3)
                            .addComponent(spnResBerat1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkResBerat1_4)
                            .addComponent(spnResBerat1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkResBerat1_5)
                            .addComponent(spnResBerat1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInputRestock.setBackground(new java.awt.Color(102, 102, 255));
        lblInputRestock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInputRestock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInputRestock.setText("Input");
        lblInputRestock.setOpaque(true);
        lblInputRestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInputRestockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInputRestockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInputRestockMouseExited(evt);
            }
        });

        lblClearRest.setBackground(new java.awt.Color(102, 102, 255));
        lblClearRest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClearRest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClearRest.setText("Clear");
        lblClearRest.setOpaque(true);
        lblClearRest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClearRestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClearRestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClearRestMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlInputRestockLayout = new javax.swing.GroupLayout(pnlInputRestock);
        pnlInputRestock.setLayout(pnlInputRestockLayout);
        pnlInputRestockLayout.setHorizontalGroup(
            pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputRestockLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputRestockLayout.createSequentialGroup()
                        .addComponent(lblInputRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblClearRest, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlInputRestockLayout.createSequentialGroup()
                        .addGroup(pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputRestockLayout.createSequentialGroup()
                                .addGroup(pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlInputRestockLayout.setVerticalGroup(
            pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputRestockLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputRestockLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInputRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInputRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClearRest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabInputData.addTab("Restock", pnlInputRestock);

        javax.swing.GroupLayout pnlInputDataLayout = new javax.swing.GroupLayout(pnlInputData);
        pnlInputData.setLayout(pnlInputDataLayout);
        pnlInputDataLayout.setHorizontalGroup(
            pnlInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputDataLayout.createSequentialGroup()
                .addComponent(tabInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlInputDataLayout.setVerticalGroup(
            pnlInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabInputData)
        );

        Mainpanel.add(pnlInputData, "InputData");

        tabTampilData.setBackground(Bodypanel.getBackground());
        tabTampilData.setForeground(new java.awt.Color(0, 102, 51));
        tabTampilData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabTampilData.setName(""); // NOI18N
        tabTampilData.setOpaque(true);

        pnlTampilPenjualan.setBackground(Menupanel.getBackground());
        pnlTampilPenjualan.setForeground(Menupanel.getForeground());

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Report");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblReportPenj.setBackground(new java.awt.Color(102, 102, 255));
        lblReportPenj.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReportPenj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportPenj.setText("Tampilkan Laporan");
        lblReportPenj.setOpaque(true);
        lblReportPenj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportPenjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportPenjMouseExited(evt);
            }
        });

        tblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Penjualan", "Tgl. Penjualan", "Pembeli", "Keterangan", "Total Harga", "Total Ayam"
            }
        ));
        jScrollPane1.setViewportView(tblPenjualan);

        javax.swing.GroupLayout pnlTampilPenjualanLayout = new javax.swing.GroupLayout(pnlTampilPenjualan);
        pnlTampilPenjualan.setLayout(pnlTampilPenjualanLayout);
        pnlTampilPenjualanLayout.setHorizontalGroup(
            pnlTampilPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTampilPenjualanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(40, 40, 40))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlTampilPenjualanLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(lblReportPenj, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTampilPenjualanLayout.setVerticalGroup(
            pnlTampilPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTampilPenjualanLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReportPenj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        tabTampilData.addTab("Penjualan", pnlTampilPenjualan);

        pnlTampilRestock.setBackground(Menupanel.getBackground());
        pnlTampilRestock.setForeground(Bodypanel.getForeground());

        tblRestock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Restock", "Tanggal restock", "Keterangan", "Total Harga"
            }
        ));
        jScrollPane2.setViewportView(tblRestock);

        jLabel6.setText("Report");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblReportRest.setBackground(new java.awt.Color(102, 102, 255));
        lblReportRest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReportRest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportRest.setText("Tampilkan Laporan");
        lblReportRest.setOpaque(true);
        lblReportRest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportRestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportRestMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTampilRestockLayout = new javax.swing.GroupLayout(pnlTampilRestock);
        pnlTampilRestock.setLayout(pnlTampilRestockLayout);
        pnlTampilRestockLayout.setHorizontalGroup(
            pnlTampilRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTampilRestockLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(47, 47, 47))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlTampilRestockLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(lblReportRest, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTampilRestockLayout.setVerticalGroup(
            pnlTampilRestockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTampilRestockLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReportRest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabTampilData.addTab("Restock", pnlTampilRestock);

        javax.swing.GroupLayout pnlTampilDataLayout = new javax.swing.GroupLayout(pnlTampilData);
        pnlTampilData.setLayout(pnlTampilDataLayout);
        pnlTampilDataLayout.setHorizontalGroup(
            pnlTampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTampilData)
        );
        pnlTampilDataLayout.setVerticalGroup(
            pnlTampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTampilData)
        );

        Mainpanel.add(pnlTampilData, "TampilData");
        pnlTampilData.getAccessibleContext().setAccessibleName("");

        pnlStatistik.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Total Ayam Terjual");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Customer Langganan");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Total Transaksi Penjualan");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Banyak Transaksi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("0");

        javax.swing.GroupLayout pnlStatistikLayout = new javax.swing.GroupLayout(pnlStatistik);
        pnlStatistik.setLayout(pnlStatistikLayout);
        pnlStatistikLayout.setHorizontalGroup(
            pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatistikLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        pnlStatistikLayout.setVerticalGroup(
            pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatistikLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addGroup(pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(pnlStatistikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mainpanel.add(pnlStatistik, "Statistik");

        pnlSetelan.setBackground(new java.awt.Color(153, 255, 153));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel9.setText("Reset Database");

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel10.setText("Reset Password");

        btnresetdatabase.setBackground(new java.awt.Color(153, 255, 153));
        btnresetdatabase.setText("Reset");
        btnresetdatabase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnresetdatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetdatabaseActionPerformed(evt);
            }
        });

        btnresetpassword.setBackground(new java.awt.Color(153, 255, 153));
        btnresetpassword.setText("Reset");
        btnresetpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnresetpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSetelanLayout = new javax.swing.GroupLayout(pnlSetelan);
        pnlSetelan.setLayout(pnlSetelanLayout);
        pnlSetelanLayout.setHorizontalGroup(
            pnlSetelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetelanLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlSetelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(pnlSetelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnresetpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnresetdatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSetelanLayout.setVerticalGroup(
            pnlSetelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetelanLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlSetelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnresetdatabase))
                .addGap(73, 73, 73)
                .addGroup(pnlSetelanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnresetpassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mainpanel.add(pnlSetelan, "Setelan");

        javax.swing.GroupLayout BodypanelLayout = new javax.swing.GroupLayout(Bodypanel);
        Bodypanel.setLayout(BodypanelLayout);
        BodypanelLayout.setHorizontalGroup(
            BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodypanelLayout.setVerticalGroup(
            BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblInputDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputDataMouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(Mainpanel.getLayout());
        c1.show(Mainpanel, "InputData");
    }//GEN-LAST:event_lblInputDataMouseClicked

    private void lblTampilDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTampilDataMouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(Mainpanel.getLayout());
        c1.show(Mainpanel, "TampilData");
    }//GEN-LAST:event_lblTampilDataMouseClicked

    private void lblStatistikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatistikMouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(Mainpanel.getLayout());
        c1.show(Mainpanel, "Statistik");
    }//GEN-LAST:event_lblStatistikMouseClicked

    private void btnresetdatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetdatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetdatabaseActionPerformed

    private void lblTentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTentangMouseClicked
        // TODO add your handling code here:
        Aboutview a1 = new Aboutview();
        a1.setVisible(true);
    }//GEN-LAST:event_lblTentangMouseClicked

    private void lblSetelanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetelanMouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(Mainpanel.getLayout());
        c1.show(Mainpanel, "Setelan");
    }//GEN-LAST:event_lblSetelanMouseClicked

    private void lblTentangAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTentangAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTentangAncestorAdded

    private void lblTentangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTentangMouseEntered
        // TODO add your handling code here:
        lblTentang.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblTentangMouseEntered

    private void lblMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseClicked
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(Mainpanel.getLayout());
        c1.show(Mainpanel, "MainMenu");
    }//GEN-LAST:event_lblMainMenuMouseClicked

    private void lblMainMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseEntered
        // TODO add your handling code here:
        lblMainMenu.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblMainMenuMouseEntered

    private void lblMainMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseExited
        // TODO add your handling code here:
        lblMainMenu.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblMainMenuMouseExited

    private void lblInputDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputDataMouseEntered
        // TODO add your handling code here:
        lblInputData.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblInputDataMouseEntered

    private void lblInputDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputDataMouseExited
        // TODO add your handling code here:
        lblInputData.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblInputDataMouseExited

    private void lblTampilDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTampilDataMouseEntered
        // TODO add your handling code here:
        lblTampilData.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblTampilDataMouseEntered

    private void lblTampilDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTampilDataMouseExited
        // TODO add your handling code here:
        lblTampilData.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblTampilDataMouseExited

    private void lblStatistikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatistikMouseEntered
        // TODO add your handling code here:
        lblStatistik.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblStatistikMouseEntered

    private void lblStatistikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatistikMouseExited
        // TODO add your handling code here:
        lblStatistik.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblStatistikMouseExited

    private void lblSetelanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetelanMouseEntered
        // TODO add your handling code here:
        lblSetelan.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblSetelanMouseEntered

    private void lblSetelanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetelanMouseExited
        // TODO add your handling code here:
        lblSetelan.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblSetelanMouseExited

    private void lblTentangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTentangMouseExited
        // TODO add your handling code here:
         lblTentang.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblTentangMouseExited

    private void lblLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseEntered
        // TODO add your handling code here:
        lblLogOut.setBackground(new Color(91, 255, 91));
    }//GEN-LAST:event_lblLogOutMouseEntered

    private void lblLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseExited
        // TODO add your handling code here:
        lblLogOut.setBackground(Menupanel.getBackground());
    }//GEN-LAST:event_lblLogOutMouseExited

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        // TODO add your handling code here:
        Login a1 = new Login();
        a1.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void chkPenBerat1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPenBerat1_5ActionPerformed
        // TODO add your handling code here:
        if(chkPenBerat1_5.isSelected()) {
            spnPenBerat1_5.setEnabled(true);
        } else {
            spnPenBerat1_5.setEnabled(false);
            spnPenBerat1_5.setValue(0);
        }
    }//GEN-LAST:event_chkPenBerat1_5ActionPerformed

    private void chkPenFilletDadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPenFilletDadaActionPerformed
        // TODO add your handling code here:
        if(chkPenFilletDada.isSelected()) {
            spnPenFilletDada.setEnabled(true);
        } else {
            spnPenFilletDada.setEnabled(false);
            spnPenFilletDada.setValue(0);
        }
    }//GEN-LAST:event_chkPenFilletDadaActionPerformed

    private void chkPenFilletPahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPenFilletPahaActionPerformed
        // TODO add your handling code here:
        if(chkPenFilletPaha.isSelected()) {
            spnPenFilletPaha.setEnabled(true);
        } else {
            spnPenFilletPaha.setEnabled(false);
            spnPenFilletPaha.setValue(0);
        }
    }//GEN-LAST:event_chkPenFilletPahaActionPerformed

    private void chkPenBerat1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPenBerat1_4ActionPerformed
        // TODO add your handling code here:
        if(chkPenBerat1_4.isSelected()) {
            spnPenBerat1_4.setEnabled(true);
        } else {
            spnPenBerat1_4.setEnabled(false);
            spnPenBerat1_4.setValue(0);
        }
    }//GEN-LAST:event_chkPenBerat1_4ActionPerformed

    private void chkPenBerat1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPenBerat1_3ActionPerformed
        // TODO add your handling code here:
        if(chkPenBerat1_3.isSelected()) {
            spnPenBerat1_3.setEnabled(true);
        } else {
            spnPenBerat1_3.setEnabled(false);
            spnPenBerat1_3.setValue(0);
        }
    }//GEN-LAST:event_chkPenBerat1_3ActionPerformed

    private void chkPenBerat1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPenBerat1_2ActionPerformed
        // TODO add your handling code here:
        if(chkPenBerat1_2.isSelected()) {
            spnPenBerat1_2.setEnabled(true);
        } else {
            spnPenBerat1_2.setEnabled(false);
            spnPenBerat1_2.setValue(0);
        }
    }//GEN-LAST:event_chkPenBerat1_2ActionPerformed

    private void txtInputPenNamaPenjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputPenNamaPenjualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputPenNamaPenjualActionPerformed

    private void chkResBerat1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResBerat1_5ActionPerformed
        // TODO add your handling code here:
        if(chkResBerat1_5.isSelected()) {
            spnResBerat1_5.setEnabled(true);
        } else {
            spnResBerat1_5.setEnabled(false);
            spnResBerat1_5.setValue(0);
        }
    }//GEN-LAST:event_chkResBerat1_5ActionPerformed

    private void chkResFilletPahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResFilletPahaActionPerformed
        // TODO add your handling code here:
        if(chkResFilletPaha.isSelected()) {
            spnResFilletPaha.setEnabled(true);
        } else {
            spnResFilletPaha.setEnabled(false);
            spnResFilletPaha.setValue(0);
        }
    }//GEN-LAST:event_chkResFilletPahaActionPerformed

    private void chkResFilletDadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResFilletDadaActionPerformed
        // TODO add your handling code here:
        if(chkResFilletDada.isSelected()) {
            spnResFilletDada.setEnabled(true);
        } else {
            spnResFilletDada.setEnabled(false);
            spnResFilletDada.setValue(0);
        }
    }//GEN-LAST:event_chkResFilletDadaActionPerformed

    private void chkResBerat1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResBerat1_3ActionPerformed
        // TODO add your handling code here:
        if(chkResBerat1_3.isSelected()) {
            spnResBerat1_3.setEnabled(true);
        } else {
            spnResBerat1_3.setEnabled(false);
            spnResBerat1_3.setValue(0);
        }
    }//GEN-LAST:event_chkResBerat1_3ActionPerformed

    private void chkResBerat1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResBerat1_2ActionPerformed
        // TODO add your handling code here:
        if(chkResBerat1_2.isSelected()) {
            spnResBerat1_2.setEnabled(true);
        } else {
            spnResBerat1_2.setEnabled(false);
            spnResBerat1_2.setValue(0);
        }
    }//GEN-LAST:event_chkResBerat1_2ActionPerformed

    private void chkResBerat1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkResBerat1_4ActionPerformed
        // TODO add your handling code here:
        if(chkResBerat1_4.isSelected()) {
            spnResBerat1_4.setEnabled(true);
        } else {
            spnResBerat1_4.setEnabled(false);
            spnResBerat1_4.setValue(0);
        }
    }//GEN-LAST:event_chkResBerat1_4ActionPerformed

    private void lblInputRestockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputRestockMouseEntered
        // TODO add your handling code here:
        lblInputRestock.setBackground(new Color(55, 55, 255));
        
    }//GEN-LAST:event_lblInputRestockMouseEntered

    private void lblInputRestockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputRestockMouseExited
        // TODO add your handling code here:
        
        lblInputRestock.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_lblInputRestockMouseExited

    private void lblReportPenjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportPenjMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportPenjMouseEntered

    private void lblReportPenjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportPenjMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportPenjMouseExited

    private void lblReportRestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportRestMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportRestMouseEntered

    private void lblReportRestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportRestMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportRestMouseExited

    private void spnPenBerat1_2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnPenBerat1_2PropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_spnPenBerat1_2PropertyChange

    private void spnPenBerat1_2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPenBerat1_2StateChanged
        // TODO add your handling code here:
        totalAyamPenj = getTotalAyam();
        totalHargaPenj = getTotalHarga("pen");
        
        lblItungPenTotalAyam.setText(Integer.toString(totalAyamPenj));
        lblItungPenTotalHarga.setText(Integer.toString(totalHargaPenj));
    }//GEN-LAST:event_spnPenBerat1_2StateChanged

    private void spnPenBerat1_3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPenBerat1_3StateChanged
        // TODO add your handling code here:
        totalAyamPenj = getTotalAyam();
        totalHargaPenj = getTotalHarga("pen");
        
        lblItungPenTotalAyam.setText(Integer.toString(totalAyamPenj));
        lblItungPenTotalHarga.setText(Integer.toString(totalHargaPenj));
    }//GEN-LAST:event_spnPenBerat1_3StateChanged

    private void spnPenBerat1_4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPenBerat1_4StateChanged
        // TODO add your handling code here:
        totalAyamPenj = getTotalAyam();
        totalHargaPenj = getTotalHarga("pen");
        
        lblItungPenTotalAyam.setText(Integer.toString(totalAyamPenj));
        lblItungPenTotalHarga.setText(Integer.toString(totalHargaPenj));
    }//GEN-LAST:event_spnPenBerat1_4StateChanged

    private void spnPenFilletPahaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPenFilletPahaStateChanged
        // TODO add your handling code here:
        totalAyamPenj = getTotalAyam();
        totalHargaPenj = getTotalHarga("pen");
        
        lblItungPenTotalAyam.setText(Integer.toString(totalAyamPenj));
        lblItungPenTotalHarga.setText(Integer.toString(totalHargaPenj));
    }//GEN-LAST:event_spnPenFilletPahaStateChanged

    private void spnPenFilletDadaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPenFilletDadaStateChanged
        // TODO add your handling code here:
        totalAyamPenj = getTotalAyam();
        totalHargaPenj = getTotalHarga("pen");
        
        lblItungPenTotalAyam.setText(Integer.toString(totalAyamPenj));
        lblItungPenTotalHarga.setText(Integer.toString(totalHargaPenj));
    }//GEN-LAST:event_spnPenFilletDadaStateChanged

    private void spnPenBerat1_5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPenBerat1_5StateChanged
        // TODO add your handling code here:
        totalAyamPenj = getTotalAyam();
        totalHargaPenj = getTotalHarga("pen");
        
        lblItungPenTotalAyam.setText(Integer.toString(totalAyamPenj));
        lblItungPenTotalHarga.setText(Integer.toString(totalHargaPenj));
    }//GEN-LAST:event_spnPenBerat1_5StateChanged

    private void spnResBerat1_2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnResBerat1_2StateChanged
        // TODO add your handling code here:
        totalHargaRestock = getTotalHarga("");
        
        lblItungResTotalHarga.setText(Integer.toString(totalHargaRestock));
    }//GEN-LAST:event_spnResBerat1_2StateChanged

    private void spnResBerat1_3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnResBerat1_3StateChanged
        // TODO add your handling code here:
        totalHargaRestock = getTotalHarga("");
        
        lblItungResTotalHarga.setText(Integer.toString(totalHargaRestock));
    }//GEN-LAST:event_spnResBerat1_3StateChanged

    private void spnResBerat1_4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnResBerat1_4StateChanged
        // TODO add your handling code here:
        totalHargaRestock = getTotalHarga("");
        
        lblItungResTotalHarga.setText(Integer.toString(totalHargaRestock));
    }//GEN-LAST:event_spnResBerat1_4StateChanged

    private void spnResFilletPahaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnResFilletPahaStateChanged
        // TODO add your handling code here:
        totalHargaRestock = getTotalHarga("");
        
        lblItungResTotalHarga.setText(Integer.toString(totalHargaRestock));
    }//GEN-LAST:event_spnResFilletPahaStateChanged

    private void spnResFilletDadaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnResFilletDadaStateChanged
        // TODO add your handling code here:
        totalHargaRestock = getTotalHarga("");
        
        lblItungResTotalHarga.setText(Integer.toString(totalHargaRestock));
    }//GEN-LAST:event_spnResFilletDadaStateChanged

    private void spnResBerat1_5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnResBerat1_5StateChanged
        // TODO add your handling code here:
        totalHargaRestock = getTotalHarga("");
        
        lblItungResTotalHarga.setText(Integer.toString(totalHargaRestock));
    }//GEN-LAST:event_spnResBerat1_5StateChanged

    private void lblClearRestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearRestMouseEntered
        // TODO add your handling code here:
        lblClearRest.setBackground(new Color(55, 55, 255));
        
    }//GEN-LAST:event_lblClearRestMouseEntered

    private void lblClearRestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearRestMouseExited
        // TODO add your handling code here:
        
        lblClearRest.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_lblClearRestMouseExited

    private void lblClearRestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearRestMouseClicked
        // TODO add your handling code here:
        clearForm("");
    }//GEN-LAST:event_lblClearRestMouseClicked

    private void lblInputRestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputRestockMouseClicked
        // TODO add your handling code here:
        Database db = new Database();
        SimpleDateFormat dfrm = new SimpleDateFormat("yyyy-MM-dd");
        Restock rs = new Restock();
        Stock s = new Stock();
        
        try {
            String item1, item2, item3, item4, item5, item6;
            String tgl_restock;
            int totalHarga;
            
            item1 = spnResBerat1_2.getValue().toString();
            item2 = spnResBerat1_3.getValue().toString();
            item3 = spnResBerat1_4.getValue().toString();
            item4 = spnResBerat1_5.getValue().toString();
            item5 = spnResFilletDada.getValue().toString();
            item6 = spnResFilletPaha.getValue().toString();
            
            tgl_restock = dfrm.format(calTglRestock.getDate());
            totalHarga = Integer.parseInt(lblItungResTotalHarga.getText());
            
            String code = item1 + "&" + item2 + "&" + item3 + "&" + item4 + "&" + item5 + "&" + item6;
            int[] num = Arrays.stream(code.split("&")).mapToInt(Integer::parseInt).toArray();
            
            rs.setTgl_restock(tgl_restock);
            rs.setTotalHarga(totalHarga);
            rs.setString_restock(code);
            
            s.setStringRestock(code);
            s.setStock_12(num[0]);
            s.setStock_13(num[1]);
            s.setStock_14(num[2]);
            s.setStock_15(num[3]);
            s.setStock_fill_dada(num[4]);
            s.setStock_fill_paha(num[5]);
            
            rs.saveRestock();
            s.savestock();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_lblInputRestockMouseClicked

    private void lblClearPenjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearPenjMouseExited
        // TODO add your handling code here:

        lblClearPenj.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_lblClearPenjMouseExited

    private void lblClearPenjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearPenjMouseEntered
        // TODO add your handling code here:
        lblClearPenj.setBackground(new Color(55, 55, 255));

    }//GEN-LAST:event_lblClearPenjMouseEntered

    private void lblClearPenjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearPenjMouseClicked
        // TODO add your handling code here:
        clearForm("pen");
    }//GEN-LAST:event_lblClearPenjMouseClicked

    private void lblInputPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputPenjualanMouseExited
        // TODO add your handling code here:
        lblInputPenjualan.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_lblInputPenjualanMouseExited

    private void lblInputPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputPenjualanMouseEntered
        // TODO add your handling code here:
        lblInputPenjualan.setBackground(new Color(55, 55, 255));
    }//GEN-LAST:event_lblInputPenjualanMouseEntered

    private void lblInputPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInputPenjualanMouseClicked
        // TODO add your handling code here:
        Database db = new Database();
        Penjualan pj = new Penjualan();
        SimpleDateFormat dfrm = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String item1, item2, item3, item4, item5, item6;
            String nama_pembeli;
            String tgl_penjualan;
            int totalAyam;
            int totalHarga;

            item1 = spnPenBerat1_2.getValue().toString();
            item2 = spnPenBerat1_3.getValue().toString();
            item3 = spnPenBerat1_4.getValue().toString();
            item4 = spnPenBerat1_5.getValue().toString();
            item5 = spnPenFilletDada.getValue().toString();
            item6 = spnPenFilletPaha.getValue().toString();

            nama_pembeli = txtInputPenNamaPenjual.getText();
            tgl_penjualan = dfrm.format(calTglPenjualan.getDate());
            totalAyam = Integer.parseInt(lblItungPenTotalAyam.getText());
            totalHarga = Integer.parseInt(lblItungPenTotalHarga.getText());
            String code = item1 + "&" + item2 + "&" + item3 + "&" + item4 + "&" + item5 + "&" + item6;

            pj.setNama_pembeli(nama_pembeli);
            pj.setTgl_penjualan(tgl_penjualan);
            pj.setTotalAyam(totalAyam);
            pj.setTotalHarga(totalHarga);
            pj.setString_penjualan(code);

            pj.savepenjualan();

            JOptionPane.showMessageDialog(null, "Data berhasil di input");
            clearForm("pen");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di input");
        }

    }//GEN-LAST:event_lblInputPenjualanMouseClicked

    private void lblInputPenjualanComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lblInputPenjualanComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInputPenjualanComponentAdded

    private void btnresetpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetpasswordActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mainapp().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bodypanel;
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JPanel Menupanel;
    private javax.swing.JButton btnresetdatabase;
    private javax.swing.JButton btnresetpassword;
    private com.toedter.calendar.JDateChooser calTglPenjualan;
    private com.toedter.calendar.JDateChooser calTglRestock;
    private javax.swing.JCheckBox chkPenBerat1_2;
    private javax.swing.JCheckBox chkPenBerat1_3;
    private javax.swing.JCheckBox chkPenBerat1_4;
    private javax.swing.JCheckBox chkPenBerat1_5;
    private javax.swing.JCheckBox chkPenFilletDada;
    private javax.swing.JCheckBox chkPenFilletPaha;
    private javax.swing.JCheckBox chkResBerat1_2;
    private javax.swing.JCheckBox chkResBerat1_3;
    private javax.swing.JCheckBox chkResBerat1_4;
    private javax.swing.JCheckBox chkResBerat1_5;
    private javax.swing.JCheckBox chkResFilletDada;
    private javax.swing.JCheckBox chkResFilletPaha;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconAyam;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblClearPenj;
    private javax.swing.JLabel lblClearRest;
    private javax.swing.JLabel lblInputData;
    private javax.swing.JLabel lblInputPenjualan;
    private javax.swing.JLabel lblInputRestock;
    private javax.swing.JLabel lblItungPenTotalAyam;
    private javax.swing.JLabel lblItungPenTotalHarga;
    private javax.swing.JLabel lblItungResTotalHarga;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblMainMenuIntro;
    private javax.swing.JLabel lblReportPenj;
    private javax.swing.JLabel lblReportRest;
    private javax.swing.JLabel lblSetelan;
    private javax.swing.JLabel lblStatistik;
    private javax.swing.JLabel lblTampilData;
    private javax.swing.JLabel lblTentang;
    private javax.swing.JPanel pnlInputData;
    private javax.swing.JPanel pnlInputPenjualan;
    private javax.swing.JPanel pnlInputRestock;
    private javax.swing.JPanel pnlMainMenu;
    private javax.swing.JPanel pnlSetelan;
    private javax.swing.JPanel pnlStatistik;
    private javax.swing.JPanel pnlTampilData;
    private javax.swing.JPanel pnlTampilPenjualan;
    private javax.swing.JPanel pnlTampilRestock;
    private javax.swing.JSpinner spnPenBerat1_2;
    private javax.swing.JSpinner spnPenBerat1_3;
    private javax.swing.JSpinner spnPenBerat1_4;
    private javax.swing.JSpinner spnPenBerat1_5;
    private javax.swing.JSpinner spnPenFilletDada;
    private javax.swing.JSpinner spnPenFilletPaha;
    private javax.swing.JSpinner spnResBerat1_2;
    private javax.swing.JSpinner spnResBerat1_3;
    private javax.swing.JSpinner spnResBerat1_4;
    private javax.swing.JSpinner spnResBerat1_5;
    private javax.swing.JSpinner spnResFilletDada;
    private javax.swing.JSpinner spnResFilletPaha;
    private javax.swing.JTabbedPane tabInputData;
    private javax.swing.JTabbedPane tabTampilData;
    private javax.swing.JTable tblPenjualan;
    private javax.swing.JTable tblRestock;
    private javax.swing.JTextField txtInputPenNamaPenjual;
    // End of variables declaration//GEN-END:variables
}
