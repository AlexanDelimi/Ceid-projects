//import javax.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.util.Random;

public class Swing extends JFrame {

	String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
			"19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
	JComboBox cbd = new JComboBox(days);

	String[] stay = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
			"19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
	JComboBox cbs = new JComboBox(stay);

	String[] people = { "1", "2", "3", "4" };
	JComboBox cbp = new JComboBox(people);

	JComboBox rooms = new JComboBox();

	public Swing() {
		frame();
	}

	public void frame() {

		Hotel tokyo = new Hotel();
		int mode = 0;
		Room_Type_A a1 = new Room_Type_A();
		a1.setMaximum_capacity(9);
		a1.setPrice_per_person(20);
		a1.setPrice_per_day(10);
		tokyo.add_Room(a1);
		Room_Type_A a2 = new Room_Type_A();
		a2.setMaximum_capacity(9);
		a2.setPrice_per_person(20);
		a2.setPrice_per_day(10);
		tokyo.add_Room(a2);
		Room_Type_B b1 = new Room_Type_B();
		b1.setMaximum_capacity(9);
		b1.setPrice_per_person(20);
		b1.setPrice_per_day(10);
		b1.setDiscount_per_day(5);
		tokyo.add_Room(b1);
		Room_Type_B b2 = new Room_Type_B();
		b2.setMaximum_capacity(9);
		b2.setPrice_per_person(20);
		b2.setPrice_per_day(10);
		b2.setDiscount_per_day(5);
		tokyo.add_Room(b2);
		Room_Type_C c1 = new Room_Type_C();
		c1.setMaximum_capacity(9);
		c1.setPrice_per_person(20);
		c1.setMinimum_people(3);
		c1.setMinimum_days(5);
		tokyo.add_Room(c1);
		Room_Type_C c2 = new Room_Type_C();
		c2.setMaximum_capacity(9);
		c2.setPrice_per_person(20);
		c2.setMinimum_people(3);
		c2.setMinimum_days(5);
		tokyo.add_Room(c2);
		Room_Type_D d1 = new Room_Type_D();
		d1.setMaximum_capacity(9);
		d1.setPrice_per_person(20);
		d1.setMinimum_people(3);
		tokyo.add_Room(d1);
		Room_Type_D d2 = new Room_Type_D();
		d2.setMaximum_capacity(9);
		d2.setPrice_per_person(20);
		d2.setMinimum_people(3);
		tokyo.add_Room(d2);
		Room_Type_E e1 = new Room_Type_E();
		e1.setMaximum_capacity(9);
		e1.setPrice_per_person(20);
		tokyo.add_Room(e1);
		Room_Type_E e2 = new Room_Type_E();
		e2.setMaximum_capacity(9);
		e2.setPrice_per_person(20);
		tokyo.add_Room(e2);

		for (int i = 0; i < tokyo.getRooms_of_hotel().size(); i++) {
			rooms.addItem(tokyo.getRooms_of_hotel().get(i).getRoom_code());
		}

		JFrame theFrame = new JFrame();
		theFrame.setVisible(true);
		theFrame.setSize(500, 400);
		theFrame.setTitle("KSENODOXIA");
		theFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel thePanel = new JPanel(new GridBagLayout());

		theFrame.add(thePanel);

		JButton button1 = new JButton("Booking");
		JButton button2 = new JButton("Cancelation");
		JButton button3 = new JButton("Show all bookings");
		JButton button4 = new JButton("Show all rooms");
		JButton button5 = new JButton("Booking plan");
		JButton button6 = new JButton("Income");
		JButton button7 = new JButton("Next loop");

		Toolkit tk = Toolkit.getDefaultToolkit(); // dinei prosbasi se methodous
													// tou Toolkit

		Dimension dim = tk.getScreenSize();

		int xPos = (dim.width / 7) - (this.getWidth() / 7);
		int yPos = (dim.height / 7) - (this.getHeight() / 7);

		theFrame.setLocation(xPos, yPos);

		GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(10, 10, 10, 10);
		c.gridx = 1;
		c.gridy = 1;
		thePanel.add(button1, c);
		c.gridx = 3;
		c.gridy = 1;
		thePanel.add(button2, c);
		c.gridx = 1;
		c.gridy = 2;
		thePanel.add(button3, c);
		c.gridx = 3;
		c.gridy = 2;
		thePanel.add(button4, c);
		c.gridx = 1;
		c.gridy = 3;
		thePanel.add(button5, c);
		c.gridx = 3;
		c.gridy = 3;
		thePanel.add(button6, c);
		c.gridx = 2;
		c.gridy = 4;
		thePanel.add(button7, c);

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}

				// JOptionPane.showMessageDialog(null, "ActionListener is
				// working");

