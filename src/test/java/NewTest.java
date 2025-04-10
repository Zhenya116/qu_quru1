import org.junit.jupiter.api.Test;

public class NewTest {

    @Test
    void newTest() {
        int i = 42;      
        System.out.println("This is best test");
        Assertions.asserTrue(i > 2);
    }
}
