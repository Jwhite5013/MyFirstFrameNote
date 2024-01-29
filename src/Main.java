import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //1.Create a Frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        //2. Create Panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(125,130,40));
        //3. Create Components
        JLabel label = new JLabel("Hello Seaver");
        JButton button = new JButton("Push you!");
        JTextField textField = new JTextField(5);
        //add Image
        ImageIcon icon = new ImageIcon("Images/myCards/2C.png");
        //Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,75,Image.SCALE_DEFAULT));
        //Creating a label with an icon on it
        JLabel picLabel = new JLabel(icon);
        //Creating a progress bar ha
        JProgressBar progressBar = new JProgressBar(0,1000);
        //Putting stuff on progress bar
        progressBar.setValue(500);
        //4. Add Components
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);
        panel.add(progressBar);


        //5. Add the panel to the frame
        frame.add(panel);
        //6. Make the frame visible
        frame.setVisible(true);




    }
}