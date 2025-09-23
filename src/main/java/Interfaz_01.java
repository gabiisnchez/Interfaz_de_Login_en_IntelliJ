import javax.swing.*;
import java.awt.*;

public class Interfaz_01 extends JFrame {

    // Componentes de la interfaz
    private JPanel PanelBloc;
    private JLabel logoLabel;
    private JLabel usuarioLabel;
    private JTextField usuarioField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JCheckBox terminosCheckBox;
    private JButton accederButton;

    public Interfaz_01() {
        initializeComponents();
        setupLayout();
        configureFrame();
    }

    private void initializeComponents() {
        // Logo de la aplicación como imagen
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Usuario1\\IdeaProjects\\BlocNotas\\src\\images\\FitBreak_logo.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon logoIcon = new ImageIcon(scaledImage);
        logoLabel = new JLabel(logoIcon, SwingConstants.CENTER);

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

        // Panel principal con padding
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        mainPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Logo
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(logoLabel, gbc);

        // Mensaje de bienvenida
        JLabel mensajeBienvenida = new JLabel("¡Bienvenido a FitBreak!", SwingConstants.CENTER);
        mensajeBienvenida.setFont(new Font("Arial", Font.BOLD, 16));
        mensajeBienvenida.setForeground(new Color(119, 172, 58));
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 20, 10);
        mainPanel.add(mensajeBienvenida, gbc);

        // Usuario
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(usuarioLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(usuarioField, gbc);

        // Contraseña
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(passwordField, gbc);

        // Términos y condiciones
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 10, 10, 10);
        mainPanel.add(terminosCheckBox, gbc);

        // Botón Acceder
        gbc.gridy = 5;
        gbc.insets = new Insets(15, 10, 10, 10);
        mainPanel.add(accederButton, gbc);

        add(mainPanel, BorderLayout.CENTER);
    }

    private void configureFrame() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Icono de la ventana
        Image ventanaIcon = new ImageIcon("C:\\Users\\Usuario1\\IdeaProjects\\BlocNotas\\src\\images\\FitBreak_logo.png").getImage();
        setIconImage(ventanaIcon);

        pack();
        setLocationRelativeTo(null); // Centrar en pantalla
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Interfaz_01().setVisible(true));
    }
}
