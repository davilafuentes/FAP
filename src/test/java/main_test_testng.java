import org.testng.Assert;
import org.testng.annotations.Test;

public class main_test_testng {

    @Test
    public void testConstructor()
    {
        Persona persona = new Persona("Anakin", "Skywalker");
        Assert.assertEquals(persona.getFullName(), "Anakin Skywalker");
    }

    @Test
    public void testChangeName()
    {
        Persona persona = new Persona("Anakin", "Skywalker");
        persona.changeName("Darth");
        Assert.assertTrue(persona.getFullName().equals("Darth Skywalker"));
    }

}
