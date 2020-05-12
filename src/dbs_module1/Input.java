/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbs_module1;
import java.util.*;
import java.awt.Color;
/**
 *
 * @author StylishDheeru
 */
public class Input extends javax.swing.JFrame {

    /**
     * Creates new form Input
     */
    public Input() {
        initComponents();
        ckeylbl.setForeground(new Color(51,51,51));
        nflbl.setForeground(new Color(51,51,51));
        declbl.setForeground(new Color(51,51,51));
        ansarea.setBackground(new Color(51,51,51));
        //ansarea.setVisible(false);
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        total_jtxtfld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inp_jtxtfld = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        ckeylbl = new javax.swing.JLabel();
        nflbl = new javax.swing.JLabel();
        outckey = new javax.swing.JLabel();
        outnf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ansarea = new javax.swing.JTextArea();
        declbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.darkGray);

        panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("All Attributes");

        total_jtxtfld.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        total_jtxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_jtxtfldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Functional Dependencies");

        inp_jtxtfld.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Footlight MT Light", 0, 12)); // NOI18N
        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Footlight MT Light", 0, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        ckeylbl.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        ckeylbl.setForeground(new java.awt.Color(255, 255, 255));
        ckeylbl.setText("Ckey");

        nflbl.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        nflbl.setForeground(new java.awt.Color(255, 255, 255));
        nflbl.setText("Normal Form");

        outckey.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        outckey.setForeground(new java.awt.Color(255, 255, 255));

        outnf.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        outnf.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);

        ansarea.setEditable(false);
        ansarea.setBackground(new java.awt.Color(51, 51, 51));
        ansarea.setColumns(20);
        ansarea.setForeground(new java.awt.Color(255, 255, 255));
        ansarea.setLineWrap(true);
        ansarea.setRows(5);
        ansarea.setWrapStyleWord(true);
        ansarea.setBorder(null);
        jScrollPane1.setViewportView(ansarea);

        declbl.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        declbl.setForeground(new java.awt.Color(255, 255, 255));
        declbl.setText("Decomposed Relations");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Table Normalization Tool");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inp_jtxtfld)
                            .addComponent(total_jtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckeylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nflbl)
                    .addComponent(declbl))
                .addGap(47, 47, 47)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outnf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outckey, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(outckey, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outnf, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(ckeylbl)
                                .addGap(18, 18, 18)
                                .addComponent(nflbl)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(declbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(total_jtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inp_jtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(clear))))
                .addGap(70, 70, 70))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void total_jtxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_jtxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_jtxtfldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String total = total_jtxtfld.getText();       
        total_jtxtfld.setText("");
      
        Decomp d = new Decomp();
        d.total_array = total.split(",");
        String inp = inp_jtxtfld.getText();
    
        inp_jtxtfld.setText("");
        Decomp.attributes = total;
        Decomp.fd = inp;
        
//        StringTokenizer str = new StringTokenizer(inp,",");
//        while(str.hasMoreTokens()){
//            StringTokenizer fds = new StringTokenizer(str.nextToken(),"->");
//            while(fds.hasMoreTokens()){
//              String leftside = fds.nextToken();
//              String rightside = fds.nextToken();
//              if(leftside.equals(rightside) == false){
//                 d.left.add(leftside);
//                 d.right.add(rightside);
//              }
//                
//            }
//        }

        Decomp.deco(d.left,d.right,d.total_array);
        
        //ansarea.setVisible(true);
        ckeylbl.setForeground(new Color(255,255,255));
        if(!Decomp.dec.equals("")) {
            declbl.setForeground(new Color(255,255,255));
        } 
        nflbl.setForeground(new Color(255,255,255));
        ansarea.setForeground(new Color(255,255,255));
        outnf.setText(Decomp.Norm);
        outckey.setText(Decomp.C_KEY);
        System.out.println(Decomp.dec);
        ansarea.setText(Decomp.dec);
        
        
//        try{
//            Decomp.deco();
//        }   catch(Exception e){
//            System.out.println("error in calling deco method");     
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        inp_jtxtfld.setText("");
        total_jtxtfld.setText("");
        ckeylbl.setForeground(new Color(51,51,51));
       nflbl.setForeground(new Color(51,51,51));
        declbl.setForeground(new Color(51,51,51));
        ansarea.setBackground(new Color(51,51,51));
        ansarea.setText("");
        outckey.setText("");
        ansarea.setText("");
        //ansarea.setVisible(false);
        outnf.setText("");
        
        
        
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ansarea;
    private javax.swing.JLabel ckeylbl;
    private javax.swing.JButton clear;
    private javax.swing.JLabel declbl;
    private javax.swing.JTextField inp_jtxtfld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nflbl;
    private javax.swing.JLabel outckey;
    private javax.swing.JLabel outnf;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField total_jtxtfld;
    // End of variables declaration//GEN-END:variables
}