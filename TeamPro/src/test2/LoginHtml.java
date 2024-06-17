package test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class LoginHtml extends JFrame {
    public LoginHtml() {
        // JFrame 설정
        super("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // 로그인 버튼 생성
        JButton loginButton = new JButton("로그인");

        // 로그인 버튼 클릭 이벤트 핸들러
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // HTML 파일 경로
                File htmlFile = new File("C:/Users/user/IdeaProjects/TeamPro/src/test2/loginandregisteration.html");
                Dimension frameSize = getSize();
                Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
                setLocation((windowSize.width - frameSize.width) / 2,
                        (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setVisible(true);
                // HTML 파일 열기
                if (htmlFile.exists()) {
                    try {
                        Desktop.getDesktop().browse(htmlFile.toURI());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    System.out.println("File not found: " + htmlFile.getAbsolutePath());
                }
            }
        });

        // 돌아가기 버튼 생성
        JButton backButton = new JButton("돌아가기");

        // 돌아가기 버튼 클릭 이벤트 핸들러
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 현재 창 닫기
                dispose();

                // Dinae 클래스를 실행
                new Dinae();
            }
        });

        // 프레임에 버튼 추가
        add(loginButton);
        add(backButton);

        // 프레임을 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginHtml();
    }
}
