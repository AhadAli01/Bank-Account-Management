/*

Program: BankAccountUI_Tester.java    

Purpose: Prompts the user to enter their bank account information, and in return, they will be provided an account summary after their transaction.


Author: Ahad Ali,  

*/
package bankaccountui_tester;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;


public class BankAccountUI_Tester extends javax.swing.JFrame
{

    public BankAccountUI_Tester()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        CreateAccountPanel = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        Balance = new javax.swing.JLabel();
        BalanceInput = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        ManageAccountPanel = new javax.swing.JPanel();
        DepositRadioButton = new javax.swing.JRadioButton();
        WithdrawRadioButton = new javax.swing.JRadioButton();
        MoneyInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReceiptOutput = new javax.swing.JTextArea();
        EnterButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NewUserButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateAccountPanel.setBackground(new java.awt.Color(0, 100, 0));
        CreateAccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Name.setBackground(new java.awt.Color(0, 150, 0));
        Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name: ");

        NameInput.setBackground(new java.awt.Color(0, 150, 0));
        NameInput.setForeground(new java.awt.Color(255, 255, 255));
        NameInput.setText("Enter Here...");
        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });
        NameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameInputKeyTyped(evt);
            }
        });

        Balance.setBackground(new java.awt.Color(0, 150, 0));
        Balance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Balance.setForeground(new java.awt.Color(255, 255, 255));
        Balance.setText("Balance: ");

        BalanceInput.setBackground(new java.awt.Color(0, 150, 0));
        BalanceInput.setForeground(new java.awt.Color(255, 255, 255));
        BalanceInput.setText("And Here...");
        BalanceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceInputActionPerformed(evt);
            }
        });
        BalanceInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BalanceInputKeyTyped(evt);
            }
        });

        Create.setBackground(new java.awt.Color(0, 150, 0));
        Create.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateAccountPanelLayout = new javax.swing.GroupLayout(CreateAccountPanel);
        CreateAccountPanel.setLayout(CreateAccountPanelLayout);
        CreateAccountPanelLayout.setHorizontalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAccountPanelLayout.createSequentialGroup()
                .addComponent(Name)
                .addGap(18, 18, 18)
                .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Balance)
                .addGap(18, 18, 18)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Create, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(BalanceInput))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateAccountPanelLayout.setVerticalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance)
                    .addComponent(BalanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Create)
                .addGap(21, 21, 21))
        );

        ManageAccountPanel.setBackground(new java.awt.Color(0, 100, 0));
        ManageAccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        ManageAccountPanel.setEnabled(false);

        DepositRadioButton.setBackground(new java.awt.Color(0, 150, 0));
        buttonGroup1.add(DepositRadioButton);
        DepositRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        DepositRadioButton.setText("Deposit");
        DepositRadioButton.setEnabled(false);
        DepositRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositRadioButtonActionPerformed(evt);
            }
        });

        WithdrawRadioButton.setBackground(new java.awt.Color(0, 150, 0));
        buttonGroup1.add(WithdrawRadioButton);
        WithdrawRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawRadioButton.setText("Withdraw");
        WithdrawRadioButton.setEnabled(false);
        WithdrawRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawRadioButtonActionPerformed(evt);
            }
        });

        MoneyInput.setBackground(new java.awt.Color(0, 150, 0));
        MoneyInput.setForeground(new java.awt.Color(255, 255, 255));
        MoneyInput.setEnabled(false);

        ReceiptOutput.setBackground(new java.awt.Color(0, 150, 0));
        ReceiptOutput.setColumns(20);
        ReceiptOutput.setForeground(new java.awt.Color(255, 255, 255));
        ReceiptOutput.setRows(5);
        jScrollPane1.setViewportView(ReceiptOutput);

        EnterButton.setBackground(new java.awt.Color(0, 150, 0));
        EnterButton.setForeground(new java.awt.Color(255, 255, 255));
        EnterButton.setText("Enter");
        EnterButton.setEnabled(false);
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 150, 0));
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("New Transaction");
        ClearButton.setEnabled(false);
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageAccountPanelLayout = new javax.swing.GroupLayout(ManageAccountPanel);
        ManageAccountPanel.setLayout(ManageAccountPanelLayout);
        ManageAccountPanelLayout.setHorizontalGroup(
            ManageAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ManageAccountPanelLayout.createSequentialGroup()
                        .addComponent(DepositRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WithdrawRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearButton)))
                .addContainerGap())
        );
        ManageAccountPanelLayout.setVerticalGroup(
            ManageAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageAccountPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ManageAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositRadioButton)
                    .addComponent(WithdrawRadioButton)
                    .addComponent(MoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterButton)
                    .addComponent(ClearButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        DepositRadioButton.getAccessibleContext().setAccessibleName("");
        WithdrawRadioButton.getAccessibleContext().setAccessibleName("");

        ExitButton.setBackground(new java.awt.Color(0, 150, 0));
        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitButton.setText("x");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 150, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("EXIT");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER");

        NewUserButton.setBackground(new java.awt.Color(0, 150, 0));
        NewUserButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewUserButton.setText("+");
        NewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Resources.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManageAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NewUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewUserButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Exit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExitButtonActionPerformed
    {//GEN-HEADEREND:event_ExitButtonActionPerformed
        //End program
        System.exit (0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void NewUserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewUserButtonActionPerformed
    {//GEN-HEADEREND:event_NewUserButtonActionPerformed
        //Clear all text and set to selected color
        NameInput.setText ("");
        BalanceInput.setText ("");
        MoneyInput.setText ("");
        ReceiptOutput.setText ("");
        
        buttonGroup1.clearSelection();
        
        NameInput.setForeground(Color.WHITE);
        BalanceInput.setForeground(Color.WHITE);
        MoneyInput.setForeground(Color.WHITE);
        ReceiptOutput.setForeground(Color.WHITE);
        
        ManageAccountPanel.setEnabled(false);
        DepositRadioButton.setEnabled(false);
        WithdrawRadioButton.setEnabled (false);
        EnterButton.setEnabled (false);
        ClearButton.setEnabled(false);
        MoneyInput.setEnabled (false);
        ReceiptOutput.setEnabled (false);        
    }//GEN-LAST:event_NewUserButtonActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CreateActionPerformed
    {//GEN-HEADEREND:event_CreateActionPerformed
        //Enable bottom panel and its items for use.
        ManageAccountPanel.setEnabled(true);
        DepositRadioButton.setEnabled(true);
        WithdrawRadioButton.setEnabled (true);
        EnterButton.setEnabled (true);
        ClearButton.setEnabled(true);
        MoneyInput.setEnabled (true);
        ReceiptOutput.setEnabled (true);
    }//GEN-LAST:event_CreateActionPerformed

    private void DepositRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DepositRadioButtonActionPerformed
    {//GEN-HEADEREND:event_DepositRadioButtonActionPerformed
    }//GEN-LAST:event_DepositRadioButtonActionPerformed

    private void WithdrawRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_WithdrawRadioButtonActionPerformed
    {//GEN-HEADEREND:event_WithdrawRadioButtonActionPerformed
    }//GEN-LAST:event_WithdrawRadioButtonActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EnterButtonActionPerformed
    {//GEN-HEADEREND:event_EnterButtonActionPerformed
        //Initialize variables
        double InputBalance = Double.parseDouble(BalanceInput.getText());
        String InputName = NameInput.getText();
        double InputMoney = Double.parseDouble(MoneyInput.getText()); 
        
        //BankAccount is class, and BankAccount () is constructor method
        //Most important line; object-orientated line
        BankAccount account = new BankAccount (InputBalance, InputName);
        
        //Decimal Format
        DecimalFormat decFor1 = new DecimalFormat("0.00");
        DecimalFormat decFor2 = new DecimalFormat("$00.00");
        
        //Set these textfields to selected colors.
        NameInput.setForeground(Color.WHITE);
        BalanceInput.setForeground(Color.WHITE);
        MoneyInput.setForeground(Color.WHITE);
        ReceiptOutput.setForeground(Color.WHITE);
        
        //if user chooses to deposit
        if (DepositRadioButton.isSelected())
        {
            
            //if user enters negative value
            if (InputMoney < 0)
            {
                ReceiptOutput.setText ("Please enter a positive number.");
                ReceiptOutput.setForeground(Color.RED);
                MoneyInput.setText("");

            }
            
            //if user enters positive value
            else 
            {
                account.deposit(InputMoney);
                
                //if bank account balance is negative
                if (account.getBalance() < 0)
                {
                    ReceiptOutput.setText (InputName + ", you have deposited " + decFor2.format(InputMoney) + ".\n" + 
                            InputName + ", your account balance is, " + decFor2.format(account.getBalance()) + ".\n" +
                            "You are now in our debt. From now on, please spend your money wisely and within your limits.\n\n" + 
                            "To make another transaction, click the new transaction button above.\n\n" +
                            "To exit, click the X button at the top right.\n\n" +
                            "To protect your private information from other users,\n"
                        + "click the + button to the left of the X button.");
                    BalanceInput.setText(decFor1.format(account.getBalance())); 
                }
                
                //if bank account balance is positive
                else
                {
                    ReceiptOutput.setText (InputName + ", you have deposited " + decFor2.format(InputMoney) + ".\n" +
                        InputName + ", your account balance is, " + decFor2.format(account.getBalance()) + ".\n\n" + 
                        "To make another transaction, click the new transaction button above.\n\n" +
                        "To exit, click the X button at the top right.\n\n" +
                        "To protect your private information from other users,\n "
                            + "click the + button to the left of the X button.");
                    BalanceInput.setText(decFor1.format(account.getBalance())); 
                }
            }
        }
        
        //if user chooses to withdraw
        else if (WithdrawRadioButton.isSelected())
        {
            
            //if user enters negative value
            if (InputMoney < 0)
            {
                ReceiptOutput.setText ("Please enter a positive number.");
                ReceiptOutput.setForeground(Color.RED);
                MoneyInput.setText("");
            }
            
            //if user enters positive value
            else 
            {
                account.withdraw(InputMoney);
                
                //if bank account balance is negative
                if (account.getBalance() < 0)
                {
                    ReceiptOutput.setText (InputName + ", you have withdrawn " + decFor2.format(InputMoney) + ".\n" + 
                            InputName + ", your account balance is, " + decFor2.format(account.getBalance()) + ".\n" +
                            "You are now in our debt. From now on, please spend your money wisely and within your limits.\n\n" + 
                            "To make another transaction, click the new transaction button above.\n\n" +
                            "To exit, click the X button at the top right.\n\n" +
                            "To protect your private information from other users,\n"
                        + "click the + button to the left of the X button.");
                    BalanceInput.setText(decFor1.format(account.getBalance())); 
                }
                
                //if bank account balance is positive
                else
                {
                    ReceiptOutput.setText (InputName + ", you have withdrawn " + decFor2.format(InputMoney) + ".\n" +
                        InputName + ", your account balance is, " + decFor2.format(account.getBalance()) + ".\n\n" + 
                        "To make another transaction, click the new transaction button above.\n\n" +
                        "To exit, click the X button at the top right.\n\n" +
                        "To protect your private information from other users,\n"
                            + "click the + button to the left of the X button.");
                    BalanceInput.setText(decFor1.format(account.getBalance())); 
                }
            }
        }
        
        //if user neither chooses to deposit or withdraw
        else 
        {
           ReceiptOutput.setText("Please choose to either deposit or withdraw.");
           ReceiptOutput.setForeground(Color.RED);
        }
        
        
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        //Clear all text and set to selected color
        MoneyInput.setText ("");
        MoneyInput.setForeground (Color.WHITE);
        
        ReceiptOutput.setText ("");
        ReceiptOutput.setForeground(Color.WHITE);
        
        buttonGroup1.clearSelection();

    }//GEN-LAST:event_ClearButtonActionPerformed

    private void NameInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameInputKeyTyped
        //Have text disappear when key is typed
        String a = NameInput.getText();
        if ("Enter Here...".equals(a))
        {
            NameInput.setText("");
        }
    }//GEN-LAST:event_NameInputKeyTyped

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        //Change text color
        NameInput.setForeground(Color.WHITE);
    }//GEN-LAST:event_NameInputActionPerformed

    private void BalanceInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BalanceInputKeyTyped
        //Have text disappear when key is typed
        String a = BalanceInput.getText();
        if ("And Here...".equals(a))
        {
            BalanceInput.setText("");
        }

    }//GEN-LAST:event_BalanceInputKeyTyped

    private void BalanceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceInputActionPerformed
        //Change text color
        NameInput.setForeground(Color.WHITE);
    }//GEN-LAST:event_BalanceInputActionPerformed

    
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(BankAccountUI_Tester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(BankAccountUI_Tester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(BankAccountUI_Tester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(BankAccountUI_Tester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BankAccountUI_Tester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JTextField BalanceInput;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton Create;
    private javax.swing.JPanel CreateAccountPanel;
    private javax.swing.JRadioButton DepositRadioButton;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel ManageAccountPanel;
    private javax.swing.JTextField MoneyInput;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameInput;
    private javax.swing.JButton NewUserButton;
    private javax.swing.JTextArea ReceiptOutput;
    private javax.swing.JRadioButton WithdrawRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
