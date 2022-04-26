package tankwald;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankClient extends Frame {
    //出现窗口的一种方式,继承自Frame。
    public void LaunchFrame(){
        this.setLocation(400,300);
        this.setSize(800,600);
        this.setTitle("TankWar");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);
        this.setBackground(Color.GREEN);
        setVisible(true);
    }

    //在窗口上画画
    @Override
    public void paint(Graphics g) {
        Color color = g.getColor();//设置窗口的前景色，有默认的颜色，后面可以自己设置。
        g.setColor(Color.RED);
        g.fillOval(50,50,30,30);
        g.setColor(color);
    }

    public static void main(String[] args) {
        TankClient tankClient = new TankClient();
        tankClient.LaunchFrame();
    }
}
