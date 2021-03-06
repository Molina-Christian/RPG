/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Frames;

import javax.swing.JFrame;
import rpg.Controllers.Battle;
import rpg.Controllers.Party;
import rpg.Models.Mob;
import rpg.Models.Player;

/**
 *
 * @author Christian
 */
public class Battles extends javax.swing.JFrame {
    private final Battle control = new Battle(this);
    private static Result result;
    private static final Party party = new Party();
    private static javax.swing.JFrame previous;
    public Player fighter;
    public Mob foe;

    private void updateAll() {
        hp.setText(this.convertNumber(fighter.getHP()));
        mp.setText(this.convertNumber(fighter.getMP()));
        if (fighter.getHP() <= 0) {
            result.win(false);
            result.setVisible(true);
            this.setVisible(false);
        } else if (foe.getHP() <= 0) {
            result.win(true);
            result.setVisible(true);
            this.setVisible(false);
        }
    }
    private String convertNumber(int number) {
        return "" + number;
    }
    public void initiate() {
        foe = party.buildEncounter();
        fighter = AkashicTrials.hero;
        name.setText(fighter.getNick());
        hpMax.setText(this.convertNumber(fighter.getMaxHP()));
        mpMax.setText(this.convertNumber(fighter.getMaxMP()));
        hp.setText(this.convertNumber(fighter.getHP()));
        mp.setText(this.convertNumber(fighter.getMP()));
        control.playerDefend = false;
        control.mobDefend = false;
    }
    
    /**
     * Creates new form Battles
     */
    public Battles() {
        this.setLocation(350, 200);
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

        frameHolder = new javax.swing.JPanel();
        gfxFrame = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        img = new javax.swing.JTextPane();
        inputFrame = new javax.swing.JPanel();
        itemButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        attackButton = new javax.swing.JButton();
        magicButton = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        hpMax = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        mpMax = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        displayFrame = new javax.swing.JPanel();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gfxFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(img);

        javax.swing.GroupLayout gfxFrameLayout = new javax.swing.GroupLayout(gfxFrame);
        gfxFrame.setLayout(gfxFrameLayout);
        gfxFrameLayout.setHorizontalGroup(
            gfxFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        gfxFrameLayout.setVerticalGroup(
            gfxFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        inputFrame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        itemButton.setText("Item");
        itemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButtonActionPerformed(evt);
            }
        });

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        magicButton.setText("Magic");
        magicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magicButtonActionPerformed(evt);
            }
        });

        name.setText("jLabel1");

        hpMax.setText("jLabel1");

        jLabel2.setText("/");

        hp.setText("jLabel3");

        mpMax.setText("jLabel4");

        jLabel5.setText("/");

        mp.setText("jLabel6");

        jLabel7.setText("HP:");

        jLabel8.setText("MP:");

        javax.swing.GroupLayout inputFrameLayout = new javax.swing.GroupLayout(inputFrame);
        inputFrame.setLayout(inputFrameLayout);
        inputFrameLayout.setHorizontalGroup(
            inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputFrameLayout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(hp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hpMax))
                    .addGroup(inputFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(mp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mpMax)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inputFrameLayout.createSequentialGroup()
                        .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inputFrameLayout.createSequentialGroup()
                        .addComponent(magicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        inputFrameLayout.setVerticalGroup(
            inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemButton)
                    .addComponent(attackButton)
                    .addComponent(name)
                    .addComponent(hpMax)
                    .addComponent(jLabel2)
                    .addComponent(hp)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(runButton)
                        .addComponent(magicButton))
                    .addGroup(inputFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mpMax)
                        .addComponent(jLabel5)
                        .addComponent(mp)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayFrame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout displayFrameLayout = new javax.swing.GroupLayout(displayFrame);
        displayFrame.setLayout(displayFrameLayout);
        displayFrameLayout.setHorizontalGroup(
            displayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display)
                .addContainerGap())
        );
        displayFrameLayout.setVerticalGroup(
            displayFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameHolderLayout = new javax.swing.GroupLayout(frameHolder);
        frameHolder.setLayout(frameHolderLayout);
        frameHolderLayout.setHorizontalGroup(
            frameHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gfxFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        frameHolderLayout.setVerticalGroup(
            frameHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gfxFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        control.playerAttack();
        if (control.mobDefend.equals(true)) {
            control.mobDefend = false;
            foe.DEF = foe.getDEF() / 2;
        }
        control.enemyTurn();
        this.updateAll();
    }//GEN-LAST:event_attackButtonActionPerformed

    private void magicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magicButtonActionPerformed
        control.playerSkill();
        if (control.mobDefend.equals(true)) {
            control.mobDefend = false;
            foe.DEF = foe.getDEF() / 2;
        }
        control.enemyTurn();
        this.updateAll();
    }//GEN-LAST:event_magicButtonActionPerformed

    private void itemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButtonActionPerformed
        control.playerDefend();
        if (control.mobDefend.equals(true)) {
            control.mobDefend = false;
            foe.DEF = foe.getDEF() / 2;
        }
        control.enemyTurn();
        this.updateAll();
    }//GEN-LAST:event_itemButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        if (fighter.getSPD() > foe.getSPD()) {
            result.run(true);
            result.setVisible(true);
            this.setVisible(false);
        } else {
            display.setText("You were stopped by the " + foe.getName() + "!");
            if (control.mobDefend.equals(true)) {
                control.mobDefend = false;
                foe.DEF = foe.getDEF() / 2;
            }
        }
        this.updateAll();
    }//GEN-LAST:event_runButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Battles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackButton;
    public javax.swing.JTextField display;
    private javax.swing.JPanel displayFrame;
    private javax.swing.JPanel frameHolder;
    private javax.swing.JPanel gfxFrame;
    private javax.swing.JLabel hp;
    private javax.swing.JLabel hpMax;
    private javax.swing.JTextPane img;
    private javax.swing.JPanel inputFrame;
    private javax.swing.JButton itemButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton magicButton;
    private javax.swing.JLabel mp;
    private javax.swing.JLabel mpMax;
    private javax.swing.JLabel name;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
    private void setPrevious(javax.swing.JFrame where) {
        previous = where;
    }
}
