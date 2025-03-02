package views;
import javax.swing.*;
import java.awt.*;

class ServiciosVista extends JFrame {
    public ServiciosVista() {
        setTitle("Servicios - Velky Pets");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 8, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idServicioLabel = new JLabel("Categoria del servicio:");
        JTextField idServicioField = new JTextField();
        JLabel nombreServicioLabel = new JLabel("Nombre del servicio:");
        JTextField nombreServicioField = new JTextField();
        JLabel duracionLabel = new JLabel("Duración estimada:");
        String[] duraciones = {"5-15 min", "20-50 min", "2-4 horas", "Requiere Hospitalizacion"};
        JComboBox<String> duracionComboBox = new JComboBox<>(duraciones);
        JLabel precioLabel = new JLabel("Precio del servicio:");
        JTextField precioField = new JTextField();

        JButton agregarButton = new JButton("Agregar");
        JButton editarButton = new JButton("Editar");
        JButton eliminarButton = new JButton("Eliminar");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idServicioLabel);
        panel.add(idServicioField);
        panel.add(nombreServicioLabel);
        panel.add(nombreServicioField);
        panel.add(duracionLabel);
        panel.add(duracionComboBox);
        panel.add(precioLabel);
        panel.add(precioField);
        panel.add(agregarButton);
        panel.add(editarButton);
        panel.add(eliminarButton);
        panel.add(regresarButton);

        add(panel);

        agregarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Servicio agregado exitosamente.");
        });

        editarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Servicio editado exitosamente.");
        });

        eliminarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Servicio eliminado exitosamente.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}