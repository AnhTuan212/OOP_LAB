package OOP_Lab_01;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
//        int option = JOptionPane.showConfirmDialog(null,
//                "Do you want to change to the first class ticket?");
//
//        JOptionPane.showMessageDialog(null, "You've chosen: " +
//                (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        Object[] options = {"I do", "I don’t"};
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Custom Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        String message = "You've chosen: ";
        if (option == 0) {
            message += "I do";
        } else if (option == 1) {
            message += "I don’t";
        } else {
            message += "Closed";
        }

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}
