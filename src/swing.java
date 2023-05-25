import java.awt.*;
import javax.swing.*;

public class swing
{ public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("icon.jfif");

        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.BLACK);

        JLabel label = new JLabel();
        label.setText("Hi, this is the new app I made");
        label.setVisible(true);
        frame.add(label);
        ImageIcon image1 = new ImageIcon("icon.jfif");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(205,205,205));
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(-30);
        label.setBackground(Color.black);

    }
}