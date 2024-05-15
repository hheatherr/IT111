import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
// declare our variables
        // we are going to make them constants

        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 550;

        // Create a window
        JFrame window = new JFrame();
        window.setTitle("A Simple Window");



        JLabel label1 = new JLabel("My First Big Label!!!");
        JLabel label2 = new JLabel("My Second Big Label!");

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();


        label1.setBounds(50, 50, 250, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 12));

        label2.setBounds(50, 115, 250, 20);
        label2.setFont(new Font("Arial", Font.BOLD, 14));

        textField1.setBounds(50, 80, 150, 30);
        textField2.setBounds(50, 145, 150, 30);

//       textField1.setBounds(550, 2500, 350, 20);
//       textField2.setBounds(550, 340, 350, 20);


        window.add(label1);
        window.add(label2);
        window.add(textField1);
        window.add(textField2);

        label1.setVisible(true);
        label2.setVisible(true);
        textField1.setVisible(true);
        textField2.setVisible(true);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.setLayout(null);

       window.getContentPane().setBackground(Color.red);

        window.setLocation(500,250);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we don't display the window, it won't display
        // displaying the window is a boolean
        window.setVisible(true);

    }



}
