import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UI implements ActionListener {
    JFrame f;
    JButton b;

    UI() {
        f = new JFrame("My Frame");
        b = new JButton("My Button");

        b.setBounds(200, 200, 200, 50);
        b.addActionListener(this);
        f.add(b);

        f.setLayout(null);
        f.setSize(500, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.setText("Text Changed");
    }

}

class ExGUI_2_3 {
    public static void main(String[] args) {
        new UI();
    }
}
