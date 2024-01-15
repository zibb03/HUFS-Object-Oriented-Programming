import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class st_GUI{
	
	static JFrame frame = null;
	JButton Add_button = null;
	JButton Update_button = null;
	JButton Search_button = null;
	JButton Display_button = null;
	JButton Exit_button = null;
	static JPanel contentPane;
	static JPanel menu;

	st_GUI(){
		
		frame = new JFrame();
        frame.setSize(1000, 600);
        frame.setTitle("Student_information");
        frame.setLayout(null);
        
        menu = new JPanel();
        menu.setBorder(new EmptyBorder(5, 5, 5, 5));
        menu.setLayout(null);
		
		Add_button = new JButton("Add information");
		Add_button.setBounds(10, 10, 110, 400);
		menu.add(Add_button);
		
		Update_button = new JButton("Update information");
		Update_button.setBounds(150, 10, 110, 400);//14, 140, 111, 18
		menu.add(Update_button);
		
		Search_button = new JButton("Search information");
		Search_button.setBounds(290, 10, 110, 400);
		menu.add(Search_button);
		
		Display_button = new JButton("Display information");
		Display_button.setBounds(430, 10, 110, 400);
		menu.add(Display_button);
		
		Exit_button = new JButton("Exit");
		Exit_button.setBounds(580, 10, 110, 400);
		menu.add(Exit_button);
		
		frame.setContentPane(menu);
	    frame.revalidate();
	    
     
       Add_button.addActionListener(new ActionListener() {
    	   
			public void actionPerformed(ActionEvent e) {
				JTextField tf1;
				JTextField tf2;
				JTextField tf3;
				JTextField tf4;
				JTextField tf5;
				JButton Add_Btn;
				
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				contentPane.setLayout(null);
				
				Add_Btn = new JButton("Save");
				Add_Btn.setBounds(14, 200, 111, 18);
				contentPane.add(Add_Btn);
				
				
				JLabel l1 = new JLabel("Student ID");
				l1.setBounds(14, 50, 111, 18);
				contentPane.add(l1);
				
				JLabel l2 = new JLabel("Student Name");
				l2.setBounds(14, 80, 111, 18);
				contentPane.add(l2);
				
				JLabel l3 = new JLabel("Student Address");
				l3.setBounds(14, 110, 111, 18);
				contentPane.add(l3);
				
				JLabel l4 = new JLabel("Student Department");
				l4.setBounds(14, 140, 111, 18);
				contentPane.add(l4);
				
				JLabel l5 = new JLabel("Student Courses");
				l5.setBounds(14, 170, 111, 18);
				contentPane.add(l5);
				
				
				tf1 = new JTextField();
				tf1.setBounds(180, 50, 116, 24);
				contentPane.add(tf1);
				tf1.setColumns(10);
				
				tf2 = new JTextField();
				tf2.setBounds(180, 80, 116, 24);
				contentPane.add(tf2);
				tf2.setColumns(10);
				
				tf3 = new JTextField();
				tf3.setBounds(180, 110, 116, 24);
				contentPane.add(tf3);
				tf3.setColumns(10);
				
				tf4 = new JTextField();
				tf4.setBounds(180, 140, 116, 24);
				contentPane.add(tf4);
				tf4.setColumns(10);
				
				tf5 = new JTextField();
				tf5.setBounds(180, 170, 116, 24);
				contentPane.add(tf5);
				tf5.setColumns(10);
				
				JButton Back_Btn = new JButton("Back");
				Back_Btn.setBounds(14, 230, 111, 18);
				contentPane.add(Back_Btn);
				
				Back_Btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.setContentPane(menu);
							frame.revalidate();
						}
					});
				
				frame.setContentPane(contentPane);
			    frame.revalidate();
			    
			   
			    Add_Btn.addActionListener(new ActionListener() {

			        public void actionPerformed(ActionEvent e) {
			        	String ID = tf1.getText();
			            try {
			                if (st_File.Exist_ID_File(ID)) {
			                    JOptionPane.showMessageDialog(null, "ID already exist!", "Toast", JOptionPane.INFORMATION_MESSAGE);
			                } else {
			                    String Name = tf2.getText();
			                    String Address = tf3.getText();
			                    String Department = tf4.getText();
			                    String course = tf5.getText();
			                    St_info st = new St_info(ID, Name, Address, Department, course);
			                    

			                    try {
			                        st_File.writeDatatoFile(st);
			                        JOptionPane.showMessageDialog(null, "Add success", "Toast", JOptionPane.INFORMATION_MESSAGE);
			                        frame.setContentPane(menu);
									frame.revalidate();
			                       
			                    } catch (IOException e1) {
			                        e1.printStackTrace();
			                    }
			                }
			            } catch (FileNotFoundException e1) {
			                e1.printStackTrace();
			            }
			        }
			    });

			}
		});
       Update_button.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	    	if (st_File.Empty()) {
    	    		Back_to_Menu();
    	            } else {
    	                JTextField tf0;
    	                JTextField tf1;
    	                JTextField tf2;
    	                JTextField tf3;
    	                JTextField tf4;
    	                JTextField tf5;
    	                JButton Upd_Btn;

    	                contentPane = new JPanel();
    	                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	                contentPane.setLayout(null);

    	                Upd_Btn = new JButton("Update");
    	                Upd_Btn.setBounds(14, 200, 111, 18);
    	                contentPane.add(Upd_Btn);

    	                JLabel l0 = new JLabel("ID to update");
    	                l0.setBounds(14, 20, 111, 18);
    	                contentPane.add(l0);

    	                JLabel l1 = new JLabel("Student new ID");
    	                l1.setBounds(14, 50, 111, 18);
    	                contentPane.add(l1);

    	                JLabel l2 = new JLabel("Student Name");
    	                l2.setBounds(14, 80, 111, 18);
    	                contentPane.add(l2);

    	                JLabel l3 = new JLabel("Student Address");
    	                l3.setBounds(14, 110, 111, 18);
    	                contentPane.add(l3);

    	                JLabel l4 = new JLabel("Student Department");
    	                l4.setBounds(14, 140, 111, 18);
    	                contentPane.add(l4);

    	                JLabel l5 = new JLabel("Student Courses");
    	                l5.setBounds(14, 170, 111, 18);
    	                contentPane.add(l5);

    	                tf0 = new JTextField();
    	                tf0.setBounds(180, 20, 116, 24);
    	                contentPane.add(tf0);
    	                tf0.setColumns(10);

    	                tf1 = new JTextField();
    	                tf1.setBounds(180, 50, 116, 24);
    	                contentPane.add(tf1);
    	                tf1.setColumns(10);

    	                tf2 = new JTextField();
    	                tf2.setBounds(180, 80, 116, 24);
    	                contentPane.add(tf2);
    	                tf2.setColumns(10);

    	                tf3 = new JTextField();
    	                tf3.setBounds(180, 110, 116, 24);
    	                contentPane.add(tf3);
    	                tf3.setColumns(10);

    	                tf4 = new JTextField();
    	                tf4.setBounds(180, 140, 116, 24);
    	                contentPane.add(tf4);
    	                tf4.setColumns(10);

    	                tf5 = new JTextField();
    	                tf5.setBounds(180, 170, 116, 24);
    	                contentPane.add(tf5);
    	                tf5.setColumns(10);

    	                JButton Back_Btn = new JButton("Back");
    	                Back_Btn.setBounds(14, 230, 111, 18);
    	                contentPane.add(Back_Btn);

    	                Back_Btn.addActionListener(new ActionListener() {
    	                    public void actionPerformed(ActionEvent e) {
    	                        frame.setContentPane(menu);
    	                        frame.revalidate();
    	                    }
    	                });

    	                frame.setContentPane(contentPane);
    	                frame.revalidate();

    	                Upd_Btn.addActionListener(new ActionListener() {
    	                    public void actionPerformed(ActionEvent e) {
    	                        String ID = tf0.getText();
    	                        try {
    	                            if (!st_File.Exist_ID_File(ID)) {
    	                                JOptionPane.showMessageDialog(null, "ID doesn't exist!", "Toast", JOptionPane.INFORMATION_MESSAGE);
    	                            } else {
    	                                String new_ID = tf1.getText();
    	                                String Name = tf2.getText();
    	                                String Address = tf3.getText();
    	                                String Department = tf4.getText();
    	                                String course = tf5.getText();
    	                                St_info st = new St_info(new_ID, Name, Address, Department, course);
    	                                st_File.update_file(ID, st);
    	                                JOptionPane.showMessageDialog(null, "Update success", "Toast", JOptionPane.INFORMATION_MESSAGE);
    	                                frame.setContentPane(menu);
    	                                frame.revalidate();
    	                            }
    	                        } catch (FileNotFoundException e1) {
    	                            e1.printStackTrace();
    	                        } catch (IOException e2) {
    	                            e2.printStackTrace();
    	                        }
    	                    }
    	                });
    	            }
    	       
    	    }
    	});

       Search_button.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   if(st_File.Empty()) {
    			   Back_to_Menu();
    		   }else {
				contentPane = new JPanel();
				JTextArea Display_GUI;
				Display_GUI = new JTextArea();
				Display_GUI.setBackground(Color.LIGHT_GRAY);
				Display_GUI.setBounds(51, 228, 425, 108);
				
				JTextField ID = new JTextField();
				ID.setBounds(180, 50, 116, 24);
				contentPane.add(ID);
				ID.setColumns(10);
				
				JButton Search_Btn = new JButton("Search");
				Search_Btn.setBounds(14, 230, 111, 18);
				contentPane.add(Search_Btn);
				
				JButton Back_Btn = new JButton("Back");
				Back_Btn.setBounds(14, 200, 111, 18);
				contentPane.add(Back_Btn);
				
				Back_Btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.setContentPane(menu);
							frame.revalidate();
						}
					});
				
				Search_Btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							contentPane.remove(Display_GUI);
							String Display = ID.getText();
							try {
								Display = st_File.Search_ID_File(Display);
								Display_GUI.setText(Display);
							} 
							
							catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							contentPane.add(Display_GUI);
			                frame.revalidate();
			                frame.repaint();
						}
					});
				frame.setContentPane(contentPane);
			    frame.revalidate();
			}
    	   }
		});
      Display_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane = new JPanel();
				
				JButton Back_Btn = new JButton("Back");
				Back_Btn.setBounds(14, 230, 111, 18);
				contentPane.add(Back_Btn);
				
				Back_Btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							frame.setContentPane(menu);
							frame.revalidate();
							
						}
					});
				
				JTextArea Display_GUI;
				Display_GUI = new JTextArea();
				Display_GUI.setBackground(Color.LIGHT_GRAY);
				Display_GUI.setBounds(51, 228, 425, 108);
				contentPane.add(Display_GUI);
				String[] Display;
				try {
					Display = st_File.Display_AllFromFile();
					if(Display.length ==0) {
						Display_GUI.append("Empty student information");
					}else {
					for(int i= 0; i < Display.length; i++) {
						Display_GUI.append(Display[i]);
						}
					}
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				frame.setContentPane(contentPane);
			    frame.revalidate();
			}
		});
      Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
      
        
        frame.setVisible(true);
	}
	private static void Back_to_Menu() {
		JOptionPane.showMessageDialog(null, "Empty information in file!", "Toast", JOptionPane.INFORMATION_MESSAGE);
		frame.setContentPane(menu);
        frame.revalidate();
	}

}
