
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ProgramaGui{

    public static void main(String[]args){
        JFrame frame = new JFrame("Hello World");
        JLabel label = new JLabel("Hello, World", JLabel.CENTER);
        JButton btn = new JButton("OK");
        btn.setBounds(200,400,100,20);
        label.setBounds(200,200,200,20);

        frame.add(label);
        frame.add(btn);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    

        btn.addActionListener(e ->{
            label.setText("Hello, World! - Turma Senac 2024!!");
        });
    }
}