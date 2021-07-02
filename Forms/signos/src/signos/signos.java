package signos;

public class signos extends javax.swing.JFrame {

    private int Dia, Mes, Ano, IdadeA, IdadeD, IdadeM, Total;
    String Signo, Estacao;

    public signos() {
        initComponents();
        jPanel1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lbl1 = new javax.swing.JLabel();
        Lbl2 = new javax.swing.JLabel();
        Lbl3 = new javax.swing.JLabel();
        Lbl4 = new javax.swing.JLabel();
        Lbl5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Txt1 = new javax.swing.JTextField();
        Txt2 = new javax.swing.JTextField();
        Txt3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl1.setToolTipText("");
        Lbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl3.setBackground(new java.awt.Color(255, 255, 255));
        Lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Signo");

        jLabel6.setText("Dias");

        jLabel7.setText("Mêses");

        jLabel8.setText("Anos");

        jLabel9.setText("Estação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(14, 14, 14)
                            .addComponent(Lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(Lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(Lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Informe a data de seu nascimento");

        Txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Dia");

        jLabel3.setText("Mês");

        jLabel4.setText("Ano");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFechar)
                                    .addComponent(Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCalcular)))))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnCalcular)
                    .addComponent(btnFechar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void entradaDados() {
        Dia = Integer.parseInt(Txt1.getText());
        Mes = Integer.parseInt(Txt2.getText());
        Ano = Integer.parseInt(Txt3.getText());
    }
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        entradaDados();
        if (Mes == 1) {
            if (Dia >= 21) {
                Signo = "Aquário";
                Estacao = "Verão";
            } else {
                Signo = "Capricórnio";
                Estacao = "Verão";
            }
        }
        if (Mes == 2) {
            if (Dia >= 21) {
                Signo = "Peixes";
                Estacao = "Verão";
            } else {
                Signo = "Aquário";
                Estacao = "Verão";
            }
        }
        if (Mes == 3) {
            if (Dia >= 21) {
                Signo = "Áries";
                Estacao = "Outono";
            } else {
                Signo = "Peixes";
                Estacao = "Verão";
            }
        }
        if (Mes == 4) {
            if (Dia >= 21) {
                Signo = "Touro";
                Estacao = "Outono";
            } else {
                Signo = "Áries";
                Estacao = "Outono";
            }
        }
        if (Mes == 5) {
            if (Dia >= 21) {
                Signo = "Gêmeos";
                Estacao = "Outono";
            } else {
                Signo = "Touro";
                Estacao = "Outono";
            }
        }
        if (Mes == 6) {
            if (Dia >= 21) {
                Signo = "Câncer";
                Estacao = "Inverno";
            } else {
                Signo = "Gêmeos";
                Estacao = "Outono";
            }
        }
        if (Mes == 7) {
            if (Dia >= 21) {
                Signo = "Leão";
                Estacao = "Inverno";
            } else {
                Signo = "Câncer";
                Estacao = "Inverno";
            }
        }
        if (Mes == 8) {
            if (Dia >= 21) {
                Signo = "Virgem";
                Estacao = "Inverno";
            } else {
                Signo = "Leão";
                Estacao = "Inverno";
            }
        }
        if (Mes == 9) {
            if (Dia >= 21) {
                Signo = "Libra";
                Estacao = "Primavera";
            } else {
                Signo = "Virgem";
                Estacao = "Inverno";
            }
        }

        if (Mes == 10) {
            if (Dia >= 21) {
                Signo = "Escorpião";
                Estacao = "Primavera";
            } else {
                Signo = "Libra";
                Estacao = "Primavera";
            }
        }
        if (Mes == 11) {
            if (Dia >= 21) {
                Signo = "Sagitário";
                Estacao = "Primavera";
            } else {
                Signo = "Escorpião";
                Estacao = "Primavera";
            }
        }
        if (Mes == 12) {
            if (Dia >= 21) {
                Estacao = "Verão";
                Signo = "Capricórnio";
            } else {
                Signo = "Sagitário";
                Estacao = "Primavera";
            }
        }
        if (Mes == 1) {
            IdadeM = 8;
            IdadeD = 240 + 27 - Dia;
        }
        if (Mes == 2) {
            IdadeM = 7;
            IdadeD = 210 + 27 - Dia;
        }
        if (Mes == 3) {
            IdadeM = 6;
            IdadeD = 180 + 27 - Dia;
        }
        if (Mes == 4) {
            IdadeM = 5;
            IdadeD = 150 + 27 - Dia;
        }
        if (Mes == 5) {
            IdadeM = 4;
            IdadeD = 120 + 27 - Dia;
        }
        if (Mes == 6) {
            IdadeM = 3;
            IdadeD = 90 + 27 - Dia;
        }
        if (Mes == 7) {
            IdadeM = 2;
            IdadeD = 60 + 27 - Dia;
        }
        if (Mes == 8) {
            IdadeM = 1;
            IdadeD = 30 + 27 - Dia;
        }
        if ((Mes == 9) && (Dia <= 27)) {
            IdadeM = 0;
            IdadeD = 27 - Dia;
        }
        if ((Mes == 9) && (Dia > 27)) {
            IdadeM = 14;
            IdadeD = 420 + 27 - Dia;
        }
        if (Mes == 10) {
            IdadeM = 13;
            IdadeD = 390 + 27 - Dia;
        }
        if (Mes == 11) {
            IdadeM = 12;
            IdadeD = 360 + 27 - Dia;
        }
        if (Mes == 12) {
            IdadeM = 11;
            IdadeD = 330 + 27 - Dia;
        }

        IdadeA = 2021 - Ano;
        Lbl1.setText(String.valueOf(Signo));
        Lbl2.setText(String.valueOf(IdadeD));
        Lbl3.setText(String.valueOf(IdadeM));
        Lbl4.setText(String.valueOf(IdadeA));
        Lbl5.setText(String.valueOf(Estacao));
        jPanel1.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Txt1.setText(null);
        Txt2.setText(null);
        Txt3.setText(null);
        Lbl1.setText(null);
        Lbl2.setText(null);
        Lbl3.setText(null);
        Lbl4.setText(null);
        Lbl5.setText(null);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(signos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel Lbl2;
    private javax.swing.JLabel Lbl3;
    private javax.swing.JLabel Lbl4;
    private javax.swing.JLabel Lbl5;
    private javax.swing.JTextField Txt1;
    private javax.swing.JTextField Txt2;
    private javax.swing.JTextField Txt3;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
