import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

class textinput extends JFrame{
  public static void main(String args[]){
    textinput frame = new textinput("input");
    frame.setVisible(true);
  }

  textinput(String title){
    setTitle(title);
    setBounds(100,100,600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField text1 = new JTextField(20);

    JPanel p = new JPanel();
    p.add(text1);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
a
