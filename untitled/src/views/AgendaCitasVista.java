package views;

import javax.swing.*;
import java.awt.*;

class AgendaCitasVista extends JFrame {
    public AgendaCitasVista() {
        setTitle("Agenda de Citas - Velky Pets");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 8, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idCitaLabel = new JLabel("ID de la cita:");
        JTextField idCitaField = new JTextField();
        JLabel nombreMascotaLabel = new JLabel("Nombre de la mascota:");
        JTextField nombreMascotaField = new JTextField();
        JLabel nombreDueñoLabel = new JLabel("Nombre del dueño:");
        JTextField nombreDueñoField = new JTextField();
        JLabel fechaLabel = new JLabel("Fecha de la cita:");
        JTextField fechaField = new JTextField();
        JLabel horaLabel = new JLabel("Hora de la cita:");
        JTextField horaField = new JTextField();
        JLabel motivoLabel = new JLabel("Motivo de la cita:");
        JTextField motivoField = new JTextField();
        JLabel veterinarioLabel = new JLabel("Veterinario asignado:");
        JTextField veterinarioField = new JTextField();
        JLabel estadoLabel = new JLabel("Estado de la cita:");
        String[] estados = {"Confirmado", "Pendiente", "Cancelado"};
        JComboBox<String> estadoComboBox = new JComboBox<>(estados);

        JButton guardarButton = new JButton("Guardar");
        JButton cancelarButton = new JButton("Cancelar Cita");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idCitaLabel);
        panel.add(idCitaField);
        panel.add(nombreMascotaLabel);
        panel.add(nombreMascotaField);
        panel.add(nombreDueñoLabel);
        panel.add(nombreDueñoField);
        panel.add(fechaLabel);
        panel.add(fechaField);
        panel.add(horaLabel);
        panel.add(horaField);
        panel.add(motivoLabel);
        panel.add(motivoField);
        panel.add(veterinarioLabel);
        panel.add(veterinarioField);
        panel.add(estadoLabel);
        panel.add(estadoComboBox);
        panel.add(guardarButton);
        panel.add(cancelarButton);
        panel.add(regresarButton);

        add(panel);

        guardarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cita guardada exitosamente.");
        });

        cancelarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cita cancelada.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}
