import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Planets{
    Mercury(2439.7,3.285e23),
    Venus(6051.8,4.867e24),
    Earth(6371,5.972e24),
    Mars(3389.5,6.39e23),
    Jupiter(69911,1.898e27),
    Saturn(58232,5.683e26),
    Uranus(25362,8.681e25),
    Neptune(24622,1.024e26);
    double r;
    double m;
    Planets(double r ,double m){
        this.r=r;
        this.m=m;
    }
}
class Test extends JFrame{
    JPanel[] panel=new JPanel[8];
    JButton b1=new JButton("Mercury");
    JButton b2=new JButton("Venus");
    JButton b3=new JButton("Earth");
    JButton b4=new JButton("Mars");
    JButton b5=new JButton("Jupiter");
    JButton b6=new JButton("Saturn");
    JButton b7=new JButton("Uranus");
    JButton b8=new JButton("Neptune");
    JTextField jt=new JTextField(10);
    Test(){
        setLayout(new GridLayout(2,4));
        setSize(500,300);
        for(int i=0;i<=7;i++) {
            panel[i] = new JPanel();
            add(panel[i]);
            panel[i].setLayout(new BorderLayout());
        }
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Mercury.m/Planets.Earth.m)/((Planets.Mercury.r/Planets.Earth.r)*(Planets.Mercury.r/Planets.Earth.r))+"g");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Venus.m/Planets.Earth.m)/((Planets.Venus.r/Planets.Earth.r)*(Planets.Venus.r/Planets.Earth.r))+"g");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Earth.m/Planets.Earth.m)/((Planets.Earth.r/Planets.Earth.r)*(Planets.Earth.r/Planets.Earth.r))+"g");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Mars.m/Planets.Earth.m)/((Planets.Mars.r/Planets.Earth.r)*(Planets.Mars.r/Planets.Earth.r))+"g");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Jupiter.m/Planets.Earth.m)/((Planets.Jupiter.r/Planets.Earth.r)*(Planets.Jupiter.r/Planets.Earth.r))+"g");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Saturn.m/Planets.Earth.m)/((Planets.Saturn.r/Planets.Earth.r)*(Planets.Saturn.r/Planets.Earth.r))+"g");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Uranus.m/Planets.Earth.m)/((Planets.Uranus.r/Planets.Earth.r)*(Planets.Uranus.r/Planets.Earth.r))+"g");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,(Planets.Neptune.m/Planets.Earth.m)/((Planets.Neptune.r/Planets.Earth.r)*(Planets.Neptune.r/Planets.Earth.r))+"g");
            }
        });



        panel[0].add(b1);
        panel[1].add(b2);
        panel[2].add(b3);
        panel[3].add(b4);
        panel[4].add(b5);
        panel[5].add(b6);
        panel[6].add(b7);
        panel[7].add(b8);
        setVisible(true);
    }

}

public class Planet {
    public static void main(String[] args) {
        new Test().setVisible(true);

    }
}