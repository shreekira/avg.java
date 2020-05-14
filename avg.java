import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
/*<applet code="avg" width=500 height=500> </applet> */
public class avg extends JApplet
{
JLabel jl;
JLabel l1,l2,l3,mA1,mA2,mA3,mB1,mB2,mB3,mC1,mC2,mC3;
int avg1,avg2,avg3;
public void init()
{
try
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
makeGUI();
}
});
}
catch(Exception e)
{
System.out.println(e);
}
}
public void makeGUI()
{
setLayout(new FlowLayout());
mA1=new JLabel(" OOC");
mA2=new JLabel(" OS");
mA3=new JLabel(" DAA");
mB1=new JLabel(" OOC");
mB2=new JLabel(" OS");
mB3=new JLabel(" DAA");
mC1=new JLabel(" OOC");
mC2
=new JLabel(" OS");
mC3=new JLabel(" DAA");

JTextField jA1=new JTextField(10);
JTextField jA2=new JTextField(10);
JTextField jA3=new JTextField(10);
JTextField jB1=new JTextField(10);
JTextField jB2=new JTextField(10);
JTextField jB3=new JTextField(10);
JTextField jC1=new JTextField(10);
JTextField jC2=new JTextField(10);
JTextField jC3=new JTextField(10);
add(mA1);
add(jA1);
add(mA2);
add(jA2);
add(mA3);
add(jA3);
add(mB1);
add(jB1);
add(mB2);
add(jB2);
add(mB3);
add(jB3);
add(mC1);
add(jC1);
add(mC2);
add(jC2);
add(mC3);
add(jC3);
jl=new JLabel("");
jl.setHorizontalAlignment(JLabel.CENTER);
jl.setFont(new Font("Verdana",Font.PLAIN,15));
jl.setForeground(new Color(120,90,40));
jl.setPreferredSize(new Dimension(250,100));
add(jl);
JButton jb=new JButton("Average");
jb.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(jA1.getText());
		int a2=Integer.parseInt(jA2.getText());
		int a3=Integer.parseInt(jA3.getText());
		avg1=(a1+a2+a3)/3;
		int b1=Integer.parseInt(jB1.getText());
		int b2=Integer.parseInt(jB2.getText());
		int b3=Integer.parseInt(jB3.getText());
		avg2=(b1+b2+b3)/3;
		int c1=Integer.parseInt(jC1.getText());
		int c2=Integer.parseInt(jC2.getText());
		int c3=Integer.parseInt(jC3.getText());
		avg3=(c1+c2+c3)/3;
		int average=(avg1+avg2+avg3)/3;
		jl.setText(String.valueOf(average));
		
	}
});
add(jb);	
}
}
