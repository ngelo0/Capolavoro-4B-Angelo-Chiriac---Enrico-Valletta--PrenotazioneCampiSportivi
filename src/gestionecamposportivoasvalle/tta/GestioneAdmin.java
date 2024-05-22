/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionecamposportivoasvalle.tta;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author valletta.enrico
 */
public class GestioneAdmin extends javax.swing.JFrame {
    public String Data;
    private static ArrayList elenco= new ArrayList(1);
    /**
     * Creates new form GestioneAdmin
     */
    public GestioneAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbn_Cancella = new javax.swing.JButton();
        jbn_Home = new javax.swing.JButton();
        jbn_Esci = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        c_data = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("GESTIONE ADMIN");

        jbn_Cancella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionecamposportivoasvalle/tta/danger.png"))); // NOI18N
        jbn_Cancella.setText("CANCELLA PRENOTAZIONE");
        jbn_Cancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_CancellaActionPerformed(evt);
            }
        });

        jbn_Home.setText("UTENTE");
        jbn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_HomeActionPerformed(evt);
            }
        });

        jbn_Esci.setText("ESCI");
        jbn_Esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_EsciActionPerformed(evt);
            }
        });

        jLabel2.setText("DATA PER VISUALIZZARE PRENOTAZIONI");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("VISUALIZZA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbn_Cancella)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbn_Home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbn_Esci))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1)
                        .addGap(25, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(c_data, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(c_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbn_Cancella)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_Home)
                    .addComponent(jbn_Esci))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_HomeActionPerformed
        // TODO add your handling code here:
        Menù a= new Menù();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbn_HomeActionPerformed

    private void jbn_EsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_EsciActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbn_EsciActionPerformed

    private void jbn_CancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_CancellaActionPerformed
        // TODO add your handling code here:
        Cancellazione a=new Cancellazione();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbn_CancellaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
            try {
        Data = sdf.format(c_data.getDate());
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Inserisci tutte le informazioni", "Errore", JOptionPane.ERROR_MESSAGE);
        return; // Esci dal metodo se c_data è null
    }
            FileInputStream f=new FileInputStream("prenotazioni.dat");
            ObjectInputStream fIN=new ObjectInputStream(f);
            
            boolean check=false;
            while(true){
                try{
                    Prenotazione p= (Prenotazione) fIN.readObject();     
                    if(p.Data.equals(Data)){
                        elenco.add(p);
                        check=true;
                    }
                }
                catch(EOFException e){
                    //si interrompe il ciclo 
                    break;
         }      catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
            f.close();
            if(check==true){
                Visualizzazione a= new Visualizzazione(elenco);
                a.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Non c'è nessuna prenotazione per questa data", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestioneAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestioneAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestioneAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestioneAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestioneAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser c_data;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbn_Cancella;
    private javax.swing.JButton jbn_Esci;
    private javax.swing.JButton jbn_Home;
    // End of variables declaration//GEN-END:variables
}
