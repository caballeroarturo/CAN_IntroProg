import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class VentanaClinica extends JFrame {

    // Componentes de Registro
    private JTextField txtNomMascota, txtFecNac, txtRaza, txtVacuna;
    private JComboBox<String> cmbEspecie;
    private JTextField txtNomPpal, txtTelPpal, txtDomPpal;
    private JComboBox<String> cmbSexoPpal;
    private JTextField txtNomSec, txtTelSec;
    private JComboBox<String> cmbSexoSec;

    // Componentes de Búsqueda
    private JTextField txtBuscador;
    private JTable tablaResultados;
    private DefaultTableModel modeloTabla;

    public VentanaClinica() {
        // Inicializamos la BD y tablas
        ConexionBD.crearTablas();

        setTitle("Sistema Integral - Clínica Veterinaria");
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Usamos Pestañas para organizar la interfaz
        JTabbedPane pestañas = new JTabbedPane();
        pestañas.add("Registrar Paciente", crearPanelRegistro());
        pestañas.add("Buscar Pacientes", crearPanelBusqueda());

        add(pestañas);
    }

    private JPanel crearPanelRegistro() {
        JPanel panel = new JPanel(null);

        // Sección Animal
        JLabel l1 = new JLabel("--- DATOS DEL ANIMAL ---");
        l1.setBounds(30, 20, 200, 25);
        panel.add(l1);

        JLabel lNom = new JLabel("Nombre:"); lNom.setBounds(30, 50, 100, 25); panel.add(lNom);
        txtNomMascota = new JTextField(); txtNomMascota.setBounds(130, 50, 150, 25); panel.add(txtNomMascota);

        JLabel lEsp = new JLabel("Especie:"); lEsp.setBounds(300, 50, 100, 25); panel.add(lEsp);
        cmbEspecie = new JComboBox<>(new String[]{"Perro", "Gato", "Pato", "Vaca", "Perico", "Hamster"});
        cmbEspecie.setBounds(390, 50, 150, 25); panel.add(cmbEspecie);

        JLabel lFec = new JLabel("Nacimiento:"); lFec.setBounds(30, 85, 100, 25); panel.add(lFec);
        txtFecNac = new JTextField("YYYY-MM-DD"); txtFecNac.setBounds(130, 85, 150, 25); panel.add(txtFecNac);

        JLabel lRaza = new JLabel("Raza:"); lRaza.setBounds(300, 85, 100, 25); panel.add(lRaza);
        txtRaza = new JTextField(); txtRaza.setBounds(390, 85, 150, 25); panel.add(txtRaza);

        // Sección Dueño Principal
        JLabel l2 = new JLabel("--- DUEÑO PRINCIPAL ---");
        l2.setBounds(30, 130, 200, 25); panel.add(l2);

        JLabel lNP = new JLabel("Nombre:"); lNP.setBounds(30, 160, 100, 25); panel.add(lNP);
        txtNomPpal = new JTextField(); txtNomPpal.setBounds(130, 160, 150, 25); panel.add(txtNomPpal);

        JLabel lTP = new JLabel("Teléfono:"); lTP.setBounds(300, 160, 100, 25); panel.add(lTP);
        txtTelPpal = new JTextField(); txtTelPpal.setBounds(390, 160, 150, 25); panel.add(txtTelPpal);

        JLabel lSP = new JLabel("Sexo:"); lSP.setBounds(30, 195, 100, 25); panel.add(lSP);
        cmbSexoPpal = new JComboBox<>(new String[]{"Masculino", "Femenino", "Otro"});
        cmbSexoPpal.setBounds(130, 195, 150, 25); panel.add(cmbSexoPpal);

        JLabel lDP = new JLabel("Domicilio:"); lDP.setBounds(300, 195, 100, 25); panel.add(lDP);
        txtDomPpal = new JTextField(); txtDomPpal.setBounds(390, 195, 195, 25); panel.add(txtDomPpal);

        // Sección Dueño Secundario y Vacuna
        JLabel l3 = new JLabel("--- SECUNDARIO Y VACUNA ---");
        l3.setBounds(30, 240, 200, 25); panel.add(l3);

        JLabel lNS = new JLabel("Nom. Secundario:"); lNS.setBounds(30, 270, 110, 25); panel.add(lNS);
        txtNomSec = new JTextField(); txtNomSec.setBounds(130, 270, 150, 25); panel.add(txtNomSec);

        JLabel lTS = new JLabel("Tel. Secundario:"); lTS.setBounds(300, 270, 100, 25); panel.add(lTS);
        txtTelSec = new JTextField(); txtTelSec.setBounds(390, 270, 150, 25); panel.add(txtTelSec);

        JLabel lVac = new JLabel("Vacuna inicial:"); lVac.setBounds(30, 310, 100, 25); panel.add(lVac);
        txtVacuna = new JTextField(); txtVacuna.setBounds(130, 310, 250, 25); panel.add(txtVacuna);

        // Botón Guardar
        JButton btnGuardar = new JButton("Guardar Registro Completo");
        btnGuardar.setBounds(180, 360, 250, 35);
        panel.add(btnGuardar);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean exito = PacienteDAO.guardarPaciente(
                        txtNomMascota.getText().trim(), txtFecNac.getText().trim(),
                        cmbEspecie.getSelectedItem().toString(), txtRaza.getText().trim(),
                        txtNomPpal.getText().trim(), txtTelPpal.getText().trim(),
                        cmbSexoPpal.getSelectedItem().toString(), txtDomPpal.getText().trim(),
                        txtNomSec.getText().trim(), txtTelSec.getText().trim(), "N/A",
                        txtVacuna.getText().trim()
                );

                if (exito) {
                    JOptionPane.showMessageDialog(null, "¡Paciente y dueños registrados con éxito!");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        return panel;
    }

    private JPanel crearPanelBusqueda() {
        JPanel panel = new JPanel(new BorderLayout());

        // Panel superior para escribir la búsqueda
        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Buscar por Nombre o Especie: "));
        txtBuscador = new JTextField(15);
        panelSuperior.add(txtBuscador);
        JButton btnBuscar = new JButton("Buscar");
        panelSuperior.add(btnBuscar);

        panel.add(panelSuperior, BorderLayout.NORTH);

        // Tabla central para mostrar resultados
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Mascota", "Especie", "Raza", "Dueño Ppal", "Teléfono"}, 0);
        tablaResultados = new JTable(modeloTabla);
        panel.add(new JScrollPane(tablaResultados), BorderLayout.CENTER);

        // Acción del botón buscar
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filtro = txtBuscador.getText().trim();
                modeloTabla.setRowCount(0); // Limpiamos tabla previa
                Vector<Vector<Object>> resultados = PacienteDAO.buscarPacientes(filtro);
                for (Vector<Object> fila : resultados) {
                    modeloTabla.addRow(fila);
                }
            }
        });

        return panel;
    }

    private void limpiarCampos() {
        txtNomMascota.setText(""); txtFecNac.setText(""); txtRaza.setText("");
        txtNomPpal.setText(""); txtTelPpal.setText(""); txtDomPpal.setText("");
        txtNomSec.setText(""); txtTelSec.setText(""); txtVacuna.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaClinica().setVisible(true);
        });
    }
}