package views;
import javax.swing.*;
import java.awt.*;

class GestionClientesVista extends JFrame {
    public GestionClientesVista() {
        setTitle("Gestión de Clientes - Velky Pets");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idLabel = new JLabel("ID del cliente:");
        JTextField idField = new JTextField();
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField();
        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoField = new JTextField();
        JLabel correoLabel = new JLabel("Correo:");
        JTextField correoField = new JTextField();
        JLabel direccionLabel = new JLabel("Dirección:");
        JTextField direccionField = new JTextField();
        JLabel mascotaLabel = new JLabel("Nombre de la mascota:");
        JTextField mascotaField = new JTextField();

        JButton guardarButton = new JButton("Guardar");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(telefonoLabel);
        panel.add(telefonoField);
        panel.add(correoLabel);
        panel.add(correoField);
        panel.add(direccionLabel);
        panel.add(direccionField);
        panel.add(mascotaLabel);
        panel.add(mascotaField);
        panel.add(guardarButton);
        panel.add(regresarButton);

        add(panel);

        guardarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cliente guardado exitosamente.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}