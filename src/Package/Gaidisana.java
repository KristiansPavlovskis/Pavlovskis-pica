package Package;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

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
    static int lielums;
    static String merce;

    static String piedevas;

    static String mikla;
    static String adress;
    static String Talr;
    static String perVards;

    Gaidisana(int lielums, String merce, String mikla, String piedevas,String adress,String Talr,String perVards){
        this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;
        this.lielums = lielums;
        this.merce = merce;
        this.mikla = mikla;
        this.piedevas=piedevas;

        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon(pica.class.getResource("/bildes/Piegade.png"));
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
        jb.setBounds(200, 200, 200, 200);
        frame.add(jb);

        frame.add(panel);
        frame.setVisible(true);

        fillProgressBar(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Pasutit) {
            frame.dispose();
            //Gaidisana PicaPasutisana = new Gaidisana();
        } else if (e.getSource() == Klatiene) {
            frame.dispose();
            //Gaidisana PicaPasutisana = new Gaidisana();
            //Klatiene PicaKlatiene = new Klatiene();
        }
    }
    private void fillProgressBar() {
        int reizes = MAX_VERTIBA / 1000; // update progress bar by 1% each time
        for (int i = 0; i <= MAX_VERTIBA; i += reizes) {
            jb.setValue(i);
            try {
                if (i > 666 && i<1332) {
                    jb.setString("Tika ielikta cepenē");
                } else if (i > 1333) {
                    jb.setString("Piegāde ir ceļā");
                } else if (i < 665) {
                    jb.setString("Tiek taisīta pica");
                }
                jb.setBounds((int) (i/3.4), 200, 200, 200);
                Thread.sleep(10); // wait for 10 milliseconds before updating again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        jb.setValue(MAX_VERTIBA); 
    }
    





    public static void main(String[] args) {
        Gaidisana checkbock = new Gaidisana(lielums, merce, mikla, piedevas, adress, Talr, perVards);
        //File fails = new File("kopums.txt");
        
    }
}