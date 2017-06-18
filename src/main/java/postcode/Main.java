package postcode;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(
                Api.getAddress("3824A", 42, null)
        );
    }
}
