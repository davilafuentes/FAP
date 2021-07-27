import org.junit.Assert;
import org.junit.Test;

public class main_test_junit {


    @Test
    public void testConstructor()
    {
        Persona persona = new Persona("Anakyn", "Skywalker");
        Assert.assertEquals("Anakyn Skywalker", persona.getFullName());
    }

    @Test
    public void testChangeName()
    {
        Persona persona = new Persona("Anakyn", "Skywalker");
        persona.changeName("Darth");
        Assert.assertEquals("Darth Skywalker", persona.getFullName());
    }
}
