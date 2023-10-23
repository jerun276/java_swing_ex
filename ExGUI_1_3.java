import javax.swing.JFrame;

class UI{
    UI () {
        JFrame f=new JFrame();
        f.setSize(500,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

    }

}


class ExGUI_1_3{
    public static void main(String[] args){
      new UI(); 
    }
}