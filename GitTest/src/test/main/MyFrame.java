package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,300,400); //프레임 x좌표 y좌표 width,height 
		setLayout(new BorderLayout());//프레임의 레이아웃 법칙 지정하기
		setDefaultCloseOperation(EXIT_ON_CLOSE); //프레임 닫았을때 process 종료되도록
		
		JButton sendBtn = new JButton("전송"); //버튼 만들기
		JButton deleteBtn = new JButton("취소");
		sendBtn.setActionCommand("send"); //버튼눌렀을때 동작할 command 지정하기
		deleteBtn.setActionCommand("delete");
		add(sendBtn,BorderLayout.NORTH); //버튼을 프레임의 북쪽에 배치하기
		add(deleteBtn,BorderLayout.NORTH);
		sendBtn.addActionListener(this); //버튼에 액션리스너 등록하기
		deleteBtn.addActionListener(this);
		setVisible(true);//프레임이 화면에 보이도록 설정
	}
	public static void main(String[] args) {
		new MyFrame("나의프레임");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션 command를 읽어온다.
		String command=e.getActionCommand();
		//액션 command 가 무엇이냐에 따라서 분기하기
		if(command.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송합니다.");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "취소합니다.");
		}
	}
}
