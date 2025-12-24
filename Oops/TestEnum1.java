
enum Status {
    Running,
    SUCCESS,
    FAILURE,
    PENDING
}

public class TestEnum1 {

    public static void main(String[] args) {
        Status s = Status.SUCCESS;

        switch (s) {
            case Running:
                System.out.println("The process is running");
                break;
            case SUCCESS:
                System.out.println("The process is successful");
                break;
            case FAILURE:
                System.out.println("The process has failed");
                break;
            default:
                System.out.println("The process is pending");
                break;
        }
    }

}
