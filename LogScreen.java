import java.util.regex.*;
import javax.swing.JOptionPane;

public class LogScreen {
    
    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[0-9])" +
                       "(?=.*[a-z])" +
                       "(?=.*[A-Z])" +
                       "(?=.*[@#$%^&+=])" +
                       ".{8,}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        String surname = JOptionPane.showInputDialog("Enter your surname:");
        String password = JOptionPane.showInputDialog("Enter your password:");

        if (firstName.isEmpty() || surname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "First name and surname cannot be empty.");
        } 
        
        else if (!validatePassword(password)) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long, contain an uppercase letter, a lowercase letter, a number, and a special character.");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Login verified! Karibu, " + firstName + " " + surname + "!");
        }
    }
}