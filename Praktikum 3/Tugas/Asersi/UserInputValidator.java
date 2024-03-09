/* 
Nama     : Aniqah Nursabrina
NIM      : 24060122120036
Tanggal  : 09/03/2024
 */ 

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserInputValidator {

    public static void validateUsername(String username) {
        Pattern uNamePattern;
        Matcher uNameMatcher;

        uNamePattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,19}$");
        uNameMatcher = uNamePattern.matcher(username);

        assert(username.length() >= 5): "Username must be at least 5 characters long";
        assert(username.length() <= 20): "Username must be at most 20 characters long";
        assert (uNameMatcher.matches()): "Invalid username";
    }

    public static void validateEmail(String email) {
        Pattern emailPattern;
        Matcher emailMatcher;

        emailPattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{0,63}+@gmail.com$");
        emailMatcher = emailPattern.matcher(email);

        assert (emailMatcher.matches()): "Invalid email address";
    }
    
    public static void validateAge(int age) {
        assert (age >= 17 && age <= 99): "Age must be between 17 and 99";    
    }
}