package game;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *  飞机游戏的主窗口
 */

public class MyGameFrame extends JFrame {

    Image bg = GameUtil.getImage("images/bg.jpeg");
    Image plane = GameUtil.getImage("images/plane.png");
    int planeX = 250;
    int planeY = 250;
    Plane pl = new Plane(plane, 250, 250, 50, 50);
    Shell shell = new Shell();

    Shell[] shells = new Shell[50];

    /**
     * 初始化 加载窗口
     */
    public void launchFrame() {
        this.setTitle("飞机游戏");
        this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        this.setLocation(300, 300);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // 启动重画窗口的线程
        new PaintThread().start();
        addKeyListener(new KeyMonitor());
        launchShell();
    }

    /**
     * 生成炮弹
     */
    public void launchShell() {
        for (int i = 0; i < 50; i++) {
            shells[i] = new Shell();
        }
    }
    /**
     * 画出炮弹
     */
    public void drawShell(Graphics g) {
        for (int i = 0; i < shells.length; i++) {
            shells[i].draw(g);
        }
    }

    /**
     * 自动调用的
     * @param g  --> 画笔
     */

    @Override
    public void paint(Graphics g) {
//        Color c = g.getColor();
//        g.setColor(Color.BLUE);
//
//        g.drawLine(0, 50, 200, 50);
//
//        g.setColor(c);
//        g.drawImage(bg, 0, 0, 500, 500, null);
//        g.drawImage(plane, planeX, planeY,60,60, null);
//        planeX++;
        g.drawImage(bg, 0, 0, Constant.GAME_WIDTH, Constant.GAME_HEIGHT, null);
        pl.drawSelf(g);
        // shell.draw(g);
        for (int i = 0; i < shells.length; i++) {
            shells[i].draw(g);

            boolean peng = shells[i].getRect().intersects(pl.getRect());
            if (peng) {
                System.out.println("撞机了.....");
                pl.live = false;
            }
        }

    }

    /**
     * 这个线程 帮助反复的重画窗口
     */
    class PaintThread extends Thread{
        @Override
        public void run() {
            while (true) {
                repaint(); // 重画
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 键盘监听
     * @param
     */

    class KeyMonitor extends KeyAdapter{
        // 按下键盘的监听事件
        @Override
        public void keyPressed(KeyEvent e) {
            pl.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            pl.cancelDirection(e);
        }
    }

    public static void main(String[] args) {
        MyGameFrame myGame = new MyGameFrame();
        myGame.launchFrame();
    }
}
