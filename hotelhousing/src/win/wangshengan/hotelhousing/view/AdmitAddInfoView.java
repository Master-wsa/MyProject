/*
 * AdmitAddInfoView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import java.sql.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import win.wangshengan.hotelhousing.business.CountsBuss;
import win.wangshengan.hotelhousing.business.RoomBuss;
import win.wangshengan.hotelhousing.business.RoomCheckInBuss;
import win.wangshengan.hotelhousing.business.impl.CountsBussImpl;
import win.wangshengan.hotelhousing.business.impl.RoomBussImpl;
import win.wangshengan.hotelhousing.business.impl.RoomCheckInBussImpl;
import win.wangshengan.hotelhousing.entity.Counts;
import win.wangshengan.hotelhousing.entity.RoomCheckIn;
import win.wangshengan.hotelhousing.entity.Rooms;
import win.wangshengan.hotelhousing.util.Format;

/**
 *
 * @author  __USER__
 */
public class AdmitAddInfoView extends javax.swing.JPanel {

	RoomCheckInBuss roomCheckInBuss = new RoomCheckInBussImpl();
	CountsBuss countsBuss = new CountsBussImpl();
	RoomBuss roomBuss = new RoomBussImpl();

	/** Creates new form AdmitAddInfoView */
	public AdmitAddInfoView() {
		initComponents();
		fillTable(false);
		initiaP1();
		this.setSize(638, 624);
		this.setOpaque(false);
		jPanel1.setOpaque(false);
		jPanel2.setOpaque(false);
	}

