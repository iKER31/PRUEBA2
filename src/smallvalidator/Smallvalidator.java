package smallvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Smallvalidator {

    private static final String email= "^[A-Za-z0-9+_.-]+@[A-Za-z0-0.-]+$";
    
    public static boolean isValidEmail(String mail){
        Pattern pattern = Pattern.compile(mail);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        String email= JOptionPane.showInputDialog("Digite su correo electronico");
        String email2= "invalid.email.com";
        String email3= "john.doe@example";
        
        System.out.println(email + " es valido " + isValidEmail(email));
        System.out.println(email2 + " es valido " + isValidEmail(email2));
        System.out.println(email3 + " es valido " + isValidEmail(email3));
    }
    
}
