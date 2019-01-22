
package CapaInterface;

import CapaNegocio.ClsTriangulo;
import CapaNegocio.ClsCuadrilatero;
import CapaNegocio.ClsPoligono;
import CapaNegocio.ClsCirculo;


public class WinFiguras extends javax.swing.JFrame {

    
    public WinFiguras() {
        initComponents();
        PnlTriangulo.setVisible(false);
        PnlCuadrilatero.setVisible(false);
        PnlCirculo.setVisible(false);
        PnlPologono.setVisible(false);
        PnlCalculos.setVisible(false);
    }
    
ClsCirculo a;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTriangulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtLado1Triangulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtLado2Triangulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtLado3Triangulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PnlCirculo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TxtRadioCirculo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        PnlCuadrilatero = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtLado1Cuadri = new javax.swing.JTextField();
        TxtLado2Cuadri = new javax.swing.JTextField();
        PnlCalculos = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        LblTipoCalculo = new javax.swing.JLabel();
        LblNombreFigura = new javax.swing.JLabel();
        LblValor = new javax.swing.JLabel();
        PnlPologono = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtNumLados = new javax.swing.JTextField();
        TxtLadoPoligono = new javax.swing.JTextField();
        MnuFiguras = new javax.swing.JMenuBar();
        MnuTriangulo = new javax.swing.JMenu();
        MnuItemAreaTriangulo = new javax.swing.JMenuItem();
        MnuItemPerimTriangulo = new javax.swing.JMenuItem();
        MnuItemTipoTriangulo = new javax.swing.JMenuItem();
        MnuCuadrilatero = new javax.swing.JMenu();
        MnuItemAreaCuadrilatrero = new javax.swing.JMenuItem();
        MnuItemPerimCuadrilatero = new javax.swing.JMenuItem();
        MnuCirculo = new javax.swing.JMenu();
        MnuItemAreaCirculo = new javax.swing.JMenuItem();
        MnuItemPerimCirculo = new javax.swing.JMenuItem();
        MnuPoligono = new javax.swing.JMenu();
        MnuItemAreaPoligono = new javax.swing.JMenuItem();
        MnuItemPerimPoligono = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTriangulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "TRIANGULO"));

        jLabel1.setText("LADO1:");

        jLabel2.setText("LADO2:");

        jLabel3.setText("LADO3:");

        jButton1.setText("RETORNAR");

        javax.swing.GroupLayout PnlTrianguloLayout = new javax.swing.GroupLayout(PnlTriangulo);
        PnlTriangulo.setLayout(PnlTrianguloLayout);
        PnlTrianguloLayout.setHorizontalGroup(
            PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTrianguloLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(TxtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTrianguloLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(TxtLado3Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTrianguloLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(TxtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTrianguloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        PnlTrianguloLayout.setVerticalGroup(
            PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtLado3Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PnlCirculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CIIRCULO"));

        jLabel6.setText("RADIO:");

        jButton3.setText("RETORNAR");

        javax.swing.GroupLayout PnlCirculoLayout = new javax.swing.GroupLayout(PnlCirculo);
        PnlCirculo.setLayout(PnlCirculoLayout);
        PnlCirculoLayout.setHorizontalGroup(
            PnlCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(63, 63, 63)
                .addComponent(TxtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCirculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(20, 20, 20))
        );
        PnlCirculoLayout.setVerticalGroup(
            PnlCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCirculoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PnlCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        PnlCuadrilatero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CUADRILATERO"));

        jButton2.setText("RETORNAR");

        jLabel4.setText("LADO1:");

        jLabel5.setText("LADO2:");

        javax.swing.GroupLayout PnlCuadrilateroLayout = new javax.swing.GroupLayout(PnlCuadrilatero);
        PnlCuadrilatero.setLayout(PnlCuadrilateroLayout);
        PnlCuadrilateroLayout.setHorizontalGroup(
            PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCuadrilateroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCuadrilateroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(PnlCuadrilateroLayout.createSequentialGroup()
                        .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtLado1Cuadri, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(TxtLado2Cuadri))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlCuadrilateroLayout.setVerticalGroup(
            PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCuadrilateroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtLado1Cuadri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtLado2Cuadri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        PnlCalculos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CALCULOS"));

        jButton5.setText("RETORNAR");

        LblTipoCalculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblNombreFigura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PnlCalculosLayout = new javax.swing.GroupLayout(PnlCalculos);
        PnlCalculos.setLayout(PnlCalculosLayout);
        PnlCalculosLayout.setHorizontalGroup(
            PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCalculosLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(LblNombreFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCalculosLayout.createSequentialGroup()
                .addGroup(PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlCalculosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(LblTipoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(LblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlCalculosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(22, 22, 22))
        );
        PnlCalculosLayout.setVerticalGroup(
            PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCalculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNombreFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCalculosLayout.createSequentialGroup()
                        .addComponent(LblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCalculosLayout.createSequentialGroup()
                        .addComponent(LblTipoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );

        PnlPologono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "POLIGONO"));

        jButton4.setText("RETORNAR");

        jLabel7.setText("NUM.LADOS:");

        jLabel8.setText("LADO:");

        javax.swing.GroupLayout PnlPologonoLayout = new javax.swing.GroupLayout(PnlPologono);
        PnlPologono.setLayout(PnlPologonoLayout);
        PnlPologonoLayout.setHorizontalGroup(
            PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPologonoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(27, 27, 27))
            .addGroup(PnlPologonoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(57, 57, 57)
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtLadoPoligono, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(TxtNumLados))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        PnlPologonoLayout.setVerticalGroup(
            PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPologonoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtNumLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPologonoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(PnlPologonoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(TxtLadoPoligono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        MnuFiguras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuFigurasMouseClicked(evt);
            }
        });

        MnuTriangulo.setText("Triangulo");
        MnuTriangulo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MnuTrianguloMenuSelected(evt);
            }
        });
        MnuTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuTrianguloActionPerformed(evt);
            }
        });

        MnuItemAreaTriangulo.setText("Area");
        MnuItemAreaTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuItemAreaTrianguloActionPerformed(evt);
            }
        });
        MnuTriangulo.add(MnuItemAreaTriangulo);

        MnuItemPerimTriangulo.setText("Perimetro");
        MnuTriangulo.add(MnuItemPerimTriangulo);

        MnuItemTipoTriangulo.setText("Tipo");
        MnuItemTipoTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuItemTipoTrianguloActionPerformed(evt);
            }
        });
        MnuTriangulo.add(MnuItemTipoTriangulo);

        MnuFiguras.add(MnuTriangulo);

        MnuCuadrilatero.setText("Cuadrilatero");
        MnuCuadrilatero.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MnuCuadrilateroMenuSelected(evt);
            }
        });

        MnuItemAreaCuadrilatrero.setText("Area");
        MnuCuadrilatero.add(MnuItemAreaCuadrilatrero);

        MnuItemPerimCuadrilatero.setText("Perimetro");
        MnuCuadrilatero.add(MnuItemPerimCuadrilatero);

        MnuFiguras.add(MnuCuadrilatero);

        MnuCirculo.setText("Circulo");
        MnuCirculo.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MnuCirculoMenuSelected(evt);
            }
        });

        MnuItemAreaCirculo.setText("Area");
        MnuCirculo.add(MnuItemAreaCirculo);

        MnuItemPerimCirculo.setText("Perimetro");
        MnuCirculo.add(MnuItemPerimCirculo);

        MnuFiguras.add(MnuCirculo);

        MnuPoligono.setText("Poligono");
        MnuPoligono.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MnuPoligonoMenuSelected(evt);
            }
        });

        MnuItemAreaPoligono.setText("Area");
        MnuPoligono.add(MnuItemAreaPoligono);

        MnuItemPerimPoligono.setText("Perimetro");
        MnuPoligono.add(MnuItemPerimPoligono);

        MnuFiguras.add(MnuPoligono);

        setJMenuBar(MnuFiguras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlCuadrilatero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlPologono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(PnlCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCuadrilatero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlPologono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addComponent(PnlCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(868, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuTrianguloActionPerformed
       //no
    }//GEN-LAST:event_MnuTrianguloActionPerformed

    private void MnuFigurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuFigurasMouseClicked
       //no
    }//GEN-LAST:event_MnuFigurasMouseClicked

    private void MnuTrianguloMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MnuTrianguloMenuSelected
        // TODO add your handling code here:
        PnlCuadrilatero.setVisible(false);
        PnlCirculo.setVisible(false);
        PnlPologono.setVisible(false);
        PnlCalculos.setVisible(false);
        PnlTriangulo.setVisible(true);

        
        
    }//GEN-LAST:event_MnuTrianguloMenuSelected

    private void MnuCuadrilateroMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MnuCuadrilateroMenuSelected
        // TODO add your handling code here:
        PnlTriangulo.setVisible(false);
        PnlCuadrilatero.setVisible(true);
                PnlCirculo.setVisible(false);
        PnlPologono.setVisible(false);
        PnlCalculos.setVisible(false);
    }//GEN-LAST:event_MnuCuadrilateroMenuSelected

    private void MnuCirculoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MnuCirculoMenuSelected
        // TODO add your handling code here:
        PnlTriangulo.setVisible(false);
        PnlCuadrilatero.setVisible(false);
        PnlCirculo.setVisible(true);
        PnlCuadrilatero.setVisible(false);
        PnlCalculos.setVisible(false);
    }//GEN-LAST:event_MnuCirculoMenuSelected

    private void MnuPoligonoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MnuPoligonoMenuSelected
        // TODO add your handling code here:
        PnlTriangulo.setVisible(false);
        PnlCuadrilatero.setVisible(false);
        PnlCirculo.setVisible(false);
        PnlCuadrilatero.setVisible(true);
        PnlCalculos.setVisible(false);
    }//GEN-LAST:event_MnuPoligonoMenuSelected

    private void MnuItemTipoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuItemTipoTrianguloActionPerformed
        // TODO add your handling code here:
        
        //lad1= Integer.parseInt(TxtLado1Triangulo);
        //lad2= Integer.parseInt(TxtLado2Triangulo);
        //lad3= Integer.parseInt(TxtLado3Triangulo);
        PnlTriangulo.setVisible(false);
        LblNombreFigura.setText("Triangulo");
        
    }//GEN-LAST:event_MnuItemTipoTrianguloActionPerformed

    private void MnuItemAreaTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuItemAreaTrianguloActionPerformed
        // TODO add your handling code here:
        
        //lad1= Integer.parseInt(TxtLado1Triangulo);
        //lad2= Integer.parseInt(TxtLado2Triangulo);
        //lad3= Integer.parseInt(TxtLado3Triangulo);
        PnlTriangulo.setVisible(false);
        PnlCalculos.setVisible(false);
        PnlTriangulo.setVisible(true);
