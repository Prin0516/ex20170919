import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame {
    public MainFrame(){
        init();
    }
    private void init(){
        this.setLocation(10,10);
        this.setSize(500,500);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent ) {
                System.exit(0);
            }
        });

    }
}