				JFrame theFrame1 = new JFrame();
				theFrame1.setSize(500, 500);
				theFrame1.setTitle("Booking");

				JPanel thePanel1 = new JPanel(new GridBagLayout());

				JLabel label1 = new JLabel();
				label1.setText("NAME");
				label1.setToolTipText("Type your name here");
				// getText
				
				JTextField textField1 = new FocusTextField();
				textField1.setColumns(10);
				textField1.setText("Name");

				JLabel label2 = new JLabel();
				label2.setText("DAYS");
				label2.setToolTipText("Which is your arrival day?");
				// getSelectedItem

				JLabel label3 = new JLabel();
				label3.setText("STAY");
				label3.setToolTipText("How many day will you stay?");

				JLabel label4 = new JLabel();
				label4.setText("PEOPLE");
				label4.setToolTipText("How many people will stay?");
				
				JTextField textField2 = new FocusTextField();
				textField2.setColumns(10);
				textField2.setText("ID");

				JLabel label5 = new JLabel();
				label5.setText("ID");
				label5.setToolTipText("Only if you know the ID of your room?");

				JButton buttonOk = new JButton();
				buttonOk.setText("OK");

				buttonOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name = textField1.getText();
						int arrival = Integer.parseInt((String) cbd.getSelectedItem());
						int days = Integer.parseInt((String) cbs.getSelectedItem());
						int people = Integer.parseInt((String) cbp.getSelectedItem());

						Booking book = new Booking();
						book.setName_of_client(name);
						book.setArrival(arrival);
						book.setDays_of_accomodation(days);
						book.setPeople(people);

