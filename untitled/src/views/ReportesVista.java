package views;

import javax.swing.*;
import java.awt.*;

class ReportesVista extends JFrame {
    public ReportesVista() {
        setTitle("Reportes - Velky Pets");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel tipoReporteLabel = new JLabel("Tipo de reporte:");
        JTextField tipoReporteField = new JTextField();

        JLabel fechaInicioLabel = new JLabel("Fecha de inicio:");
        JTextField fechaInicioField = new JTextField();

        JLabel fechaFinLabel = new JLabel("Fecha de fin:");
        JTextField fechaFinField = new JTextField();

        JLabel resultadoLabel = new JLabel("Resultado del reporte:");
        JTextArea resultadoArea = new JTextArea(10, 40);
        resultadoArea.setEditable(false);

        JButton generarReporteButton = new JButton("Generar reporte");
        JButton exportarPDFButton = new JButton("Exportar PDF");
        JButton regresarButton = new JButton("Regresar");

        panel.add(tipoReporteLabel);
        panel.add(tipoReporteField);
        panel.add(fechaInicioLabel);
        panel.add(fechaInicioField);
        panel.add(fechaFinLabel);
        panel.add(fechaFinField);
        panel.add(resultadoLabel);
        panel.add(new JScrollPane(resultadoArea));
        panel.add(generarReporteButton);
        panel.add(exportarPDFButton);
        panel.add(regresarButton);

        add(panel);

        generarReporteButton.addActionListener(e -> {
            resultadoArea.setText("Reporte generado para: " + tipoReporteField.getText() +
                    "\nDesde: " + fechaInicioField.getText() +
                    " Hasta: " + fechaFinField.getText());
        });

        exportarPDFButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Reporte exportado como PDF (simulado).\nNo hay lógica real implementada aún.");
        });

        regresarButton.addActionListener(e -> {
            new MenuPrincipalVista().setVisible(true);
            dispose();
        });
    }
}