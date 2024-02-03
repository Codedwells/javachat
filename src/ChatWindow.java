import java.awt.*;

import javax.swing.*;

class ChatWindow{
    public static void main(String args[]){
       JFrame frame = new JFrame("Group Chat");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       
       // Start chat button
       JButton openChat = new JButton("Open Chat");
       openChat.setBackground(Color.red);
       
       // Set button padding and margin
       openChat.setMargin(new Insets(10,20,10,20));       
       
        
       frame.getContentPane().add(openChat);
       frame.setVisible(true);
    }
}
