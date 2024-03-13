/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package java2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author foxfox
 */
public class lab3 extends javax.swing.JPanel {
private List<hocsinh> studen = new ArrayList<>();
    DefaultTableModel tblModel;

    /**
     * Creates new form lab3
     */
    public lab3() {
        initComponents();
        initMajor();
        settable();
        setDataTablet();
    }

    public void initMajor() {
        String[] major = new String[]{"Phát Triển Phần Mềm", "Thiết Kế Đồ Họa"};
        DefaultComboBoxModel<String> boxModel = new DefaultComboBoxModel<>(major);
        cboNganh.setModel(boxModel);
    }

    public void settable() {
        tblModel = (DefaultTableModel) tblStuden.getModel();
        String[] cols = new String[]{"Họ và Tên", "Điểm", "Ngành", "Học lực", "Thưởng"};
        tblModel.setColumnIdentifiers(cols);
    }

    public void tableData() { // Thêm dữ liệu học sinh mẫu
        studen.add(new hocsinh("Tru", "Phát Triển Phần Mềm", 9));
        studen.add(new hocsinh("Yen Nhi", "Thiết Kế Đồ Họa", 9));
        studen.add(new hocsinh("Tien", "Phát Triển Phần Mềm", 7));
        studen.add(new hocsinh("Huy", "Phát Triển Phần Mềm", 6));
    }

    public void setDataTablet() {
        tblModel.setRowCount(0);
        for (hocsinh hs : studen ) {
            Object[] row = new Object[]{hs.getName(), hs.getPoint(), hs.getMajor(), hs.getHocLuc(), hs.isThuong()};
            tblModel.addRow(row);
        }
    }
    public void addStudent() {
        hocsinh hs = new hocsinh();
        hs.setName(txtName.getText());
        hs.setPoint(Double.parseDouble(txtPoint.getText()));
        hs.setMajor((String) cboNganh.getSelectedItem());
        txtHocLuc.setText(hs.getHocLuc());
        chkThuong.setSelected(hs.isThuong());
        studen.add(hs);
        setDataTablet();
        JOptionPane.showMessageDialog(this,"đã thêm");

    }
    public void showRows(){
        int index = tblStuden.getSelectedRow();
            txtName.setText(studen.get(index).getName());
            txtPoint.setText( String.valueOf(studen.get(index).getPoint()));
            cboNganh.setSelectedItem(studen.get(index).getMajor());
            txtHocLuc.setText(studen.get(index).getHocLuc());
            chkThuong.setSelected(studen.get(index).isThuong());
    }
    public void removeStuden() {
        int index = tblStuden.getSelectedRow();
        studen.remove(index);
        setDataTablet();
        JOptionPane.showMessageDialog(this," đã xoá");
    }
    public void updateStudent(){
        int index = tblStuden.getSelectedRow();
            hocsinh hs = studen.get(index);
            txtName.setText(studen.get(index).getName());
            txtPoint.setText(String.valueOf(studen.get(index).getPoint()));
            cboNganh.setSelectedItem(studen.get(index).getMajor());
            txtHocLuc.setText(studen.get(index).getHocLuc());
            chkThuong.setSelected(studen.get(index).isThuong());
            setDataTablet();
            JOptionPane.showMessageDialog(this, "Đã sửa đổi");
    }
    public void sortName(){
        Collections.sort(studen, ((hs1, hs2) ->
                (hs1.getName().compareTo(hs2.getName()))));
        setDataTablet();
    }
    public void sortPoint(){
        Collections.sort(studen, ((hs1, hs2) ->
            (int) (hs1.getPoint() - hs2.getPoint())));
        setDataTablet();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cboNganh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHocLuc = new javax.swing.JTextField();
        chkThuong = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        btnNhapmoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStuden = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnTheoTen = new javax.swing.JButton();
        btnTheoDiem = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản Lý Sinh Viên");

        cboNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNganhActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Họ Và Tên");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Điểm");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Ngành");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Học lực");

        txtHocLuc.setEnabled(false);
        txtHocLuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHocLucActionPerformed(evt);
            }
        });

        chkThuong.setText("Có phần thưởng ?");
        chkThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkThuongActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapnhat.setText("Cập Nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnNhapmoi.setText("Nhập mới");
        btnNhapmoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapmoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapnhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhapmoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapnhat)
                    .addComponent(btnNhapmoi))
                .addContainerGap())
        );

        tblStuden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ và Tên", "Điểm", "Ngành", "Học Lực", "Thưởng"
            }
        ));
        tblStuden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStuden);

        btnTheoTen.setText("Sắp Xếp Theo Tên");
        btnTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoTenActionPerformed(evt);
            }
        });

        btnTheoDiem.setText("Sắp Xếp Theo Điểm");
        btnTheoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnTheoTen)
                .addGap(29, 29, 29)
                .addComponent(btnTheoDiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTheoTen)
                    .addComponent(btnTheoDiem))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkThuong)
                            .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkThuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNganhActionPerformed

    private void btnNhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapmoiActionPerformed
        txtName.setText(null);
        txtHocLuc.setText(null);
        txtPoint.setText(null);
        chkThuong.setSelected(false);
    }//GEN-LAST:event_btnNhapmoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        removeStuden();
        btnNhapmoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        addStudent();
    }//GEN-LAST:event_btnThemActionPerformed
    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnCapnhatActionPerformed
    private void chkThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkThuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkThuongActionPerformed
    private void btnTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoTenActionPerformed
        sortName();
    }//GEN-LAST:event_btnTheoTenActionPerformed
    private void btnTheoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoDiemActionPerformed
        sortPoint();
    }//GEN-LAST:event_btnTheoDiemActionPerformed

    private void txtHocLucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHocLucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHocLucActionPerformed

    private void tblStudenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudenMouseClicked
        showRows();
    }//GEN-LAST:event_tblStudenMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnNhapmoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTheoDiem;
    private javax.swing.JButton btnTheoTen;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboNganh;
    private javax.swing.JCheckBox chkThuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblStuden;
    private javax.swing.JTextField txtHocLuc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPoint;
    // End of variables declaration//GEN-END:variables


}
