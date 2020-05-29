package proyectoteoria2;

import com.mongodb.BasicDBObject;
import java.awt.Color;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.bson.Document;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana_Empresas = new javax.swing.JDialog();
        Ventana_Empleados = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Cand = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_AplCandidato = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        Ventana_Curriculum = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        genMasc = new javax.swing.JRadioButton();
        genFem = new javax.swing.JRadioButton();
        reg_Nombre = new javax.swing.JTextField();
        reg_Apellido = new javax.swing.JTextField();
        reg_Nacionalidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fecha_Reg = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        id_Mostrado = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        IDUno = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        IDDos = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        IDTres = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        reg_PResidencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        reg_Estado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        reg_Municipio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        reg_Direccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        reg_Fijo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        reg_Email = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFamiliares = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        box_Parentesco = new javax.swing.JComboBox<>();
        btn_AgregarFamiliar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        reg_nomFamily = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        reg_LNameFam = new javax.swing.JTextField();
        verif_ID = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        reg_NacFam = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        genMascFam = new javax.swing.JRadioButton();
        genFemFam = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        tel_Fam = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        reg_EmailFam = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        fechaNacReg = new com.toedter.calendar.JDateChooser();
        lbl_Verify = new java.awt.Label();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        reg_SalaryEsp = new javax.swing.JTextField();
        box_Expectativa = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        box_TipoContrato = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Si_Mayor = new javax.swing.JRadioButton();
        No_Mayor = new javax.swing.JRadioButton();
        No_Preso = new javax.swing.JRadioButton();
        Si_Preso = new javax.swing.JRadioButton();
        No_Licencia = new javax.swing.JRadioButton();
        Si_Licencia = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        box_GradoAcademy = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Opciones_Emp = new javax.swing.JPopupMenu();
        Modif_Emp = new javax.swing.JMenuItem();
        genre_reg = new javax.swing.ButtonGroup();
        genre_Fam = new javax.swing.ButtonGroup();
        seleccionMayor = new javax.swing.ButtonGroup();
        seleccionPreso = new javax.swing.ButtonGroup();
        seleccionLicencia = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnOfertasEmpleo = new javax.swing.JButton();
        btnRCandidato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCandidatos = new javax.swing.JButton();
        btnREmpresa = new javax.swing.JLabel();

        javax.swing.GroupLayout Ventana_EmpresasLayout = new javax.swing.GroupLayout(Ventana_Empresas.getContentPane());
        Ventana_Empresas.getContentPane().setLayout(Ventana_EmpresasLayout);
        Ventana_EmpresasLayout.setHorizontalGroup(
            Ventana_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Ventana_EmpresasLayout.setVerticalGroup(
            Ventana_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setForeground(new java.awt.Color(0, 51, 255));

        Tabla_Cand.setModel(new DefaultTableModel());
        Tabla_Cand.setComponentPopupMenu(Opciones_Emp);
        Tabla_Cand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_CandMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Cand);

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel35.setText("Candidatos");

        Tabla_AplCandidato.setModel(new DefaultTableModel());
        jScrollPane3.setViewportView(Tabla_AplCandidato);

        jLabel36.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel36.setText("Aplicaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout Ventana_EmpleadosLayout = new javax.swing.GroupLayout(Ventana_Empleados.getContentPane());
        Ventana_Empleados.getContentPane().setLayout(Ventana_EmpleadosLayout);
        Ventana_EmpleadosLayout.setHorizontalGroup(
            Ventana_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Ventana_EmpleadosLayout.setVerticalGroup(
            Ventana_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Ventana_Curriculum.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setForeground(new java.awt.Color(0, 51, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Registro");

        jLabel3.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel7.setText("Nacionalidad");

        jLabel8.setText("Género");

        genre_reg.add(genMasc);
        genMasc.setText("Másculino");

        genre_reg.add(genFem);
        genFem.setText("Femenino");

        jLabel9.setText("Fecha Nacimiento");

        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setText("Su ID es:");

        id_Mostrado.setEnabled(false);

        jLabel28.setText("Número Identidad");

        IDUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDUnoKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel29.setText("-");

        IDDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDDosKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setText("-");

        IDTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDTresKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genMasc)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(reg_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(id_Mostrado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reg_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genFem)
                            .addComponent(reg_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(fecha_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel28))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(IDUno, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDDos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDTres, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(313, 313, 313))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reg_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(id_Mostrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(IDDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(IDTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fecha_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genMasc)
                    .addComponent(genFem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Personales", jPanel4);

        jLabel6.setText("Pais de Residencia");

        jLabel10.setText("Estado/Departamento");

        jLabel11.setText("Municipio");

        jLabel12.setText("Ciudad/Calle/Colonia");

        jLabel13.setText("Telefono");

        jLabel15.setText("Correo Electrónico");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(reg_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(reg_PResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(reg_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(reg_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(reg_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(reg_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reg_PResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reg_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reg_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reg_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contacto", jPanel5);

        jScrollPane2.setViewportView(listaFamiliares);

        jLabel17.setText("ID");

        jLabel18.setText("Parentesco");

        box_Parentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Hermano", "Hermana", "Hijo", "Hija", "Primo", "Prima", "Tio", "Tia", "Abuelo", "Abuela", "Nieto", "Nieta" }));

        btn_AgregarFamiliar.setText("Agregar Familiar");
        btn_AgregarFamiliar.setEnabled(false);
        btn_AgregarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarFamiliarActionPerformed(evt);
            }
        });

        jLabel19.setText("Nombre");

        jLabel20.setText("Apellido");

        jButton7.setText("Verificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel21.setText("Nacionalidad");

        jLabel22.setText("Género");

        genre_Fam.add(genMascFam);
        genMascFam.setText("Másculino");

        genre_Fam.add(genFemFam);
        genFemFam.setText("Femenino");

        jLabel23.setText("Teléfono");

        jLabel24.setText("Correo Electrónico");

        jLabel25.setText("Fecha Nacimiento");

        lbl_Verify.setBackground(new java.awt.Color(255, 0, 0));
        lbl_Verify.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_Verify.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Verify.setText("x");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(fechaNacReg, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel_Fam, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(reg_EmailFam, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel18)
                                                            .addComponent(jLabel19)
                                                            .addComponent(jLabel17))
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                                        .addComponent(jLabel20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(box_Parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(reg_nomFamily)
                                                        .addComponent(reg_LNameFam, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(verif_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(reg_NacFam, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))
                                        .addComponent(lbl_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(genMascFam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(genFemFam))
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AgregarFamiliar)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_AgregarFamiliar))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(verif_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Verify, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(box_Parentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(reg_nomFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reg_LNameFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(reg_NacFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(genMascFam)
                                    .addComponent(genFemFam))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tel_Fam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reg_EmailFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaNacReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        jTabbedPane1.addTab("Familiares", jPanel7);

        jLabel16.setText("Salario Esperado");

        jLabel26.setText("Expectativa Laboral");

        jLabel27.setText("Tipo de Contrato");

        box_TipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Temporal", "Por Obra o Servicio", "Eventual", "De Internidad", "De Relevo", "De Formación y Aprendizaje", "De Prácticas" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reg_SalaryEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(130, 130, 130)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(box_Expectativa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_TipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_SalaryEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_Expectativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_TipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Curriculum", jPanel8);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setText("Es Mayor");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel32.setText("Estuvo Preso");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setText("Tiene Licencia");

        seleccionMayor.add(Si_Mayor);
        Si_Mayor.setText("Si");

        seleccionMayor.add(No_Mayor);
        No_Mayor.setText("No");

        seleccionPreso.add(No_Preso);
        No_Preso.setText("No");

        seleccionPreso.add(Si_Preso);
        Si_Preso.setText("Si");

        seleccionLicencia.add(No_Licencia);
        No_Licencia.setText("No");

        seleccionLicencia.add(Si_Licencia);
        Si_Licencia.setText("Si");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(Si_Licencia)
                        .addGap(18, 18, 18)
                        .addComponent(No_Licencia))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(Si_Preso)
                        .addGap(18, 18, 18)
                        .addComponent(No_Preso))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(Si_Mayor)
                        .addGap(18, 18, 18)
                        .addComponent(No_Mayor))
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addContainerGap(576, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Si_Mayor)
                    .addComponent(No_Mayor))
                .addGap(61, 61, 61)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Si_Preso)
                    .addComponent(No_Preso))
                .addGap(67, 67, 67)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Si_Licencia)
                    .addComponent(No_Licencia))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Legales", jPanel9);

        box_GradoAcademy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachiller", "Licenciado", "Magíster", "Doctorado" }));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setText("Grado Académico");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(box_GradoAcademy, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_GradoAcademy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Académicos", jPanel10);

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel4))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(94, 94, 94))
        );

        Ventana_Curriculum.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Modif_Emp.setText("Modificar");
        Modif_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modif_EmpActionPerformed(evt);
            }
        });
        Opciones_Emp.add(Modif_Emp);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        btnOfertasEmpleo.setText("Ver Ofertas de Empleo");
        btnOfertasEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasEmpleoActionPerformed(evt);
            }
        });

        btnRCandidato.setBackground(new java.awt.Color(153, 153, 255));
        btnRCandidato.setForeground(new java.awt.Color(153, 153, 255));
        btnRCandidato.setText("Registrar Candidato");
        btnRCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCandidatoMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Agencia de Empleos");

        btnCandidatos.setText("Ver Candidatos");
        btnCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatosActionPerformed(evt);
            }
        });

        btnREmpresa.setForeground(new java.awt.Color(153, 153, 255));
        btnREmpresa.setText("Resgistrar Empresas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCandidatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOfertasEmpleo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnREmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOfertasEmpleo))
                    .addComponent(btnREmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCandidatos)
                    .addComponent(btnRCandidato))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRCandidatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRCandidatoMouseClicked
        //Registrar empleado
        this.dispose();
        Ventana_Curriculum.pack();
        Ventana_Curriculum.setLocationRelativeTo(this);
        Ventana_Curriculum.setVisible(true);
    }//GEN-LAST:event_btnRCandidatoMouseClicked

    private void btnOfertasEmpleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasEmpleoActionPerformed
        //boton ver empresas
        Ventana_Empresas.pack();
        Ventana_Empresas.setLocationRelativeTo(this);
        Ventana_Empresas.setVisible(true);
    }//GEN-LAST:event_btnOfertasEmpleoActionPerformed

    private void btnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosActionPerformed
        // boton ver empleados buscando empleo
        this.dispose();
        Ventana_Empleados.pack();
        Ventana_Empleados.setLocationRelativeTo(this);
        Ventana_Empleados.setVisible(true);
    }//GEN-LAST:event_btnCandidatosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Retornar a menu
        Ventana_Empleados.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Tabla_CandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_CandMouseClicked
        //seleccionar fila
        try {
            //TableModel modelo = Tabla_Emp.getModel();
            fila_select = Tabla_Cand.getSelectedRow();
            System.out.println("Fila Seleccionada: " + fila_select);

            //abrir click derecho para ver curriculum
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Tabla_CandMouseClicked

    private void Modif_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modif_EmpActionPerformed
        // Boton Modificar
        try {
            System.out.println("Fila Seleccionada: " + fila_select);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Modif_EmpActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Registrar
        Persona P = new Persona();
        try {
            if (genMasc.isSelected()) {
                gen_selec = genMasc.getText();
            } else if (genFem.isSelected()) {
                gen_selec = genFem.getText();
            } else {
                gen_selec = "";
            }

            //Aqui datos legales
            //Mayor
            if (Si_Mayor.isSelected()) {
                Mayor = true;
                MayorCadena = Si_Mayor.getText();
            } else if (No_Mayor.isSelected()) {
                Mayor = false;
                MayorCadena = No_Mayor.getText();
            } else {
                Mayor = false;
                MayorCadena = "";
            }

            //Preso
            if (Si_Preso.isSelected()) {
                Preso = true;
                PresoCadena = Si_Preso.getText();
            } else if (No_Preso.isSelected()) {
                Preso = false;
                PresoCadena = No_Preso.getText();
            } else {
                Preso = false;
                PresoCadena = "";
            }

            //Licencia
            if (Si_Licencia.isSelected()) {
                Licencia = true;
                LicenciaCadena = Si_Licencia.getText();
            } else if (No_Licencia.isSelected()) {
                Licencia = false;
                LicenciaCadena = No_Licencia.getText();
            } else {
                Licencia = false;
                LicenciaCadena = "";
            }

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String fechaCadena = sdf.format(new Date());
            if (!"".equals(gen_selec) && reg_Nombre.getText().length() > 0 && reg_Apellido.getText().length() > 0 && reg_Nacionalidad.getText().length() > 0
                    && !"".equals(fechaCadena) && reg_PResidencia.getText().length() > 0 && reg_Estado.getText().length() > 0 && reg_Municipio.getText().length() > 0
                    && reg_Direccion.getText().length() > 0 && reg_Fijo.getText().length() > 0 && reg_Email.getText().length() > 0 && !"".equals(PresoCadena)
                    && !"".equals(MayorCadena) && !"".equals(LicenciaCadena)) {

                verify_reg = true;
                JOptionPane.showMessageDialog(null, "Registrado con Exito");

                //agarrar la fecha de nacimiento
                Date f = fecha_Reg.getDate();

                //crear nuevo empleado
                String idPersona = "";

                boolean bandera = false;
                //Verificar que el ID no se repita
                do {

                    int random = (int) (Math.random() * 9999);
                    idPersona = "C" + random;
                    Document d = new Document("_id", idPersona);
                    // dbd.getPersonas(d);

                } while (bandera == false);

                Direccion address = new Direccion();
                address.setPais(reg_PResidencia.getText());
                address.setDepart(idPersona);
                address.setMunicipio(gen_selec);
                address.setColonia(idPersona);
//                String pais = address.getPais();
//                String depto = address.getDepart();
//                String muni = address.getMunicipio();
//                String barrio = address.getColonia();

                //Strings
                P.setId(idPersona);
                P.setNombre(reg_Nombre.getText());
                P.setApellido(reg_Apellido.getText());
                P.setGenero(genMasc.getText());
                P.setTelefono(reg_Fijo.getText());
                P.setNacionalidad(reg_Nacionalidad.getText());
                P.setCorreo(reg_Email.getText());

                //Nacimiento
                P.setFechaNacimiento(f);

                //Direccion
                P.setDireccion(address);

                //Aqui validar lo de la identidad
                id_actual = idPersona;
                id_Mostrado.setText(idPersona);

            } else {
                verify_reg = false;
                JOptionPane.showMessageDialog(null, "Error al registrarse!");
            }
        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Ventana_Curriculum.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BUSCAR EL ID PARA AGREGAR FAMILIAR

        List<Persona> verificarPers = dbd.getPersonas(new Document("_id", verif_ID.getText()));
        if (!verificarPers.isEmpty()) {

            verify_exist = true;
        } else {
            verify_exist = false;
        }

        //Validacion que existe el ID de la persona
        if (verify_exist) {
            lbl_Verify.setText("✓");
            lbl_Verify.setBackground(Color.green);
            btn_AgregarFamiliar.setEnabled(true);
        } else {
            //No lo agrega porque ningun ID coincide
            lbl_Verify.setText("x");
            lbl_Verify.setBackground(Color.red);
            btn_AgregarFamiliar.setEnabled(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_AgregarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarFamiliarActionPerformed
        // Agregar un familiar

    }//GEN-LAST:event_btn_AgregarFamiliarActionPerformed

    private void IDUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDUnoKeyTyped
        // Limite primeros 4 digitos

        int limit = 4;
        if (IDUno.getText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_IDUnoKeyTyped

    private void IDDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDDosKeyTyped
        // Limite primeros 4 digitos

        int limit = 4;
        if (IDDos.getText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_IDDosKeyTyped

    private void IDTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTresKeyTyped
        // Limite primeros 5 digitos

        int limit = 5;
        if (IDTres.getText().length() == limit) {
            evt.consume();
        }
    }//GEN-LAST:event_IDTresKeyTyped

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDDos;
    private javax.swing.JTextField IDTres;
    private javax.swing.JTextField IDUno;
    private javax.swing.JMenuItem Modif_Emp;
    private javax.swing.JRadioButton No_Licencia;
    private javax.swing.JRadioButton No_Mayor;
    private javax.swing.JRadioButton No_Preso;
    private javax.swing.JPopupMenu Opciones_Emp;
    private javax.swing.JRadioButton Si_Licencia;
    private javax.swing.JRadioButton Si_Mayor;
    private javax.swing.JRadioButton Si_Preso;
    private javax.swing.JTable Tabla_AplCandidato;
    private javax.swing.JTable Tabla_Cand;
    private javax.swing.JDialog Ventana_Curriculum;
    private javax.swing.JDialog Ventana_Empleados;
    private javax.swing.JDialog Ventana_Empresas;
    private javax.swing.JComboBox<String> box_Expectativa;
    private javax.swing.JComboBox<String> box_GradoAcademy;
    private javax.swing.JComboBox<String> box_Parentesco;
    private javax.swing.JComboBox<String> box_TipoContrato;
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnOfertasEmpleo;
    private javax.swing.JLabel btnRCandidato;
    private javax.swing.JLabel btnREmpresa;
    private javax.swing.JButton btn_AgregarFamiliar;
    private com.toedter.calendar.JDateChooser fechaNacReg;
    private com.toedter.calendar.JDateChooser fecha_Reg;
    private javax.swing.JRadioButton genFem;
    private javax.swing.JRadioButton genFemFam;
    private javax.swing.JRadioButton genMasc;
    private javax.swing.JRadioButton genMascFam;
    private javax.swing.ButtonGroup genre_Fam;
    private javax.swing.ButtonGroup genre_reg;
    private javax.swing.JTextField id_Mostrado;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label lbl_Verify;
    private javax.swing.JList<String> listaFamiliares;
    private javax.swing.JTextField reg_Apellido;
    private javax.swing.JTextField reg_Direccion;
    private javax.swing.JTextField reg_Email;
    private javax.swing.JTextField reg_EmailFam;
    private javax.swing.JTextField reg_Estado;
    private javax.swing.JTextField reg_Fijo;
    private javax.swing.JTextField reg_LNameFam;
    private javax.swing.JTextField reg_Municipio;
    private javax.swing.JTextField reg_NacFam;
    private javax.swing.JTextField reg_Nacionalidad;
    private javax.swing.JTextField reg_Nombre;
    private javax.swing.JTextField reg_PResidencia;
    private javax.swing.JTextField reg_SalaryEsp;
    private javax.swing.JTextField reg_nomFamily;
    private javax.swing.ButtonGroup seleccionLicencia;
    private javax.swing.ButtonGroup seleccionMayor;
    private javax.swing.ButtonGroup seleccionPreso;
    private javax.swing.JTextField tel_Fam;
    private javax.swing.JTextField verif_ID;
    // End of variables declaration//GEN-END:variables
    int fila_select = 0;
    boolean verify_reg = false;
    String gen_selec = "";
    List<Persona> personas = new ArrayList<>();
    boolean verify_exist = false;
    DriverDB dbd = new DriverDB();
    String id_actual = "";
    boolean Mayor = false;
    boolean Preso = false;
    boolean Licencia = false;
    String MayorCadena = "";
    String PresoCadena = "";
    String LicenciaCadena = "";
}
