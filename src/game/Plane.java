package game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
    boolean left;
    boolean right;
    boolean up;
    boolean down;
    int speed = 10;
    public Plane(Image img, int x, int y, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawSelf(Graphics g) {
        g.drawImage(img, (int)x, (int)y, width, height, null);
        if(left) {
            x -=speed;
        }
        if (right){
            x += speed;
        }
        if (up) {
            y -= speed;
        }
        if(down) {
            y += speed;
        }
    }

    /**
     * 键盘按下 监听
     * @param e
     */

    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
                default:
        }
    }

    /**
     * 键盘弹起
     */
    public void cancelDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
            default:
        }
    }
}
