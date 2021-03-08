import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class NeveraTest extends Assertions {

    @Test
    public void test()  {
        Nevera n = new Nevera();
        n.put("Joshua");
        assertTrue(n.contains("Joshua"));
        assertFalse(n.contains("Manolo"));

        try {
            n.take("Joshua");
            n.take("Manolo");
        } catch (NoSuchItemException e){
            System.out.println(e.getMessage());
        }
    }
}