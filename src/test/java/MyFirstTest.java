import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MyFirstTest {
    private int globalVar = 10:

    Integer age = 18;
 //   BigDecimal price = new BigDecimal('10.01');


    @Test
    public void firsTest() {
        System.out.println("Hello, corona, maza faka!");
        int sum = sumTwoDigits(15, 20);
        System.out.println("Aaaand the sum is: "+ sum);
        System.out.println(sumTwoDigits(3, 8));

        age = 19;


    }
    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }
}
