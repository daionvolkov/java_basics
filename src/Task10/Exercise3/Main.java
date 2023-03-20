package Task10.Exercise3;

public class Main {
    public static void main(String[] args) {
        String filenameToRead = "src/Task10/Exercise3/textToRead.txt";
        String filenameToAdd = "src/Task10/Exercise3/textToWrite.txt";

        Glue.GlueTwoFiles(filenameToRead, filenameToAdd);
    }
}
