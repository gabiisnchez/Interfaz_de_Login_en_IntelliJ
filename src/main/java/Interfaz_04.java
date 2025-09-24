import javax.swing.*;
import java.awt.*;

public class Interfaz_04 extends JFrame {

    private JTabbedPane tabbedPane1;
    private JPanel loginPanel;
    private JPanel registroPanel;

    public Interfaz_04() {
        initializeComponents();
        setupLayout();
        configureFrame();
    }

    private void initializeComponents() {
        // Crear el JTabbedPane
        tabbedPane1 = new JTabbedPane();

        // =========================
        // PANEL LOGIN
        // =========================
        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(new Color(240, 245, 255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel loginLabel = new JLabel("Iniciar Sesión", SwingConstants.CENTER);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel usuarioLabel = new JLabel("Usuario:");
        JTextField usuarioField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField(15);

        JCheckBox recordarCheckBox = new JCheckBox("Recordar usuario");
        JButton loginButton = new JButton("Acceder");

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        loginPanel.add(loginLabel, gbc);

        gbc.gridy = 1; gbc.gridwidth = 1;
        loginPanel.add(usuarioLabel, gbc);
        gbc.gridx = 1;
        loginPanel.add(usuarioField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        loginPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        loginPanel.add(passwordField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        loginPanel.add(recordarCheckBox, gbc);

        gbc.gridy = 4;
        loginPanel.add(loginButton, gbc);

        // =========================
        // PANEL REGISTRO
        // =========================
        registroPanel = new JPanel(new GridBagLayout());
        registroPanel.setBackground(new Color(255, 245, 240));
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.insets = new Insets(8, 8, 8, 8);
        gbc2.fill = GridBagConstraints.HORIZONTAL;

        JLabel registroLabel = new JLabel("Registro de Usuario", SwingConstants.CENTER);
        registroLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel nuevoUsuarioLabel = new JLabel("Usuario:");
        JTextField nuevoUsuarioField = new JTextField(15);

        JLabel nuevoEmailLabel = new JLabel("Email:");
        JTextField nuevoEmailField = new JTextField(15);

        JLabel nuevaPassLabel = new JLabel("Contraseña:");
        JPasswordField nuevaPassField = new JPasswordField(15);

        JLabel confirmarPassLabel = new JLabel("Confirmar Contraseña:");
        JPasswordField confirmarPassField = new JPasswordField(15);

        JCheckBox terminosCheckBox = new JCheckBox("Aceptar términos y condiciones");
        JButton registroButton = new JButton("Registrarse");

        gbc2.gridx = 0; gbc2.gridy = 0; gbc2.gridwidth = 2;
        registroPanel.add(registroLabel, gbc2);

        gbc2.gridy = 1; gbc2.gridwidth = 1;
        registroPanel.add(nuevoUsuarioLabel, gbc2);
        gbc2.gridx = 1;
        registroPanel.add(nuevoUsuarioField, gbc2);

        gbc2.gridx = 0; gbc2.gridy = 2;
        registroPanel.add(nuevoEmailLabel, gbc2);
        gbc2.gridx = 1;
        registroPanel.add(nuevoEmailField, gbc2);

        gbc2.gridx = 0; gbc2.gridy = 3;
        registroPanel.add(nuevaPassLabel, gbc2);
        gbc2.gridx = 1;
        registroPanel.add(nuevaPassField, gbc2);

        gbc2.gridx = 0; gbc2.gridy = 4;
        registroPanel.add(confirmarPassLabel, gbc2);
        gbc2.gridx = 1;
        registroPanel.add(confirmarPassField, gbc2);

        gbc2.gridx = 0; gbc2.gridy = 5; gbc2.gridwidth = 2;
        registroPanel.add(terminosCheckBox, gbc2);

        gbc2.gridy = 6;
        registroPanel.add(registroButton, gbc2);

        // =========================
        // AGREGAR PANEL A JTabbedPane
        // =========================
        tabbedPane1.addTab("Login", loginPanel);
        tabbedPane1.addTab("Registro", registroPanel);
    }

    private void setupLayout() {
        add(tabbedPane1, BorderLayout.CENTER);
    }

    private void configureFrame() {
        setTitle("Login & Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null); // Centrar ventana
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Interfaz_04().setVisible(true));
    }
}
