package codestalk;


import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

public class Problemset extends javax.swing.JFrame {
    
    private String user = null;
    DefaultTableModel table_model;
    public Problemset(String name) throws ProtocolException, IOException {
        initComponents();
        username.setVisible(false);
        user = name;
        if(!user.equals("null")){
            username.setText(user);
            username.setVisible(true);
            sign_up.setVisible(false);
            log_in.setVisible(false);
        }
        get_cf_problems(0);
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
        search_bar = new javax.swing.JTextField();
        search_type = new javax.swing.JComboBox<>();
        scroller = new javax.swing.JScrollPane();
        problems_table = new javax.swing.JTable();
        problemset = new javax.swing.JButton();
        contest = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeStalk");
        setBackground(new java.awt.Color(102, 255, 204));
        setBounds(new java.awt.Rectangle(0, 0, 1000, 600));
        setForeground(new java.awt.Color(0, 128, 128));
        setName("home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));
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

        search_type.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        search_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Problem Tag", "Problem Name", " " }));

        problems_table.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        problems_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Tags", "Online Judge", "Link"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        problems_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        problems_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                problems_tableMouseClicked(evt);
            }
        });
        scroller.setViewportView(problems_table);

        problemset.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        problemset.setForeground(new java.awt.Color(102, 102, 102));
        problemset.setText("Problemset");
        problemset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        contest.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        contest.setForeground(new java.awt.Color(102, 102, 102));
        contest.setText("Contest");
        contest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contestActionPerformed(evt);
            }
        });

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

        search.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroller)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(profile)
                .addGap(97, 97, 97)
                .addComponent(problemset)
                .addGap(98, 98, 98)
                .addComponent(contest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(search_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)))
                .addGap(68, 68, 68))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(335, 335, 335)
                    .addComponent(codestalk)
                    .addGap(257, 257, 257)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(search_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addComponent(sign_up)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(log_in, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(problemset)
                            .addComponent(contest)
                            .addComponent(profile))
                        .addGap(46, 46, 46))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(search_type))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)))
                .addComponent(scroller, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sign_up)
                                .addComponent(log_in)))
                        .addComponent(codestalk))
                    .addGap(10, 10, 10)
                    .addComponent(search_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(487, Short.MAX_VALUE)))
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

    private void contestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contestActionPerformed
        // TODO add your handling code here:
        Contest contest = new Contest(user);
        contest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_contestActionPerformed

    private void problems_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_problems_tableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(problems_table.getValueAt(problems_table.getSelectedRow(), 3).toString());
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(evt.getClickCount() == 1){
            
        }
    }//GEN-LAST:event_problems_tableMouseClicked

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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String type = search_type.getSelectedItem().toString();
        if(type.equals("Problem Tag")){
            get_cf_problems(2);
        }
        else{
            get_cf_problems(1);
        }
    }//GEN-LAST:event_searchActionPerformed
     
    void get_cf_problems(int parsing){
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        HttpURLConnection connection;
        try {
            URL url = new URL("https://codeforces.com/api/problemset.problems");
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
        
        if(parsing == 0){
            parse_cf_problems(responseContent.toString());
        }
        else if(parsing == 1){
            parse_searched_problem(responseContent.toString());
        }
        else{
            parse_cf_tag(responseContent.toString());
        }
    }
    
    void parse_cf_tag(String responseBody){
        JSONObject response = new JSONObject(responseBody);
        JSONObject result = response.getJSONObject("result");
        JSONArray problems = result.getJSONArray("problems");
        //JSONArray problemStatistics = result.getJSONArray("problemStatistics");
        boolean ok = false, check = false;
        int count = 0;
        for(int i=0;i<problems.length();i++){
            check = false;
            JSONObject obj = problems.getJSONObject(i);
            String name = obj.getInt("contestId") + " " + obj.getString("index") + " " + obj.getString("name");
            String tags = "";
            JSONArray tag = obj.getJSONArray("tags");
            for(int j=0;j<tag.length();j++){
                if(tag.getString(j).equals(search_bar.getText())){
                    check = true;
                    count++;
                }
                tags += tag.getString(j);
                if(j != tag.length() - 1) tags += " , ";
            }
            String judge = "Codeforces";
            String link = "https://codeforces.com/problemset/problem/" + obj.getInt("contestId") + "/" + obj.getString("index");
            if(check){
                if(count == 1){
                    table_model = (DefaultTableModel) problems_table.getModel();
                    table_model.setRowCount(0);
                }
                ok = true;
                add_row(name,tags,judge,link);
            }
        }
        
        if(!ok){
            JOptionPane.showMessageDialog(this, "No problems found");
        }
    }
    
    void parse_cf_problems(String responseBody){        
        JSONObject response = new JSONObject(responseBody);
        JSONObject result = response.getJSONObject("result");
        JSONArray problems = result.getJSONArray("problems");
        //JSONArray problemStatistics = result.getJSONArray("problemStatistics");
        for(int i=0;i<problems.length();i++){
            JSONObject obj = problems.getJSONObject(i);
            String name = obj.getInt("contestId") + " " + obj.getString("index") + " " + obj.getString("name");
            String tags = "";
            JSONArray tag = obj.getJSONArray("tags");
            for(int j=0;j<tag.length();j++){
                tags += tag.getString(j);
                if(j != tag.length() - 1) tags += " , ";
            }
            String judge = "Codeforces";
            String link = "https://codeforces.com/problemset/problem/" + obj.getInt("contestId") + "/" + obj.getString("index");
            
            add_row(name,tags,judge,link);
        }
    }
    
    void parse_searched_problem(String responseBody){
        JSONObject response = new JSONObject(responseBody);
        JSONObject result = response.getJSONObject("result");
        JSONArray problems = result.getJSONArray("problems");
        //JSONArray problemStatistics = result.getJSONArray("problemStatistics");
        boolean ok = false;
        for(int i=0;i<problems.length();i++){
            JSONObject obj = problems.getJSONObject(i);
            if(obj.getString("name").toLowerCase().equals(search_bar.getText().toLowerCase())){
                ok = true;
                String name = obj.getInt("contestId") + " " + obj.getString("index") + " " + obj.getString("name");
                String tags = "";
                JSONArray tag = obj.getJSONArray("tags");
                for(int j=0;j<tag.length();j++){
                    tags += tag.getString(j);
                    if(j != tag.length() - 1) tags += " , ";
                }
                String judge = "Codeforces";
                String link = "https://codeforces.com/problemset/problem/" + obj.getInt("contestId") + "/" + obj.getString("index");
                table_model = (DefaultTableModel) problems_table.getModel();
                table_model.setRowCount(0);
                add_row(name,tags,judge,link);
                break;
            }
        }
        
        if(!ok){
            JOptionPane.showMessageDialog(this, "No problems found");
        }
    }
    
    void add_row(String name, String tags, String judge, String link){
        table_model = (DefaultTableModel) problems_table.getModel();
    
        String data[] = {name,tags,judge,link};
        table_model.addRow(data);
    }

    public static void main(String args[]) {       
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Problemset("null").setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Problemset.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel codestalk;
    private javax.swing.JButton contest;
    private javax.swing.JButton log_in;
    private javax.swing.JTable problems_table;
    private javax.swing.JButton problemset;
    private javax.swing.JButton profile;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_bar;
    private javax.swing.JComboBox<String> search_type;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
