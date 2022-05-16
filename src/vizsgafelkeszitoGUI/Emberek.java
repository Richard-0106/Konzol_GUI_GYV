package vizsgafelkeszitoGUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Emberek extends javax.swing.JFrame {

    public Emberek() throws FileNotFoundException {
        initComponents();
        beolvas();
        comboBoxFeltoltes();

//        legidosebb();
//        osszeskor();
//        hatevedolgozo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboLanyok = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboFiuk = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jfiu = new javax.swing.JRadioButton();
        jlany = new javax.swing.JRadioButton();
        jLabelLegidosebb = new javax.swing.JLabel();
        jLabelOsszesKor = new javax.swing.JLabel();
        jLabelHatEveDolgozo = new javax.swing.JLabel();
        jLabellegidosebb = new javax.swing.JLabel();
        jLabelosszeskor = new javax.swing.JLabel();
        jLabelhatevedolgozo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelKor = new javax.swing.JLabel();
        jLabelMiotaDolgozik = new javax.swing.JLabel();
        jkor = new javax.swing.JLabel();
        jmiotadolgozik = new javax.swing.JLabel();
        jCheckBoxMindKetto = new javax.swing.JCheckBox();
        jButtonMent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lányok:");

        jComboLanyok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Válassz egy lányt!" }));
        jComboLanyok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLanyokActionPerformed(evt);
            }
        });

        jLabel2.setText("fiúk:");

        jComboFiuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Válassz egy fiút!" }));
        jComboFiuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFiukActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Összesítő"));

        buttonGroup1.add(jfiu);
        jfiu.setText("fiú");
        jfiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfiuActionPerformed(evt);
            }
        });

        buttonGroup1.add(jlany);
        jlany.setText("lány");
        jlany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlanyActionPerformed(evt);
            }
        });

        jLabelLegidosebb.setText("legidősebb:");

        jLabelOsszesKor.setText("összes kor:");

        jLabelHatEveDolgozo.setText("6 éve dolgozó:");

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
                                .addComponent(jLabelLegidosebb)
                                .addGap(18, 18, 18)
                                .addComponent(jLabellegidosebb))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelOsszesKor)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelosszeskor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelHatEveDolgozo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelhatevedolgozo)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jfiu)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlany)
                    .addComponent(jfiu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLegidosebb)
                    .addComponent(jLabellegidosebb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOsszesKor)
                    .addComponent(jLabelosszeskor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHatEveDolgozo)
                    .addComponent(jLabelhatevedolgozo))
                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Adatok"));

        jLabelKor.setText("kor:");

        jLabelMiotaDolgozik.setText("mióta dolgozik:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelKor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jkor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelMiotaDolgozik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jmiotadolgozik)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKor)
                    .addComponent(jkor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMiotaDolgozik)
                    .addComponent(jmiotadolgozik))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jCheckBoxMindKetto.setText("mind kettő nem");
        jCheckBoxMindKetto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMindKettoActionPerformed(evt);
            }
        });

        jButtonMent.setText("Ment");
        jButtonMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboLanyok, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboFiuk, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxMindKetto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboLanyok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboFiuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxMindKetto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMent))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int kor = 0;
    int miotaDolgozik = 0;
    String[][] emberek;
    String[][] fiuk;
    String[][] lanyok;

    private void beolvas() throws FileNotFoundException {
        File file = new File("emberek.txt");

        ArrayList<String> lista = new ArrayList<>();

        Scanner sc = new Scanner(file, "UTF8");

        while (sc.hasNext()) {

            String line = sc.nextLine();

//            System.out.println(line);
            lista.add(line);
        }

        lista.remove(lista.get(0));
//        System.out.println(lista);
        emberek = new String[lista.size()][4];
        fiuk = new String[lista.size()][4];
        lanyok = new String[lista.size()][4];
        int fiuszamlalo = 0;
        int lanyszamlalo = 0;
        for (int i = 0; i < lista.size(); i++) {
            String ember = lista.get(i);
            String[] e = ember.split(";");
            emberek[i] = e;
            //e tömb amiben vannak adott embernek az adatai
            if ("F".equals(e[2])) {
                fiuk[fiuszamlalo] = e;
                fiuszamlalo++;
                System.out.println(e);
            } else {
                lanyok[lanyszamlalo] = e;
                lanyszamlalo++;
            }
        }

    }

    private void comboBoxFeltoltes() {

        for (int i = 0; i < emberek.length; i++) {
            if ("F".equals(emberek[i][2])) {
                jComboFiuk.addItem(emberek[i][0]);
            } else {
                jComboLanyok.addItem(emberek[i][0]);
            }
        }

    }

    public int legidosebb(String nem) {
        int max = 0;
        for (int i = 0; i < emberek.length; i++) {
            if (emberek[i][2].equals(nem)) {
                if (Integer.parseInt(emberek[i][1]) > max) {
                    max = Integer.parseInt(emberek[i][1]);
                }
            }
        }
        return max;
    }

    public int osszeskor(String nem) {
        int osszes = 0;

        for (int i = 0; i < emberek.length; i++) {
            if (emberek[i][2].equals(nem)) {
                osszes += Integer.parseInt(emberek[i][1]);
            }
        }
        return osszes;

    }

    public void kiiras() throws IOException {
        String txt = "";
        if (jCheckBoxMindKetto.isSelected()) {
            txt += "Lányok:\n";
            txt += jLabelLegidosebb.getText() + legidosebb("L") + "\n";
            txt += jLabelOsszesKor.getText() + osszeskor("L") + "\n";;
            txt += jLabelHatEveDolgozo.getText() + hatevedolgozo("L") + "\n";
            
            txt += "Fiúk:\n";
            txt += jLabelLegidosebb.getText() + legidosebb("F") + "\n";
            txt += jLabelOsszesKor.getText() + osszeskor("F") + "\n";;
            txt += jLabelHatEveDolgozo.getText() + hatevedolgozo("F") + "\n";
        } else {
            txt += jLabelLegidosebb.getText() + jLabellegidosebb.getText() + "\n";
            txt += jLabelOsszesKor.getText() + jLabelosszeskor.getText() + "\n";;
            txt += jLabelHatEveDolgozo.getText() + jLabelhatevedolgozo.getText() + "\n";
        }

        BufferedWriter out = new BufferedWriter(new FileWriter("dolgozok.txt"));
        try {

            out.write(txt);  //Replace with the string 
            //you are trying to write
        } catch (IOException e) {
            System.out.println("Exception ");

        } finally {
            out.close();
        }
    }

    public String hatevedolgozo(String nem) {
        String nev = "";
        for (int i = 0; i < emberek.length; i++) {
            if (emberek[i][2].equals(nem)) {
                if (emberek[i].length > 3 && Integer.parseInt(emberek[i][3]) >= 6) {
                    nev += emberek[i][0];
                }
            }
        }
        if (nev == "") {

            return "nincs";
        } else {

            return nev;
        }
    }

    public void radiogomb() {
        int legidosebb = 0;
        int osszeskor = 0;
        String hatEveDolgozo = "";
        if (jlany.isSelected()) {
            legidosebb = legidosebb("L");

            osszeskor = osszeskor("L");
            hatEveDolgozo = hatevedolgozo("L");
        } else if (jfiu.isSelected()) {
            legidosebb = legidosebb("F");

            osszeskor = osszeskor("F");
            hatEveDolgozo = hatevedolgozo("F");
        }

        jLabelhatevedolgozo.setText(hatEveDolgozo);
        jLabellegidosebb.setText(legidosebb + " éves");
        jLabelosszeskor.setText(osszeskor + " éves");
    }
    private void jfiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfiuActionPerformed
        radiogomb();
    }//GEN-LAST:event_jfiuActionPerformed

    private void jlanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlanyActionPerformed
        radiogomb();
    }//GEN-LAST:event_jlanyActionPerformed

    private void jCheckBoxMindKettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMindKettoActionPerformed

    }//GEN-LAST:event_jCheckBoxMindKettoActionPerformed

    private void jButtonMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMentActionPerformed
        try {
            kiiras();
        } catch (IOException ex) {
            Logger.getLogger(Emberek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonMentActionPerformed

    private void jComboLanyokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLanyokActionPerformed
        if (jComboLanyok.getSelectedIndex() > 0) {
            if (lanyok[jComboLanyok.getSelectedIndex() - 1].length < 4) {
                jmiotadolgozik.setText("0");
            } else {
                jmiotadolgozik.setText(lanyok[jComboLanyok.getSelectedIndex() - 1][3]);
            }
            jkor.setText(lanyok[jComboLanyok.getSelectedIndex() - 1][1]);// mivel válassz egy ...a 0.index petra meg az 1.
        }
    }//GEN-LAST:event_jComboLanyokActionPerformed

    private void jComboFiukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFiukActionPerformed
        if (jComboFiuk.getSelectedIndex() > 0) {
            if (fiuk[jComboFiuk.getSelectedIndex() - 1].length < 4) {
                jmiotadolgozik.setText("0");
            } else {

                jmiotadolgozik.setText(fiuk[jComboFiuk.getSelectedIndex() - 1][3]);
            }
            jkor.setText(fiuk[jComboFiuk.getSelectedIndex() - 1][1]);
            System.out.println();
        }

    }//GEN-LAST:event_jComboFiukActionPerformed

    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new Emberek().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Emberek.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonMent;
    private javax.swing.JCheckBox jCheckBoxMindKetto;
    private javax.swing.JComboBox<String> jComboFiuk;
    private javax.swing.JComboBox<String> jComboLanyok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHatEveDolgozo;
    private javax.swing.JLabel jLabelKor;
    private javax.swing.JLabel jLabelLegidosebb;
    private javax.swing.JLabel jLabelMiotaDolgozik;
    private javax.swing.JLabel jLabelOsszesKor;
    private javax.swing.JLabel jLabelhatevedolgozo;
    private javax.swing.JLabel jLabellegidosebb;
    private javax.swing.JLabel jLabelosszeskor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jfiu;
    private javax.swing.JLabel jkor;
    private javax.swing.JRadioButton jlany;
    private javax.swing.JLabel jmiotadolgozik;
    // End of variables declaration//GEN-END:variables
   
}
