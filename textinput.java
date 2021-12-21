import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class textinput extends JFrame implements ActionListener{
  JTextField text1;
  JLabel result_input;

  public static void main(String args[]){
    textinput frame = new textinput("input");
    frame.setVisible(true);
  }

  textinput(String title){
    setTitle(title);
    setBounds(100,100,600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    text1 = new JTextField(20);
    JButton button = new JButton("Get");
    button.addActionListener(this);

    JPanel p = new JPanel();
    p.add(text1);
    p.add(button);

    result_input = new JLabel();

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
    contentPane.add(result_input, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e){
    String a = text1.getText();
    System.out.println(a);
    result_input.setText(text1.getText());
  }
}
