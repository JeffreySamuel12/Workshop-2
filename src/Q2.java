class CustomDataException extends Exception {
    public CustomDataException(String message) {
        super(message);
    }
}

public class Q2 {

    public static void checkData(int data) throws CustomDataException {
        if(data <= 0) {
            throw new CustomDataException("Invalid data: " + data);
        } else {
            System.out.println("Valid data: " + data);
        }
    }

    public static void main(String[] args) {
        try {
            checkData(-1);
        } catch (CustomDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