//        MnuItemAreaTriangulo.setVisible(true);
//        MnuItemPerimTriangulo.setVisible(true);
//        MnuItemTipoTriangulo.setVisible(true);
        LblNombreFigura.setText("Triangulo");
        
    }//GEN-LAST:event_MnuItemAreaTrianguloActionPerformed

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
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblNombreFigura;
    private javax.swing.JLabel LblTipoCalculo;
    private javax.swing.JLabel LblValor;
    private javax.swing.JMenu MnuCirculo;
    private javax.swing.JMenu MnuCuadrilatero;
    private javax.swing.JMenuBar MnuFiguras;
    private javax.swing.JMenuItem MnuItemAreaCirculo;
    private javax.swing.JMenuItem MnuItemAreaCuadrilatrero;
    private javax.swing.JMenuItem MnuItemAreaPoligono;
    private javax.swing.JMenuItem MnuItemAreaTriangulo;
    private javax.swing.JMenuItem MnuItemPerimCirculo;
    private javax.swing.JMenuItem MnuItemPerimCuadrilatero;
    private javax.swing.JMenuItem MnuItemPerimPoligono;
    private javax.swing.JMenuItem MnuItemPerimTriangulo;
    private javax.swing.JMenuItem MnuItemTipoTriangulo;
    private javax.swing.JMenu MnuPoligono;
    private javax.swing.JMenu MnuTriangulo;
    private javax.swing.JPanel PnlCalculos;
    private javax.swing.JPanel PnlCirculo;
    private javax.swing.JPanel PnlCuadrilatero;
    private javax.swing.JPanel PnlPologono;
    private javax.swing.JPanel PnlTriangulo;
    private javax.swing.JTextField TxtLado1Cuadri;
    private javax.swing.JTextField TxtLado1Triangulo;
    private javax.swing.JTextField TxtLado2Cuadri;
    private javax.swing.JTextField TxtLado2Triangulo;
    private javax.swing.JTextField TxtLado3Triangulo;
    private javax.swing.JTextField TxtLadoPoligono;
    private javax.swing.JTextField TxtNumLados;
    private javax.swing.JTextField TxtRadioCirculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
