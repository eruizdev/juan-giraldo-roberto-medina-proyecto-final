package views;

import javax.swing.*;
import java.awt.*;

class FacturacionVista extends JFrame {
    public FacturacionVista() {
        setTitle("🐾 Facturación - Velky Pets 🐾");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(15, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idFacturaLabel = new JLabel("ID de factura:");
        JTextField idFacturaField = new JTextField();
        JLabel nombreClienteLabel = new JLabel("Nombre del cliente:");
        JTextField nombreClienteField = new JTextField();
        JLabel nombreMascotaLabel = new JLabel("Nombre de la mascota:");
        JTextField nombreMascotaField = new JTextField();
        JLabel servicioLabel = new JLabel("Servicio realizado:");
        String[] servicios = {"Consulta", "Cirugía", "Medicación", "Hospitalización"};
        JComboBox<String> servicioComboBox = new JComboBox<>(servicios);
        JLabel fechaLabel = new JLabel("Fecha de la factura:");
        JTextField fechaField = new JTextField();
        JLabel subtotalLabel = new JLabel("Subtotal:");
        JTextField subtotalField = new JTextField();
        JLabel ivaLabel = new JLabel("IVA (%):");
        JTextField ivaField = new JTextField("19"); // Valor predeterminado del IVA
        JLabel totalLabel = new JLabel("Total:");
        JTextField totalField = new JTextField();
        JLabel metodoPagoLabel = new JLabel("Método de pago:");
        String[] metodosPago = {"Efectivo", "Tarjeta", "Transferencia", "Nequi", "DaviPlata"};
        JComboBox<String> metodoPagoComboBox = new JComboBox<>(metodosPago);

        JButton generarFacturaButton = new JButton("Generar factura");
        JButton guardarButton = new JButton("Guardar");
        JButton cancelarButton = new JButton("Cancelar");
        JButton regresarButton = new JButton("Regresar");

        panel.add(idFacturaLabel);
        panel.add(idFacturaField);
        panel.add(nombreClienteLabel);
        panel.add(nombreClienteField);
        panel.add(nombreMascotaLabel);
        panel.add(nombreMascotaField);
        panel.add(servicioLabel);
        panel.add(servicioComboBox);
        panel.add(fechaLabel);
        panel.add(fechaField);
        panel.add(subtotalLabel);
        panel.add(subtotalField);
        panel.add(ivaLabel);
        panel.add(ivaField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(metodoPagoLabel);
        panel.add(metodoPagoComboBox);
        panel.add(generarFacturaButton);
        panel.add(guardarButton);
        panel.add(cancelarButton);
        panel.add(regresarButton);

        add(panel);

        generarFacturaButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Factura generada exitosamente.");
        });

        guardarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Factura guardada exitosamente.");
        });

        cancelarButton.addActionListener(e -> {
            dispose();
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}