import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame {
    private Button btnexit=new Button("exit");
    public MainFrame(){
        init();
    }
    private void init(){
        this.setLocation(10,10);
        this.setSize(500,500);
        this.setLayout(null);
        btnexit.setBounds(200,200,100,100);
        this.add(btnexit);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent ) {
                System.exit(0);
            }
        });
        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

    }
}
