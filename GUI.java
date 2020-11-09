import java.awt.*;


import javax.swing.*;

/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{
    public GUI(){
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(6, 1));
         
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Menu");
        frame.pack();
        frame.setVisible(true);
        
    }
    public static void main(String[] args){
        new GUI();
        JFrame frame2 = new JFrame("Menu");
        frame2.setVisible(true);
        frame2.setSize(400,200);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar naviBar = new JMenuBar();
        frame2.setJMenuBar(naviBar);
        
        JMenu home = new JMenu("Home");
        naviBar.add(home);
        
        JMenu services = new JMenu("Services");
        naviBar.add(services);
        JMenuItem cut = new JMenuItem("Cut Grass");
        services.add(cut);
        JMenuItem tree = new JMenuItem("Tree Removal");
        services.add(tree);
        JMenuItem garden = new JMenuItem("Gardening");
        services.add(garden);
        JMenuItem landscaping = new JMenuItem("Landscaping");
        services.add(landscaping);
        JMenuItem hedge = new JMenuItem("Trimming Bushes/Hedges");
        services.add(hedge);
        JMenuItem planting = new JMenuItem("Planting");
        services.add(planting);
        
        JMenu businesses = new JMenu("Businesses");
        naviBar.add(businesses);
        JMenuItem sponsors = new JMenuItem("Sponsors");
        businesses.add(sponsors);
        JMenuItem yourBusiness = new JMenuItem("Include My Business");
         businesses.add(yourBusiness);
         
        JMenu login = new JMenu("Login");
        naviBar.add(login);
        JMenuItem sign = new JMenuItem("Login/Sign-In");
        login.add(sign);
        JMenuItem member = new JMenuItem("Become a Member");
        login.add(member);
        
        JMenu about = new JMenu("About");
        naviBar.add(about);
    }
}
