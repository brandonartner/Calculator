/*
 * Authors: Brandon Artner & Michael Bennett
 * Assignment: Lab 2
 * Date: 2/7/16
 */
package simplecalculator;

/**
 *
 * @author brandon
 */
public class calculator extends javax.swing.JFrame {

    public String curOp;
    public String firstVar;
    public String secondVar;
    public boolean hasNum;
    
    
    /**
     * Creates new form calculator
     */
    public calculator() {
        this.hasNum = false;
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

        sevenButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        workspaceTextBox = new javax.swing.JTextField();
        nineButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        diffButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        percentButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sevenButton.setText("7");
        sevenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenButtonMouseClicked(evt);
            }
        });

        plusButton.setText("+");
        plusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusButtonMouseClicked(evt);
            }
        });

        eightButton.setText("8");
        eightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightButtonMouseClicked(evt);
            }
        });

        workspaceTextBox.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        workspaceTextBox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        workspaceTextBox.setText("0");

        nineButton.setText("9");
        nineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineButtonMouseClicked(evt);
            }
        });

        equalButton.setText("=");
        equalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalButtonMouseClicked(evt);
            }
        });

        divButton.setText("/");
        divButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divButtonMouseClicked(evt);
            }
        });

        zeroButton.setText("0");
        zeroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroButtonMouseClicked(evt);
            }
        });

        fourButton.setText("4");
        fourButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourButtonMouseClicked(evt);
            }
        });

        fiveButton.setText("5");
        fiveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveButtonMouseClicked(evt);
            }
        });

        dotButton.setText(".");
        dotButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotButtonMouseClicked(evt);
            }
        });

        sixButton.setText("6");
        sixButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixButtonMouseClicked(evt);
            }
        });

        diffButton.setText("-");
        diffButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diffButtonMouseClicked(evt);
            }
        });

        oneButton.setText("1");
        oneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneButtonMouseClicked(evt);
            }
        });

        clearButton.setText("C");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        signButton.setText("+/-");
        signButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signButtonMouseClicked(evt);
            }
        });

        percentButton.setText("%");
        percentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                percentButtonMouseClicked(evt);
            }
        });

        twoButton.setText("2");
        twoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoButtonMouseClicked(evt);
            }
        });

        multButton.setText("*");
        multButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multButtonMouseClicked(evt);
            }
        });

        threeButton.setText("3");
        threeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(workspaceTextBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workspaceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appendNumber(String num)
    {
        String temp;
        
        temp = this.workspaceTextBox.getText();
        if(!temp.equals("0") && !this.hasNum)
            this.workspaceTextBox.setText(temp + num);
        else
            this.workspaceTextBox.setText(num);
    }
    
    private void operation(String op)
    {
        String temp;
        
        temp = this.workspaceTextBox.getText();
        
        if(this.firstVar == null && !op.equals("%"))
        {
            this.curOp = op;
            this.firstVar = temp;
            this.workspaceTextBox.setText("0");
        }
        else if(op.equals("%"))     // If the operation is % then it only has one operand, so it is a special case
        {
            this.curOp = "%";       // Set up the operator
            this.firstVar = this.workspaceTextBox.getText();    // Set  up the operand
            this.firstVar = calculate();
            this.workspaceTextBox.setText(this.firstVar);
            this.curOp = null;
        }
        else
        {
            this.firstVar = calculate();
            this.workspaceTextBox.setText(this.firstVar);
            this.curOp = op;
        }
    }
    
    public String calculate()
    {
        double result = 0;
        
        switch(this.curOp)
        {
            case "+":
                result = Double.valueOf(this.firstVar)+Double.valueOf(this.workspaceTextBox.getText());
                break;
            case "-":
                result = Double.valueOf(this.firstVar)-Double.valueOf(this.workspaceTextBox.getText());
                break;
            case "/":
                if(!this.workspaceTextBox.getText().equals("0"))
                    result = Double.valueOf(this.firstVar)/Double.valueOf(this.workspaceTextBox.getText());
                else
                {
                    this.workspaceTextBox.setText("Warning: Cannot divide by 0.");
                    try {
                        Thread.sleep(1000);                 //1000 milliseconds is one second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case "*":
                result = Double.valueOf(this.firstVar)*Double.valueOf(this.workspaceTextBox.getText());
                break;
            case "%":
                result = Double.valueOf(this.firstVar)/100;
                break;
        }
        
        return String.valueOf(result);
    }
    
    private void sevenButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenButtonMouseClicked
        appendNumber("7");
    }//GEN-LAST:event_sevenButtonMouseClicked

    private void plusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusButtonMouseClicked
        operation("+");
    }//GEN-LAST:event_plusButtonMouseClicked

    private void eightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightButtonMouseClicked
        appendNumber("8");
    }//GEN-LAST:event_eightButtonMouseClicked

    private void nineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineButtonMouseClicked
        appendNumber("9");
    }//GEN-LAST:event_nineButtonMouseClicked

    private void equalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalButtonMouseClicked
        this.firstVar = calculate();
        this.workspaceTextBox.setText(this.firstVar);
        this.hasNum = true;
    }//GEN-LAST:event_equalButtonMouseClicked

    private void divButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divButtonMouseClicked
        operation("/");
    }//GEN-LAST:event_divButtonMouseClicked

    private void zeroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroButtonMouseClicked
        if(!this.workspaceTextBox.getText().equals("0"))
            appendNumber("0");
    }//GEN-LAST:event_zeroButtonMouseClicked

    private void fourButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourButtonMouseClicked
        appendNumber("4");
    }//GEN-LAST:event_fourButtonMouseClicked

    private void fiveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveButtonMouseClicked
        appendNumber("5");
    }//GEN-LAST:event_fiveButtonMouseClicked

    private void dotButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotButtonMouseClicked
        appendNumber(".");
    }//GEN-LAST:event_dotButtonMouseClicked

    private void sixButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixButtonMouseClicked
        appendNumber("6");
    }//GEN-LAST:event_sixButtonMouseClicked

    private void diffButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diffButtonMouseClicked
        operation("-");
    }//GEN-LAST:event_diffButtonMouseClicked

    private void oneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneButtonMouseClicked
        appendNumber("1");
    }//GEN-LAST:event_oneButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        this.workspaceTextBox.setText("0");
        this.curOp = null;
        this.firstVar = null;
        this.secondVar = null;
        this.hasNum = false;
    }//GEN-LAST:event_clearButtonMouseClicked

    private void signButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signButtonMouseClicked
        if(this.workspaceTextBox.getText().toCharArray()[0] == '-')
        this.workspaceTextBox.setText(this.workspaceTextBox.getText().substring(1));
        else
        this.workspaceTextBox.setText("-" + this.workspaceTextBox.getText());
    }//GEN-LAST:event_signButtonMouseClicked

    private void percentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percentButtonMouseClicked
        operation("%");
    }//GEN-LAST:event_percentButtonMouseClicked

    private void twoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoButtonMouseClicked
        appendNumber("2");
    }//GEN-LAST:event_twoButtonMouseClicked

    private void multButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multButtonMouseClicked
        operation("*");
    }//GEN-LAST:event_multButtonMouseClicked

    private void threeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeButtonMouseClicked
        appendNumber("3");
    }//GEN-LAST:event_threeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton diffButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton multButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton percentButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton signButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JTextField workspaceTextBox;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
