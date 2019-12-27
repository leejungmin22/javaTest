package test.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,300,400); //프레임 x좌표 y좌표 width,height 
		setLayout(new BorderLayout());//프레임의 레이아웃 법칙 지정하기
		setDefaultCloseOperation(EXIT_ON_CLOSE); //프레임 닫았을때 process 종료되도록
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("나의프레임");
	}
}
