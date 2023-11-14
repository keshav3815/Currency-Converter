import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CurrencyConverter {
	    JLabel l1,l2,l3,l4,l5;
	    void converter()
	    {
	        JFrame f=new JFrame("Currency Converter");
	        f.setSize(800,400);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setLayout(null);

	        l1=new JLabel();
	        Font fo=new Font("serif",Font.BOLD,20);
	        l1.setText("Currency Converter");
	        l1.setBounds(300,10,200,50);
	        l1.setFont(fo);
	        f.add(l1);

	        String list1[]={"Choose one","USA","Nigeria","Brazil","Canada","Kenyan","Indonesia","Philipine","Pakistan","India"};
	        JComboBox b1=new JComboBox(list1);
	        b1.setBounds(100,90,150,40);
	        f.add(b1);

	        JComboBox b2=new JComboBox(list1);
	        b2.setBounds(500,90,150,40);
	        f.add(b2);        

	        l2=new JLabel();
	        l2.setText("From currency of");
	        l2.setBounds(100,60,100,40);
	        f.add(l2);

	        l3=new JLabel();
	        l3.setText("To currency of");
	        l3.setBounds(500,60,100,40);
	        f.add(l3);

	        JTextField tf1=new JTextField();
	        tf1.setBounds(100,140,150,40);
	        f.add(tf1);

	        JTextField tf2=new JTextField();
	        tf2.setBounds(500,140,150,40);
	        f.add(tf2);

	        JButton button1=new JButton("convert currency");
	        button1.setBounds(100,250,150,40);
	        f.add(button1);
	        JButton button2=new JButton("exit");
	        button2.setBounds(500,250,150,40);
	        f.add(button2);

	        l4=new JLabel();
	        l4.setText("units:");
	        l4.setBounds(100,180,50,20);
	        f.add(l4);

	        l5=new JLabel();
	        l5.setText("units:");
	        l5.setBounds(500,180,50,20);
	        f.add(l5);

	        button2.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                System.exit(0);
	            }
	        }
	        );

	        button1.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                int a=b1.getSelectedIndex();
	                int b=b2.getSelectedIndex();
	                if(a==1)
	                {
	                    l4.setText("Dollar");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==2)
	                    {
	                        result=(float) (select1*781.50);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*5.00);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*1.35);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*148.20);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==6)
	                    {
	                        double result2=(double) (select1*15482);
	                        String result1=Double.toString(result2);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*56.63);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*289.06);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*83.09);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==2)
	                {
	                    l4.setText("Naira");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.0013);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*0.0064);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.0017);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*0.19);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                        
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*19.81);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*0.072);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*0.37);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*0.11);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==3)
	                {
	                    l4.setText("reais");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.20);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*156.02);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.27);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*29.59);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*3090.91);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*11.31);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*57.72);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*16.59 );
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==4)
	                {
	                    l4.setText("Dollar");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.74);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*577.57);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*3.70);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*109.53);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*11437.41);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*41.85);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*213.63);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*61.41);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==5)
	                {
	                    l4.setText("Shilling");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.0067);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*5.27);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*0.034);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.0091);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*104.43);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*0.38);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*1.95);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*0.56);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==6)
	                {
	                    l4.setText("Rupiah");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.000065);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*0.050);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*0.00032);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.000087);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*0.0096);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*0.0037);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*0.019);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*0.0054);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==7)
	                {
	                    l4.setText("Peso");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.018);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*13.80);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*0.088);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.024);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*2.62);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*273.27);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*5.10);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*1.47);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==8)
	                {
	                    l4.setText("Rupee");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.0035);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*2.70);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*0.017);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.0047);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*0.51);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*53.55);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*0.20);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==9)
	                    {
	                        result=(float) (select1*0.29);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	                if(a==9)
	                {
	                    l4.setText("Rupee");
	                    String select=tf1.getText();
	                    float select1=Integer.parseInt(select);
	                    float result;
	                    if(b==1)
	                    {
	                        result=(float) (select1*0.012);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==2)
	                    {
	                        result=(float) (select1*9.33);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                         l5.setText("Naira");
	                    }
	                    if(b==3)
	                    {
	                        result=(float) (select1*0.060);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Reais");
	                    }
	                    if(b==4)
	                    {
	                        result=(float) (select1*0.016);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Dollar");
	                    }
	                    if(b==5)
	                    {
	                        result=(float) (select1*1.78);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Shilling");
	                    }
	                    if(b==6)
	                    {
	                        result=(float) (select1*186.22);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupiah");
	                    }
	                    if(b==7)
	                    {
	                        result=(float) (select1*0.68);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Peso");
	                    }
	                    if(b==8)
	                    {
	                        result=(float) (select1*3.46);
	                        String result1=Float.toString(result);
	                        tf2.setText(result1);
	                        l5.setText("Rupee");
	                    }
	                }
	            }
	        }
	        );
	        f.setVisible(true);
	    }
	    public static void main(String[] args) {
	        CurrencyConverter aa=new CurrencyConverter();
	        aa.converter();
	    }
	}
