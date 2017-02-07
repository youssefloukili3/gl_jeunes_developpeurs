package projet.ihm;

import base_donnees.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *@authors: AMINE EL KHOUMISSI, YOUSSEF LOUKILI, YASSIR HADDAD
 *@exams numbers: 734, 394, 586
 *@version: 1.0
 */


public class FenetrePrincipale extends javax.swing.JFrame {

    
    ResultSet rs;
    DataBase db;
    
    public FenetrePrincipale() {
        
        
         db = new DataBase(new Parametres().HOST_DB, new Parametres().USERNAME_DB,
                 new Parametres().PASSWORD_DB, new Parametres().IPHOST, new Parametres().PORT);
        initComponents();
        table();
        table1();
        
    }
    public void table() {
        String a[] = {"id_vol", "aeroportDepart", "dateDepart", "aeroportArrivee", "dateArrivee", 
        "tarif", "nombrePlaces", "duree", "escale", "aeroportEscale", "heureArriveeEscale",
        "heureDepartEscale"};
        rs = db.querySelect(a, "vol");
        vol.setModel(new ResultSetTableModel(rs));
       
        
    }
    
    public void table1() {
        String a[] = {"num_Reservation", "dateReservation", "prenomPassager", "nomPassager", "numPassport", 
        "telephonePassager", "numVol"};
        rs = db.querySelect(a, "reservation");
        reservation.setModel(new ResultSetTableModel(rs));
       
        
    }
    
    void actualiser() {
        
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setSelectedItem(" numVol");
    }
    
    
    

    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vol = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservation = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        developpeurs = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        te2 = new javax.swing.JTextField();
        te4 = new javax.swing.JTextField();
        te3 = new javax.swing.JTextField();
        te1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenue!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Fly-Morroco 2017");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("http://www.fly-Morroco.ma");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Copyrigth Fly-Morroco 2017");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("06-01-02-03-04");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, -1, -1));

        jTabbedPane1.addTab("Accueil\n", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_vol", "aeroportDepart", "dateDepart", "aeroportArrivee", "dateArrivee", "tarif", "nombrePlaces", "duree", "escale", "aeroportEscale", "heureArriveeEscale", "heureDepartEscale"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vol);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1260, 160));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("N°  de vol                :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Aéroport de départ :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Date de départ        :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        jPanel2.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 250, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Aéroport d'arrivée  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Date d'arrivée         :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Tarif  ($)                :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));
        jPanel2.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 250, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Durée (min)                   :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Escale                             :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Aéroport d'escale            :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Heure d'arrivée d'escale  :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Heure de départ d'escale :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Nombre de places          :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, 20));

        txt8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 250, 30));

        txt9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 250, 30));

        txt10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 250, 30));

        txt11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 250, 30));

        txt7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 250, 30));

        txt1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 250, 30));

        txt2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 250, 30));

        txt3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 250, 30));

        txt4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 250, 30));

        txt5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 250, 30));

        jTabbedPane1.addTab("Vols Programmés", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservation.setAutoCreateRowSorter(true);
        reservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "num_Reservation", "dateReservation", "prenomPassager", "nomPassager", "numPassport", "telephonePassager", "numVol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reservation);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 48, 1140, 150));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("N° de vol             :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("N° de réservation     :");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Date de réservation  :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Prénom                    :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Nom                         :");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("N° de passport    :");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("N° de téléphone  :");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, 100, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton2.setText("Confirmer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 100, 40));

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t1.setText("Champ généré automatiquement");
        t1.setName(" "); // NOI18N
        jPanel3.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 220, 30));

        t2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 220, 30));

        t3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 220, 30));

        t4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 220, 30));

        t5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 210, 30));

        t6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 210, 30));

        t7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        t7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1111", "1112", "1113", "1114", "1115" }));
        jPanel3.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 210, 30));

        jTabbedPane1.addTab("Réservation Vols", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        developpeurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AMINE", "EL KHOUMISSI", "GI2", "734"},
                {"YOUSSEF", "LOUKILI", "GI2", "394"},
                {"YASSIR", "HADDAD", "GI2", "586"}
            },
            new String [] {
                "Prénom", "Nom", "Niveau", "N° d'examen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        developpeurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                developpeursMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(developpeurs);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1200, 140));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Développeurs :");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("N° d'examen :");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Prénom :");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Nom       :");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Niveau         :");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        te2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(te2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 240, 30));

        te4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(te4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 240, 30));

        te3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(te3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 240, 30));

        te1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel5.add(te1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 240, 30));

        jTabbedPane1.addTab("Développeurs", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volMouseClicked
        // TODO add your handling code here:
        txt1.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),0)));
        txt2.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),1)));
        txt3.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),2)));
        txt4.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),3)));
        txt5.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),4)));
        txt6.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),5)));
        txt7.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),6)));
        txt8.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),7)));
        txt9.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),8)));
        txt10.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),9)));
        txt11.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),10)));
        txt12.setText(String.valueOf( vol.getValueAt( vol.getSelectedRow(),11)));

    }//GEN-LAST:event_volMouseClicked

    private void reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseClicked
        // TODO add your handling code here:
        
        t1.setText(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),0)));
        t2.setText(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),1)));
        t3.setText(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),2)));
        t4.setText(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),3)));
        t5.setText(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),4)));
        t6.setText(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),5)));
        t7.setSelectedItem(String.valueOf( reservation.getValueAt( reservation.getSelectedRow(),6)));
       
        
    }//GEN-LAST:event_reservationMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (t2.getText().equals("") || t3.getText().equals("")
               || t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("")
                || t7.getSelectedItem().equals("numVol")) {
            JOptionPane.showMessageDialog(this, "Entrez les informations complètes s'il vous plaît.");
        } else {
            String[] colon = {"dateReservation", "prenomPassager", 
                "nomPassager", "numPassport", "telephonePassager", "numVol"};
            String[] inf = {t2.getText(), t3.getText(),t4.getText(), t5.getText(),
                t6.getText(), t7.getSelectedItem().toString()};
            System.out.println(db.queryInsert("reservation", colon, inf));
            table1();
            actualiser();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String id = String.valueOf(reservation.getValueAt(reservation.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Est ce que tu es sure que tu "
                +"veux suuprimer cette réservation", "attention!!!", 
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("reservation", "num_Reservation=" + id);
        } else {
            return;
        }
        table1();

 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void developpeursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_developpeursMouseClicked
        // TODO add your handling code here:
        
        te1.setText(String.valueOf( developpeurs.getValueAt( developpeurs.getSelectedRow(),0)));
        te2.setText(String.valueOf( developpeurs.getValueAt( developpeurs.getSelectedRow(),1)));
        te3.setText(String.valueOf( developpeurs.getValueAt( developpeurs.getSelectedRow(),2)));
        te4.setText(String.valueOf( developpeurs.getValueAt( developpeurs.getSelectedRow(),3)));
       
        
    }//GEN-LAST:event_developpeursMouseClicked

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable developpeurs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable reservation;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JComboBox<String> t7;
    private javax.swing.JTextField te1;
    private javax.swing.JTextField te2;
    private javax.swing.JTextField te3;
    private javax.swing.JTextField te4;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTable vol;
    // End of variables declaration//GEN-END:variables
}
