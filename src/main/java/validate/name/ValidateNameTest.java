package validate.name;

public class ValidateNameTest {

    private static ValidateName validateName;

    public static final String[] validValidateName = new String[] {"sas"};
    public static final String[] invalidValidateName = new String[] {"dada"};

    public static void main(String[] args) {
        validateName = new ValidateName();
        for (String Name : validValidateName) {
            boolean isvalid = validateName.validate(Name);
            System.out.println("name: " + Name + "isvalid: " + isvalid);
        }
        for (String Name : invalidValidateName) {
            boolean isvalid = validateName.validate(Name);
            System.out.println("name: " + Name + "isvalid: " + isvalid);
        }
    }
}
