
public class Main {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occured");

        } catch (Exception e) {
            System.out.println("Some error occured");
        }
    }
}
