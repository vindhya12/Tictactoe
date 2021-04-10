import java.awt.*;
import java.awt.event.*;

class TicTacToe
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(650,600);
		f.setLocation(200,50);
		f.setBackground(Color.black);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}

class FDemo extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	Button un,t;
	Label li1,li2;
	
	int x=100,y=200;
	int w=100,h=100;
	
	FDemo()
	{
		setLayout(null);
		Font f=new Font("Forte",Font.BOLD,30);
		setFont(f);		
		int k=0;
		
		
		t=new Button(" Tictac Toe ");
		t.setBackground(Color.red);		
		t.setSize(180,55);
		t.setLocation(255,50);
		add(t);
		
		un=new Button(" ReStart !!");
		un.setBackground(Color.red);
		un.setSize(180,55);
		un.setLocation(450,300);
		add(un);
		un.addActionListener(this);
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				b[k]=new Button("");
				b[k].setBackground(Color.red);
				b[k].setSize(w,h);
				b[k].setLocation(x,y);
				add(b[k]);
				b[k].addActionListener(this);
				k++;
				x=x+100;
			}
			x=100;
			y=y+100;
			
		}
		
		li1=new Label("");
		li1.setBackground(Color.black);
		li1.setForeground(Color.red);
		li1.setSize(350,55);
		li1.setLocation(155,130);
		add(li1);
		//li1.addActionListener(this);
		
		li2=new Label("");
		li2.setBackground(Color.black);
		li2.setForeground(Color.red);
		li2.setSize(180,55);
		li2.setLocation(450,400);
		add(li2);
		//li2.addActionListener(this);
	}
	int c=0;
	public void actionPerformed(ActionEvent e)
	{
		//Label li1,li2;
		Button b1=(Button)e.getSource();	
		
		if(e.getSource()==un)
		{
			System.out.println("hwllo");
				for(int i=0;i<9;i++)
				{
					b[i].setLabel("");
					b[i].addActionListener(this);				
				}
				li1.setText("");
				li2.setText("");
				un.setLabel("ReStart");
				c=0;
				return;
		}			
		
		if(c%2==0)
		{
			b1.setLabel("X");
		}
		else
		{
			b1.setLabel("0");
		}
		b1.removeActionListener(this);
		c++;
		
		if(
		(b[0].getLabel().equals("X") && b[1].getLabel().equals("X") && b[2].getLabel().equals("X"))
		||
		(b[3].getLabel().equals("X") && b[4].getLabel().equals("X") && b[5].getLabel().equals("X"))
		||
		(b[6].getLabel().equals("X") && b[7].getLabel().equals("X") && b[8].getLabel().equals("X"))
		||
		(b[0].getLabel().equals("X") && b[3].getLabel().equals("X") && b[6].getLabel().equals("X"))
		||
		(b[1].getLabel().equals("X")&& b[4].getLabel().equals("X") && b[7].getLabel().equals("X"))
		||
		(b[2].getLabel().equals("X") && b[5].getLabel().equals("X") && b[8].getLabel().equals("X"))
		||
		(b[0].getLabel().equals("X") && b[4].getLabel().equals("X") && b[8].getLabel().equals("X"))
		||
		(b[2].getLabel().equals("X") && b[4].getLabel().equals("X") && b[6].getLabel().equals("X"))
		)
		{
			li1.setText("             'X' Winner :D");
			li2.setText(" GameOver");
			rm(b);
			
		}
		
		else if(
		(b[0].getLabel().equals("0") && b[1].getLabel().equals("0") && b[2].getLabel().equals("0"))
		||
		(b[3].getLabel().equals("0")&& b[4].getLabel().equals("0") && b[5].getLabel().equals("0"))
		||
		(b[6].getLabel().equals("0") && b[7].getLabel().equals("0") && b[8].getLabel().equals("0"))
		||
		(b[0].getLabel().equals("0") && b[3].getLabel().equals("0") && b[6].getLabel().equals("0"))
		||
		(b[1].getLabel().equals("0") && b[4].getLabel().equals("0") && b[7].getLabel().equals("0"))
		||
		(b[2].getLabel().equals("0") && b[5].getLabel().equals("0") && b[8].getLabel().equals("0"))
		||
		(b[0].getLabel().equals("0")&& b[4].getLabel().equals("0") && b[8].getLabel().equals("0"))
		||
		(b[2].getLabel().equals("0") && b[4].getLabel().equals("0")&& b[6].getLabel().equals("0"))
		)
		{
			
			li1.setText("              '0' Winner :D");
			li2.setText(" GameOver");
			rm(b);
			
		}
		b1.removeActionListener(this);
		
		
		
		
	}
	
	void rm(Button b[])
	{
		for(int i=0;i<9;i++)
		{
			b[i].removeActionListener(this);
		}
	}

}