	/**
	 * 初始化房间查询信息框内的下拉框信息
	 */
	private void initiaP1() {
		List<String> ls = roomBuss.getRoomRtype();
		for (String type : ls) {
			cbtype.addItem(type);
		}
		List<String> lst = roomBuss.getRoomRState();
		for (String state : lst) {
			cbstate.addItem(state);
		}
		List<Integer> li = roomBuss.getRoomRvalue();
		for (int value : li) {
			cbvalue.addItem(value);
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
		cbtype = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		cbstate = new javax.swing.JComboBox();
		cbvalue = new javax.swing.JComboBox();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jtfbegin = new javax.swing.JTextField();
		jtfend = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jtrooms = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jtfuname = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jtfuid = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jtfvalue = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jtfrno = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jtfdepost = new javax.swing.JTextField();
		jlbalert = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		lbvalue = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						255, 255, 255)), "\u623f\u95f4\u67e5\u8be2",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Microsoft YaHei UI", 0, 12),
				new java.awt.Color(255, 255, 255)));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u623f\u95f4\u7f16\u53f7");

		jLabel2.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u623f\u95f4\u578b\u53f7");

		jLabel3.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u623f\u95f4\u4ef7\u683c");

		cbtype.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "请选择" }));

		jLabel4.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u623f\u95f4\u72b6\u6001");

		cbstate.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "请选择" }));

		cbvalue.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "请选择" }));

		jLabel7.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("\u5165\u4f4f\u65f6\u95f4");

		jLabel8.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("\u9000\u623f\u65f6\u95f4");

		jLabel9.setForeground(new java.awt.Color(255, 0, 0));
		jLabel9.setText("\u683c\u5f0f\uff1a2017-07-10");

		jButton1.setFont(new java.awt.Font("华文新魏", 1, 14));
		jButton1.setForeground(new java.awt.Color(0, 0, 204));
		jButton1.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\查询.png")); // NOI18N
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

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
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jtfno,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				65,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				cbstate,
																				0,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2)
														.addComponent(jLabel3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																cbtype,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(cbvalue,
																0, 65,
																Short.MAX_VALUE))
										.addGap(12, 12, 12)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jtfend,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				119,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jtfbegin,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				119,
																				Short.MAX_VALUE)))
										.addGap(7, 7, 7)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																111,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																86,
																javax.swing.GroupLayout.PREFERRED_SIZE))
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
														.addComponent(jLabel1)
														.addComponent(
																jtfno,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																cbtype,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7)
														.addComponent(
																jtfbegin,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9))
										.addGap(20, 20, 20)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																cbstate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																cbvalue,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8)
														.addComponent(
																jtfend,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1))
										.addGap(24, 24, 24)));

		jtrooms.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "房间编号", "房间型号", "房间状态", "房间价格", "房间配置" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jtrooms.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jtroomsMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jtrooms);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						255, 255, 255)), "\u64cd\u4f5c\u533a",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("华文新魏", 0, 14), new java.awt.Color(255, 255,
						255)));

		jLabel5.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u5ba2\u6237\u59d3\u540d");

		jLabel6.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("\u8eab\u4efd\u8bc1\u53f7");

		jLabel10.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("\u623f\u95f4\u4ef7\u683c");

		jtfvalue.setEditable(false);

		jLabel11.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("\u623f\u95f4\u7f16\u53f7");

		jtfrno.setEditable(false);

		jLabel12.setFont(new java.awt.Font("华文新魏", 0, 14));
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("\u623f\u95f4\u62bc\u91d1");

		jtfdepost.setEditable(false);
		jtfdepost.setText("100");

		jlbalert.setFont(new java.awt.Font("华文新魏", 0, 18));
		jlbalert.setForeground(new java.awt.Color(204, 0, 0));

		jButton2.setFont(new java.awt.Font("华文新魏", 1, 14));
		jButton2.setForeground(new java.awt.Color(0, 0, 204));
		jButton2.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\付款.png")); // NOI18N
		jButton2.setText("\u4ed8\u8d26");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel15.setForeground(new java.awt.Color(255, 255, 255));
		jLabel15.setText("      \uffe5");

		lbvalue.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		lbvalue.setForeground(new java.awt.Color(204, 0, 0));
		lbvalue.setText(" ");

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
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel5)
														.addComponent(jLabel11))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jtfrno)
																						.addComponent(
																								jtfuname,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								102,
																								Short.MAX_VALUE))
																		.addGap(36,
																				36,
																				36)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel12)
																						.addComponent(
																								jLabel6))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jtfdepost)
																						.addComponent(
																								jtfuid,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE))
																		.addGap(42,
																				42,
																				42)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel15)
																						.addComponent(
																								jLabel10))
																		.addGap(8,
																				8,
																				8))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jlbalert,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(18,
																				18,
																				18)))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jtfvalue)
														.addComponent(
																lbvalue,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																89,
																Short.MAX_VALUE))
										.addGap(56, 56, 56)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jtfuname,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jtfvalue,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel10)
														.addComponent(
																jtfuid,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
										.addGap(30, 30, 30)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel11)
														.addComponent(jLabel15)
														.addComponent(
																jtfrno,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lbvalue)
														.addComponent(
																jtfdepost,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel12))
										.addGap(31, 31, 31)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButton2)
														.addComponent(
																jlbalert,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																27,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(28, Short.MAX_VALUE)));

		jLabel13.setFont(new java.awt.Font("华文新魏", 1, 36));
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("\u5165\u4f4f\u767b\u8bb0");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jPanel1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jScrollPane1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						614,
																						Short.MAX_VALUE)
																				.addComponent(
																						jPanel2,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						614,
																						Short.MAX_VALUE)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(243,
																		243,
																		243)
																.addComponent(
																		jLabel13)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel13)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										131,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										252, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if ("".equals(jtfuname.getText()) || "".equals(jtfuid.getText())) {
			jlbalert.setText("客户姓名和身份证号不能为空！");
			jlbalert.setHorizontalAlignment(jlbalert.CENTER);
			return;
		}
		int rowNum = jtrooms.getSelectedRow();
		String rstate = jtrooms.getValueAt(rowNum, 2) + "";
		if ("满".equals(rstate)) {
			jlbalert.setText("该房间已经被其他人占用，请跟换房间！");
			jlbalert.setHorizontalAlignment(jlbalert.CENTER);
		} else if ("预".equals(rstate)) {
			String userid = jtfuid.getText();
			int depost = Integer.parseInt(jtfdepost.getText());
			int bookst = 2; //直接设置房间为入住状态
			boolean flag = roomCheckInBuss.updateRoomCheckIn(new RoomCheckIn(
					-1, "", userid, new Date(1), new Date(1), bookst, depost));
			if (flag) {
				JOptionPane.showMessageDialog(null, "支付成功！");
				roomBuss.updateRoom(new Rooms(
						Integer.parseInt(jtfrno.getText()), "", "满", "", -1));
				Counts counts = countsBuss.getCountById(userid);
				countsBuss.updateCount(new Counts("", userid, depost
						+ counts.getPaid(), -1, -1));
			} else {
				jlbalert.setText("支付失败！");
				jlbalert.setHorizontalAlignment(jlbalert.CENTER);
			}
		} else if ("空".equals(rstate)) {
			String uname = jtfuname.getText();
			String uid = jtfuid.getText();
			Date beginTime = Date.valueOf(jtfbegin.getText());
			Date endTime = Date.valueOf(jtfend.getText());
			int value = Integer.parseInt(jtfvalue.getText());
			int rno = Integer.parseInt(jtfrno.getText());
			int depost = Integer.parseInt(jtfdepost.getText());
			java.util.Date date = new java.util.Date();	//当前时间
			java.util.Date begin = new java.util.Date(beginTime.getTime());//查询时入房时间
			//检查填写的入房日期是否已过
			if(date.after(begin)){
				jlbalert.setText("警告：已过入住时间，请修改！");
				return;
			}
			boolean isCounts = countsBuss.addCount(new Counts(uname, uid, value
					+ depost, 0, 0));
			boolean isAddRoom = roomCheckInBuss.addRoomCheckIn(new RoomCheckIn(
					rno, uname, uid, beginTime, endTime, 2, depost));
			if (isCounts && isAddRoom) {
				roomBuss.updateRoom(new Rooms(
						Integer.parseInt(jtfrno.getText()), "", "满", "", -1));
				JOptionPane.showMessageDialog(null, "支付成功！");
			} else {
				jlbalert.setText("支付失败！");
				jlbalert.setHorizontalAlignment(jlbalert.CENTER);
			}
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		fillTable(true); //按条件查询
	}

	private void jtroomsMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		jlbalert.setText("");
		int rowNum = jtrooms.getSelectedRow();
		int rno = (Integer) jtrooms.getValueAt(rowNum, 0);//获取房间编号
		jtfrno.setText(rno + "");
		String rstate = (String) jtrooms.getValueAt(rowNum, 2);
		String depostValue = jtfdepost.getText();
		//如果该房间已经预定了，需获取预定该房间用户信息
		if ("预".equals(rstate)) {
			//获取房间入住表和结算表中的数据信息
			RoomCheckIn roomCheckIn = roomCheckInBuss.getRoomCheckInByRno(rno);
			String id = roomCheckIn.getUserid();
			Counts counts = countsBuss.getCountById(id);
			jtfuname.setText(roomCheckIn.getUname());
			jtfuid.setText(id);
			jtfvalue.setText(counts.getPaid() + "");
			lbvalue.setText(depostValue);

		} else if ("空".equals(rstate)) {
			jtfuname.setText("");
			jtfuid.setText("");
			String begTime = jtfbegin.getText();
			String enTime = jtfend.getText();
			int valueHos = (Integer) jtrooms.getValueAt(rowNum, 3);
			if ("".equals(begTime) || "".equals(enTime)) {
				jlbalert.setText("请输入您要住房的日期！");
				jlbalert.setHorizontalAlignment(jlbalert.CENTER);
			} else {
				if (!Format.isDateFormat(begTime)
						|| !Format.isDateFormat(enTime)) {
					jlbalert.setText("请输入正确日期格式！");
					jlbalert.setHorizontalAlignment(jlbalert.CENTER);
				} else {
					Date beginTime = Date.valueOf(begTime);
					Date endTime = Date.valueOf(enTime);
					Long time = endTime.getTime() - beginTime.getTime();
					Long value = (time / 86400000) * valueHos;//房间价格
					jtfvalue.setText(value + "");
					int money = value.intValue()
							+ Integer.parseInt(depostValue);
					lbvalue.setText(money + "");
				}
			}
		} else {
			jlbalert.setText("对不起，该房间已住客人！");
			jlbalert.setHorizontalAlignment(jlbalert.CENTER);
		}
	}

	/**
	 * 填充table
	 */
	private void fillTable(boolean flag) {
		String rno = jtfno.getText();//数据库中为number类型
		String rtype = cbtype.getSelectedItem() + "";
		String rstate = cbstate.getSelectedItem() + "";
		String rvalue = cbvalue.getSelectedItem() + "";//数据库中为number类型
		int roomno = -1;
		int roomvalue = -1;
		if (flag) {
			if (!"".equals(rno) && !"请选择".equals(rvalue)) {
				roomno = Integer.parseInt(rno);
				roomvalue = Integer.parseInt(rvalue);
			} else if ("".equals(rno) && !"请选择".equals(rvalue)) {
				roomvalue = Integer.parseInt(rvalue);
			} else if (!"".equals(rno) && "请选择".equals(rvalue)) {
				roomno = Integer.parseInt(rno);
			}
		}
		List<Rooms> lr = roomBuss.getAllRoomsByCondition(new Rooms(roomno,
				rtype, rstate, "", roomvalue));
		DefaultTableModel dtm = (DefaultTableModel) jtrooms.getModel();
		dtm.setRowCount(0); //设置行的数目为0
		for (Rooms room : lr) {
			Vector v = new Vector();
			v.add(room.getRno());
			v.add(room.getRtype());
			v.add(room.getRstate());
			v.add(room.getRvalue());
			v.add(room.getRconfigue());
			dtm.addRow(v);
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JComboBox cbstate;
	private javax.swing.JComboBox cbtype;
	private javax.swing.JComboBox cbvalue;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel15;
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
	private javax.swing.JLabel jlbalert;
	private javax.swing.JTextField jtfbegin;
	private javax.swing.JTextField jtfdepost;
	private javax.swing.JTextField jtfend;
	private javax.swing.JTextField jtfno;
	private javax.swing.JTextField jtfrno;
	private javax.swing.JTextField jtfuid;
	private javax.swing.JTextField jtfuname;
	private javax.swing.JTextField jtfvalue;
	private javax.swing.JTable jtrooms;
	private javax.swing.JLabel lbvalue;
	// End of variables declaration//GEN-END:variables

}