package views;

import javax.swing.*;
import java.awt.*;

class MenuPrincipalVista extends JFrame {
    public MenuPrincipalVista() {
        setTitle("Menú Principal - Velky Pets");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnMascotas = new JButton("Gestión de Mascotas");
        JButton btnClientes = new JButton("Gestión de Clientes");
        JButton btnHistorial = new JButton("Historial Médico");
        JButton btnCitas = new JButton("Agenda de Citas");
        JButton btnInventario = new JButton("Inventario");
        JButton btnServicios = new JButton("Servicios Veterinarios");
        JButton btnFacturacion = new JButton("Facturación");
        JButton btnReportes = new JButton("Reportes");
        JButton btnSalir = new JButton("Salir");

        panel.add(btnMascotas);
        panel.add(btnClientes);
        panel.add(btnHistorial);
        panel.add(btnCitas);
        panel.add(btnInventario);
        panel.add(btnServicios);
        panel.add(btnFacturacion);
        panel.add(btnReportes);
        panel.add(btnSalir);

        add(panel);

        btnSalir.addActionListener(e -> System.exit(0));
        btnMascotas.addActionListener(e -> new GestionMascotasVista().setVisible(true));
        btnClientes.addActionListener(e -> new GestionClientesVista().setVisible(true));
        btnHistorial.addActionListener(e -> new HistorialMedicoVista().setVisible(true));
        btnCitas.addActionListener(e -> new AgendaCitasVista().setVisible(true));
        btnInventario.addActionListener(e -> new InventarioVista().setVisible(true));
        btnServicios.addActionListener(e -> new ServiciosVista().setVisible(true));
        btnFacturacion.addActionListener(e -> new FacturacionVista().setVisible(true));
        btnReportes.addActionListener(e -> new ReportesVista().setVisible(true));
    }
}


