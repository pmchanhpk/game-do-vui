
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChanhPM
 */
public class Game_chanh extends javax.swing.JFrame {

    public int time_run, point;
    public final int TIME_MAX = 100;
    public Timer time;
    public List<Question> listQues;
    public Question cur_ques;

    public String user_ans;

    public Game_chanh() {
        time_run = TIME_MAX;

        initComponents();
        this.setTitle("Game Đố Vui - Version 1.1");
        
        try {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("babelfish_2.png")));
        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jName = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScore = new javax.swing.JLabel();
        jPoint = new javax.swing.JLabel();
        jansC = new javax.swing.JButton();
        jPlay = new javax.swing.JButton();
        jansA = new javax.swing.JButton();
        jQuestion = new javax.swing.JLabel();
        jansB = new javax.swing.JButton();
        jansD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jName.setText("Phạm Minh Chánh");
        jPanel1.add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 910, 22));

        jScore.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jScore.setText("Score:");
        jPanel1.add(jScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPoint.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPoint.setText("0");
        jPanel1.add(jPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jansC.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jansC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_chanh/cat_true.png"))); // NOI18N
        jansC.setEnabled(false);
        jansC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jansC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jansCActionPerformed(evt);
            }
        });
        jPanel1.add(jansC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 410, 85));

        jPlay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPlay.setText("PLAY");
        jPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayActionPerformed(evt);
            }
        });
        jPanel1.add(jPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 410, 55));

        jansA.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jansA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_chanh/555.png"))); // NOI18N
        jansA.setEnabled(false);
        jansA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jansA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jansAActionPerformed(evt);
            }
        });
        jPanel1.add(jansA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 410, 85));

        jQuestion.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jQuestion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 910, 120));

        jansB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jansB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_chanh/6666.png"))); // NOI18N
        jansB.setEnabled(false);
        jansB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jansB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jansBActionPerformed(evt);
            }
        });
        jPanel1.add(jansB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 410, 85));

        jansD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jansD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_chanh/999.png"))); // NOI18N
        jansD.setEnabled(false);
        jansD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jansD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jansDActionPerformed(evt);
            }
        });
        jPanel1.add(jansD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 410, 85));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_chanh/anh_nen.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void readQues() {
        Question q1 = new Question("El Nino là gì?", "A. Một loại dương xỉ", "B. Một điệu nhảy", "C. Một khu rừng ở Châu Phi", "D. Một hiện tượng thời tiết", "D. Một hiện tượng thời tiết");
        Question q2 = new Question("Loài động vật nào có 3 tim, 8 chi và máu màu xanh?", "A. Mực", "B. Bạch tuộc", "C. Hải cẩu", "D. Sư tử biển", "B. Bạch tuộc");
        Question q3 = new Question("What is the only position on a football team that can be \"sacked\"?", "A. Wide recevie", "B. Tight end", "C. Center", "D. Quarterback", "D. Quarterback");
        Question q4 = new Question("Khe núi Grand Canyon nằm ở nước nào?", "A. Mỹ", "B. Anh", "C. Chi-lê", "D. Canada", "A. Mỹ");
        Question q5 = new Question("Nhà khoa học nào sau đây phát minh ra thuốc nổ?", "A. Isaac Newton", "B. Albert Einstein", "C. Alfred Nobel", "D. Nikola Tesla", "C. Alfred Nobel");

        listQues = new ArrayList<Question>();
        listQues.add(q1);
        listQues.add(q2);
        listQues.add(q3);
        listQues.add(q4);
        listQues.add(q5);

    }
    private void jansAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jansAActionPerformed
        this.user_ans = cur_ques.getAnsA();
        if (check_result()) {
            time.stop();
            this.jPlay.setText("Corrected!");
            load();

        } else {
            jQuestion.setText("You lose!");
            this.jPlay.setEnabled(true);
            this.jPlay.setText("Replay");
            this.jansA.setEnabled(false);
            this.jansB.setEnabled(false);
            this.jansC.setEnabled(false);
            this.jansD.setEnabled(false);
            time.stop();
            jProgressBar1.setValue(0);
        }
    }//GEN-LAST:event_jansAActionPerformed

    private void jansCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jansCActionPerformed
        this.user_ans = cur_ques.getAnsC();
        if (check_result()) {
            time.stop();
            this.jPlay.setText("Corrected!");
            load();

        } else {
            jQuestion.setText("You lose!");
            this.jPlay.setEnabled(true);
            this.jPlay.setText("Replay");
            time.stop();
            jProgressBar1.setValue(0);
            this.jansA.setEnabled(false);
            this.jansB.setEnabled(false);
            this.jansC.setEnabled(false);
            this.jansD.setEnabled(false);
        }
    }//GEN-LAST:event_jansCActionPerformed

    private void jPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayActionPerformed

        readQues();
        this.jPlay.setEnabled(false);// clock the btn
        this.jansA.setEnabled(true);
        this.jansB.setEnabled(true);
        this.jansC.setEnabled(true);
        this.jansD.setEnabled(true);

        point = -1;
        time = new Timer(50, new LoadTime());
        load();


    }//GEN-LAST:event_jPlayActionPerformed

    private void jansDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jansDActionPerformed
        this.user_ans = cur_ques.getAnsD();
        if (check_result()) {
            time.stop();
            this.jPlay.setText("Corrected!");
            load();

        } else {
            jQuestion.setText("You lose!");
            this.jPlay.setEnabled(true);
            this.jPlay.setText("Replay");
            this.jansA.setEnabled(false);
            this.jansB.setEnabled(false);
            this.jansC.setEnabled(false);
            this.jansD.setEnabled(false);
            time.stop();
            jProgressBar1.setValue(0);
        }
    }//GEN-LAST:event_jansDActionPerformed

    private void jansBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jansBActionPerformed
        this.user_ans = cur_ques.getAnsB();
        if (check_result()) {
            time.stop();
            this.jPlay.setText("Corrected!");
            load();

        } else {
            jQuestion.setText("You lose!");
            this.jPlay.setEnabled(true);
            this.jPlay.setText("Replay");
            this.jansA.setEnabled(false);
            this.jansB.setEnabled(false);
            this.jansC.setEnabled(false);
            this.jansD.setEnabled(false);
            time.stop();
            jProgressBar1.setValue(0);
        }
    }//GEN-LAST:event_jansBActionPerformed

    void load() {
        point++;
        jPoint.setText(point + "");

        if (listQues.size() == 0) {
            this.jQuestion.setText("You won!");
            this.jPlay.setEnabled(true);
            this.jPlay.setText("Replay");
            this.jansA.setEnabled(false);
            this.jansB.setEnabled(false);
            this.jansC.setEnabled(false);
            this.jansD.setEnabled(false);
            time.stop();
            jProgressBar1.setValue(0);
        } else {
            Random rand = new Random();
            int index_random = rand.nextInt(listQues.size());

            cur_ques = listQues.get(index_random);
            listQues.remove(index_random);

            this.jQuestion.setText(cur_ques.getQues());
            this.jansA.setText(cur_ques.getAnsA());
            this.jansB.setText(cur_ques.getAnsB());
            this.jansC.setText(cur_ques.getAnsC());
            this.jansD.setText(cur_ques.getAnsD());

            time_run = TIME_MAX;
            time.start();
        }

    }

    public boolean check_result() {

        if (this.user_ans == cur_ques.getAnsTrue()) {
            return true;
        }
        return false;

    }

    public class LoadTime implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (time_run > 0) {
                time_run--;
                jProgressBar1.setValue(time_run);
            } else {
                time.stop();
                jQuestion.setText("You lose!");
                jPlay.setEnabled(true);
                jansA.setEnabled(false);
                jansB.setEnabled(false);
                jansC.setEnabled(false);
                jansD.setEnabled(false);
                jPlay.setText("Replay");
            }
        }

    }

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
            java.util.logging.Logger.getLogger(Game_chanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_chanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_chanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_chanh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_chanh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPlay;
    private javax.swing.JLabel jPoint;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jQuestion;
    private javax.swing.JLabel jScore;
    private javax.swing.JButton jansA;
    private javax.swing.JButton jansB;
    private javax.swing.JButton jansC;
    private javax.swing.JButton jansD;
    // End of variables declaration//GEN-END:variables
}