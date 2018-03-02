package API;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.web.client.RestTemplate;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;

public class API_gui {

	private JFrame frame;
	private JTextField textField;
	private JSpinner textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					API_gui window = new API_gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public API_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(165, 42, 42));
		frame.setBounds(100, 100, 664, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JComboBox comboBox = new JComboBox();

		comboBox.addItem("NAME");
		comboBox.addItem("CAPITAL CITY");
		comboBox.addItem("REGION");
		comboBox.addItem("LANGUAGE");
		comboBox.addItem("CURRENCY");
		comboBox.setBounds(166, 41, 132, 20);
		frame.getContentPane().add(comboBox);

		JLabel lblSelectShearchMethod = new JLabel("Select shearch method");
		lblSelectShearchMethod.setForeground(new Color(255, 182, 193));
		lblSelectShearchMethod.setBounds(34, 44, 109, 14);
		frame.getContentPane().add(lblSelectShearchMethod);

		textField = new JTextField();
		textField.setBounds(318, 41, 116, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblCountryName = new JLabel("country name ");
		lblCountryName.setForeground(new Color(255, 182, 193));
		lblCountryName.setBounds(34, 101, 86, 14);
		frame.getContentPane().add(lblCountryName);

		JLabel lblCapital = new JLabel("capital ");
		lblCapital.setForeground(new Color(255, 182, 193));
		lblCapital.setBounds(34, 126, 86, 14);
		frame.getContentPane().add(lblCapital);

		JLabel lblRegion = new JLabel("region");
		lblRegion.setForeground(new Color(255, 182, 193));
		lblRegion.setBounds(34, 153, 86, 14);
		frame.getContentPane().add(lblRegion);

		JLabel lblNumericcode = new JLabel("numericCode");
		lblNumericcode.setForeground(new Color(255, 182, 193));
		lblNumericcode.setBounds(34, 179, 86, 14);
		frame.getContentPane().add(lblNumericcode);

		JLabel lblArea = new JLabel("area");
		lblArea.setForeground(new Color(255, 182, 193));
		lblArea.setBounds(34, 206, 86, 14);
		frame.getContentPane().add(lblArea);

		JLabel lblPopulation = new JLabel("population");
		lblPopulation.setForeground(new Color(255, 182, 193));
		lblPopulation.setBounds(34, 233, 86, 14);
		frame.getContentPane().add(lblPopulation);

		JLabel lblTimezones = new JLabel("timezones");
		lblTimezones.setForeground(new Color(255, 182, 193));
		lblTimezones.setBounds(34, 258, 86, 14);
		frame.getContentPane().add(lblTimezones);

		JLabel lblBorders = new JLabel("borders");
		lblBorders.setForeground(new Color(255, 182, 193));
		lblBorders.setBounds(34, 292, 86, 14);
		frame.getContentPane().add(lblBorders);

		JLabel lblLanguags = new JLabel("demonym");
		lblLanguags.setForeground(new Color(255, 182, 193));
		lblLanguags.setBounds(34, 327, 86, 14);
		frame.getContentPane().add(lblLanguags);

		JLabel lblCurrencies = new JLabel("currencies");
		lblCurrencies.setForeground(new Color(255, 182, 193));
		lblCurrencies.setBounds(34, 368, 86, 14);
		frame.getContentPane().add(lblCurrencies);

		JLabel lblNewLabel = new JLabel(": ");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setBounds(130, 101, 1214, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel(": ");
		label.setForeground(new Color(255, 182, 193));
		label.setBounds(130, 126, 1214, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel(": ");
		label_1.setForeground(new Color(255, 182, 193));
		label_1.setBounds(130, 153, 1214, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel(": ");
		label_2.setForeground(new Color(255, 182, 193));
		label_2.setBounds(130, 179, 1214, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel(": ");
		label_3.setForeground(new Color(255, 182, 193));
		label_3.setBounds(130, 206, 1214, 14);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel(": ");
		label_4.setForeground(new Color(255, 182, 193));
		label_4.setBounds(130, 233, 1214, 14);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel(": ");
		label_5.setForeground(new Color(255, 182, 193));
		label_5.setBounds(130, 258, 1214, 14);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel(": ");
		label_6.setForeground(new Color(255, 182, 193));
		label_6.setBounds(130, 292, 1214, 14);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel(": ");
		label_7.setForeground(new Color(255, 182, 193));
		label_7.setBounds(130, 327, 1214, 14);
		frame.getContentPane().add(label_7);

		JLabel label_8 = new JLabel(": ");
		label_8.setForeground(new Color(255, 182, 193));
		label_8.setBounds(130, 368, 1214, 14);
		frame.getContentPane().add(label_8);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(": ");
				label.setText(": ");
				label_1.setText(": ");
				label_2.setText(": ");
				label_3.setText(": ");
				label_4.setText(": ");
				label_5.setText(": ");
				label_6.setText(": ");
				label_7.setText(": ");
				label_8.setText(": ");
				String url = "https://restcountries.eu/rest/v2/";
				if (comboBox.getSelectedIndex() == 0) {
					url += "name/";
				} else if (comboBox.getSelectedIndex() == 1) {
					url += "capital/";
				} else if (comboBox.getSelectedIndex() == 2) {
					url += "region/";
				} else if (comboBox.getSelectedIndex() == 3) {
					url += "lang/";
				} else if (comboBox.getSelectedIndex() == 4) {
					url += "currency/";
				}

				url += textField.getText();

				try {

					RestTemplate restTemplate = new RestTemplate();
					Json[] jList = restTemplate.getForObject(url, Json[].class);

					if (jList == null)
						JOptionPane.showMessageDialog(null, "404 not found");
					for (Json J : jList) {
						if (J == null)
							JOptionPane.showMessageDialog(null, "404 not found");
						lblNewLabel.setText(lblNewLabel.getText() + J.getName() + " | ");
						label.setText(label.getText() + J.getCapital() + " | ");
						label_1.setText(label_1.getText() + J.getRegion() + " | ");
						label_2.setText(label_2.getText() + J.getNumericCode() + " | ");
						label_3.setText(label_3.getText() + J.getArea() + " | ");
						label_4.setText(label_4.getText() + J.getPopulation() + " | ");
						for (String t : J.getTimezones()) {
							label_5.setText(label_5.getText() + t + " , ");
						}
						label_5.setText(label_5.getText() + " | ");

						for (String b : J.getBorders()) {
							label_6.setText(label_6.getText() + b + " , ");
						}
						label_6.setText(label_6.getText() + " | ");

						label_7.setText(label_7.getText() + J.getDemonym() + " | ");
						String cur = "";
						for (currencies c : J.getCurrencies()) {
							if (c != null)
								cur += c.getName() + ", ";
						}
						label_8.setText(label_8.getText() + cur + " | ");

					}

				} catch (org.springframework.web.client.HttpClientErrorException e1) {
					JOptionPane.showMessageDialog(null, "invalid input !!");
				}
			}
		});
		btnGo.setBounds(444, 40, 89, 23);
		frame.getContentPane().add(btnGo);

		textField_1 = new JSpinner();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setBounds(344, 440, 160, 37);
		frame.getContentPane().add(textField_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		comboBox_1.setBounds(514, 440, 181, 37);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.addItem("Trivia");
		comboBox_1.addItem("Math");
		comboBox_1.addItem("Date");
		comboBox_1.addItem("Year");

		JLabel lblEnterNumber = new JLabel("enter number ");
		lblEnterNumber.setForeground(new Color(255, 182, 193));
		lblEnterNumber.setBounds(222, 442, 96, 37);
		frame.getContentPane().add(lblEnterNumber);

		JButton btnRandomNumber = new JButton("Random number");
		btnRandomNumber.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String url = "http://numbersapi.com/random";

				if (comboBox_1.getSelectedIndex() == 1) {
					url += "/math";
				} else if (comboBox_1.getSelectedIndex() == 2) {
					url += "/date";
				} else if (comboBox_1.getSelectedIndex() == 3) {
					url += "/year";
				}
				RestTemplate restTemplate = new RestTemplate();
				String J = restTemplate.getForObject(url, String.class);
				textField_2.setText(J);

			}
		});
		btnRandomNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnRandomNumber.setBounds(514, 497, 181, 29);
		frame.getContentPane().add(btnRandomNumber);

		JButton btnGo_1 = new JButton("GO");
		btnGo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String url = "http://numbersapi.com/";
				url += textField_1.getValue();
				if (comboBox_1.getSelectedIndex() == 1) {
					url += "/math";
				} else if (comboBox_1.getSelectedIndex() == 2) {
					url += "/date";
				} else if (comboBox_1.getSelectedIndex() == 3) {
					url += "/year";
				}
				RestTemplate restTemplate = new RestTemplate();
				String J = restTemplate.getForObject(url, String.class);
				textField_2.setText(J);

			}
		});
		btnGo_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnGo_1.setBounds(344, 498, 160, 26);
		frame.getContentPane().add(btnGo_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_2.setBackground(new Color(255, 182, 193));
		textField_2.setBounds(166, 574, 990, 67);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGetCountryInformation = new JLabel("Get country information");
		lblGetCountryInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblGetCountryInformation.setBounds(577, 11, 280, 57);
		frame.getContentPane().add(lblGetCountryInformation);
		
		JLabel lblFacts = new JLabel("Facts");
		lblFacts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblFacts.setBounds(482, 393, 70, 36);
		frame.getContentPane().add(lblFacts);

	}
}
