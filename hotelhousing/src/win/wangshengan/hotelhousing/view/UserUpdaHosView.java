/*
 * UserUpdaHosView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import java.sql.Date;

import javax.swing.JOptionPane;

import win.wangshengan.hotelhousing.business.CountsBuss;
import win.wangshengan.hotelhousing.business.HistoryBuss;
import win.wangshengan.hotelhousing.business.RoomBuss;
import win.wangshengan.hotelhousing.business.RoomCheckInBuss;
import win.wangshengan.hotelhousing.business.impl.CountsBussImpl;
import win.wangshengan.hotelhousing.business.impl.HistoryBussImpl;
import win.wangshengan.hotelhousing.business.impl.RoomBussImpl;
import win.wangshengan.hotelhousing.business.impl.RoomCheckInBussImpl;
import win.wangshengan.hotelhousing.entity.Counts;
import win.wangshengan.hotelhousing.entity.History;
import win.wangshengan.hotelhousing.entity.RoomCheckIn;
import win.wangshengan.hotelhousing.entity.Rooms;

/**
 *
 * @author  __USER__
 */
public class UserUpdaHosView extends javax.swing.JPanel {

	RoomCheckInBuss roomCheckInBuss = new RoomCheckInBussImpl();
	RoomBuss roomBuss = new RoomBussImpl();
	CountsBuss countsBuss = new CountsBussImpl();

	public UserUpdaHosView() {

	}

	/** Creates new form UserUpdaHosView */
	public UserUpdaHosView(String id) {
		initComponents();
		initiaInfo(id);
		this.setSize(638, 624);
		this.setOpaque(false);
		jPanel1.setOpaque(false);
		jPanel2.setOpaque(false);
	}

