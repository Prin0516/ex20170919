import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame {
    private Button btnexit=new Button("exit");
    private Button btnadd=new Button("add");
    private Label lab=new Label("0");
    private int c=0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setLocation(10,10);
        this.setSize(500,500);
        this.setLayout(null);
        btnexit.setBounds(200,200,100,40);
        btnadd.setBounds(200,250,100,40);
        lab.setBounds(200,300,100,50);
        btnexit.setBackground(new Color(200,200,100));
        btnadd.setBackground(new Color(200,200,255));
        this.add(btnexit);
        this.add(btnadd);
        this.add(lab);
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
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                c++;
                lab.setText(Integer.toString(c));
            }
        });

    }
}
