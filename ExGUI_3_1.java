import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UI {
    JFrame f;
    JButton b;
    JLabel l;

    UI() {
        f = new JFrame("My Frame");
        b = new JButton("My Button");
        l = new JLabel();
        l.setText("My Label");
        l.setBounds(200, 100, 200, 50);

        b.setBounds(200, 200, 200, 50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setText("Text Changed");
                l.setText("Label Changed");
            }
        });

        f.add(b);
        f.add(l);

        f.setLayout(null);
        f.setSize(500, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }

}

class ExGUI_3_1 {
    public static void main(String[] args) {
        new UI();
    }
}
