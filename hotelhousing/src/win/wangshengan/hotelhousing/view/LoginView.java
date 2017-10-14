/*
 * LoginView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import java.awt.Color;
import java.awt.Event;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import win.wangshengan.hotelhousing.business.AdmitBuss;
import win.wangshengan.hotelhousing.business.UserzBuss;
import win.wangshengan.hotelhousing.business.impl.AdmitBussImpl;
import win.wangshengan.hotelhousing.business.impl.UserzBussImpl;
import win.wangshengan.hotelhousing.entity.Admit;
import win.wangshengan.hotelhousing.entity.Userz;
import win.wangshengan.hotelhousing.util.Format;
import win.wangshengan.hotelhousing.util.ViewUtil;

/**
 *
 * @author  __USER__
 */
public class LoginView extends javax.swing.JFrame {

	/** Creates new form LoginView */
	public LoginView() {
		initComponents();
		ViewUtil.viewLocationCenter(this);
		rbuser.setSelected(true);
		addBackground();
		rbuser.setOpaque(false);
		rbadmin.setOpaque(false);
	}

	//���ӱ���ͼƬ
	private void addBackground() {
		jbtlogin.setBackground(Color.green);
		ImageIcon image = new ImageIcon("images/back.jpg");
		image.setImage(image.getImage().getScaledInstance(550, 395,
				Image.SCALE_FAST));
		JLabel jlabel = new JLabel(image);
		jlabel.setBounds(0, 0, 550, 395);
		getLayeredPane().add(jlabel, new Integer(Integer.MIN_VALUE));
		((JPanel) getContentPane()).setOpaque(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		rbuser = new javax.swing.JRadioButton();
		rbadmin = new javax.swing.JRadioButton();
		jLabel3 = new javax.swing.JLabel();
		jtfid = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jbtlogin = new javax.swing.JButton();
		jtfpsw = new javax.swing.JPasswordField();
		jpfpsw = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		lbid = new javax.swing.JLabel();
		lbpsw = new javax.swing.JLabel();
		lbalert = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("������κ", 1, 48));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u4e91\u5c1a\u5b89\u4f73\u9152\u5e97");

		jLabel2.setFont(new java.awt.Font("������κ", 0, 18));
		jLabel2.setForeground(new java.awt.Color(0, 0, 255));
		jLabel2.setText("\u89d2   \u8272\uff1a");

		buttonGroup1.add(rbuser);
		rbuser.setFont(new java.awt.Font("������κ", 0, 14));
		rbuser.setForeground(new java.awt.Color(0, 0, 204));
		rbuser.setText("\u7528\u6237");

		buttonGroup1.add(rbadmin);
		rbadmin.setFont(new java.awt.Font("������κ", 0, 14));
		rbadmin.setForeground(new java.awt.Color(0, 0, 255));
		rbadmin.setText("\u7ba1\u7406\u5458");

		jLabel3.setFont(new java.awt.Font("������κ", 0, 18));
		jLabel3.setForeground(new java.awt.Color(0, 0, 255));
		jLabel3.setText("\u7528\u6237ID\uff1a");

		jtfid.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jtfidMouseClicked(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("������κ", 0, 18));
		jLabel4.setForeground(new java.awt.Color(0, 0, 204));
		jLabel4.setText("\u5bc6   \u7801\uff1a");

		jbtlogin.setFont(new java.awt.Font("������κ", 0, 24));
		jbtlogin.setForeground(new java.awt.Color(255, 255, 255));
		jbtlogin.setText("\u767b \u5f55");
		jbtlogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jbtloginActionPerformed(evt);
			}
		});

		jpfpsw.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jpfpswMouseClicked(evt);
			}
		});
		jpfpsw.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jpfpswKeyPressed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("������κ", 0, 14));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u53bb\u6ce8\u518c\uff1f");
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel5MouseClicked(evt);
			}
		});

		lbid.setFont(new java.awt.Font("������κ", 0, 14));
		lbid.setForeground(new java.awt.Color(255, 0, 0));
		lbid.setText(" ");

		lbpsw.setFont(new java.awt.Font("������κ", 0, 14));
		lbpsw.setForeground(new java.awt.Color(255, 0, 0));
		lbpsw.setText(" ");

		lbalert.setFont(new java.awt.Font("������κ", 0, 14));
		lbalert.setForeground(new java.awt.Color(255, 0, 0));
		lbalert.setText(" ");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(137,
																		137,
																		137)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jLabel3)
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																																.addComponent(
																																		jLabel2)
																																.addComponent(
																																		jLabel4)))
																								.addGap(27,
																										27,
																										27)
																								.addComponent(
																										jtfpsw,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										0,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		rbuser)
																																.addGap(18,
																																		18,
																																		18)
																																.addComponent(
																																		rbadmin)
																																.addGap(14,
																																		14,
																																		14)
																																.addComponent(
																																		lbpsw,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		124,
																																		Short.MAX_VALUE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING)
																																				.addComponent(
																																						jpfpsw,
																																						javax.swing.GroupLayout.Alignment.LEADING,
																																						javax.swing.GroupLayout.DEFAULT_SIZE,
																																						145,
																																						Short.MAX_VALUE)
																																				.addComponent(
																																						jtfid,
																																						javax.swing.GroupLayout.DEFAULT_SIZE,
																																						145,
																																						Short.MAX_VALUE))
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		lbid,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		126,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))))
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										jLabel5)
																								.addComponent(
																										jbtlogin,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										260,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(106,
																		106,
																		106)
																.addComponent(
																		jLabel1)))
								.addContainerGap())
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(180, Short.MAX_VALUE)
								.addComponent(lbalert,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										175,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(176, 176, 176)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addComponent(jLabel1)
								.addGap(42, 42, 42)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(rbuser)
												.addComponent(rbadmin))
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jtfid,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3)
												.addComponent(lbid))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(37, 37,
																		37)
																.addComponent(
																		jtfpsw,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(28, 28,
																		28)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(
																										jpfpsw,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										lbpsw))
																				.addComponent(
																						jLabel4))))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(lbalert,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										16,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(15, 15, 15)
								.addComponent(jbtlogin)
								.addGap(38, 38, 38)
								.addComponent(jLabel5)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jpfpswKeyPressed(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			login();
		}
	}

	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		lbalert.setText(" ");
		if (rbuser.isSelected()) {
			new UserView(this).setVisible(true);
			this.setVisible(false);
		} else {
			lbalert.setText("�Բ��𣬹���Ա����ע�ᣡ");
			lbalert.setHorizontalAlignment(lbalert.CENTER);
		}
	}

	void jpfpswMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		lbalert.setText(" ");
		lbid.setText("");
		lbpsw.setText("");
	}

	private void jtfidMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		lbalert.setText("   ");
		lbid.setText("");
		lbpsw.setText("");
	}

	private void jbtloginActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		login();
	}

	private void login() {
		lbalert.setText(" ");
		lbid.setText("");
		lbpsw.setText("");
		String id = jtfid.getText();
		String psw = jpfpsw.getText();
		if ("".equals(id)) {
			lbid.setText("�� ID����Ϊ�գ�");
			return;
		}
		if ("".equals(psw)) {
			lbpsw.setText("�� ���벻��Ϊ��!");
			return;
		}
		if (!Format.isStringToNumber(id)) {
			lbid.setText("�� ��������ȷ��ID��");
			return;
		}
		if (rbuser.isSelected()) {
			UserzBuss userzBuss = new UserzBussImpl();
			boolean flag = userzBuss.getUserzByIdPsw(new Userz(id, psw));
			if (flag) {
				this.dispose();
				MainUserzView mainUserzView = new MainUserzView(id);
				mainUserzView.setVisible(true);
				Thread t = new Thread(mainUserzView);
				t.start();
			} else {
				lbalert.setText("��¼ʧ�ܣ�");
				lbalert.setHorizontalAlignment(lbalert.CENTER);
			}
		} else if (rbadmin.isSelected()) {
			AdmitBuss admitBuss = new AdmitBussImpl();
			boolean flag = admitBuss.getAdmitByIdPsw(new Admit(Integer
					.valueOf(id), psw));
			if (flag) {
				this.dispose();
				MainAdmitView mainAdmitView = new MainAdmitView(
						Integer.parseInt(id));
				mainAdmitView.setVisible(true);
				Thread t = new Thread(mainAdmitView);
				t.start();
			} else {
				lbalert.setText("��¼ʧ�ܣ�");
				lbalert.setHorizontalAlignment(lbalert.CENTER);
			}

		}
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JButton jbtlogin;
	private javax.swing.JPasswordField jpfpsw;
	private javax.swing.JTextField jtfid;
	private javax.swing.JPasswordField jtfpsw;
	private javax.swing.JLabel lbalert;
	private javax.swing.JLabel lbid;
	private javax.swing.JLabel lbpsw;
	private javax.swing.JRadioButton rbadmin;
	private javax.swing.JRadioButton rbuser;
	// End of variables declaration//GEN-END:variables

}