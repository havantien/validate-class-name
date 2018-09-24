package validate.name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    private static final String NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ValidateName() {

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
