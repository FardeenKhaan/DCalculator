import javax.swing.*;
import java.awt.*;
 
public class SplashScreen extends Thread{
    JFrame frame;
    JLabel text=new JLabel("CALCULATOR");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();//Crating a JLabel for displaying the message
    
    public void run(){
        //adding gui
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        //adding text
        text.setFont(new Font("Ink Free",Font.BOLD,30));
        text.setBounds(190,150,600,40);
        text.setForeground(Color.BLACK);
        frame.add(text);
        //adding message
        message.setBounds(250,320,200,40);//Setting the size and location of the label
        message.setForeground(Color.blue);//Setting foreground Color
        message.setFont(new Font("Ink Free",Font.BOLD,15));//Setting font properties
        frame.add(message);//adding label to the frame
        //progress bar.
        progressBar.setBounds(100,280,400,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);

        int i=0;//Creating an integer variable and intializing it to 0
 
        while( i<=100)
        {
            try{
                Thread.sleep(50);//Pausing execution for 50 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING "+Integer.toString(i)+"%");//Setting text of the message JLabel
                i++;
                if(i==100){
                frame.dispose();
                new DCalculator();}
            }catch(Exception e){
                e.printStackTrace();
            }
        }   
    }
}
