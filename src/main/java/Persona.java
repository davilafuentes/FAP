public class Persona {
    private String name;
    private String lastName;

    public Persona(String pName, String pLastName)
    {
        this.name = pName;
        this.lastName = pLastName;
    }

    public void changeName(String pNewName)
    {
        this.name = pNewName;
    }

    public String getFullName()
    {
        return this.name + " " + this.lastName;
    }

}
