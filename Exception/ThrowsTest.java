import java.io.*;

class ThrowsTest {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
