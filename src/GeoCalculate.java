import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class GeoCalculate extends JFrame{
		JPanel circle = new JPanel();
		JPanel triangle = new JPanel();
		JPanel square = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel all = new JPanel();
		JPanel control = new JPanel();
		JTextField c = new JTextField(1);
		JTextField cA = new JTextField(1);
		JTextField cP = new JTextField(1);
		JTextField tBase = new JTextField(1);
		JTextField tHeight = new JTextField(1);
		JTextField tA = new JTextField(1);
		JTextField s = new JTextField(1);
		JTextField sA = new JTextField(1);
		JButton set = new JButton("設定");
		JButton clean = new JButton("清除");
	
	
	public GeoCalculate(){

		control.add(set);
		control.add(clean);

		circle.setLayout(new GridLayout(4,2,10,5));
		circle.add(new JLabel("Radius : "));
		circle.add(c);
		circle.add(new JLabel("The area is : "));
		circle.add(cA);
		circle.add(new JLabel("The perimeter is :"));
		circle.add(cP);	
		p1.setLayout(new BorderLayout(5,2));
		p1.add(new JLabel("Circle"),BorderLayout.NORTH);
		p1.add(circle,BorderLayout.SOUTH);

		
		triangle.setLayout(new GridLayout(4,2,10,5));
		triangle.add(new JLabel("Base : "));
		triangle.add(tBase);
		triangle.add(new JLabel("Height"));
		triangle.add(tHeight);
		triangle.add(new JLabel("The area is : "));
		triangle.add(tA);
		p2.setLayout(new BorderLayout(5,2));
		p2.add(new JLabel("Triangle"),BorderLayout.NORTH);
		p2.add(triangle,BorderLayout.SOUTH);

			
		square.setLayout(new GridLayout(3,2,10,5));
		square.add(new JLabel("Length : "));
		square.add(s);
		square.add(new JLabel("The area is : "));
		square.add(sA);
		p3.setLayout(new BorderLayout(5,2));
		p3.add(new JLabel("Square"),BorderLayout.NORTH);
		p3.add(square,BorderLayout.CENTER);


		all.setLayout(new GridLayout(1,3,5,5));
		all.add(p1);
		all.add(p2);
		all.add(p3);
		add(all,BorderLayout.NORTH);
		add(control,BorderLayout.SOUTH);
		
		
		set.addActionListener(new setListener());
		clean.addActionListener(new cleanListener());
		
	}
	private class setListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double radius = Double.parseDouble(c.getText());
			double base = Double.parseDouble(tBase.getText());
			double height = Double.parseDouble(tHeight.getText());
			double length = Double.parseDouble(s.getText());
			
			
			cA.setText(String.format("%.2f",radius*radius*3.14));
			cP.setText(String.format("%.2f",radius*2));
			tA.setText(String.format("%.2f", base*height/2));
			sA.setText(String.format("%.2f",length*length));
			
		}

	}

	private class cleanListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			c.setText(null);
			cA.setText(null);
			cP.setText(null);
			tBase.setText(null);
			tHeight.setText(null);
			tA.setText(null);
			s.setText(null);
			sA.setText(null);			
		}
	}
	public static void main(String[] args){
		GeoCalculate frame =new GeoCalculate();
		frame.setTitle("u10316049_GeoCalculate");
		frame.setSize(800,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
