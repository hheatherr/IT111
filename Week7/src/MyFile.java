import java.io.File;

public class MyFile {

    public static void main(String[] args) {
        // we're going to create a file object

        File dir = new File("./NewFolder");

        //create an if else statement- if the directory exists, yippy skippy
        //else, not a good thing

        if(dir.exists()) {
            System.out.println("Yippy Skippy! We have a directory");
        } else {
            System.out.println("We are lost in space, don't know where that directory is?");
        }
    }
}
