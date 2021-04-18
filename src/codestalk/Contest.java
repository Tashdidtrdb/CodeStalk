package codestalk;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

public class Contest extends javax.swing.JFrame {
    
    private String user = null;
    public Contest(String name) {
        initComponents();
        username.setVisible(false);
        user = name;
        if(!user.equals("null")){
            username.setText(user);
            username.setVisible(true);
            sign_up.setVisible(false);
            log_in.setVisible(false);
        }  
        get_cf_contests();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        Panel = new javax.swing.JPanel();
        codestalk = new javax.swing.JLabel();
        sign_up = new javax.swing.JButton();
        log_in = new javax.swing.JButton();
        scroller = new javax.swing.JScrollPane();
        contest_table = new javax.swing.JTable();
        problemset = new javax.swing.JButton();
        contest = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeStalk");
        setBackground(new java.awt.Color(102, 255, 204));
        setBounds(new java.awt.Rectangle(0, 0, 1000, 600));
        setForeground(new java.awt.Color(0, 128, 128));
        setName("home"); // NOI18N
        setResizable(false);

        Panel.setBackground(new java.awt.Color(0, 128, 128));
        Panel.setMaximumSize(new java.awt.Dimension(1000, 600));
        Panel.setPreferredSize(new java.awt.Dimension(1000, 600));

        codestalk.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        codestalk.setForeground(new java.awt.Color(255, 255, 255));
        codestalk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codestalk.setText("CodeStalk");

        sign_up.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        sign_up.setText("Sign up");
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });

        log_in.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        log_in.setText("Login");
        log_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_inActionPerformed(evt);
            }
        });

        contest_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Upcoming Contests", "Online Judge", "Date and Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroller.setViewportView(contest_table);

        problemset.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        problemset.setForeground(new java.awt.Color(102, 102, 102));
        problemset.setText("Problemset");
        problemset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        problemset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemsetActionPerformed(evt);
            }
        });

        contest.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        contest.setForeground(new java.awt.Color(102, 102, 102));
        contest.setText("Contest");
        contest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        profile.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        profile.setForeground(new java.awt.Color(102, 102, 102));
        profile.setText("Profile");
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroller))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(profile)
                        .addGap(97, 97, 97)
                        .addComponent(problemset)
                        .addGap(98, 98, 98)
                        .addComponent(contest)
                        .addGap(0, 323, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(codestalk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(791, 791, 791)
                    .addComponent(sign_up)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(log_in, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(codestalk))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problemset)
                    .addComponent(contest)
                    .addComponent(profile))
                .addGap(46, 46, 46)
                .addComponent(scroller, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sign_up)
                        .addComponent(log_in))
                    .addContainerGap(518, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
        // TODO add your handling code here:
        signup frame = new signup();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sign_upActionPerformed

    private void problemsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemsetActionPerformed
        // TODO add your handling code here:
        Problemset problems = null;
        try {
            problems = new Problemset(user);
        } catch (IOException ex) {
            Logger.getLogger(Contest.class.getName()).log(Level.SEVERE, null, ex);
        }
        problems.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_problemsetActionPerformed

    private void log_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_inActionPerformed
        // TODO add your handling code here:
        login frame = new login();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_log_inActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        if(user.equals("null")){
            login frame = new login();
            frame.setVisible(true);
            this.dispose();
        }
        else{
            profile frame = new profile(user);
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_profileActionPerformed

    DefaultTableModel table_model;
    void get_cf_contests(){
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        HttpURLConnection connection;
        try {
            URL url = new URL("https://codeforces.com/api/contest.list?");
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
        
        parse_cf_contests(responseContent.toString());
    }
    
    String get_date(int unix){
        Date date = new java.util.Date(unix*1000L); 
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z"); 
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+6")); 
        String formattedDate = sdf.format(date);
        return formattedDate;
    }
    
    void parse_cf_contests(String responseBody){        
        JSONObject response = new JSONObject(responseBody);
        JSONArray result = response.getJSONArray("result");
        for(int i=0;i<result.length();i++){
            JSONObject obj = result.getJSONObject(i);
            String type = obj.getString("phase");
            if(type.equals("BEFORE")){
                String name = obj.getString("name");
                int date_unix = obj.getInt("startTimeSeconds");
                String date = get_date(date_unix);
                String judge = "Codeforces";
                add_row(name,judge,date);
            }
        }
    }
    
    void add_row(String name, String judge, String date){
        table_model = (DefaultTableModel) contest_table.getModel();
        String data[] = {name,judge,date};
        table_model.addRow(data);
    }
    
    public static void main(String args[]) {          
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contest("null").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel codestalk;
    private javax.swing.JButton contest;
    private javax.swing.JTable contest_table;
    private javax.swing.JButton log_in;
    private javax.swing.JButton problemset;
    private javax.swing.JButton profile;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
