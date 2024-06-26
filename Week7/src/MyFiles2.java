import java.io.File;

import static java.lang.System.out;
public class MyFiles2 {

    public static void main(String[] args) {

        File dir = new File("NewFolder");
        //start with an if else statement

        if(dir.exists()) {
            //we are going to be happy!
            //this is where we're going to call out our array
            String[] files = dir.list();
            //a new key word named Assert
            assert files != null; //files are not empty!
            out.println(files.length + " files found");
            // we would like to see those files! with a for loop
            for(int i = 0; i < files.length; i++) {
                out.println(files[i]);

            }
        } else {
            // we are going to be sad
            out.println("Directory does not exist");
        }

    }
}
