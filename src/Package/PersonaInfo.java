package Package;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PersonaInfo extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    JButton Pasutit = new JButton("Turpināt");
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JTextArea adr, vard, tal;

    private int lielums;
    private String merce,piedevas,mikla,adress,Talr,perVards;

    
	static double cena,cena1;
    PersonaInfo(int lielums, String merce, String mikla, String piedevas, double cena) {
    	
        this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;
        this.cena=cena;
      
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon(
        		pica.class.getResource("/bildes/PersonasInfo.png"));
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel backgroundLabel = new JLabel(scaledImageIcon);
        panel.add(backgroundLabel, BorderLayout.CENTER);

        Pasutit.setBounds(200, 690, 270, 60);
        Pasutit.addActionListener(this);
        frame.add(Pasutit);

        adr = new JTextArea();
        adr.setBounds(90, 310, 520, 70);
        adr.setOpaque(false);
        adr.setFont(new Font("Arial", Font.BOLD, 30));
        
        vard = new JTextArea();
        vard.setBounds(90, 440, 520, 70);
        vard.setOpaque(false);
        vard.setFont(new Font("Arial", Font.BOLD, 30));
        
        tal = new JTextArea();
        tal.setBounds(90, 605, 520, 70);
        tal.setOpaque(false);
        tal.setFont(new Font("Arial", Font.BOLD, 30));
        
        frame.add(adr);
        frame.add(tal);
        frame.add(vard);
        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Pasutit) {
            String telNum = tal.getText().replaceAll("\\s+","");
            if(telNum.length() != 8) {
                JOptionPane.showMessageDialog(frame, "Telefona numurs jāsastāv no 8 cipariem");
                return;
            }
            if(telNum.charAt(0) == '0' || telNum.charAt(0) == '1'||telNum.charAt(0) == '3' 
            		||telNum.charAt(0) == '4' ||telNum.charAt(0) == '5' ||telNum.charAt(0) == '6' 
            		||telNum.charAt(0) == '7' ||telNum.charAt(0) == '8' ||telNum.charAt(0) == '9') {
                JOptionPane.showMessageDialog(frame, "Pirmajam ciparam Jābūt 2");
                return;
            }if (adr.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Adreses lauks nevar būt tukšs");
                return;
            }
            if (vard.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Vārda lauks nevar būt tukšs");
                return;
            }
            frame.dispose();
            adress= adr.getText();
            Talr= tal.getText();
            perVards= vard.getText();
            Ceptuve PicaPasutisana = new Ceptuve(lielums, merce,mikla,piedevas, adress,Talr,perVards,cena);

        } else if(e.getSource() == tal) {
            String talNumber = tal.getText().replaceAll("\\s+","");
            if(talNumber.length() > 8) {
                talNumber = talNumber.substring(0, 8);
                tal.setText(talNumber);
            }
        }
    }

   
}
