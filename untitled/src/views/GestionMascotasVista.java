package views;

import javax.swing.*;
import java.awt.*;

class GestionMascotasVista extends JFrame {
    public GestionMascotasVista() {
        setTitle("Gestión de Mascotas - Velky Pets");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idLabel = new JLabel("Nombre de la mascota:");
        JTextField idField = new JTextField();
        JLabel especieLabel = new JLabel("Especie:");
        JTextField especieField = new JTextField();
        JLabel razaLabel = new JLabel("Raza:");
        JTextField razaField = new JTextField();
        JLabel edadLabel = new JLabel("Edad:");
        JTextField edadField = new JTextField();
        JLabel dueñoLabel = new JLabel("Nombre del dueño:");
        JTextField dueñoField = new JTextField();
        JLabel sintomasLabel = new JLabel("Síntomas:");
        JTextField sintomasField = new JTextField();

        JButton guardarButton = new JButton("Guardar");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(especieLabel);
        panel.add(especieField);
        panel.add(razaLabel);
        panel.add(razaField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(dueñoLabel);
        panel.add(dueñoField);
        panel.add(sintomasLabel);
        panel.add(sintomasField);
        panel.add(guardarButton);
        panel.add(regresarButton);

        add(panel);

        guardarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Mascota guardada exitosamente.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}