						if (tokyo.add_booking(book) != 0) {
							JOptionPane.showMessageDialog(null, "Booking was registered with success");
							theFrame1.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Booking was not registered with success");
							theFrame1.dispose();
						}
					}
				});

				int xPos = (dim.width / 2) - (theFrame1.getWidth() / 12);
				int yPos = (dim.height / 3) - (theFrame1.getHeight() / 5);

				theFrame1.setLocation(xPos, yPos);

				theFrame1.add(thePanel1);
				thePanel1.add(label1);
				thePanel1.add(textField1);
				thePanel1.add(label2);
				thePanel1.add(cbd);
				thePanel1.add(label3);
				thePanel1.add(cbs);
				thePanel1.add(label4);
				thePanel1.add(cbp);
				thePanel1.add(label5);
				thePanel1.add(textField2);
				thePanel1.add(buttonOk);

				GridBagConstraints d = new GridBagConstraints();

				d.insets = new Insets(10, 10, 10, 10);
				d.gridx = 1;
				d.gridy = 1;
				thePanel1.add(label1, d);
				d.gridx = 3;
				d.gridy = 1;
				thePanel1.add(textField1, d);
				d.gridx = 1;
				d.gridy = 2;
				thePanel1.add(label2, d);
				d.gridx = 3;
				d.gridy = 2;
				thePanel1.add(cbd, d);
				d.gridx = 1;
				d.gridy = 3;
				thePanel1.add(label3, d);
				d.gridx = 3;
				d.gridy = 3;
				thePanel1.add(cbs, d);
				d.gridx = 1;
				d.gridy = 4;
				thePanel1.add(label4, d);
				d.gridx = 3;
				d.gridy = 4;
				thePanel1.add(cbp, d);
				d.gridx = 1;
				d.gridy = 5;
				thePanel1.add(label5, d);
				d.gridx = 3;
				d.gridy = 5;
				thePanel1.add(textField2, d);
				d.gridx = 2;
				d.gridy = 7;
				thePanel1.add(buttonOk, d);

				theFrame1.setVisible(true);

				// JTextField textField1 = new JTextField();
				// textField1.setText("Type your name here");
				// thePanel.add(textField1);

				theFrame1.add(thePanel1);

			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}

				JFrame theFrame2 = new JFrame();
				theFrame2.setSize(300, 100);
				theFrame2.setTitle("Cancelation");

				JPanel thePanel2 = new JPanel(new GridBagLayout());

				JLabel label6 = new JLabel();
				label6.setText("CANCEL-ID");
				label6.setToolTipText("Type the Cancel-ID here");

				JTextField textField3 = new FocusTextField();
				textField3.setColumns(10);
				textField3.setText("ID here");
				// textField3.requestFocus();

				JButton buttonOk1 = new JButton();
				buttonOk1.setText("OK");

				buttonOk1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int cancel_code = Integer.parseInt(textField3.getText());

						// int cancel_code = 0;
						/*
						 * try { System.out.
						 * println("Give me the booking ID you want to cancel please"
						 * ); cancel_code = scan.nextInt(); } catch
						 * (java.util.InputMismatchException ev) {
						 * System.out.println(e); cancel_code = scan.nextInt();
						 * }
						 */
						boolean succces = tokyo.booking_cancellation(cancel_code);

						if (succces) {
							JOptionPane.showMessageDialog(null, "Booking was canceled with success");
							theFrame2.dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Booking was not canceled with success");
							theFrame2.dispose();
						}

					}
				});

				theFrame2.add(thePanel2);
				thePanel2.add(label6);
				thePanel2.add(textField3);
				thePanel2.add(buttonOk1);
				theFrame2.setVisible(true);

			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}
				System.out.println("Booking code Name of Client Room code");
				for (int i = 0; i <= tokyo.bookings_of_hotel.size() - 1; i++) {
					System.out.print(tokyo.bookings_of_hotel.get(i).getBooking_code() + " ");
					System.out.print(tokyo.bookings_of_hotel.get(i).getName_of_client() + " ");
					System.out.println(tokyo.bookings_of_hotel.get(i).getRoom().getRoom_code());
				}
			}
		});

		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}
				System.out.println("room code plentitude Income from this room");
				for (int i = 0; i < tokyo.rooms_of_hotel.size(); i++) {
					System.out.print(tokyo.rooms_of_hotel.get(i).getRoom_code() + " ");
					System.out.print(tokyo.rooms_of_hotel.get(i).plentitude() + " ");
					System.out.println(tokyo.rooms_of_hotel.get(i).pricing());
				}
			}
		});

		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}
				tokyo.booking_plan();
			}
		});

		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}

				JFrame theFrame3 = new JFrame();
				theFrame3.setSize(500, 500);
				theFrame3.setTitle("Booking");

				JPanel thePanel3 = new JPanel(new GridBagLayout());

				JLabel label8 = new JLabel();
				label8.setText("Dou you want a specific room, Yes or No?");
				label8.setToolTipText("");

				JLabel label9 = new JLabel();
				label9.setText("If Yes which room you want");
				label9.setToolTipText("");

				JButton buttonTrue = new JButton();
				buttonTrue.setText("Yes");
				
				JButton buttonFalse = new JButton();
				buttonFalse.setText("No");
				
				
				
				buttonTrue.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int room_codes = 1;
						boolean code = false;

						JTextField textFieldTrue = new JTextField();
						textFieldTrue.setColumns(10);
						room_codes = (int) rooms.getSelectedItem();

						System.out.println(tokyo.calculate_income(room_codes));
					}
				});

				
				buttonFalse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int room_codes = 1;
						boolean code = false;

						System.out.println(tokyo.calculate_income());
					}
				});

				
				theFrame3.add(thePanel3);
				thePanel3.add(label8);
				thePanel3.add(buttonTrue);
				thePanel3.add(buttonFalse);
				thePanel3.add(label9);
				thePanel3.add(rooms);
				theFrame3.setVisible(true);
				
				GridBagConstraints er = new GridBagConstraints();

				er.insets = new Insets(10, 10, 10, 10);
				er.gridx = 1;
				er.gridy = 1;
				thePanel3.add(label8, er);
				er.gridx = 3;
				er.gridy = 1;
				thePanel3.add(buttonTrue, er);
				er.gridx = 5;
				er.gridy = 1;
				thePanel3.add(buttonFalse, er);
				er.gridx = 1;
				er.gridy = 3;
				thePanel3.add(label9, er);
				er.gridx = 4;
				er.gridy = 3;
				thePanel3.add(rooms, er);
				
			}
		});

		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scan = new Scanner(System.in);
				Random rand = new Random();
				{
					int arrival0 = rand.nextInt(30) + 1;
					int days0 = rand.nextInt(31 - arrival0) + 1;
					int people0 = rand.nextInt(5);
					String[] listName = new String[] { "Takis", "Nikos", "Alex", "Babis", "Sylvia", "Magdalini",
							"Omiros", "Jimmy", "Giorgos", "Zhshs" };
					int posit = rand.nextInt(9);
					String clientName = listName[posit];
					Booking every = new Booking(clientName, arrival0, days0, people0);
					tokyo.add_booking(every);
					if (rand.nextInt(3) == 0) {
						int posit0 = rand.nextInt(tokyo.bookings_of_hotel.size());
						tokyo.booking_cancellation(tokyo.bookings_of_hotel.get(posit0).getBooking_code());
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new Swing();
	}

	static class FocusTextField extends JTextField {
		{
			addFocusListener(new FocusListener() {

				@Override
				public void focusGained(FocusEvent e) {
					FocusTextField.this.select(0, getText().length());
				}

				@Override
				public void focusLost(FocusEvent e) {
					FocusTextField.this.select(0, 0);
				}
			});
		}
	}
}