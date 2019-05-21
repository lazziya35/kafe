package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class BCart extends JPanel {

	private Image backgroundImage;
	private JTable table;
	private JTable table2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public BCart(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, (int) getSize().getWidth() - 0, (int) getSize().getHeight() - 0, this);

	}
	public BCart() {
		SuleymanDemirel();
	}
	public void SuleymanDemirel() {
		this.setBounds(0, 0, 1280, 720);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBackground(Color.WHITE);
		setLayout(null);
		
		String[] columnNames = { "Card Id", "Card Type", "Balance","Customer Name"};
		Object[][] data = {
				{ new Integer(1), "Regular", "350,00TL","Customer1"},
				{ new Integer(2), "Student", "72,00TL","Customer2"},
				{ new Integer(3), "Premium","553,00TL","Customer3"}	
		};
		
		String[] columnNames2 = { "Id","Name", "Surname","Card Type", "Email","Phone","BirthDate"};
		Object[][] data2 = {
				{  new Integer(1),"Muslum","Gurses","Premium","muslumbaba@msn.com","05068884545","3/8/1958"},
				{  new Integer(2),"Hakan"," Tasiyan", "Regular","hakantasiyon@google.com","05452124541","4/4/1984"}
		};
		
		table = new JTable(data, columnNames);
	    table.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setOpaque(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(957, 60, 288, 531);
		scrollPane.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane);
		
		table2 = new JTable(data2, columnNames2);
	    table2.setPreferredScrollableViewportSize(new Dimension(200, 70));
	    table2.setBackground(Color.DARK_GRAY);
		table2.setForeground(Color.WHITE);
		table2.setFillsViewportHeight(true);
		table2.setOpaque(false);
		
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(614, 60, 333, 531);
		scrollPane2.getViewport().setBackground(Color.DARK_GRAY);
		add(scrollPane2);
		
		
		JLabel lblNewLabel = new JLabel("Card List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(82, 190, 230));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel.setBounds(990, 11, 213, 38);
		add(lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("Customer List");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(82, 190, 230));
		lblNewLabel_7.setFont(new Font("Bauhaus 93", Font.ITALIC, 27));
		lblNewLabel_7.setBounds(657, 11, 213, 38);
		add(lblNewLabel_7);
		
		
		JLabel lblCreateCustomer = new JLabel("Create Customer");
		lblCreateCustomer.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblCreateCustomer.setBounds(10, 38, 122, 21);
		add(lblCreateCustomer);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(10, 70, 56, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(10, 95, 56, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_3.setBounds(10, 120, 56, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone");
		lblNewLabel_4.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_4.setBounds(10, 145, 56, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BirtDate(D/M/Y)");
		lblNewLabel_5.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_5.setBounds(10, 170, 103, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CartType");
		lblNewLabel_6.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_6.setBounds(10, 223, 75, 21);
		add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(76, 70, 122, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 92, 122, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 117, 122, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 142, 122, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 192, 56, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(76, 192, 56, 20);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(142, 192, 56, 20);
		add(spinner_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Regular");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton.setBounds(6, 251, 79, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Student");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_1.setBounds(87, 251, 75, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Premium");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_2.setBounds(164, 251, 85, 23);
		add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Create Customer");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton.setBounds(10, 293, 145, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Create Card");
		lblNewLabel_8.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_8.setBounds(268, 38, 103, 21);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Card Type");
		lblNewLabel_9.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_9.setBounds(268, 67, 75, 21);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Add Balance");
		lblNewLabel_10.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_10.setBounds(268, 195, 94, 21);
		add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Amount :");
		lblNewLabel_11.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_11.setBounds(268, 226, 67, 23);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("CustomerId :");
		lblNewLabel_12.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_12.setBounds(268, 120, 88, 21);
		add(lblNewLabel_12);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Regular");
		rdbtnNewRadioButton_3.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_3.setBounds(268, 91, 88, 23);
		add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Student");
		rdbtnNewRadioButton_4.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_4.setBounds(358, 91, 75, 23);
		add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Premium");
		rdbtnNewRadioButton_5.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		rdbtnNewRadioButton_5.setBounds(441, 91, 75, 23);
		add(rdbtnNewRadioButton_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(366, 120, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Create Card");
		btnNewButton_1.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		btnNewButton_1.setBounds(268, 145, 122, 23);
		add(btnNewButton_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(345, 223, 86, 21);
		add(spinner_3);
		
		JLabel lblTl = new JLabel("TL");
		lblTl.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblTl.setBounds(441, 226, 46, 14);
		add(lblTl);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnNewButton_2.setBounds(268, 261, 122, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_13 = new JLabel("Remove Customer");
		lblNewLabel_13.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblNewLabel_13.setBounds(10, 327, 122, 23);
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Customer Id :");
		lblNewLabel_14.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblNewLabel_14.setBounds(10, 361, 103, 21);
		add(lblNewLabel_14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(123, 361, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		btnRemove.setBounds(10, 393, 89, 23);
		add(btnRemove);
		
		JLabel lblRemoveCard = new JLabel("Remove Card");
		lblRemoveCard.setFont(new Font("Bauhaus 93", Font.ITALIC, 15));
		lblRemoveCard.setBounds(268, 332, 103, 18);
		add(lblRemoveCard);
		
		JLabel lblCardId = new JLabel("Card Id :");
		lblCardId.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		lblCardId.setBounds(268, 364, 75, 18);
		add(lblCardId);
		
		textField_6 = new JTextField();
		textField_6.setBounds(366, 361, 86, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnRemoveCard = new JButton("Remove Card");
		btnRemoveCard.setFont(new Font("Bauhaus 93", Font.ITALIC, 13));
		btnRemoveCard.setBounds(268, 394, 122, 23);
		add(btnRemoveCard);
	}
}
