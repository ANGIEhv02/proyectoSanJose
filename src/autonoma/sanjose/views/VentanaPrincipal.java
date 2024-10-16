
package autonoma.sanjose.views;

import autonoma.sanjose.models.Hospital;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import autonoma.sanjose.views.AgregarPaciente;
import autonoma.sanjose.views. AgregarEmpleados;
import autonoma.sanjose.models.Medicamento;

/**
 *
 * @author herre
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private JButton btnGestionEmpleados;
    private JButton btnGestionPacientes;
    private JButton btnGestionFarmacia;
    private JButton btnReportes;
    private Hospital hospitalmain;
    private Hospital hospital;
    private JPanel BtnCitas;

    public VentanaPrincipal() {
        setTitle("Hospital San José St. Bonaventure - Ventana Principal");
        setSize(400, 300);
        setLocationRelativeTo(null); // Centra la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // Usar diseño nulo para posicionar los botones manualmente

        // Inicializar los botones
        btnGestionEmpleados = new JButton("Gestión de Empleados");
        btnGestionEmpleados.setBounds(100, 30, 200, 30);
        btnGestionPacientes = new JButton("Gestión de Pacientes");
        btnGestionPacientes.setBounds(100, 70, 200, 30);
        btnGestionFarmacia = new JButton("Gestión de Farmacia");
        btnGestionFarmacia.setBounds(100, 110, 200, 30);
        btnReportes = new JButton("Generar Reportes");
        btnReportes.setBounds(100, 150, 200, 30);

        // Agregar los botones a la ventana
        add(btnGestionEmpleados);
        add(btnGestionPacientes);
        add(btnGestionFarmacia);
        add(btnReportes);

        // Asignar acciones a los botones para abrir las otras ventanas
        btnGestionEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestionEmpleado gestionEmpleados = new GestionEmpleado();
                gestionEmpleados.setVisible(true);
            }
        });

      
        
    }
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Hospital hospital) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/sanJose/imagenes/hospital.png")).getImage());
        }catch(Exception e){
            
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
        btnFarmacia = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnFarma = new javax.swing.JButton();
        btnPaciente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnPacient = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNombreHospital = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnEmplead = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnFarmacia.setBackground(new java.awt.Color(204, 204, 255));
        btnFarmacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFarmaciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFarmaciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFarmaciaMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medicamento.png"))); // NOI18N

        btnFarma.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnFarma.setText("Farmacia");
        btnFarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnFarmaciaLayout = new javax.swing.GroupLayout(btnFarmacia);
        btnFarmacia.setLayout(btnFarmaciaLayout);
        btnFarmaciaLayout.setHorizontalGroup(
            btnFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFarmaciaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFarmaciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFarma)
                .addGap(42, 42, 42))
        );
        btnFarmaciaLayout.setVerticalGroup(
            btnFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFarmaciaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFarma)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnPaciente.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/sanjose/views/paciente.png"))); // NOI18N

        btnPacient.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnPacient.setText("Pacientes");
        btnPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPacienteLayout = new javax.swing.GroupLayout(btnPaciente);
        btnPaciente.setLayout(btnPacienteLayout);
        btnPacienteLayout.setHorizontalGroup(
            btnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPacienteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(btnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPacient)
                    .addComponent(jLabel8))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnPacienteLayout.setVerticalGroup(
            btnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnPacient)
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lblNombreHospital.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblNombreHospital.setText("Hospital San José St. Bonaventure");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hospital.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel2.setText("Vidal Antonio Morales - Angie Herrera Villa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombreHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblNombreHospital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N

        btnEmplead.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEmplead.setText("Empleados");
        btnEmplead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnEmplead)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmplead)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFarmaciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaciaMouseEntered
        this.mouseEntered(btnFarmacia);
    }//GEN-LAST:event_btnFarmaciaMouseEntered

    private void btnFarmaciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaciaMouseExited
         this.mouseExited(btnFarmacia);
    }//GEN-LAST:event_btnFarmaciaMouseExited

    private void btnFarmaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaciaMouseClicked
     
    }//GEN-LAST:event_btnFarmaciaMouseClicked

    private void btnFarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaActionPerformed
   
      
    }//GEN-LAST:event_btnFarmaActionPerformed

    private void btnPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientActionPerformed
      AgregarPaciente newframe = new AgregarPaciente();
      newframe.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnPacientActionPerformed

    private void btnEmpleadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadActionPerformed
      AgregarEmpleados newframe = new AgregarEmpleados();
      newframe.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnEmpleadActionPerformed

    private void BtnCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasMouseEntered
        this.mouseEntered(BtnCitas);
    }//GEN-LAST:event_BtnCitasMouseEntered

    private void BtnCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasMouseExited
        this.mouseExited(BtnCitas);
    }//GEN-LAST:event_BtnCitasMouseExited

    private void BtnFarmaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFarmaciaMouseClicked
        GestionFarmacia ventanaFarmacia = new GestionFarmacia ( this, true ,this.hospital,this);
        ventanaFarmacia.setVisible(true);
    }//GEN-LAST:event_BtnFarmaciaMouseClicked

    private void BtnPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPacientesMouseClicked
        
        
    }//GEN-LAST:event_BtnPacientesMouseClicked

    private void BtnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadoMouseClicked
      GestionEmpleado ventanaEmpleado = new GestionEmpleado (this,true,this.hospital,this);
      ventanaEmpleado.setVisible(true);
    }//GEN-LAST:event_BtnEmpleadoMouseClicked
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmplead;
    private javax.swing.JButton btnFarma;
    private javax.swing.JPanel btnFarmacia;
    private javax.swing.JButton btnPacient;
    private javax.swing.JPanel btnPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblNombreHospital;
    // End of variables declaration//GEN-END:variables

    private void mouseEntered(JPanel panel) {    
        panel.setBackground(new Color(200,255,255));
    }
    
    private void mouseExited (JPanel panel) {    
        panel.setBackground(new Color(255,255,255));
    }
}
