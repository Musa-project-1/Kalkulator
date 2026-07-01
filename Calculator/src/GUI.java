
public class GUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    double angkaPertama = 0;
    String operator = "";
    boolean operatorDiklik = false;
    
    public GUI() {
        initComponents();
    }

    
    private void initComponents() {

        display = new javax.swing.JTextField();
        btnC = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        btnSama = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        labelRiwayat = new javax.swing.JLabel();
        btnGantiTanda = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setPreferredSize(new java.awt.Dimension(385, 420));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setEditable(false);
        display.setFocusable(false);
        display.setBackground(new java.awt.Color(225, 230, 242));
        display.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        // display.addActionListener(this::displayActionPerformed);
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 360, 50));

        btnC.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(this::btnCActionPerformed);
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 85, 50));

        btnBagi.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnBagi.setText("÷");
        btnBagi.addActionListener(this::btnBagiActionPerformed);
        getContentPane().add(btnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 80, 90, 50));

        btn7.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(this::btn7ActionPerformed);
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 135, 85, 50));

        btn8.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(this::btn8ActionPerformed);
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 135, 85, 50));

        btn9.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(this::btn9ActionPerformed);
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 135, 85, 50));

        btnKali.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnKali.setText("X");
        btnKali.addActionListener(this::btnKaliActionPerformed);
        getContentPane().add(btnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 135, 90, 50));

        btn4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(this::btn4ActionPerformed);
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 190, 85, 50));

        btn5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(this::btn5ActionPerformed);
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 190, 85, 50));

        btn6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(this::btn6ActionPerformed);
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 190, 85, 50));

        btnKurang.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(this::btnKurangActionPerformed);
        getContentPane().add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 190, 90, 50));

        btn1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(this::btn1ActionPerformed);
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 245, 85, 50));

        btn2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(this::btn2ActionPerformed);
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 245, 85, 50));

        btn3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(this::btn3ActionPerformed);
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 245, 85, 50));

        btnTambah.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(this::btnTambahActionPerformed);
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 245, 90, 50));

        btn0.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(this::btn0ActionPerformed);
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 300, 85, 50));

        btnTitik.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnTitik.setText(".");
        btnTitik.addActionListener(this::btnTitikActionPerformed);
        getContentPane().add(btnTitik, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 300, 85, 50));

        btnSama.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnSama.setText("=");
        btnSama.addActionListener(this::btnSamaActionPerformed);
        getContentPane().add(btnSama, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 300, 90, 50));

        btnBackspace.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnBackspace.setText("<<");
        btnBackspace.addActionListener(this::btnBackspaceActionPerformed);
        getContentPane().add(btnBackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 80, 85, 50));

        labelRiwayat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelRiwayat.setForeground(new java.awt.Color(100, 100, 100));
        labelRiwayat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 360, 18));

        btnGantiTanda.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnGantiTanda.setText("+/-");
        btnGantiTanda.addActionListener(this::btnGantiTandaActionPerformed);
        getContentPane().add(btnGantiTanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 300, 85, 50));

        btnPersen.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnPersen.setText("%");
        btnPersen.addActionListener(this::btnPersenActionPerformed);
        getContentPane().add(btnPersen, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 80, 85, 50));

        pack();
    }// </editor-fold>                        

    private double getAngka() {
        String teks = display.getText();
        if (teks.contains("Error")) return 0;
        if (teks.contains("%")) {
            return Double.parseDouble(teks.replace("%", "")) / 100;
        } else {
            return Double.parseDouble(teks);
        }
    }
    
    private boolean resetIfError() {
        if (display.getText().contains("Error")) {
            display.setText("0");
            labelRiwayat.setText("");
            operator = "";
            operatorDiklik = false;
            return true;
        }
        return false;
    }

    private void inputAngka(String angka) {
        resetIfError();
        if (operatorDiklik || display.getText().equals("0")) {
            display.setText(angka);
            operatorDiklik = false;
        } else {
            if (display.getText().length() < 12) {
                display.setText(display.getText() + angka);
            }
        }
    }

    private void inputOperator(String op) {
        if (resetIfError() ) return;
        if (!operatorDiklik) {
            angkaPertama = getAngka();
        } 
        operator = op;
        operatorDiklik = true;
        labelRiwayat.setText(display.getText() + " " + op + " ");
    }
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("1");}

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("2");}

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("3");}

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("4");}

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("5");}

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("6");}

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("7");}

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("8");}

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("9");}

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) { inputAngka("0");}

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) { inputOperator("+");}
    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) { inputOperator("-");}
    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) { inputOperator("X");}
    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) { inputOperator("÷");}
    
    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {
        if (resetIfError()) return;
        if (operatorDiklik) { 
            display.setText("0.");
            operatorDiklik = false;
        } else {
            display.setText(display.getText() + ".");
        }
    }

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText("0");
        angkaPertama = 0;
        operator = "";
        operatorDiklik = false;
        labelRiwayat.setText("");
    }

    private void btnSamaActionPerformed(java.awt.event.ActionEvent evt) {
        if (resetIfError()) return;
        String teks = display.getText();
        if (operator.equals("")) {
            if (teks.equals("%")) {
                display.setText(String.valueOf(getAngka()));
                labelRiwayat.setText(teks + " =");
            }
            return;
        }
        double angkaKedua = getAngka();
        String hasil = Kalkulator.hitung(operator, angkaPertama, angkaKedua);
        display.setText(hasil);
        operator = "";
        if (hasil.contains("Error")) {
            labelRiwayat.setText("");
            operatorDiklik = false;
            return;
        }
        labelRiwayat.setText(labelRiwayat.getText() + teks + " =");
        angkaPertama = Double.parseDouble(hasil);
        operatorDiklik = true;
    }

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {
        if (resetIfError()) return;
        String teks = display.getText();
        if (teks.length() > 1) {
            display.setText(teks.substring(0, teks.length() - 1));
        } else {
            display.setText("0");
        }
    }

    private void btnGantiTandaActionPerformed(java.awt.event.ActionEvent evt) {
        if (resetIfError()) return;
        boolean adaPersen = display.getText().contains("%");
        double angka = Double.parseDouble(display.getText().replace("%", "")) * -1;
        String hasilFormat = (angka == (long) angka ? String.valueOf((long) angka) : String.valueOf(angka));
        display.setText(hasilFormat + (adaPersen ? "%" : ""));
    }

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {
        if (resetIfError()) return;
        String teks = display.getText();
        if (!teks.contains("%")) {
            display.setText(teks + "%");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnGantiTanda;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnSama;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTitik;
    private javax.swing.JTextField display;
    private javax.swing.JLabel labelRiwayat;
    // End of variables declaration//GEN-END:variables
}
