import javax.swing.JFrame;
import javax.swing.JButton;

class UI {
    UI() {
        JFrame f = new JFrame("My Frame");
        JButton b = new JButton("My Button");

        b.setBounds(200, 200, 100, 50);

        f.add(b);

        f.setLayout(null);
        f.setSize(500, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }

}

class ExGUI_2_2 {
    public static void main(String[] args) {
        new UI();
    }
}
