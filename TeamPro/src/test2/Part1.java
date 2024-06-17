package test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Part1 extends JFrame {
    Part1(){
        super("이미지 생성"); //타이틀
// Top Panel for Login/Logout
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        JButton backbtn = new JButton("돌아가기");
        backbtn.setMargin(new Insets(0, 0, 0, 0));
        setSize(500, 500); //창 크기 설정
        topPanel.add(backbtn, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);


        // Center Panel for Image Upload/Download
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(144, 238, 144)); // Light green background
        JLabel imageLabel = new JLabel("이미지 삽입", SwingConstants.CENTER);
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
        JTextArea chattingBox = new JTextArea("채팅 >> ");
        chattingBox.setLineWrap(true);
        chattingBox.setWrapStyleWord(true);
        chattingPanel.add(chattingBox, BorderLayout.CENTER);

        southPanel.add(chattingPanel);
        add(southPanel, BorderLayout.SOUTH);

        Dimension frameSize = getSize();

        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        backbtn.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                new Dinae();
                setVisible(false); // 창 안보이게 하기
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Dinae::new);
    }

    }

