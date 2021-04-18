package codestalk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class profile extends javax.swing.JFrame {
    
    String user = null;
    public profile(String name) {
        user = name;
        initComponents();
        find_profile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cf_handle_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        rating_label = new javax.swing.JLabel();
        cf_handle = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        contest_create = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 128, 128));
        panel.setForeground(new java.awt.Color(0, 153, 153));
        panel.setPreferredSize(new java.awt.Dimension(800, 600));

        cf_handle_label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cf_handle_label.setForeground(new java.awt.Color(255, 255, 255));
        cf_handle_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cf_handle_label.setText("Codeforces Handle:");

        email_label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        email_label.setText("Email:");

        email.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        username.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        username_label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username_label.setText("Username:");

        rating.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        rating.setForeground(new java.awt.Color(255, 255, 255));
        rating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        rating_label.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        rating_label.setForeground(new java.awt.Color(255, 255, 255));
        rating_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rating_label.setText("Rating:");

        cf_handle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cf_handle.setForeground(new java.awt.Color(255, 255, 255));
        cf_handle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        back.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        back.setText("Back");
        back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        contest_create.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        contest_create.setText("Create Contest");
        contest_create.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contest_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contest_createActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cf_handle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cf_handle, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(contest_create)
                                        .addGap(18, 18, 18)
                                        .addComponent(back))
                                    .addComponent(rating_label, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_handle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_handle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rating_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contest_create, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            // TODO add your handling code here:
            Problemset problems = new Problemset(user);
            problems.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_backActionPerformed

    private void contest_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contest_createActionPerformed
        // TODO add your handling code here:
        created_contest frame = new created_contest(user);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_contest_createActionPerformed

    Connection connect(){
        String url = "jdbc:sqlite:E:\\Academic docs\\4th semester\\System analysis and development\\CodeStalk\\profile.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);   
        }catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    void get_rating(String handle){
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        HttpURLConnection connection;
        try {
            URL url = new URL("https://codeforces.com/api/user.rating?handle=" + handle);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //System.out.println(status);
            if(status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            } else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            }
        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        parse_rating(responseContent.toString());
    }
    
    void parse_rating(String responseBody){
        JSONObject response = new JSONObject(responseBody);
        JSONArray result = response.getJSONArray("result");
        JSONObject obj = result.getJSONObject(0);
        Integer found_rating = (obj.getInt("newRating"));
        rating.setText(found_rating.toString());
    }
    
    void find_profile(){
        String sql = "Select * from user where Username='" + user + "'";
        
        try{
            Connection conn = connect();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);
            if(res.next()){
                email.setText(res.getString("Email"));
                username.setText(user);
                cf_handle.setText(res.getString("Cf_handle"));
                get_rating(res.getString("Cf_handle"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile("Tashdid").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel cf_handle;
    private javax.swing.JLabel cf_handle_label;
    private javax.swing.JButton contest_create;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel rating;
    private javax.swing.JLabel rating_label;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
