/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionecamposportivoasvalle.tta;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author valletta.enrico
 */
public class PrenotazioneCampo extends javax.swing.JFrame{ 
    public String Sport,Tipo,Data;
    public Date controllo;
    /**
     * Creates new form PenotazioneCalcio
     */
    public PrenotazioneCampo() {
        initComponents();
        setResizable(false);
    }
    public PrenotazioneCampo(String Sport, String Tipo) {
        this.Sport=Sport;
        this.Tipo=Tipo;
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        dateChooserPanel1 = new com.toedter.calendar.demo.DateChooserPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        txN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbn_Indietro = new javax.swing.JButton();
        jbn_Home = new javax.swing.JButton();
        b_Prenota = new javax.swing.JButton();
        c_data = new com.toedter.calendar.JDateChooser();
        box_orario = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DATA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PRENOTAZIONE");

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELEZIONA UN CAMPO", "Giardino Dei Pavoni - Lezzi , Sternatia 73010 (LE)", "Lecce CLUB , Muro Leccese 73036 (LE)", "Campi Benegiamo, Muro Leccese 73036 (LE)", "Campo Sportivo Botrugno, Botrugno 73020 (LE)", "Campetto Policarita, Maglie 73024 (LE)", "Palazzetto dello Sport, Scorrano 73020 (LE)", "L'ulivo Sporting Club. Cursi 73020 (LE) ", " ", " " }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        jLabel3.setText("CAMPI PRENOTABILI");

        jLabel4.setText("NOMINATIVO");

        jbn_Indietro.setText("INDIETRO");
        jbn_Indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_IndietroActionPerformed(evt);
            }
        });

        jbn_Home.setText("HOME");
        jbn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_HomeActionPerformed(evt);
            }
        });

        b_Prenota.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_Prenota.setText("PRENOTA");
        b_Prenota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_PrenotaActionPerformed(evt);
            }
        });

        box_orario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SCEGLI L'ORARIO", "15:00", "17:00", "19:00", "21:00" }));
        box_orario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_orarioActionPerformed(evt);
            }
        });

        jLabel5.setText("ORARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbn_Indietro)
                        .addGap(75, 75, 75)
                        .addComponent(b_Prenota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbn_Home))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_orario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(c_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_orario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_Indietro)
                    .addComponent(jbn_Home)
                    .addComponent(b_Prenota))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_IndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_IndietroActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Calcio", "Tennis", "Basket"};
        int choice = JOptionPane.showOptionDialog(
                null,                    
                "Scegli un'opzione:",    
                "Scelta",    
                JOptionPane.DEFAULT_OPTION,  
                JOptionPane.QUESTION_MESSAGE, 
                null,                    
                options,                 
                options[0]);
        if (choice==0){
            Sport="Calcio";
            Calcio a=new Calcio(Sport);
            a.setVisible(true);
            this.dispose();
        }
        if (choice==1){
            Sport="Tennis";
            Tennis a=new Tennis(Sport);
            a.setVisible(true);
            this.dispose();
        }
        if (choice==2){
            Sport="Basket";
            Basket a=new Basket(Sport);
            a.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbn_IndietroActionPerformed

    private void jbn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_HomeActionPerformed
        // TODO add your handling code here:
        Menù a= new Menù();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbn_HomeActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void b_PrenotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_PrenotaActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    try {
        Data = sdf.format(c_data.getDate());
        controllo= sdf.parse(Data);
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Inserisci tutte le informazioni", "Errore", JOptionPane.ERROR_MESSAGE);
        return; // Esci dal metodo se c_data è null
    }   catch (ParseException ex) {
            Logger.getLogger(PrenotazioneCampo.class.getName()).log(Level.SEVERE, null, ex);
        }

    String Orario = box_orario.getSelectedItem().toString();
    String Campo = combobox.getSelectedItem().toString();
    String Nominativo = txN.getText().toUpperCase();
    Date currentDate = new Date();
    if ("SCEGLI L'ORARIO".equals(Orario) || "SELEZIONA UN CAMPO".equals(Campo) || Nominativo.isEmpty() || controllo.before(currentDate)) {
        JOptionPane.showMessageDialog(null, "Controlla i valori inseriti", "Errore", JOptionPane.ERROR_MESSAGE);
        return; // Esci dal metodo se mancano informazioni
    }

    Prenotazione p = new Prenotazione(Sport, Campo, Tipo, Data, Orario, Nominativo);

    boolean check = false;
    if (ControllaFile()) {
        try (FileInputStream f = new FileInputStream("prenotazioni.dat");
             ObjectInputStream fIN = new ObjectInputStream(f)) {
            while (true) {
                try {
                    Prenotazione P1 = (Prenotazione) fIN.readObject();
                    if (p.Data.equals(P1.Data) && p.Ora.equals(P1.Ora)) {
                        check = true;
                        break;
                    }
                } catch (EOFException e) {
                    break;
                } catch (ClassNotFoundException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    if (check) {
        JOptionPane.showMessageDialog(null, "È già prenotato", "Errore", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            if (ControllaFile()) {
                try (FileOutputStream fs = new FileOutputStream("prenotazioni.dat", true);
                     AppendingStream fAPP = new AppendingStream(fs)) {
                    fAPP.writeObject(p);
                }
            } else {
                try (FileOutputStream fs = new FileOutputStream("prenotazioni.dat", true);
                     ObjectOutputStream fOUT = new ObjectOutputStream(fs)) {
                    fOUT.writeObject(p);
                }
            }
            JOptionPane.showMessageDialog(null, "Prenotazione eseguita", "Info", JOptionPane.INFORMATION_MESSAGE);
            Menù a=new Menù();
            a.setVisible(true);
            this.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_b_PrenotaActionPerformed
    
    private void box_orarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_orarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_orarioActionPerformed

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
            java.util.logging.Logger.getLogger(PrenotazioneCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrenotazioneCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrenotazioneCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrenotazioneCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrenotazioneCampo().setVisible(true);
            }
        });
    }
    
    private static boolean ControllaFile() {
        boolean caricato = false;
        File f = new File("prenotazioni.dat");
        if (f.exists()) {
            caricato = true;
        }
        return caricato;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Prenota;
    private javax.swing.JComboBox<String> box_orario;
    private com.toedter.calendar.JDateChooser c_data;
    private javax.swing.JComboBox<String> combobox;
    private com.toedter.calendar.demo.DateChooserPanel dateChooserPanel1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbn_Home;
    private javax.swing.JButton jbn_Indietro;
    private javax.swing.JTextField txN;
    // End of variables declaration//GEN-END:variables
}
