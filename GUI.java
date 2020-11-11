import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI implements ActionListener {
    //cut grass labor cost
    private JFrame frame = new JFrame("cut grass");
    private String grassLabor = "Cutting Grass will estimated to cost $150 \n"
      + "\n Approximately will take 1-4 hours depending on yard size\n"
      + "\n Maintenance or items that are needed for the job can cost up to $20, it will be included in your total price\n"
      + "\n Will require 1-4 workers";
      
     private JFrame frame1 = new JFrame("Tree Removal");
      private String treeRemovalLabor = "Tree Removal will estimated to cost $350 \n"
         + "\n Approximately will take 1-4 hours depending on tree(s) size\n"
         + "\n Maintenance or items that are needed for the job can cost up to $50, it will be included in your total price\n"
         + "\n Will require 1-5 workers";
        private JFrame frame2 = new JFrame("Gardening");
        private String gardeningLabor = "gardening will estimated to cost min. $50-$3000 depending on type of plants you already have \n"
          + "\n Approximately will take 1-7 hours depending on garden size\n"
          + "\n Maintenance or items that are needed for the job can cost up to $45-$400, it will be included in your total price\n"
          + "\n Will require 1-5 workers";
         private JFrame frame3 = new JFrame("Landscaping");
         private String landscapingLabor = "landscaping will estimated to cost min. $100- 30,000 \n"
           + "\n Approximately will take 1-90 days depending on yard size\n"
           + "\n Maintenance or items that are needed for the job can cost up to $5000, it will be included in your total price\n"
           + "\n Will require 3-15 workers";
          private JFrame frame4 = new JFrame("Trimming bushes/hedges");
          private String trimLabor = "Trimming Bushes/hedges will estimated to cost min $45-$700 \n"
            + "\n Approximately will take 1-8 hours depending on yard size\n"
            + "\n Maintenance or items that are needed for the job can cost up to $100, it will be included in your total price\n"
            + "\n Will require 1-4 workers";
  
           private JFrame frame5 = new JFrame("planting");
          private String plantingLabor = "planting will estimated to cost $150-$3000, depending on what plants you would like \n"
          + "\n Approximately will take 1-3 days depending on yard size, possible to be longer if weather is bad\n"
          + "\n Maintenance or items that are needed for the job can cost up to $60-$500, it will be included in your total price\n"
          + "\n Will require 1-7 workers";
         
   
    public GUI() {
        JFrame frame = new JFrame("menu");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(6, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Menu");
        frame.pack();
        frame.setVisible(true);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar naviBar = new JMenuBar();
        frame.setJMenuBar(naviBar);

        JMenu home = new JMenu("Home");
        naviBar.add(home);
        //services added to navigation bar  and added an action listener to display job cost
        JMenu services = new JMenu("Services");
        naviBar.add(services);
        JMenuItem cut = new JMenuItem("Cut Grass");
        services.add(cut);
        cut.addActionListener(this);
        JMenuItem tree = new JMenuItem("Tree Removal");
        services.add(tree);
        tree.addActionListener(this);
        JMenuItem garden = new JMenuItem("Gardening");
        services.add(garden);
        garden.addActionListener(this);
        JMenuItem landscaping = new JMenuItem("Landscaping");
        services.add(landscaping);
        landscaping.addActionListener(this);
        JMenuItem hedge = new JMenuItem("Trimming Bushes/Hedges");
        services.add(hedge);
        hedge.addActionListener(this);
        JMenuItem planting = new JMenuItem("Planting");
        services.add(planting);
        planting.addActionListener(this);
        //adding businesses to navigation bar
        JMenu businesses = new JMenu("Businesses");
        naviBar.add(businesses);
        JMenuItem sponsors = new JMenuItem("Sponsors");
        businesses.add(sponsors);
        JMenuItem yourBusiness = new JMenuItem("Include My Business");
        businesses.add(yourBusiness);
        //adding login to navigation bar 
        JMenu login = new JMenu("Login");
        naviBar.add(login);
        JMenuItem sign = new JMenuItem("Login/Sign-In");
        login.add(sign);
        JMenuItem member = new JMenuItem("Become a Member");
        login.add(member);

        JMenu about = new JMenu("About");
        naviBar.add(about);
    }

    public static void main(String[] args) {
        new GUI();

  
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
              String choice = e.getActionCommand();
        if(choice.equals("Cut Grass")){
            // create a JTextArea
      JTextArea textArea = new JTextArea(10, 45);
      textArea.setText(grassLabor);
      textArea.setEditable(false);
      
      // wrap a scrollpane around it
      JScrollPane scrollPane = new JScrollPane(textArea);
      
      // display them in a message dialog
      JOptionPane.showMessageDialog(frame, scrollPane);
        }else if(choice.equals("Tree Removal")){
               // create a JTextArea
      JTextArea textArea = new JTextArea(10, 45);
      textArea.setText(treeRemovalLabor);
      textArea.setEditable(false);
      
      // wrap a scrollpane around it
      JScrollPane scrollPane = new JScrollPane(textArea);
      // display them in a message dialog
      JOptionPane.showMessageDialog(frame1, scrollPane);
        }else if(choice.equals("Gardening")){
               // create a JTextArea
      JTextArea textArea = new JTextArea(10, 45);
      textArea.setText(gardeningLabor);
      textArea.setEditable(false);
      
      // wrap a scrollpane around it
      JScrollPane scrollPane = new JScrollPane(textArea);
       // display them in a message dialog
       JOptionPane.showMessageDialog(frame2, scrollPane);
        }else if(choice.equals("Landscaping")){
            // create a JTextArea
   JTextArea textArea = new JTextArea(10, 45);
   textArea.setText(landscapingLabor);
   textArea.setEditable(false);
   
   // wrap a scrollpane around it
   JScrollPane scrollPane = new JScrollPane(textArea);
    // display them in a message dialog
    JOptionPane.showMessageDialog(frame3, scrollPane);
     }else if(choice.equals("Trimming Bushes/Hedges")){
        // create a JTextArea
JTextArea textArea = new JTextArea(10, 45);
textArea.setText(trimLabor);
textArea.setEditable(false);

// wrap a scrollpane around it
JScrollPane scrollPane = new JScrollPane(textArea);
 // display them in a message dialog
 JOptionPane.showMessageDialog(frame4, scrollPane);
 }else if(choice.equals("Planting")){
    // create a JTextArea
JTextArea textArea = new JTextArea(10, 45);
textArea.setText(plantingLabor);
textArea.setEditable(false);

// wrap a scrollpane around it
JScrollPane scrollPane = new JScrollPane(textArea);
 // display them in a message dialog
 JOptionPane.showMessageDialog(frame5, scrollPane);
}

       
    }
}
