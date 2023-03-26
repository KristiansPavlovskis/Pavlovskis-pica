package Package;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class Gaidisana extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    JButton Klatiene = new JButton("");
    JButton Pasutit = new JButton("");
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JTextArea lieta;
    JProgressBar jb;
    int i=0,num=0;
    static int MAX_VERTIBA = 2000;
    private int lielums,maksa=0;
    private double cena;

    private String merce,piedevas,mikla,adress,Talr,perVards;

    
    Gaidisana(int lielums, String merce, String mikla, String piedevas,String adress,String Talr,String perVards, double cena){
    	this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;
        this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;
        this.cena=cena;
		

        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/Gaida.png"));
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel backgroundLabel = new JLabel(scaledImageIcon);
        panel.add(backgroundLabel, BorderLayout.CENTER);

        Pasutit.setBounds(26,453,350,80);
        Pasutit.addActionListener(this);
        Pasutit.setOpaque(false);
        Pasutit.setContentAreaFilled(false);
        Pasutit.setBorderPainted(false);
        frame.add(Pasutit);

        Klatiene.setBounds(390,453,365,80);
        Klatiene.addActionListener(this);
        Klatiene.setOpaque(false);
        Klatiene.setContentAreaFilled(false);
        Klatiene.setBorderPainted(false);
        frame.add(Klatiene);

        jb = new JProgressBar(0, MAX_VERTIBA);
        jb.setValue(0);
        jb.setStringPainted(true);
        jb.setBounds(200, 100, 200, 100);
        frame.add(jb);

        frame.add(panel);
        frame.setVisible(true);

        pildit(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Pasutit) {
            //frame.dispose();
            //Gaidisana PicaPasutisana = new Gaidisana();
        } else if (e.getSource() == Klatiene) {
         //   frame.dispose();
            //Gaidisana PicaPasutisana = new Gaidisana();
            //Klatiene PicaKlatiene = new Klatiene();
        }
    }
    private void pildit() {
        int reizes = MAX_VERTIBA / 1000;
        final int[] i = {0};
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (i[0] > 666 && i[0] < 1332) {
                        jb.setString("Tika ielikta cepenē");
                    } else if (i[0] > 1333) {
                        jb.setString("Piegāde ir ceļā");
                    } else if (i[0] < 665) {
                        jb.setString("Tiek taisīta pica");
                    }
                    jb.setValue(i[0]);
                    jb.setBounds((int) (i[0] / 3.5), 100, 200, 100);
                    i[0] += reizes;
                    if (i[0] >= MAX_VERTIBA) {
                        ((Timer) e.getSource()).stop();
                        frame.setVisible(false);
                        maksa=0;
                        check checkbock = new check(lielums, merce, mikla, piedevas, adress, Talr, perVards,cena,maksa);
                        jb.setValue(MAX_VERTIBA);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        timer.start();
    }
    





    public static void main(String[] args) {
      //  Gaidisana checkbock = new Gaidisana(lielums, merce, mikla, piedevas, adress, Talr, perVards,cena);
        //File fails = new File("kopums.txt");
        
    }
}