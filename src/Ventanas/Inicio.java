package Ventanas;

import Clases.DatosGraficos;
import Clases.PintarDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.*;


import main.ManejadorMatriz;
public class Inicio extends javax.swing.JFrame {

    private int clics = 0;
    private int Numerotope = 0;//Numero de nodos
    DatosGraficos arboles = new DatosGraficos();
    ManejadorMatriz manejadorMatriz = new ManejadorMatriz();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {      
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintarDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintarDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }
    }

     public Inicio() {
        initComponents();
        setExtendedState(Inicio.MAXIMIZED_BOTH);
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
        EleccionOrigen.setUI(Propiedades.createUI(rootPane));
        EleccionDestino.setUI(Propiedades.createUI(rootPane));  
        // Establecer el icono de la ventana
        Image icono = Toolkit.getDefaultToolkit().getImage("/icons/Logo Uninorte Guides.png");
        this.setIconImage(icono);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblUNGuides = new javax.swing.JLabel();
        minimizarBoton = new javax.swing.JLabel();
        closeBoton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImgMapa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MostrarCaminos = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        kmRecorridos2 = new javax.swing.JLabel();
        iconDestino = new javax.swing.JLabel();
        iconDots = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        kmRecorridos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BuscarCamino = new javax.swing.JButton();
        limpiarBackground = new javax.swing.JLabel();
        iconOrigen = new javax.swing.JLabel();
        rectanguloBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1550, 2));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 2, 980));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        lblUNGuides.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblUNGuides.setForeground(new java.awt.Color(153, 153, 153));
        lblUNGuides.setText("UninorteGuides");
        jPanel3.add(lblUNGuides);
        lblUNGuides.setBounds(30, 0, 180, 40);

        minimizarBoton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        minimizarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ArrowDownLeft.png"))); // NOI18N
        minimizarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarBotonMouseClicked(evt);
            }
        });
        jPanel3.add(minimizarBoton);
        minimizarBoton.setBounds(-810, 0, 2310, 40);

        closeBoton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        closeBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/X.png"))); // NOI18N
        closeBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBotonMouseClicked(evt);
            }
        });
        jPanel3.add(closeBoton);
        closeBoton.setBounds(-820, 0, 2370, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1570, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/silueta.jpeg"))); // NOI18N
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1660, 850));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 1250, 990));

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Selección de Lugares");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 550, 30));

        MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
        MostrarCaminos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(60, 124, 124));
        MostrarCaminos.setText("Iniciar Mapa");
        MostrarCaminos.setContentAreaFilled(false);
        MostrarCaminos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        jPanel2.add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 210, 50));

        EleccionOrigen.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(60, 124, 124));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biblioteca", "Bloque A", "Bloque B", "Bloque C", "Bloque D", "Bloque E", "Bloque F", "Bloque G", "Bloque I", "Bloque J", "Bloque K", "Bloque L", "Bloque M", "Bloque Administrativo I", "Bloque de Posgrados", "Casa Estudio", "Centro Medico", "Coliseo", "Puerta 4", "Puerta 7" }));
        EleccionOrigen.setSelectedItem("Elija su destino");
        EleccionOrigen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        EleccionOrigen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EleccionOrigen.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        jPanel2.add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 400, 50));

        kmRecorridos2.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(51, 51, 51));
        kmRecorridos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kmRecorridos2.setText("Distancia:");
        kmRecorridos2.setOpaque(true);
        jPanel2.add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 110, 30));

        iconDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crosshair.png"))); // NOI18N
        jPanel2.add(iconDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, -1));

        iconDots.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/DotsThreeVertical.png"))); // NOI18N
        jPanel2.add(iconDots, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 30));

        EleccionDestino.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(60, 124, 124));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biblioteca", "Bloque A", "Bloque B", "Bloque C", "Bloque D", "Bloque E", "Bloque F", "Bloque G", "Bloque I", "Bloque J", "Bloque K", "Bloque L", "Bloque M", "Bloque Administrativo I", "Bloque de Posgrados", "Casa Estudio", "Centro Medico", "Coliseo", "Puerta 4", "Puerta 7" }));
        EleccionDestino.setSelectedItem("Elija su destino");
        EleccionDestino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        EleccionDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        jPanel2.add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 400, 50));

        kmRecorridos.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(102, 102, 102));
        kmRecorridos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kmRecorridos.setOpaque(true);
        jPanel2.add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 270, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 470, 30));

        BuscarCamino.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(255, 255, 255));
        BuscarCamino.setText("Encontrar ruta");
        BuscarCamino.setToolTipText("");
        BuscarCamino.setBorder(null);
        BuscarCamino.setBorderPainted(false);
        BuscarCamino.setContentAreaFilled(false);
        BuscarCamino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarCamino.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BuscarCamino.setFocusPainted(false);
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        jPanel2.add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 210, 50));

        limpiarBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiarBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Frame 10.png"))); // NOI18N
        jPanel2.add(limpiarBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 210, -1));

        iconOrigen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MapPin.png"))); // NOI18N
        jPanel2.add(iconOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, -1));

        rectanguloBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rectangle 1.png"))); // NOI18N
        jPanel2.add(rectanguloBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 550, -1));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ArrowFatLinesUp.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 550, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡Presiona aquí para empezar la experiencia!");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 550, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private int CaminoSeleccionado(String vector[], String lugar){
        int i = 0;
        for (String elemento : vector) {           
            if (elemento.equals(lugar)) {
                return i;
            }
        i++;
        }
        return i;
    }
            
    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen, destino;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();
        
        String lugares[] = {"Puerta 4","","", "Puerta 7","","","Bloque M","", "Casa Estudio","", "Biblioteca","", "Bloque D","", "Bloque E", "", "Bloque F","","","","","", "Bloque G","","","", "Coliseo","","","","Bloque I","","", "Bloque K","","","","", "Bloque J","","","Bloque L","","", "Centro Medico","", " Bloque de Posgrados","","","","Bloque Administrativo I","","","","", "Bloque A","", "Bloque B","", "Bloque C"};        
        
        origen = CaminoSeleccionado(lugares, nombreOrigen);
        System.out.println("Origen: " + origen);
        destino = CaminoSeleccionado(lugares, nombreDestino);
        System.out.println("Destino: " + destino);

        if (origen == destino) {
            Advertencia abrir = new Advertencia();
            abrir.setVisible(true);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            kmRecorridos.setText(Dijkstra.getAcumulado() + " metros");
        }
        jPanel3.repaint();
        jPanel4.repaint();
        jPanel5.repaint();

    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void closeBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBotonMouseClicked
        System.exit(0); //Cerrar programa
    }//GEN-LAST:event_closeBotonMouseClicked

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void minimizarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarBotonMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarBotonMouseClicked

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        EleccionOrigen.setEnabled(true);
        EleccionDestino.setEnabled(true);
        BuscarCamino.setEnabled(true);

        jPanel1.paint(jPanel1.getGraphics());

        int xx1[] = manejadorMatriz.obtenerCoordX();
        int yy1[] = manejadorMatriz.obtenerCoordY();
        String nom[] = manejadorMatriz.obtenerEtiquetaNodos();

        for (int j = 0; j < 60; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);
        }

        int[][] matrizAdyacencia = manejadorMatriz.obtenerMatrizAdyacencia();
        double[][] matrizCoeficiente = manejadorMatriz.obtenerMatrizCoeficiente();

        for (int j = 0; j < 60; j++) {
            for (int k = 0; k < 60; k++) {
                arboles.setmAdyacencia(j, k, matrizAdyacencia[j][k]);
                arboles.setmCoeficiente(j, k, matrizCoeficiente[j][k]);
            }
        }

        Numerotope = 60;
        PintarFiguras(Numerotope, arboles);

        jPanel3.repaint();
        jPanel4.repaint();
        jPanel5.repaint();
        jLabel4.setVisible(false);
        jLabel2.setVisible(false);

    }//GEN-LAST:event_MostrarCaminosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel ImgMapa;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel closeBoton;
    private javax.swing.JLabel iconDestino;
    private javax.swing.JLabel iconDots;
    private javax.swing.JLabel iconOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel lblUNGuides;
    private javax.swing.JLabel limpiarBackground;
    private javax.swing.JLabel minimizarBoton;
    private javax.swing.JLabel rectanguloBackground;
    // End of variables declaration//GEN-END:variables
}
