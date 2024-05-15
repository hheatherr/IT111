import javax.swing. *;
public class ShowWindow {

    public static void main(String[] args) {
// declare our variables
        // we are going to make them constants

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;


        JFrame window = new JFrame();

        window.setTitle("My Simple Window");


        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the window - if we don't display the window, it won't display
        // displaying the window is a boolean
        window.setVisible(true);
    }
}
