package test1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Custom Layout");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel for Login/Logout
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        JButton loginButton = new JButton("LOGIN / LOGOUT");
        loginButton.setMargin(new Insets(0, 0, 0, 0));
        topPanel.add(loginButton, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        // Center Panel for Image Upload/Download
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(144, 238, 144)); // Light green background
        JLabel imageLabel = new JLabel("이미지 삽입\n이미지 띄우기", SwingConstants.CENTER);
        centerPanel.add(imageLabel);
        add(centerPanel, BorderLayout.CENTER);

        // South Panel for Chatting Box and Options
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));

        // Options Panel
        JPanel optionsPanel = new JPanel();
        JCheckBox 그림체CheckBox = new JCheckBox("그림체");
        JCheckBox 배경CheckBox = new JCheckBox("배경");
        JCheckBox 오브젝트CheckBox = new JCheckBox("오브젝트");
        JCheckBox 시간CheckBox = new JCheckBox("시간");

        optionsPanel.add(그림체CheckBox);
        optionsPanel.add(배경CheckBox);
        optionsPanel.add(오브젝트CheckBox);
        optionsPanel.add(시간CheckBox);
        southPanel.add(optionsPanel);

        // Chatting Box
        JPanel chattingPanel = new JPanel();
        chattingPanel.setLayout(new BorderLayout());
        JTextArea chattingBox = new JTextArea("C:\\");
        chattingBox.setLineWrap(true);
        chattingBox.setWrapStyleWord(true);
        chattingPanel.add(chattingBox, BorderLayout.CENTER);

        southPanel.add(chattingPanel);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
