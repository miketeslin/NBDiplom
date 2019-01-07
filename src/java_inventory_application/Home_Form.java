package java_inventory_application;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Home_Form extends javax.swing.JFrame {

    /**
     * Создание формы
     */
    
    public Home_Form() {
        
        initComponents();
        //ImageIcon imgThisImg = new ImageIcon("src\\images\\my_store.png");  
        //jLabel_BackgroundImage.setIcon(imgThisImg);

      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Products = new javax.swing.JButton();
        jButton_Customers = new javax.swing.JButton();
        jButton_Orders = new javax.swing.JButton();
        jButton_Categories = new javax.swing.JButton();
        jButton_Users = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(550, 350));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_Products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_products.png"))); // NOI18N
        jButton_Products.setText("Товары");
        jButton_Products.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ProductsMouseClicked(evt);
            }
        });
        jButton_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProductsActionPerformed(evt);
            }
        });

        jButton_Customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_clients.png"))); // NOI18N
        jButton_Customers.setText("Клиенты");
        jButton_Customers.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CustomersMouseClicked(evt);
            }
        });

        jButton_Orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_order.png"))); // NOI18N
        jButton_Orders.setText("Заказы");
        jButton_Orders.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_OrdersMouseClicked(evt);
            }
        });

        jButton_Categories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_category.png"))); // NOI18N
        jButton_Categories.setText("Категории");
        jButton_Categories.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CategoriesMouseClicked(evt);
            }
        });

        jButton_Users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_users.png"))); // NOI18N
        jButton_Users.setText("Пользователи");
        jButton_Users.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_UsersMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Пользователь: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Customers, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jButton_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Orders)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_Categories, jButton_Customers, jButton_Orders, jButton_Products, jButton_Users});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Products, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Orders, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_Categories, jButton_Customers, jButton_Orders, jButton_Products, jButton_Users});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ProductsMouseClicked
        MANAGE_PRODUCTS_FORM productForm = new MANAGE_PRODUCTS_FORM();
                productForm.pack();
                productForm.setVisible(true);
                productForm.setLocationRelativeTo(null);
                productForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_ProductsMouseClicked

    private void jButton_ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ProductsActionPerformed

    private void jButton_CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CustomersMouseClicked
MANAGE_CUSTOMERS_FORM customerForm = new MANAGE_CUSTOMERS_FORM();
                customerForm.pack();
                customerForm.setVisible(true);
                customerForm.setLocationRelativeTo(null);
                customerForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_CustomersMouseClicked

    private void jButton_OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_OrdersMouseClicked
       MANAGE_ORDERS_FORM orderForm = new MANAGE_ORDERS_FORM();
                orderForm.pack();
                orderForm.setVisible(true);
                orderForm.setLocationRelativeTo(null);
                orderForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_OrdersMouseClicked

    private void jButton_CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CategoriesMouseClicked
        MANAGE_CATEGORIES_FORM categoryForm = new MANAGE_CATEGORIES_FORM();
                categoryForm.pack();
                categoryForm.setVisible(true);
                categoryForm.setLocationRelativeTo(null);
                categoryForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_CategoriesMouseClicked

    private void jButton_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UsersMouseClicked
        MANAGE_USERS_FORM userForm = new MANAGE_USERS_FORM();
                userForm.pack();
                userForm.setVisible(true);
                userForm.setLocationRelativeTo(null);
                userForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_UsersMouseClicked

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
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Form().setVisible(true);
                
                        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Categories;
    private javax.swing.JButton jButton_Customers;
    private javax.swing.JButton jButton_Orders;
    private javax.swing.JButton jButton_Products;
    public javax.swing.JButton jButton_Users;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
