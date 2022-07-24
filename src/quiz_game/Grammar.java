/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author David
 */
public class Grammar extends javax.swing.JFrame { 
    /**
     * Creates new form Grammar
     */
    public Grammar() {
        initComponents();
        
        this.Question.setBackground(new Color(153,204,255)); // Change the color of the question
        this.NextButton.setVisible(false); // next button set to visible
        
        StyledDocument doc = this.Question.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
       
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
       
        Attributes.setSituation("onGoing"); // the questions is on going
        String[] values = generateQuestions();
        numberOfQuestions = Attributes.getNumQuestions();
        
        message2.Yes.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == message2.Yes) {
                
                if (choice == "ChoiceA") {
                    //System.out.println("Chose A");
                    message2.setVisible(false);
                    
                    if (answer.equals("A")) { // if correct 
                        ChoiceA.setBackground(new Color(153,255,153));
                       
                        correct = correct + 1;
                        NextButton.setVisible(true);
                    }
                    else { // if wrong
                        ChoiceA.setBackground(new Color(255,102,102));
                        
                        mistake = mistake + 1;
                        NextButton.setVisible(true);  
                    }
                    
                }
                
                else if (choice == "ChoiceB") {
                    //System.out.println("Chose B");
                    message2.setVisible(false);
                    
                    if (answer.equals("B")) { // if correct 
                        ChoiceB.setBackground(new Color(153,255,153));
                        
                        correct = correct + 1;
                        NextButton.setVisible(true);
                    }
                    else  { // if wrong
                        ChoiceB.setBackground(new Color(255,102,102));
                        
                        mistake = mistake + 1;
                        NextButton.setVisible(true);
                    }
                }
                
                else if (choice == "ChoiceC") {
                    //System.out.println("Chose C");
                    message2.setVisible(false);
                    
                    if (answer.equals("C")) { // if correct 
                        ChoiceC.setBackground(new Color(153,255,153));
                        
                        correct = correct + 1;
                        NextButton.setVisible(true);
                    }
                    else { // if wrong
                        ChoiceC.setBackground(new Color(255,102,102));
                        
                        mistake = mistake + 1;
                        NextButton.setVisible(true);
                    }
                }
                
                else if (choice == "ChoiceD") {
                    //System.out.println("Chose D");
                    message2.setVisible(false);
                    
                    if (answer.equals("D")) { // if correct 
                        ChoiceD.setBackground(new Color(153,255,153));
                        
                        correct = correct + 1;
                        NextButton.setVisible(true);
                    }
                    else { // if wrong
                        ChoiceD.setBackground(new Color(255,102,102));
                        
                        mistake = mistake + 1;
                        NextButton.setVisible(true);
                    }
                }
            }
        }
    });  
                  
    this.NextButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            if (numberOfQuestions > 1) {
                refresh(); // re-enable buttons // clear colors set to normal
                generateQuestions();
            }
            else {
                end();
            }
            
            }
        });  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Question = new javax.swing.JTextPane();
        ChoiceA = new javax.swing.JButton();
        ChoiceB = new javax.swing.JButton();
        ChoiceC = new javax.swing.JButton();
        ChoiceD = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Menu.setBackground(new java.awt.Color(255, 242, 219));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setFocusable(false);
        Menu.setPreferredSize(new java.awt.Dimension(815, 477));
        Menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuMouseDragged(evt);
            }
        });
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
        });

        Title.setBackground(new java.awt.Color(0, 0, 0));
        Title.setFont(new java.awt.Font("Permanent Marker", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("grammar");
        Title.setMaximumSize(new java.awt.Dimension(100, 19));
        Title.setPreferredSize(new java.awt.Dimension(100, 19));

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 51, 51));
        ExitButton.setText("X");
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 51, 51));
        BackButton.setText("<");
        BackButton.setFocusable(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        Question.setBackground(new java.awt.Color(153, 204, 255));
        Question.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Question.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        Question.setForeground(new java.awt.Color(0, 0, 0));
        Question.setText("“____ their names Jack & Benny?” “Yes, _____ .”");
        Question.setAutoscrolls(false);
        Question.setCaretColor(new java.awt.Color(102, 204, 255));
        Question.setFocusable(false);
        jScrollPane1.setViewportView(Question);

        ChoiceA.setBackground(new java.awt.Color(197, 197, 197));
        ChoiceA.setFont(new java.awt.Font("Permanent Marker", 0, 18)); // NOI18N
        ChoiceA.setForeground(new java.awt.Color(0, 0, 0));
        ChoiceA.setText("Choice A");
        ChoiceA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChoiceA.setFocusPainted(false);
        ChoiceA.setFocusable(false);
        ChoiceA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChoiceAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChoiceAMouseExited(evt);
            }
        });
        ChoiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiceAActionPerformed(evt);
            }
        });

        ChoiceB.setBackground(new java.awt.Color(197, 197, 197));
        ChoiceB.setFont(new java.awt.Font("Permanent Marker", 0, 18)); // NOI18N
        ChoiceB.setForeground(new java.awt.Color(0, 0, 0));
        ChoiceB.setText("Choice B");
        ChoiceB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChoiceB.setFocusPainted(false);
        ChoiceB.setFocusable(false);
        ChoiceB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChoiceBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChoiceBMouseExited(evt);
            }
        });
        ChoiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiceBActionPerformed(evt);
            }
        });

        ChoiceC.setBackground(new java.awt.Color(197, 197, 197));
        ChoiceC.setFont(new java.awt.Font("Permanent Marker", 0, 18)); // NOI18N
        ChoiceC.setForeground(new java.awt.Color(0, 0, 0));
        ChoiceC.setText("Choice C");
        ChoiceC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChoiceC.setFocusPainted(false);
        ChoiceC.setFocusable(false);
        ChoiceC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChoiceCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChoiceCMouseExited(evt);
            }
        });
        ChoiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiceCActionPerformed(evt);
            }
        });

        ChoiceD.setBackground(new java.awt.Color(197, 197, 197));
        ChoiceD.setFont(new java.awt.Font("Permanent Marker", 0, 18)); // NOI18N
        ChoiceD.setForeground(new java.awt.Color(0, 0, 0));
        ChoiceD.setText("Choice D");
        ChoiceD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChoiceD.setFocusPainted(false);
        ChoiceD.setFocusable(false);
        ChoiceD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChoiceDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChoiceDMouseExited(evt);
            }
        });
        ChoiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiceDActionPerformed(evt);
            }
        });

        NextButton.setBackground(new java.awt.Color(197, 197, 197));
        NextButton.setFont(new java.awt.Font("Permanent Marker", 0, 12)); // NOI18N
        NextButton.setForeground(new java.awt.Color(0, 0, 0));
        NextButton.setText("NEXT");
        NextButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NextButton.setFocusable(false);
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextButtonMouseExited(evt);
            }
        });
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(186, 186, 186)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(ExitButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                            .addComponent(ChoiceA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChoiceB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChoiceC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChoiceD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(116, 116, 116))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExitButton)
                            .addComponent(BackButton)))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ChoiceA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChoiceB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChoiceC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChoiceD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int lastX, lastY, lastLocationX, lastLocationY;
    int numberOfQuestions, correct, mistake;
    
    boolean choosing;
    String choice = "";
    String answer = null;
    
    Message2 message2 = new Message2();
    Operations operation = new Operations();
    Choices choicesWindow = new Choices();
    
    private void end() {
        this.setVisible(false);
        
        Attributes.setSituation("Ended");
        Operations operation = new Operations();
        operation.getQuestionForGrammar();
        
        Attributes.setCorrect(correct);
        Attributes.setMistake(mistake);
        
        Results results = new Results();
        results.setVisible(true);
    }
  
    private void refresh(){
        choosing = false;
        numberOfQuestions = numberOfQuestions - 1;
        
        this.NextButton.setVisible(false);
        
        this.ChoiceA.setBackground(new Color(197,197,197));
        this.ChoiceB.setBackground(new Color(197,197,197));
        this.ChoiceC.setBackground(new Color(197,197,197));
        this.ChoiceD.setBackground(new Color(197,197,197));
       
        this.ChoiceA.setEnabled(true);
        this.ChoiceB.setEnabled(true);
        this.ChoiceC.setEnabled(true);
        this.ChoiceD.setEnabled(true);
        
        this.NextButton.setVisible(false);
    }
    
    private String[] generateQuestions() { 
        String[] values = operation.getQuestionForGrammar();
        answer = values[5];
        
        //System.out.println(answer);
        
        this.Question.setText(values[0]); // values[0] is the question
        this.ChoiceA.setText(values[1]);
        this.ChoiceB.setText(values[2]);
        this.ChoiceC.setText(values[3]);
        this.ChoiceD.setText(values[4]);
        
       return values;  
    }
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:

        System.exit(0); //Close the app
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        Main_menu mainMenu = new Main_menu();

        this.setVisible(false);
        mainMenu.setLocation(this.getLocation());
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void MenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseDragged
        // TODO add your handling code here:

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX,
            getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_MenuMouseDragged

    private void MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMousePressed

        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_MenuMousePressed

    private void ChoiceAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceAMouseEntered
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceA.setBackground(new Color(255,255,153));
        }
    }//GEN-LAST:event_ChoiceAMouseEntered

    private void ChoiceAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceAMouseExited
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceA.setBackground(new Color(197,197,197));
        }
    }//GEN-LAST:event_ChoiceAMouseExited

    private void ChoiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceAActionPerformed
        // TODO add your handling code here:
        
        if (choosing == false) {
        choosing = true;
        this.ChoiceA.setBackground(new Color(255,255,153));
       
        this.ChoiceB.setEnabled(false);
        this.ChoiceC.setEnabled(false);
        this.ChoiceD.setEnabled(false);
        
        message2.setVisible(true);
        message2.setAlwaysOnTop(true);
        
        choice = "ChoiceA";
            
             message2.No.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){ 
                  choosing = false;
                  message2.setVisible(false);
                  ChoiceB.setEnabled(true);
                  ChoiceC.setEnabled(true);
                  ChoiceD.setEnabled(true);
                  ChoiceA.setBackground(new Color(197,197,197));
               }   
           });
        }
    }//GEN-LAST:event_ChoiceAActionPerformed

    private void ChoiceBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceBMouseEntered
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceB.setBackground(new Color(255,255,153));
        }
    }//GEN-LAST:event_ChoiceBMouseEntered

    private void ChoiceBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceBMouseExited
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceB.setBackground(new Color(197,197,197));
        }
    }//GEN-LAST:event_ChoiceBMouseExited

    private void ChoiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceBActionPerformed
        // TODO add your handling code here:
        
        if (choosing == false) {
        choosing = true;
        this.ChoiceB.setBackground(new Color(255,255,153));
       
        this.ChoiceA.setEnabled(false);
        this.ChoiceC.setEnabled(false);
        this.ChoiceD.setEnabled(false);
        
        message2.setVisible(true);
        message2.setAlwaysOnTop(true);
        
        choice = "ChoiceB";
            
            message2.No.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){ 
                  choosing = false;
                  message2.setVisible(false);
                  ChoiceA.setEnabled(true);
                  ChoiceC.setEnabled(true);
                  ChoiceD.setEnabled(true);
                  ChoiceB.setBackground(new Color(197,197,197));
               }   
           });
        }
    }//GEN-LAST:event_ChoiceBActionPerformed

    private void ChoiceCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceCMouseEntered
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceC.setBackground(new Color(255,255,153));
        }
    }//GEN-LAST:event_ChoiceCMouseEntered

    private void ChoiceCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceCMouseExited
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceC.setBackground(new Color(197,197,197));
        }
    }//GEN-LAST:event_ChoiceCMouseExited

    private void ChoiceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceCActionPerformed
        // TODO add your handling code here:
        
        if (choosing == false) {
        choosing = true;
        this.ChoiceC.setBackground(new Color(255,255,153));
       
        this.ChoiceA.setEnabled(false);
        this.ChoiceB.setEnabled(false);
        this.ChoiceD.setEnabled(false);
        
        choice = "ChoiceC";
        
        message2.setVisible(true);
        message2.setAlwaysOnTop(true);
            
            message2.No.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){ 
                  choosing = false;
                  message2.setVisible(false);
                  ChoiceA.setEnabled(true);
                  ChoiceB.setEnabled(true);
                  ChoiceD.setEnabled(true);
                  ChoiceC.setBackground(new Color(197,197,197));
               }   
           });
        }
    }//GEN-LAST:event_ChoiceCActionPerformed

    private void ChoiceDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceDMouseEntered
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceD.setBackground(new Color(255,255,153));
        }
    }//GEN-LAST:event_ChoiceDMouseEntered

    private void ChoiceDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChoiceDMouseExited
        // TODO add your handling code here:
        
        if (choosing == false) {
            this.ChoiceD.setBackground(new Color(197,197,197));
        }
    }//GEN-LAST:event_ChoiceDMouseExited

    private void ChoiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceDActionPerformed
        // TODO add your handling code here:
        
        if (choosing == false) {
        choosing = true;
        this.ChoiceD.setBackground(new Color(255,255,153));
       
        this.ChoiceB.setEnabled(false);
        this.ChoiceC.setEnabled(false);
        this.ChoiceA.setEnabled(false);
        
        choice = "ChoiceD";
        
        message2.setVisible(true);
        message2.setAlwaysOnTop(true);

            message2.No.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){ 
                  choosing = false;
                  message2.setVisible(false);
                  ChoiceA.setEnabled(true);
                  ChoiceC.setEnabled(true);
                  ChoiceB.setEnabled(true);
                  ChoiceD.setBackground(new Color(197,197,197));
               }   
           });
        }
    }//GEN-LAST:event_ChoiceDActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextButtonActionPerformed

    private void NextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseEntered
        // TODO add your handling code here:
        
        this.NextButton.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_NextButtonMouseEntered

    private void NextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseExited
        // TODO add your handling code here:
        
        this.NextButton.setBackground(new Color(197,197,197));
    }//GEN-LAST:event_NextButtonMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    
    }//GEN-LAST:event_formWindowGainedFocus
    
    
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
            java.util.logging.Logger.getLogger(Grammar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grammar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grammar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grammar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grammar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ChoiceA;
    private javax.swing.JButton ChoiceB;
    private javax.swing.JButton ChoiceC;
    private javax.swing.JButton ChoiceD;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton NextButton;
    private javax.swing.JTextPane Question;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
