package proyectoteoria2;

import com.mongodb.BasicDBObject;
import java.awt.Color;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.bson.Document;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(this);
        tipos = dbd.getTipoTrabajo(null);

        btnOfertasEmpleo.setEnabled(false);
        btnCandidatos.setEnabled(false);
        btnREmpresa.setEnabled(false);
        btnRCandidato.setEnabled(false);
        jMenuItem2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventana_Empresas = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        ID_EmpReg = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        Name_EmpReg = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        CIF_EmpReg = new javax.swing.JTextField();
        CEO_EmpReg = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Pais_EmpReg = new javax.swing.JTextField();
        Depto_EmpReg = new javax.swing.JTextField();
        Municipio_EmpReg = new javax.swing.JTextField();
        Colonia_EmpReg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
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
        btnVerificar = new javax.swing.JButton();
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
        box_ExpectativaLab = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        box_TipoContrato = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        box_CategoriaEmp = new javax.swing.JComboBox<>();
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
        jLabel37 = new javax.swing.JLabel();
        espEmpleadoReg = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        ActivoSi = new javax.swing.JRadioButton();
        ActivoNo = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OtrosEstudios = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        SiAlergias = new javax.swing.JRadioButton();
        NoAlergias = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        SiCardiaco = new javax.swing.JRadioButton();
        NoCardiaco = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        SiRespira = new javax.swing.JRadioButton();
        NoRespira = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        SiMental = new javax.swing.JRadioButton();
        NoMental = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        txtEmpresaAnterior = new javax.swing.JTextField();
        txtPuestoAnterior = new javax.swing.JTextField();
        spnAniosExperiemcia = new javax.swing.JSpinner();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Opciones_Emp = new javax.swing.JPopupMenu();
        Modif_Emp = new javax.swing.JMenuItem();
        genre_reg = new javax.swing.ButtonGroup();
        genre_Fam = new javax.swing.ButtonGroup();
        seleccionMayor = new javax.swing.ButtonGroup();
        seleccionPreso = new javax.swing.ButtonGroup();
        seleccionLicencia = new javax.swing.ButtonGroup();
        seleccionActivo = new javax.swing.ButtonGroup();
        seleccionAlergias = new javax.swing.ButtonGroup();
        SeleccionRespira = new javax.swing.ButtonGroup();
        SeleccionCardiaco = new javax.swing.ButtonGroup();
        SeleccionMental = new javax.swing.ButtonGroup();
        Ventana_OfertasEmpleo = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        box_ListaEmpresas = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        Ventana_CrearOferta = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        tf_Sueldo = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        tf_Cargo = new javax.swing.JTextField();
        tf_AreaEmpresa = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        tf_CodeOferta = new javax.swing.JTextField();
        tf_Vacantes = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        box_TipoContratoOferta = new javax.swing.JComboBox<>();
        box_GradoAcademico = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        tf_EdadOferta = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        txtEmpresaAnterior_Oferta = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtPuestoAnterior_Oferta = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        spnAniosExperiemcia_Oferta = new javax.swing.JSpinner();
        jPanel18 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        SiAlergias_Oferta = new javax.swing.JRadioButton();
        NoAlergias_Oferta = new javax.swing.JRadioButton();
        jLabel75 = new javax.swing.JLabel();
        SiRespira_Oferta = new javax.swing.JRadioButton();
        NoRespira_Oferta = new javax.swing.JRadioButton();
        jLabel76 = new javax.swing.JLabel();
        SiCardiaco_Oferta = new javax.swing.JRadioButton();
        NoCardiaco_Oferta = new javax.swing.JRadioButton();
        JLabelMental = new javax.swing.JLabel();
        SiMental_Oferta = new javax.swing.JRadioButton();
        NoMental_Oferta = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        genre_Oferta = new javax.swing.ButtonGroup();
        Alergia_Oferta = new javax.swing.ButtonGroup();
        Respiratorio_Oferta = new javax.swing.ButtonGroup();
        Cardiaco_Oferta = new javax.swing.ButtonGroup();
        Mental_Oferta = new javax.swing.ButtonGroup();
        VentanaLogin = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        tf_User = new javax.swing.JTextField();
        pf_Contraseña = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnOfertasEmpleo = new javax.swing.JButton();
        btnRCandidato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCandidatos = new javax.swing.JButton();
        btnREmpresa = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Registro Empresa");

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Nombre");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("ID");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("CIF");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("CEO");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("País");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Departamento");

        jLabel54.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel54.setText("Dirección");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Municipio");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Ciudad/Calle/Colonia");

        jButton1.setText("Registrar Empresa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(0, 0, 102));
        jLabel57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("      Volver");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jLabel57.setOpaque(true);
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(ID_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(Name_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel50)
                                    .addComponent(CIF_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CEO_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Colonia_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Municipio_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pais_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Depto_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel47))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jButton1)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CIF_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEO_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(Pais_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(Depto_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(Municipio_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(Colonia_EmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout Ventana_EmpresasLayout = new javax.swing.GroupLayout(Ventana_Empresas.getContentPane());
        Ventana_Empresas.getContentPane().setLayout(Ventana_EmpresasLayout);
        Ventana_EmpresasLayout.setHorizontalGroup(
            Ventana_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Ventana_EmpresasLayout.setVerticalGroup(
            Ventana_EmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setForeground(new java.awt.Color(0, 51, 255));

        Tabla_Cand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Fecha", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel7.setText("Nacionalidad");

        jLabel8.setText("Género");

        genre_reg.add(genMasc);
        genMasc.setText("Másculino");

        genre_reg.add(genFem);
        genFem.setText("Femenino");

        jLabel9.setText("Fecha Nacimiento");

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
                .addContainerGap(276, Short.MAX_VALUE))
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

        listaFamiliares.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listaFamiliares);

        jLabel17.setText("ID");

        jLabel18.setText("Parentesco");

        box_Parentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padre", "Madre", "Hermano", "Hermana", "Hijo", "Hija", "Primo", "Prima", "Tio", "Tia", "Abuelo", "Abuela", "Nieto", "Nieta" }));

        btn_AgregarFamiliar.setText("Agregar Familiar");
        btn_AgregarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarFamiliarActionPerformed(evt);
            }
        });

        jLabel19.setText("Nombre");

        jLabel20.setText("Apellido");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
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
                                                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel2.setText("Categoría Empleado");

        box_CategoriaEmp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_CategoriaEmpItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reg_SalaryEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel2)
                    .addComponent(box_CategoriaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(box_ExpectativaLab, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_TipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
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
                    .addComponent(box_ExpectativaLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_TipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_CategoriaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        box_GradoAcademy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Superior", "PostGrado" }));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setText("Grado Académico");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setText("Especialización");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setText("Estudiante Activo");

        seleccionActivo.add(ActivoSi);
        ActivoSi.setText("Si");

        seleccionActivo.add(ActivoNo);
        ActivoNo.setText("No");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setText("Otros Estudios");

        OtrosEstudios.setColumns(20);
        OtrosEstudios.setRows(5);
        jScrollPane4.setViewportView(OtrosEstudios);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(box_GradoAcademy, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(ActivoSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ActivoNo)))
                .addGap(99, 99, 99)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel37)
                    .addComponent(espEmpleadoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_GradoAcademy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espEmpleadoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ActivoSi)
                        .addComponent(ActivoNo))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Académicos", jPanel10);

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel40.setText("Alergias");

        seleccionAlergias.add(SiAlergias);
        SiAlergias.setText("Si");

        seleccionAlergias.add(NoAlergias);
        NoAlergias.setText("No");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setText("Problemas Cardíacos");

        SeleccionCardiaco.add(SiCardiaco);
        SiCardiaco.setText("Si");

        SeleccionCardiaco.add(NoCardiaco);
        NoCardiaco.setText("No");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel42.setText("Problemas Respiratorios");

        SeleccionRespira.add(SiRespira);
        SiRespira.setText("Si");

        SeleccionRespira.add(NoRespira);
        NoRespira.setText("No");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setText("Problemas Mentales");

        SeleccionMental.add(SiMental);
        SiMental.setText("Si");

        SeleccionMental.add(NoMental);
        NoMental.setText("No");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(SiAlergias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoAlergias))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(SiCardiaco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoCardiaco))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(SiMental)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoMental))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(SiRespira)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoRespira))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42))))
                .addGap(172, 172, 172))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiAlergias)
                            .addComponent(NoAlergias)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiRespira)
                            .addComponent(NoRespira))))
                .addGap(45, 45, 45)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiCardiaco)
                            .addComponent(NoCardiaco)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiMental)
                            .addComponent(NoMental))))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Sanitarios", jPanel12);

        spnAniosExperiemcia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel44.setText("Puesto Anterior");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel45.setText("Años de Experiencia");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel46.setText("Empresa Anterior");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPuestoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpresaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(spnAniosExperiemcia, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel46)
                    .addContainerGap(524, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpresaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAniosExperiemcia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuestoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel46)
                    .addContainerGap(425, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Exp Laboral", jPanel13);

        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(204, 204, 204)
                                .addComponent(jLabel4))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jButton4)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(56, 56, 56))
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

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Lista de Empresas");

        jButton2.setText("Crear Oferta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(0, 0, 102));
        jLabel59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("      Volver");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jLabel59.setOpaque(true);
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(box_ListaEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_ListaEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(353, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Ventana_OfertasEmpleoLayout = new javax.swing.GroupLayout(Ventana_OfertasEmpleo.getContentPane());
        Ventana_OfertasEmpleo.getContentPane().setLayout(Ventana_OfertasEmpleoLayout);
        Ventana_OfertasEmpleoLayout.setHorizontalGroup(
            Ventana_OfertasEmpleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_OfertasEmpleoLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Ventana_OfertasEmpleoLayout.setVerticalGroup(
            Ventana_OfertasEmpleoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_OfertasEmpleoLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Oferta");
        jPanel15.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 83, -1, -1));

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Cargo");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Sueldo");

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Vacantes");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Grado Académico");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Tipo de Contrato");

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Código");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Área Empresa");

        box_TipoContratoOferta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Temporal", "Por Obra o Servicio", "Eventual", "De Internidad", "De Relevo", "De Formación y Aprendizaje", "De Prácticas" }));

        box_GradoAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Superior", "PostGrado" }));

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Edad");

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Género");

        genre_Oferta.add(jRadioButton1);
        jRadioButton1.setText("Masculino");

        genre_Oferta.add(jRadioButton2);
        jRadioButton2.setText("Femenino");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel64)
                        .addGap(208, 208, 208))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_CodeOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel62)
                                .addComponent(tf_AreaEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(tf_Cargo))
                            .addComponent(jLabel63)
                            .addComponent(jLabel66)
                            .addComponent(tf_Vacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(187, 187, 187)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel65)
                                    .addComponent(box_TipoContratoOferta, 0, 190, Short.MAX_VALUE)
                                    .addComponent(box_GradoAcademico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(163, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(tf_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(tf_EdadOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)))
                        .addGap(170, 170, 170))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_EdadOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_CodeOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_TipoContratoOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_GradoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(tf_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_AreaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_Vacantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );

        jTabbedPane2.addTab("Información General", jPanel16);

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel72.setText("Empresa Anterior");

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel73.setText("Puesto Anterior");

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel74.setText("Años de Experiencia");

        spnAniosExperiemcia_Oferta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtPuestoAnterior_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72)
                                    .addComponent(txtEmpresaAnterior_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spnAniosExperiemcia_Oferta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(137, 137, 137))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpresaAnterior_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPuestoAnterior_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnAniosExperiemcia_Oferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Experiencia Laboral", jPanel17);

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel67.setText("Alergias");

        Alergia_Oferta.add(SiAlergias_Oferta);
        SiAlergias_Oferta.setText("Si");

        Alergia_Oferta.add(NoAlergias_Oferta);
        NoAlergias_Oferta.setText("No");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel75.setText("Problemas Respiratorios");

        Respiratorio_Oferta.add(SiRespira_Oferta);
        SiRespira_Oferta.setText("Si");

        Respiratorio_Oferta.add(NoRespira_Oferta);
        NoRespira_Oferta.setText("No");

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel76.setText("Problemas Cardíacos");

        Cardiaco_Oferta.add(SiCardiaco_Oferta);
        SiCardiaco_Oferta.setText("Si");

        Cardiaco_Oferta.add(NoCardiaco_Oferta);
        NoCardiaco_Oferta.setText("No");

        JLabelMental.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLabelMental.setText("Problemas Mentales");

        Mental_Oferta.add(SiMental_Oferta);
        SiMental_Oferta.setText("Si");

        Mental_Oferta.add(NoMental_Oferta);
        NoMental_Oferta.setText("No");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(SiAlergias_Oferta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoAlergias_Oferta))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(SiCardiaco_Oferta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoCardiaco_Oferta))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel76))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(SiMental_Oferta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoMental_Oferta))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(SiRespira_Oferta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoRespira_Oferta))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelMental)
                            .addComponent(jLabel75))))
                .addGap(172, 172, 172))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiAlergias_Oferta)
                            .addComponent(NoAlergias_Oferta)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiRespira_Oferta)
                            .addComponent(NoRespira_Oferta))))
                .addGap(45, 45, 45)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiCardiaco_Oferta)
                            .addComponent(NoCardiaco_Oferta)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(JLabelMental)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SiMental_Oferta)
                            .addComponent(NoMental_Oferta))))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Dato Sanitario", jPanel18);

        jPanel15.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 480));

        jLabel69.setBackground(new java.awt.Color(0, 0, 102));
        jLabel69.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("      Volver");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 981, 65));

        jButton6.setText("Confirmar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, -1, -1));

        javax.swing.GroupLayout Ventana_CrearOfertaLayout = new javax.swing.GroupLayout(Ventana_CrearOferta.getContentPane());
        Ventana_CrearOferta.getContentPane().setLayout(Ventana_CrearOfertaLayout);
        Ventana_CrearOfertaLayout.setHorizontalGroup(
            Ventana_CrearOfertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_CrearOfertaLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        Ventana_CrearOfertaLayout.setVerticalGroup(
            Ventana_CrearOfertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_CrearOfertaLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));

        jLabel77.setBackground(new java.awt.Color(0, 0, 102));
        jLabel77.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("      Volver");
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jLabel77.setOpaque(true);
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Usuario");

        jLabel79.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Contraseña");

        jButton7.setText("Iniciar Sesión");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel78))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel79)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_User)
                            .addComponent(pf_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton7)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel78))
                    .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(pf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton7)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentanaLoginLayout = new javax.swing.GroupLayout(VentanaLogin.getContentPane());
        VentanaLogin.getContentPane().setLayout(VentanaLoginLayout);
        VentanaLoginLayout.setHorizontalGroup(
            VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        VentanaLoginLayout.setVerticalGroup(
            VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnOfertasEmpleo.setText("Ver Ofertas de Empleo");
        btnOfertasEmpleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasEmpleoActionPerformed(evt);
            }
        });

        btnRCandidato.setBackground(new java.awt.Color(153, 153, 255));
        btnRCandidato.setForeground(new java.awt.Color(0, 0, 0));
        btnRCandidato.setText("Registrar Candidato");
        btnRCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRCandidatoMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agencia de Empleos");

        jSeparator1.setBackground(new java.awt.Color(153, 51, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 51, 0));

        btnCandidatos.setText("Ver Candidatos");
        btnCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatosActionPerformed(evt);
            }
        });

        btnREmpresa.setBackground(new java.awt.Color(0, 0, 0));
        btnREmpresa.setForeground(new java.awt.Color(0, 0, 0));
        btnREmpresa.setText("Registrar Empresas");
        btnREmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnREmpresaMouseClicked(evt);
            }
        });

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
                .addContainerGap(144, Short.MAX_VALUE)
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
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 260));

        jMenu1.setText("Inicio");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Iniciar Sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
        this.dispose();
        Ventana_OfertasEmpleo.pack();
        Ventana_OfertasEmpleo.setLocationRelativeTo(this);
        Ventana_OfertasEmpleo.setVisible(true);
    }//GEN-LAST:event_btnOfertasEmpleoActionPerformed

    private void btnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosActionPerformed
        // boton ver empleados buscando empleo
        personas = dbd.getPersonas(new Document("curriculum", new BasicDBObject("$exists", true)));
        DefaultTableModel modelo = (DefaultTableModel) this.Tabla_Cand.getModel();
        System.out.println(personas.size());
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            Object row[] = {
                p.getId(),
                p.getNombre(),
                p.getApellido(),
                p.getFechaNacimiento(),
                p.getTelefono(),
                p.getCorreo(),};
            modelo.addRow(row);
        }
        modelo.fireTableDataChanged();
        this.Tabla_Cand.setModel(modelo);
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

            //Activo
            if (ActivoSi.isSelected()) {
                Activo = true;
                ActivoCadena = ActivoSi.getText();
            } else if (ActivoNo.isSelected()) {
                Activo = false;
                ActivoCadena = ActivoNo.getText();
            } else {
                Activo = false;
                ActivoCadena = "";
            }

            //Alergias
            if (SiAlergias.isSelected()) {
                Alergia = true;
                AlergiaCadena = SiAlergias.getText();
            } else if (NoAlergias.isSelected()) {
                Alergia = false;
                AlergiaCadena = NoAlergias.getText();
            } else {
                Alergia = false;
                AlergiaCadena = "";
            }

            //Respiratorios
            if (SiRespira.isSelected()) {
                Respirar = true;
                RespirarCadena = SiRespira.getText();
            } else if (NoRespira.isSelected()) {
                Respirar = false;
                RespirarCadena = NoRespira.getText();
            } else {
                Respirar = false;
                RespirarCadena = "";
            }

            //Cardiacos
            if (SiCardiaco.isSelected()) {
                Cardiaco = true;
                CardiacoCadena = SiCardiaco.getText();
            } else if (NoCardiaco.isSelected()) {
                Cardiaco = false;
                CardiacoCadena = NoCardiaco.getText();
            } else {
                Cardiaco = false;
                CardiacoCadena = "";
            }

            //Mentales
            if (SiMental.isSelected()) {
                Mental = true;
                MentalCadena = SiMental.getText();
            } else if (NoMental.isSelected()) {
                Mental = false;
                MentalCadena = NoMental.getText();
            } else {
                Mental = false;
                MentalCadena = "";
            }

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            String fechaCadena = sdf.format(new Date());

            //Validar vacios y nulos
            if (!"".equals(gen_selec) && reg_Nombre.getText().length() > 0 && reg_Apellido.getText().length() > 0 && reg_Nacionalidad.getText().length() > 0
                    && !"".equals(fechaCadena) && reg_PResidencia.getText().length() > 0 && reg_Estado.getText().length() > 0 && reg_Municipio.getText().length() > 0
                    && reg_Direccion.getText().length() > 0 && reg_Fijo.getText().length() > 0 && reg_Email.getText().length() > 0 && !"".equals(PresoCadena)
                    && !"".equals(MayorCadena) && !"".equals(LicenciaCadena) && reg_SalaryEsp.getText().length() > 0 && !"".equals(ActivoCadena)
                    && !"".equals(AlergiaCadena) && !"".equals(RespirarCadena) && !"".equals(MentalCadena) && !"".equals(CardiacoCadena)) {

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
                    List<Persona> verifica = dbd.getPersonas(d);
                    if (verifica.size() == 0) {
                        bandera = true;
                    } else {
                        bandera = false;
                    }
                } while (!bandera);

                Direccion address = new Direccion();
                address.setPais(reg_PResidencia.getText());
                address.setDepart(reg_Estado.getText());
                address.setMunicipio(reg_Municipio.getText());
                address.setColonia(reg_Direccion.getText());

                //Strings
                P.setId(idPersona);
                P.setNombre(reg_Nombre.getText());
                P.setApellido(reg_Apellido.getText());
                P.setGenero(gen_selec);
                P.setTelefono(reg_Fijo.getText());
                P.setNacionalidad(reg_Nacionalidad.getText());
                P.setCorreo(reg_Email.getText());

                //Nacimiento
                P.setFechaNacimiento(f);

                //Direccion
                P.setDireccion(address);

                //Dato Legal
                DatoLegal dl = new DatoLegal();
                dl.setEsMayor(Mayor);
                dl.setEstuvoPreso(Preso);
                dl.setTieneLicencia(Licencia);
                P.setLegalesD(dl);

                //Curriculum
                Curriculum c = new Curriculum();
                List<String> expLaboral = new ArrayList<>();
                expLaboral.add(box_ExpectativaLab.getSelectedItem().toString());
                c.setExpectativaLaboral(expLaboral);
                c.setSalarioEsperado(Integer.parseInt(reg_SalaryEsp.getText()));
                c.setTipoContrato(box_TipoContrato.getSelectedItem().toString());

                ExpLaboral el = new ExpLaboral();
                el.setAniosExp(Integer.parseInt(this.spnAniosExperiemcia.getValue().toString()));
                el.setTrabajoAnterior(this.txtEmpresaAnterior.getText());
                el.setPuestoAnterior(this.txtPuestoAnterior.getText());
                c.setExpLaboral(el);

                DatoAcademico da = new DatoAcademico();
                da.setGradoAcademico(box_GradoAcademy.getSelectedItem().toString());
                da.setEspacializacion(espEmpleadoReg.getText());
                da.setEstudianteActivo(Activo);
                List<String> estudioOtros = new ArrayList<>();
                estudioOtros.add(OtrosEstudios.getText());
                da.setOtrosEstudios(estudioOtros);
                c.setDatAcademicos(da);
                P.setCurriculum(c);

                P.setDatosSanitarios(new DatosSanitarios(Alergia, Respirar, Cardiaco, Mental));

                //Aqui validar lo de la identidad
                id_actual = idPersona;
                id_Mostrado.setText(idPersona);

                dbd.setPersonas(P);
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

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // BUSCAR EL ID PARA AGREGAR FAMILIAR

        refFamiliares = dbd.getPersonas(new Document("_id", verif_ID.getText()));
        if (!refFamiliares.isEmpty()) {

            verify_exist = true;
        } else {
            verify_exist = false;
        }

        //Validacion que existe el ID de la persona
        if (verify_exist) {
            lbl_Verify.setText("✓");
            lbl_Verify.setBackground(Color.green);
            this.verif_ID.setEnabled(false);
            activarControles(true);
        } else {
            //No lo agrega porque ningun ID coincide
            lbl_Verify.setText("x");
            lbl_Verify.setBackground(Color.red);
            //btn_AgregarFamiliar.setEnabled(false);
            this.verif_ID.setEnabled(true);
            activarControles(false);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btn_AgregarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarFamiliarActionPerformed
        if (verify_exist) {
            if (this.verif_ID.getText() != "" && this.box_Parentesco.getSelectedItem().toString() != "") {
                List<DatoFamiliar> temp = new ArrayList<>();
                temp.add(new DatoFamiliar(this.verif_ID.getText(), this.box_Parentesco.getSelectedItem().toString()));
                System.out.println(temp.get(0));
                P.setRefFamiliares(temp);
            }
        } else {
            if (this.verif_ID.getText() != "" && this.box_Parentesco.getSelectedItem().toString() != "" && this.reg_nomFamily.getText() != "") {

                String gen_selec_F = new String();
                if (genMascFam.isSelected()) {
                    gen_selec_F = genMascFam.getText();
                } else if (genFemFam.isSelected()) {
                    gen_selec_F = genFemFam.getText();
                } else {
                    gen_selec_F = "";
                }
                Persona PT = new Persona();
                PT.setId(this.verif_ID.getText());
                PT.setNombre(this.reg_nomFamily.getText());
                PT.setApellido(this.reg_LNameFam.getText());
                PT.setGenero(gen_selec_F);
                PT.setTelefono(this.tel_Fam.getText());
                PT.setNacionalidad(this.reg_NacFam.getText());
                PT.setCorreo(this.reg_EmailFam.getText());

                dbd.setPersonas(PT);

                P.getRefFamiliares().add(new DatoFamiliar(this.verif_ID.getText(), this.box_Parentesco.getSelectedItem().toString()));
            }
        }
        DefaultListModel modelo = (DefaultListModel) this.listaFamiliares.getModel();
        modelo.addElement(this.verif_ID.getText());
        this.listaFamiliares.setModel(modelo);
        this.verif_ID.setEnabled(false);
        this.box_Parentesco.setEnabled(false);
        this.btnVerificar.setEnabled(false);
        this.verif_ID.setText("");
        this.btn_AgregarFamiliar.setEnabled(false);
        this.activarControles(true);
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

    private void btnREmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnREmpresaMouseClicked
        //boton ver empresas
        this.dispose();
        Ventana_Empresas.pack();
        Ventana_Empresas.setLocationRelativeTo(this);
        Ventana_Empresas.setVisible(true);
    }//GEN-LAST:event_btnREmpresaMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        activarControles(false);
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.box_CategoriaEmp.getModel();
        for (CategoriaTrabajo tipo : tipos) {
            modelo.addElement(tipo.getNombreCategoria());
        }
        this.box_CategoriaEmp.setModel(modelo);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void box_CategoriaEmpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_CategoriaEmpItemStateChanged
        Object item = evt.getItem();
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            for (CategoriaTrabajo tipo : tipos) {
                if (tipo.getNombreCategoria() == item.toString()) {
                    DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.box_ExpectativaLab.getModel();
                    modelo.removeAllElements();
                    for (int i = 0; i < tipo.getPuestosTrabajo().size(); i++) {
                        modelo.addElement(tipo.getPuestosTrabajo().get(i));
                    }
                    this.box_ExpectativaLab.getModel();
                    break;
                }
            }
        }
    }//GEN-LAST:event_box_CategoriaEmpItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Registrar Empresa
        try {

            if (ID_EmpReg.getText().length() > 0 && Name_EmpReg.getText().length() > 0 && CIF_EmpReg.getText().length() > 0
                    && CEO_EmpReg.getText().length() > 0 && Pais_EmpReg.getText().length() > 0 && Depto_EmpReg.getText().length() > 0
                    && Municipio_EmpReg.getText().length() > 0 && Colonia_EmpReg.getText().length() > 0) {

                String address_emp = Pais_EmpReg.getText() + ", " + Depto_EmpReg.getText() + ", " + Municipio_EmpReg.getText()
                        + ", " + Colonia_EmpReg.getText();
                //Si no hay vacios se registra la empresa

                //GLOBAL
                Empresa em = new Empresa();
                em.setId(ID_EmpReg.getText());
                em.setNombre(Name_EmpReg.getText());
                em.setCeo(CEO_EmpReg.getText());
                em.setCif(CIF_EmpReg.getText());
                em.getDireccion().setPais(Pais_EmpReg.getText());
                em.getDireccion().setDepart(Depto_EmpReg.getText());
                em.getDireccion().setMunicipio(Municipio_EmpReg.getText());
                em.getDireccion().setColonia(Colonia_EmpReg.getText());

                JOptionPane.showMessageDialog(null, "Empresa Registrada Exitosamente!");
            } else {

                JOptionPane.showMessageDialog(null, "No se ha podido registrar");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        Ventana_Empresas.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //LOGIN
        this.dispose();
        VentanaLogin.pack();
        VentanaLogin.setLocationRelativeTo(this);
        VentanaLogin.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        // TODO add your handling code here:
        Ventana_OfertasEmpleo.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Crear Oferta
        Ventana_CrearOferta.pack();
        Ventana_CrearOferta.setLocationRelativeTo(this);
        Ventana_CrearOferta.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        Ventana_CrearOferta.dispose();
        Ventana_OfertasEmpleo.pack();
        Ventana_OfertasEmpleo.setLocationRelativeTo(this);
        Ventana_OfertasEmpleo.setVisible(true);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Confirmar Oferta
        try {
            //radiobotones

            //Alergias
            if (SiAlergias_Oferta.isSelected()) {
                Alergia_Ofertas = true;
                AlergiaCadena_Oferta = SiAlergias_Oferta.getText();
            } else if (NoAlergias_Oferta.isSelected()) {
                Alergia_Ofertas = false;
                AlergiaCadena_Oferta = NoAlergias_Oferta.getText();
            } else {
                Alergia_Ofertas = false;
                AlergiaCadena_Oferta = "";
            }

            //Respiratorios
            if (SiRespira_Oferta.isSelected()) {
                Respirar_Ofertas = true;
                RespirarCadena_Oferta = SiRespira_Oferta.getText();
            } else if (NoRespira_Oferta.isSelected()) {
                Respirar_Ofertas = false;
                RespirarCadena_Oferta = NoRespira_Oferta.getText();
            } else {
                Respirar_Ofertas = false;
                RespirarCadena_Oferta = "";
            }

            //Cardiacos
            if (SiCardiaco_Oferta.isSelected()) {
                Cardiaco_Ofertas = true;
                CardiacoCadena_Oferta = SiCardiaco_Oferta.getText();
            } else if (NoCardiaco_Oferta.isSelected()) {
                Cardiaco_Ofertas = false;
                CardiacoCadena_Oferta = NoCardiaco_Oferta.getText();
            } else {
                Cardiaco_Ofertas = false;
                CardiacoCadena_Oferta = "";
            }

            //Mentales
            if (SiMental_Oferta.isSelected()) {
                Mental_Ofertas = true;
                MentalCadena_Oferta = SiMental_Oferta.getText();
            } else if (NoMental_Oferta.isSelected()) {
                Mental_Ofertas = false;
                MentalCadena_Oferta = NoMental_Oferta.getText();
            } else {
                Mental_Ofertas = false;
                MentalCadena_Oferta = "";
            }

            //validacion de no vacios y no nulos
            if (tf_EdadOferta.getText().length() > 0 && tf_CodeOferta.getText().length() > 0 && tf_AreaEmpresa.getText().length() > 0
                    && tf_Cargo.getText().length() > 0 && tf_Vacantes.getText().length() > 0 && tf_Sueldo.getText().length() > 0 && !"".equals(AlergiaCadena_Oferta)
                    && !"".equals(CardiacoCadena_Oferta) && !"".equals(RespirarCadena_Oferta) && !"".equals(MentalCadena_Oferta)) {

                JOptionPane.showMessageDialog(this, "Oferta Creada!");
            } else {
                JOptionPane.showMessageDialog(this, "Datos Invalidos! Revise Nuevamente");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        //login
        VentanaLogin.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Iniciar Sesion
        if (tf_User.getText().equals(usuario) && pf_Contraseña.getText().equals(password)) {
            JOptionPane.showMessageDialog(this, "Bienvenido!");
            btnOfertasEmpleo.setEnabled(true);
            btnCandidatos.setEnabled(true);
            btnREmpresa.setEnabled(true);
            btnRCandidato.setEnabled(true);
            jMenuItem1.setEnabled(false);
            jMenuItem2.setEnabled(true);

            tf_User.setText("");
            pf_Contraseña.setText("");
            VentanaLogin.dispose();
            this.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Datos Incorrectos!");
            btnOfertasEmpleo.setEnabled(false);
            btnCandidatos.setEnabled(false);
            btnREmpresa.setEnabled(false);
            btnRCandidato.setEnabled(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // logout
        jMenuItem1.setEnabled(true);
        jMenuItem2.setEnabled(false);
        btnOfertasEmpleo.setEnabled(false);
        btnCandidatos.setEnabled(false);
        btnREmpresa.setEnabled(false);
        btnRCandidato.setEnabled(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void activarControles(boolean encendido) {
        if (encendido) {
            this.reg_nomFamily.setEnabled(false);
            this.reg_LNameFam.setEnabled(false);
            this.reg_NacFam.setEnabled(false);
            this.genMascFam.setEnabled(false);
            this.genFemFam.setEnabled(false);
            this.tel_Fam.setEnabled(false);
            this.reg_EmailFam.setEnabled(false);
            this.fechaNacReg.setEnabled(false);
        } else {
            this.reg_nomFamily.setEnabled(true);
            this.reg_LNameFam.setEnabled(true);
            this.reg_NacFam.setEnabled(true);
            this.genMascFam.setEnabled(true);
            this.genFemFam.setEnabled(true);
            this.tel_Fam.setEnabled(true);
            this.reg_EmailFam.setEnabled(true);
            this.fechaNacReg.setEnabled(true);
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
    private javax.swing.JRadioButton ActivoNo;
    private javax.swing.JRadioButton ActivoSi;
    private javax.swing.ButtonGroup Alergia_Oferta;
    private javax.swing.JTextField CEO_EmpReg;
    private javax.swing.JTextField CIF_EmpReg;
    private javax.swing.ButtonGroup Cardiaco_Oferta;
    private javax.swing.JTextField Colonia_EmpReg;
    private javax.swing.JTextField Depto_EmpReg;
    private javax.swing.JTextField IDDos;
    private javax.swing.JTextField IDTres;
    private javax.swing.JTextField IDUno;
    private javax.swing.JTextField ID_EmpReg;
    private javax.swing.JLabel JLabelMental;
    private javax.swing.ButtonGroup Mental_Oferta;
    private javax.swing.JMenuItem Modif_Emp;
    private javax.swing.JTextField Municipio_EmpReg;
    private javax.swing.JTextField Name_EmpReg;
    private javax.swing.JRadioButton NoAlergias;
    private javax.swing.JRadioButton NoAlergias_Oferta;
    private javax.swing.JRadioButton NoCardiaco;
    private javax.swing.JRadioButton NoCardiaco_Oferta;
    private javax.swing.JRadioButton NoMental;
    private javax.swing.JRadioButton NoMental_Oferta;
    private javax.swing.JRadioButton NoRespira;
    private javax.swing.JRadioButton NoRespira_Oferta;
    private javax.swing.JRadioButton No_Licencia;
    private javax.swing.JRadioButton No_Mayor;
    private javax.swing.JRadioButton No_Preso;
    private javax.swing.JPopupMenu Opciones_Emp;
    private javax.swing.JTextArea OtrosEstudios;
    private javax.swing.JTextField Pais_EmpReg;
    private javax.swing.ButtonGroup Respiratorio_Oferta;
    private javax.swing.ButtonGroup SeleccionCardiaco;
    private javax.swing.ButtonGroup SeleccionMental;
    private javax.swing.ButtonGroup SeleccionRespira;
    private javax.swing.JRadioButton SiAlergias;
    private javax.swing.JRadioButton SiAlergias_Oferta;
    private javax.swing.JRadioButton SiCardiaco;
    private javax.swing.JRadioButton SiCardiaco_Oferta;
    private javax.swing.JRadioButton SiMental;
    private javax.swing.JRadioButton SiMental_Oferta;
    private javax.swing.JRadioButton SiRespira;
    private javax.swing.JRadioButton SiRespira_Oferta;
    private javax.swing.JRadioButton Si_Licencia;
    private javax.swing.JRadioButton Si_Mayor;
    private javax.swing.JRadioButton Si_Preso;
    private javax.swing.JTable Tabla_AplCandidato;
    private javax.swing.JTable Tabla_Cand;
    private javax.swing.JDialog VentanaLogin;
    private javax.swing.JDialog Ventana_CrearOferta;
    private javax.swing.JDialog Ventana_Curriculum;
    private javax.swing.JDialog Ventana_Empleados;
    private javax.swing.JDialog Ventana_Empresas;
    private javax.swing.JDialog Ventana_OfertasEmpleo;
    private javax.swing.JComboBox<String> box_CategoriaEmp;
    private javax.swing.JComboBox<String> box_ExpectativaLab;
    private javax.swing.JComboBox<String> box_GradoAcademico;
    private javax.swing.JComboBox<String> box_GradoAcademy;
    private javax.swing.JComboBox<String> box_ListaEmpresas;
    private javax.swing.JComboBox<String> box_Parentesco;
    private javax.swing.JComboBox<String> box_TipoContrato;
    private javax.swing.JComboBox<String> box_TipoContratoOferta;
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnOfertasEmpleo;
    private javax.swing.JLabel btnRCandidato;
    private javax.swing.JLabel btnREmpresa;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btn_AgregarFamiliar;
    private javax.swing.JTextField espEmpleadoReg;
    private com.toedter.calendar.JDateChooser fechaNacReg;
    private com.toedter.calendar.JDateChooser fecha_Reg;
    private javax.swing.JRadioButton genFem;
    private javax.swing.JRadioButton genFemFam;
    private javax.swing.JRadioButton genMasc;
    private javax.swing.JRadioButton genMascFam;
    private javax.swing.ButtonGroup genre_Fam;
    private javax.swing.ButtonGroup genre_Oferta;
    private javax.swing.ButtonGroup genre_reg;
    private javax.swing.JTextField id_Mostrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Label lbl_Verify;
    private javax.swing.JList<String> listaFamiliares;
    private javax.swing.JPasswordField pf_Contraseña;
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
    private javax.swing.ButtonGroup seleccionActivo;
    private javax.swing.ButtonGroup seleccionAlergias;
    private javax.swing.ButtonGroup seleccionLicencia;
    private javax.swing.ButtonGroup seleccionMayor;
    private javax.swing.ButtonGroup seleccionPreso;
    private javax.swing.JSpinner spnAniosExperiemcia;
    private javax.swing.JSpinner spnAniosExperiemcia_Oferta;
    private javax.swing.JTextField tel_Fam;
    private javax.swing.JTextField tf_AreaEmpresa;
    private javax.swing.JTextField tf_Cargo;
    private javax.swing.JTextField tf_CodeOferta;
    private javax.swing.JTextField tf_EdadOferta;
    private javax.swing.JTextField tf_Sueldo;
    private javax.swing.JTextField tf_User;
    private javax.swing.JTextField tf_Vacantes;
    private javax.swing.JTextField txtEmpresaAnterior;
    private javax.swing.JTextField txtEmpresaAnterior_Oferta;
    private javax.swing.JTextField txtPuestoAnterior;
    private javax.swing.JTextField txtPuestoAnterior_Oferta;
    private javax.swing.JTextField verif_ID;
    // End of variables declaration//GEN-END:variables
    int fila_select = 0;
    boolean verify_reg = false;
    String gen_selec = "";
    Persona P = new Persona();
    List<Persona> personas = new ArrayList<>();
    List<Persona> refFamiliares = new ArrayList<>();
    boolean verify_exist = false;
    DriverDB dbd = new DriverDB();
    String id_actual = "";
    boolean Mayor = false;
    boolean Preso = false;
    boolean Licencia = false;
    String MayorCadena = "";
    String PresoCadena = "";
    String LicenciaCadena = "";

    //Activo
    boolean Activo = false;
    String ActivoCadena = "";

    //Alergias
    boolean Alergia = false;
    String AlergiaCadena = "";

    //Respiratorios
    boolean Respirar = false;
    String RespirarCadena = "";

    //Cardiacos
    boolean Cardiaco = false;
    String CardiacoCadena = "";

    //Mentales
    boolean Mental = false;
    String MentalCadena = "";

    List<CategoriaTrabajo> tipos = new ArrayList<>();

    //OFERTAS
    //Activo
    boolean Activo_Oferta = false;
    String ActivoCadena_Oferta = "";

    //Alergias
    boolean Alergia_Ofertas = false;
    String AlergiaCadena_Oferta = "";

    //Respiratorios
    boolean Respirar_Ofertas = false;
    String RespirarCadena_Oferta = "";

    //Cardiacos
    boolean Cardiaco_Ofertas = false;
    String CardiacoCadena_Oferta = "";

    //Mentales
    boolean Mental_Ofertas = false;
    String MentalCadena_Oferta = "";

    String usuario = "Jsandoval";
    String password = "j12345";
}
