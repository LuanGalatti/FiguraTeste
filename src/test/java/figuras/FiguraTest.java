package figuras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {

    public FiguraTest() {
    }

    @Test
    void testGetCor() {
        Retangulo instance = new Retangulo();
        instance.setCor("Verde");
        String expResult = "Verde";
        assertEquals(expResult, instance.getCor());
    }
}
