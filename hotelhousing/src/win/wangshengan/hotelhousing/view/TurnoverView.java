/*
 * TurnoverView.java
 *
 * Created on __DATE__, __TIME__
 */

package win.wangshengan.hotelhousing.view;

import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import win.wangshengan.hotelhousing.business.TurnoverBuss;
import win.wangshengan.hotelhousing.business.impl.TurnoverBussImpl;
import win.wangshengan.hotelhousing.entity.Turnover;
import win.wangshengan.hotelhousing.util.DateGetUtil;

/**
 *
 * @author  __USER__
 */
public class TurnoverView extends javax.swing.JPanel {

	/** Creates new form TurnoverView */
	public TurnoverView() {
		initComponents();
		this.setSize(638, 624);
		this.setOpaque(false);
		jPanel1.setOpaque(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		cbyear = new javax.swing.JComboBox();
		cbmonth = new javax.swing.JComboBox();
		cbday = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jlbmoney = new javax.swing.JTable();
		jLabel5 = new javax.swing.JLabel();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						255, 255, 255)), "\u67e5\u8be2\u6761\u4ef6",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("������κ", 0, 14), new java.awt.Color(255, 255,
						255)));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("������κ", 0, 18));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u65f6 \u95f4");

		jButton1.setFont(new java.awt.Font("������κ", 1, 14));
		jButton1.setForeground(new java.awt.Color(0, 0, 204));
		jButton1.setIcon(new javax.swing.ImageIcon(
				"D:\\MyeclipseWork\\hotelhousing1\\images\\��ѯ.png")); // NOI18N
		jButton1.setText("\u67e5 \u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		cbyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"��ѡ��", "2017", "2018", "2019", "2020", "2021", "2022", "2023",
				"2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031",
				"2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039",
				"2040" }));
		cbyear.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cbyearItemStateChanged(evt);
			}
		});

		cbmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"��ѡ��", "01", "02", "03", "04", "05", "06", "07", "08", "09",
				"10", "11", "12" }));
		cbmonth.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cbmonthItemStateChanged(evt);
			}
		});

		cbday.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "��ѡ��" }));

		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u5e74");

		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u6708");

		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u65e5");

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
										.addGap(36, 36, 36)
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addComponent(
												cbyear,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												73,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												cbmonth,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												72,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addGap(11, 11, 11)
										.addComponent(
												cbday,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												64,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												112, Short.MAX_VALUE)
										.addComponent(jButton1)
										.addGap(28, 28, 28)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(31, 31, 31)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jLabel4)
														.addComponent(
																cbday,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																cbmonth,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																cbyear,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1))
										.addContainerGap(37, Short.MAX_VALUE)));

		jlbmoney.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "����", "Ӫҵ��" }) {
			boolean[] canEdit = new boolean[] { false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jlbmoney);

		jLabel5.setFont(new java.awt.Font("������κ", 0, 36));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u8425\u4e1a\u989d");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jLabel5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		235,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(155,
																		155,
																		155))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addContainerGap())
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		614,
																		Short.MAX_VALUE)
																.addContainerGap()))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel5)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										395,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(17, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String year = cbyear.getSelectedItem() + "";
		String month = cbmonth.getSelectedItem() + "";
		String day = cbday.getSelectedItem() + "";
		StringBuffer sb = new StringBuffer("");
		if (!"��ѡ��".equals(year)) {
			sb.append(year);
		}
		if (!"��ѡ��".equals(month)) {
			sb.append("-" + month);
		}
		if (!"��ѡ��".equals(day)) {
			sb.append("-" + day);
		}
		TurnoverBuss turnoverBuss = new TurnoverBussImpl();
		List<Turnover> lt = turnoverBuss.getAllTurnover(new Turnover(sb + "",
				-1));
		DefaultTableModel dtm = (DefaultTableModel) jlbmoney.getModel();
		dtm.setRowCount(0);
		for (Turnover turn : lt) {
			Vector v = new Vector();
			v.add(turn.getEndTime());
			v.add(turn.getTotalMoney());
			dtm.addRow(v);
		}

	}

	private void cbmonthItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:
		fillCombox();
	}

	//ͨ�������ж���
	private void fillCombox() {
		String year = cbyear.getSelectedItem() + "";
		String month = cbmonth.getSelectedItem() + "";
		cbday.removeAllItems();
		if (!"��ѡ��".equals(month) && !"��ѡ��".equals(year)) {
			int day = DateGetUtil.getDate(Integer.parseInt(year),
					Integer.parseInt(month));
			for (int i = 1; i <= day; i++) {
				cbday.addItem(i);
			}
		} else {
			cbday.addItem("��ѡ��");
		}
	}

	private void cbyearItemStateChanged(java.awt.event.ItemEvent evt) {
		// TODO add your handling code here:
		fillCombox();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JComboBox cbday;
	private javax.swing.JComboBox cbmonth;
	private javax.swing.JComboBox cbyear;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jlbmoney;
	// End of variables declaration//GEN-END:variables

}