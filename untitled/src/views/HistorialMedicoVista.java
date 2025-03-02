package views;

import javax.swing.*;
import java.awt.*;

class HistorialMedicoVista extends JFrame {
    public HistorialMedicoVista() {
        setTitle("Historial Médico - Velky Pets");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idLabel = new JLabel("ID de la mascota:");
        JTextField idField = new JTextField();
        JLabel nombreMascotaLabel = new JLabel("Nombre de la mascota:");
        JTextField nombreMascotaField = new JTextField();
        JLabel nombreDueñoLabel = new JLabel("Nombre del dueño:");
        JTextField nombreDueñoField = new JTextField();
        JLabel fechaLabel = new JLabel("Fecha:");
        JTextField fechaField = new JTextField();
        JLabel diagnosticoLabel = new JLabel("Diagnóstico:");
        JTextField diagnosticoField = new JTextField();
        JLabel tratamientoLabel = new JLabel("Tratamiento:");
        JTextField tratamientoField = new JTextField();

        JButton guardarButton = new JButton("Guardar");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nombreMascotaLabel);
        panel.add(nombreMascotaField);
        panel.add(nombreDueñoLabel);
        panel.add(nombreDueñoField);
        panel.add(fechaLabel);
        panel.add(fechaField);
        panel.add(diagnosticoLabel);
        panel.add(diagnosticoField);
        panel.add(tratamientoLabel);
        panel.add(tratamientoField);
        panel.add(guardarButton);
        panel.add(regresarButton);

        add(panel);

        guardarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Historial médico guardado exitosamente.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}