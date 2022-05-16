import javax.swing.JOptionPane;

public class basicGUI {
    public static void main(String[] args) {
        // Sring variable
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // int variable
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age); 
        
        // double variable
        double weight = Double.parseDouble((JOptionPane.showInputDialog("Enter your weight")));
        JOptionPane.showMessageDialog(null, "Your weight is " + weight + "kg");
    }
}