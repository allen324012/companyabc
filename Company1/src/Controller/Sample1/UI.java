package Controller.Sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Dao.implMember;
import Model.member;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JScrollBar;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField phone;
	private JTextField nameUpdate;
	private JTextField addressUpdate;
	private JTextField deleteId;
	private JTextField updateId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(51, 39, 224, 371);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 13));
		lblNewLabel.setBounds(24, 96, 40, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 13));
		lblNewLabel_1.setBounds(24, 121, 40, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 13));
		lblNewLabel_2.setBounds(24, 146, 40, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("地址");
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 13));
		lblNewLabel_3.setBounds(24, 171, 40, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("行動");
		lblNewLabel_4.setFont(new Font("新細明體", Font.BOLD, 13));
		lblNewLabel_4.setBounds(24, 196, 40, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("電話");
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 13));
		lblNewLabel_5.setBounds(24, 221, 40, 15);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("輸入會員基本資料");
		lblNewLabel_6.setFont(new Font("新細明體", Font.BOLD, 15));
		lblNewLabel_6.setBounds(43, 22, 124, 28);
		panel.add(lblNewLabel_6);
		
		name = new JTextField();
		name.setBounds(85, 87, 96, 21);
		panel.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(85, 115, 96, 21);
		panel.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(85, 140, 96, 21);
		panel.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(85, 165, 96, 21);
		panel.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(85, 190, 96, 21);
		panel.add(mobile);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(85, 215, 96, 21);
		panel.add(phone);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(285, 39, 504, 371);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("管理會員資料");
		lblNewLabel_7.setFont(new Font("新細明體", Font.BOLD, 15));
		lblNewLabel_7.setBounds(174, 22, 99, 29);
		panel_1.add(lblNewLabel_7);
		
		
		
		
		
		
		
		JTextArea show = new JTextArea();
		show.setBounds(10, 176, 472, 150);
		
		panel_1.add(show);
		
		JLabel lblNewLabel_8 = new JLabel("姓名");
		lblNewLabel_8.setBounds(126, 102, 36, 15);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("地址");
		lblNewLabel_8_1.setBounds(248, 102, 36, 15);
		panel_1.add(lblNewLabel_8_1);
		
		nameUpdate = new JTextField();
		nameUpdate.setBounds(150, 99, 96, 21);
		panel_1.add(nameUpdate);
		nameUpdate.setColumns(10);
		
		addressUpdate = new JTextField();
		addressUpdate.setBounds(272, 99, 96, 21);
		panel_1.add(addressUpdate);
		addressUpdate.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("ID");
		lblNewLabel_9.setBounds(126, 135, 24, 15);
		panel_1.add(lblNewLabel_9);
		
		deleteId = new JTextField();
		deleteId.setBounds(150, 132, 96, 21);
		panel_1.add(deleteId);
		deleteId.setColumns(10);
		
		
		JButton add = new JButton("確定");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			/*
			 * 1.UI接收 getText
			 * 2.new member()
			 * 3.add(m)
			 */
			String Name=name.getText();
			String Username=username.getText();
			String Password=password.getText();
			String Address=address.getText();
			String Mobile=mobile.getText();
			String Phone=phone.getText();
			member m=new member(Name,Username,Password,Address,Mobile,Phone);
			
			new implMember().add(m);
			
			
			
			}
		});
		add.setBounds(64, 262, 87, 23);
		panel.add(add);
		
		JLabel total = new JLabel("");
		total.setFont(new Font("新細明體", Font.BOLD, 15));
		total.setBounds(20, 336, 76, 25);
		panel_1.add(total);
		
		
		JButton queryAll = new JButton("查詢(全部)");
		queryAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.show.setText-->queryAll1():String
				 */
				
				show.setText(new implMember().queryAll1());
				
				List<member> l=new implMember().queryAll2();
				total.setText("共:"+l.size()+"筆");
				
			}
		});
		queryAll.setBounds(10, 65, 106, 23);
		panel_1.add(queryAll);
		
		
		
		
		JLabel tttt = new JLabel("ID");
		tttt.setBounds(369, 102, 24, 15);
		panel_1.add(tttt);
		
		updateId = new JTextField();
		updateId.setBounds(403, 99, 96, 21);
		panel_1.add(updateId);
		updateId.setColumns(10);
		
		
		JButton update = new JButton("修改");
		update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.nameUpdate,addressUpdate ,updateId-->getText
				 * 2.updateId-->轉成int--->queryId(id)-->member m
				 * 3.m.setName(),m.setAddress()
				 * 4.update(m)
				 */
				
				String Name=nameUpdate.getText();
				String Address=addressUpdate.getText();
				
				int ID=Integer.parseInt(updateId.getText());				
				member m=new implMember().queryId(ID);
				m.setName(Name);
				m.setAddress(Address);
				
				new implMember().update(m);				
				
				
			}
		});
		update.setBounds(10, 98, 106, 23);
		panel_1.add(update);
		
		
		JButton delete = new JButton("刪除");
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			/*
			 * 1.deleteId-->getText-->轉型-->int
			 * 2.執行 delete(id)
			 */
			
			int Id=Integer.parseInt(deleteId.getText());
			
			new implMember().delete(Id);
			
			
			
			}
		});
		delete.setBounds(10, 131, 106, 23);
		panel_1.add(delete);
		
		
	}
}
