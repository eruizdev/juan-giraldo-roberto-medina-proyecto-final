
import views.LoginVista;

import javax.swing.*;

public class VelkyPetsApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginVista().setVisible(true));
    }
}