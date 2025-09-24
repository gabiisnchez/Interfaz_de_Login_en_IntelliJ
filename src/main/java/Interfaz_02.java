import javax.swing.*;
import java.awt.*;

public class Interfaz_02 extends JFrame {

    private JLabel logoLabel;
    private JLabel usuarioLabel;
    private JTextField usuarioField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JCheckBox terminosCheckBox;
    private JRadioButton recordarUsuarioRadio;
    private JComboBox<String> idiomaComboBox;
    private JButton accederButton;

    public Interfaz_02() {
        initializeComponents();
        setupLayout();
        configureFrame();
    }

    private void initializeComponents() {
        // Logo
        ImageIcon originalIcon = new ImageIcon("src/images/FitBreak_logo.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        logoLabel = new JLabel(new ImageIcon(scaledImage), SwingConstants.CENTER);

        // Usuario
        usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        usuarioField = new JTextField(20);
        usuarioField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Contraseña
        passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Términos y condiciones
        terminosCheckBox = new JCheckBox("Aceptar términos y condiciones");
        terminosCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));

        // Recordar usuario
        recordarUsuarioRadio = new JRadioButton("Recordar usuario");
        recordarUsuarioRadio.setFont(new Font("Arial", Font.PLAIN, 12));

        // Idioma
        idiomaComboBox = new JComboBox<>(new String[]{"Español", "Inglés", "Francés"});
        idiomaComboBox.setFont(new Font("Arial", Font.PLAIN, 12));

        // Botón de acceso
        accederButton = new JButton("Acceder");
        accederButton.setFont(new Font("Arial", Font.BOLD, 14));
        accederButton.setBackground(new Color(43, 88, 129));
        accederButton.setForeground(Color.WHITE);
        accederButton.setFocusPainted(false);
        accederButton.setPreferredSize(new Dimension(120, 35));
    }

    private void setupLayout() {
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        mainPanel.setBackground(Color.WHITE);

        // Logo y mensaje
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.setBackground(Color.WHITE);
        topPanel.add(logoLabel);
        JLabel mensajeBienvenida = new JLabel("¡Bienvenido a FitBreak!", SwingConstants.CENTER);
        mensajeBienvenida.setFont(new Font("Arial", Font.BOLD, 16));
        mensajeBienvenida.setForeground(new Color(119, 172, 58));
        topPanel.add(mensajeBienvenida);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Panel central con GridBagLayout
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Usuario
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(usuarioLabel, gbc);
        gbc.gridx = 1;
        centerPanel.add(usuarioField, gbc);

        // Contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        centerPanel.add(passwordField, gbc);

        // Recordar usuario
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        centerPanel.add(recordarUsuarioRadio, gbc);

        // Idioma
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("Idioma:"), gbc);
        gbc.gridx = 1;
        centerPanel.add(idiomaComboBox, gbc);

        // Términos y condiciones
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        centerPanel.add(terminosCheckBox, gbc);

        // Botón Acceder
        gbc.gridy = 5;
        centerPanel.add(accederButton, gbc);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        add(mainPanel, BorderLayout.CENTER);
    }

    private void configureFrame() {
        setTitle("Login Extendido");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Icono de la ventana
        Image ventanaIcon = new ImageIcon("src/images/FitBreak_logo.png").getImage();
        setIconImage(ventanaIcon);

        pack();
        setLocationRelativeTo(null); // Centrar en pantalla
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Interfaz_02().setVisible(true));
    }
}
