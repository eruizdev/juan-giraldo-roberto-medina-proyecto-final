package views;

import javax.swing.*;
import java.awt.*;

class InventarioVista extends JFrame {
    public InventarioVista() {
        setTitle("Inventario - Velky Pets");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(10, 8, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idProductoLabel = new JLabel("ID del producto:");
        JTextField idProductoField = new JTextField();
        JLabel nombreMedicamentoLabel = new JLabel("Nombre del medicamento:");
        JTextField nombreMedicamentoField = new JTextField();
        JLabel categoriaLabel = new JLabel("Categoría:");
        String[] categorias = {"Alimento", "Medicina", "Accesorio"};
        JComboBox<String> categoriaComboBox = new JComboBox<>(categorias);
        JLabel cantidadLabel = new JLabel("Cantidad disponible:");
        JTextField cantidadField = new JTextField();
        JLabel precioLabel = new JLabel("Precio unitario:");
        JTextField precioField = new JTextField();
        JLabel fechaVencimientoLabel = new JLabel("Fecha de vencimiento:");
        JTextField fechaVencimientoField = new JTextField();

        JButton agregarButton = new JButton("Agregar");
        JButton editarButton = new JButton("Editar");
        JButton eliminarButton = new JButton("Eliminar");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idProductoLabel);
        panel.add(idProductoField);
        panel.add(nombreMedicamentoLabel);
        panel.add(nombreMedicamentoField);
        panel.add(categoriaLabel);
        panel.add(categoriaComboBox);
        panel.add(cantidadLabel);
        panel.add(cantidadField);
        panel.add(precioLabel);
        panel.add(precioField);
        panel.add(fechaVencimientoLabel);
        panel.add(fechaVencimientoField);
        panel.add(agregarButton);
        panel.add(editarButton);
        panel.add(eliminarButton);
        panel.add(regresarButton);

        add(panel);

        agregarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Producto agregado exitosamente.");
        });

        editarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Producto editado exitosamente.");
        });

        eliminarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}