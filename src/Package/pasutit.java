package Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class pasutit extends JFrame implements ActionListener{
	JFrame f= new JFrame("CheckBox Example");
	JButton next= new JButton("iet maksāt");
	pasutit(){
//	 JFrame f= new JFrame("CheckBox Example");    
     final JLabel label = new JLabel();            
     label.setHorizontalAlignment(JLabel.CENTER);    
     label.setSize(400,100);    
     JCheckBox checkbox1 = new JCheckBox("C++");    
     checkbox1.setBounds(150,100, 50,50); 
     JCheckBox izmers = new JCheckBox("30 cm");    
     izmers.setBounds(200,150, 50,50); 
     JCheckBox checkbox2 = new JCheckBox("Java");    
     checkbox2.setBounds(150,150, 50,50);    
     next.setBounds(100,200,200,40);
		next.setFocusable(false);
		next.addActionListener(this);
		f.add(next);
     f.add(checkbox1); f.add(checkbox2); f.add(label);f.add(izmers);    
     izmers.addItemListener(new ItemListener() {    
          public void itemStateChanged(ItemEvent e) {                 
             label.setText("Picas izmērs : "     
             + (e.getStateChange()==1?"checked":"unchecked"));    
          }    
       });    
//     checkbox2.addItemListener(new ItemListener() {    
//          public void itemStateChanged(ItemEvent e) {                 
//             label.setText("Java Checkbox: "     
//             + (e.getStateChange()==1?"checked":"unchecked"));    
//          }    
//       });    
     f.setSize(400,400);    
     f.setLayout(null);    
     f.setVisible(true); 
     
}
		@Override

		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
		f.dispose();
		//pasutit PicaKlatiene = new pasutit();

		}
       
	}
}
