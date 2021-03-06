package tr.edu.deu.ceng.coffie.entity.applicationform.mainmenu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import tr.edu.deu.ceng.coffie.db.inmemory.Memory;
import tr.edu.deu.ceng.coffie.entity.applicationform.BDEFTERLER;
import tr.edu.deu.ceng.coffie.entity.applicationform.CheckOut;
import tr.edu.deu.ceng.coffie.entity.applicationform.DEFTERLER;
import tr.edu.deu.ceng.coffie.entity.applicationform.TableConfiguration;
import tr.edu.deu.ceng.coffie.entity.applicationform.cart.Cart;
import tr.edu.deu.ceng.coffie.entity.applicationform.menuitems.BFoodAndDrink;
import tr.edu.deu.ceng.coffie.entity.applicationform.menuitems.FoodAndDrinkMenu;
import tr.edu.deu.ceng.coffie.entity.table.InnerTable;
import tr.edu.deu.ceng.coffie.entity.table.Table;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bmainpanel extends JPanel {
	
	private Image backgroundImage;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JFrame parent;
	private JLabel lblUserName;
	public Bmainpanel(String fileName,JFrame parent) throws IOException {
	    backgroundImage = ImageIO.read(new File(fileName));
	    this.parent = parent;
	  }
       @Override
	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
       g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	  }
	/**
	 * Create the panel.
	 */
	public Bmainpanel() {
		
       lazziya();
	}
	
	
	public void lazziya() {
		setLayout(null);
		this.setBounds(0, 0, 1280, 720);
		setBackground(Color.WHITE);
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(150,150,150,100));
		panel_1.setBounds(77, 37, 1089, 57);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("CHECK&ORDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckOut check = new CheckOut(parent);
				parent.setVisible(false);
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(82, 190, 230));
		btnNewButton.setBackground(new Color(0,0,0));
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));
		btnNewButton.setBounds(10, 0, 197, 57);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CARDS&CUSTOMER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cart window = new Cart(parent);
				
				parent.setVisible(false);

			}
		});

		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(new Color(82, 190, 230));
		btnNewButton_1.setBackground(new Color(0,0,0));
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 22));
		btnNewButton_1.setBounds(231, 1, 195, 57);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("MENU CONFIGURATION");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DEFTERLER d = new DEFTERLER(parent);
				parent.setVisible(false);

			}
		});
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(new Color(82, 190, 230));
		btnNewButton_3.setBackground(new Color(0,0,0));
		btnNewButton_3.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
		btnNewButton_3.setBounds(449, 0, 207, 57);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Table Configuration");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableConfiguration tb = new TableConfiguration(parent);
				parent.setVisible(false);
				
			}
		});
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setForeground(new Color(82, 190, 230));
		btnNewButton_4.setBackground(new Color(0,0,0));
		btnNewButton_4.setFont(new Font("Bauhaus 93", Font.PLAIN, 20));
		btnNewButton_4.setBounds(680, 0, 192, 57);
		panel_1.add(btnNewButton_4);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFocusable(false);
		btnLogout.setBorder(null);
		btnLogout.setFont(new Font("Bauhaus 93", Font.ITALIC, 24));
		btnLogout.setBounds(898, 0, 181, 57);
		btnLogout.setForeground(Color.RED);
		btnLogout.setBackground(new Color(0,0,0));
		panel_1.add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		panel_2 = new JPanel();
		GridLayout grid1 = new GridLayout(0,3);
		panel_2.setLayout(grid1);
		panel_2.setOpaque(false);
		panel_2.setBounds(77, 123, 455, 544);
		JScrollPane scrollPane1 = new JScrollPane(panel_2);
		scrollPane1.setBounds(77, 123, 455, 544);
		scrollPane1.getViewport().setBackground(new Color(0,0,0,0));
		scrollPane1.setOpaque(false);
		
		
		
		panel_3 = new JPanel();
		GridLayout grid2 = new GridLayout(0,3);
		panel_3.setLayout(grid2);
		panel_3.setOpaque(false);
		panel_3.setBounds(745, 123, 421, 531);
		panel_3.setBackground(new Color(0,0,0,0));
		JScrollPane scrollPane2 = new JScrollPane(panel_3);
		scrollPane2.setBounds(745, 123, 421, 531);
		scrollPane2.getViewport().setBackground(new Color(0,0,0,0));
		scrollPane2.setOpaque(false);
		scrollPane2.getViewport().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				scrollPane2.invalidate();
				panel_3.invalidate();
			}
		});
		List<Table> tables = Memory.getMemory().getTables();
		for (Iterator iterator = tables.iterator(); iterator.hasNext();) {
			Table table = (Table) iterator.next();
			if(table instanceof InnerTable) {
				addTable(panel_2, table);
			}else {
				addTable(panel_3, table);
			}
			
		}
		add(scrollPane2);
		add(scrollPane1);
		
		lblUserName = new JLabel("USER NAME");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(975, 0, 179, 33);
		add(lblUserName);
		lblUserName.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblUserName.setForeground(Color.ORANGE);
		lblUserName.setBackground(new Color(0,0,0));
		
		
	}
	public void addTable(JComponent panel,Table sitTable) {
		ImageIcon table = new ImageIcon("resources/table.png");

		JPanel tablepanel=new JPanel();
		tablepanel.setBackground(new Color(0,0,0,0));
		
		JButton tablebutton=new JButton();
		    tablebutton.setIcon(table);
			tablebutton.setBorder(null);
			tablebutton.setFocusable(false);
			tablebutton.setBackground(new Color(82, 190, 230));
			tablebutton.setContentAreaFilled(false);
			tablebutton.setOpaque(true);
			
		JLabel tablelabel = new JLabel("Table "+sitTable.getName());
			tablelabel.setForeground(Color.WHITE);
			tablelabel.setHorizontalAlignment(SwingConstants.CENTER);
			tablelabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
			tablelabel.setBounds(45, 95, 59, 20);
		
		tablepanel.add(tablebutton);
		tablepanel.add(tablelabel);
		panel.add(tablepanel);
	}
}