	/**
	 * 初始化客户信息
	 */
	private void initiaInfo(String id) {
		RoomCheckIn roomCheckIn = roomCheckInBuss.getAllRoomCheckInById(id);
		if (roomCheckIn == null) {
			JOptionPane.showMessageDialog(null, "对不起，您还没预定房间！");
		} else {
			Rooms rooms = roomBuss.getRoomsById(roomCheckIn.getRno());
			jtfno.setText(String.valueOf(roomCheckIn.getRno()));
			jtfbegin.setText(roomCheckIn.getBeginTime() + "");
			jtfend.setText(roomCheckIn.getEndTime() + "");
			tfno.setText(roomCheckIn.getRno() + "");
			jtfname.setText(roomCheckIn.getUname());
			jtfuid.setText(roomCheckIn.getUserid());
			jtftype.setText(rooms.getRtype());
			jtfstate.setText(rooms.getRstate());
			jtfvalue.setText(rooms.getRvalue() + "");
			jtfconfigure.setText("空调、热水、宽带、独立卫浴、" + rooms.getRconfigue());
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jtfno = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jtfconfigure = new javax.swing.JTextArea();
		jtftype = new javax.swing.JTextField();
		jtfstate = new javax.swing.JTextField();
		jtfvalue = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jtfbegin = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jtfend = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		tfno = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jtfname = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jtfuid = new javax.swing.JTextField();
		lbalert = new javax.swing.JLabel();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						255, 255, 255)), "\u623f\u95f4\u4fe1\u606f",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("华文新魏", 0, 14), new java.awt.Color(255, 255,
						255)));

		jLabel1.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u623f\u95f4\u7f16\u53f7");

		jtfno.setEditable(false);

		jLabel2.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u623f\u95f4\u578b\u53f7");

		jLabel3.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u623f\u95f4\u4ef7\u683c");

		jLabel4.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u623f\u95f4\u72b6\u6001");

		jLabel5.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u623f\u95f4\u914d\u7f6e");

		jtfconfigure.setColumns(20);
		jtfconfigure.setEditable(false);
		jtfconfigure.setRows(5);
		jScrollPane1.setViewportView(jtfconfigure);

		jtftype.setEditable(false);

		jtfstate.setEditable(false);
		jtfstate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			}
		});

		jtfvalue.setEditable(false);

		jLabel9.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("\u5165\u4f4f\u65e5\u671f");

		jtfbegin.setEditable(false);
		jtfbegin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			}
		});

		jLabel10.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("\u9000\u623f\u65e5\u671f");

		jtfend.setEditable(false);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(jLabel5)
														.addComponent(jLabel1))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																454,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jtfno,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								96,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jtfstate,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								96,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel2))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jtftype)
																						.addComponent(
																								jtfvalue,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								101,
																								Short.MAX_VALUE))
																		.addGap(28,
																				28,
																				28)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel10)
																						.addComponent(
																								jLabel9))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jtfend,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								114,
																								Short.MAX_VALUE)
																						.addComponent(
																								jtfbegin,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								114,
																								Short.MAX_VALUE))))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9)
														.addComponent(
																jtftype,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																jtfno,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel1)
														.addComponent(
																jtfbegin,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(34, 34, 34)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel10)
														.addComponent(
																jtfvalue,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																jtfstate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																jtfend,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(77,
																				77,
																				77)
																		.addComponent(
																				jLabel5))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(95,
																				95,
																				95)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				120,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(46, 46, 46)));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						255, 255, 255)), "\u9000\u623f\u64cd\u4f5c",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("华文新魏", 0, 14), new java.awt.Color(255, 255,
						255)));
		jPanel2.setForeground(new java.awt.Color(255, 255, 255));

		jLabel6.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("\u623f\u95f4\u7f16\u53f7");

		tfno.setEditable(false);

		jButton1.setFont(new java.awt.Font("华文新魏", 0, 18));
		jButton1.setForeground(new java.awt.Color(0, 0, 255));
		jButton1.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\退 房.png")); // NOI18N
		jButton1.setText("\u9000 \u623f");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("\u5ba2\u6237\u59d3\u540d");

		jtfname.setEditable(false);

		jLabel8.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("\u8eab\u4efd\u8bc1\u53f7");

		jtfuid.setEditable(false);

		lbalert.setForeground(new java.awt.Color(255, 0, 0));
		lbalert.setText(" ");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jtfname,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				121,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				tfno)))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(70,
																				70,
																				70)
																		.addComponent(
																				jLabel8)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jtfuid,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				137,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				114,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(242,
																				242,
																				242)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				97,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(50,
																				50,
																				50))))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(156, 156, 156)
										.addComponent(
												lbalert,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												255,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(179, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(8, 8, 8)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jtfuid,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jtfname,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																tfno,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(32,
																				32,
																				32)
																		.addComponent(
																				jButton1))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				lbalert)))
										.addContainerGap(27, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										381,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										43, Short.MAX_VALUE)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
	}// </editor-fold>
	//GEN-END:initComponents

	private void clear() {
		jtfbegin.setText("");
		jtfconfigure.setText("");
		jtfend.setText("");
		jtfname.setText("");
		jtfno.setText("");
		jtfstate.setText("");
		jtfuid.setText("");
		jtfvalue.setText("");
		tfno.setText("");
		jtftype.setText("");
		lbalert.setText("");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		lbalert.setText("");
		HistoryBuss historyBuss = new HistoryBussImpl();
		String rstate = jtfstate.getText();
		String userid = jtfuid.getText();
		if ("".equals(userid)) {
			lbalert.setText("警告：对不起，您还没有订房，不能退房");
			return;
		}
		String beTime = jtfbegin.getText();
		String enTime = jtfend.getText();
		Date beginTime = Date.valueOf(beTime);
		Date endTime = Date.valueOf(enTime);
		java.util.Date currentDate = new java.util.Date();
		Long time = currentDate.getTime() - (beginTime.getTime() + 43200000);
		int value = 0;
		if (time > 0) {
			lbalert.setText("警告：对不起，现在不能退房了！");
			return;
		}
		//显示已消费金额
		int i = JOptionPane.showConfirmDialog(null, "您已消费了" + value
				+ "元\n确定要退房吗？");
		if (i == 0) {
			String id = jtfuid.getText();
			Counts count = countsBuss.getCountById(id);
			int rno = Integer.parseInt(tfno.getText());
			boolean updRoom = roomBuss.updateRoom(new Rooms(rno, "", "空", "",
					-1));
			boolean rCheckIn = roomCheckInBuss.delRoomCheckIn(id);
			boolean counts = countsBuss.delCount(id);
			if (updRoom && rCheckIn && counts) {
				JOptionPane.showMessageDialog(null,
						"稍后将以支付宝的方式返还您" + count.getPaid() + "元");
				clear();
			} else {
				lbalert.setText("警告：退房失败！");
			}
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jtfbegin;
	private javax.swing.JTextArea jtfconfigure;
	private javax.swing.JTextField jtfend;
	private javax.swing.JTextField jtfname;
	private javax.swing.JTextField jtfno;
	private javax.swing.JTextField jtfstate;
	private javax.swing.JTextField jtftype;
	private javax.swing.JTextField jtfuid;
	private javax.swing.JTextField jtfvalue;
	private javax.swing.JLabel lbalert;
	private javax.swing.JTextField tfno;
	// End of variables declaration//GEN-END:variables

}