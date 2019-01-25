package learn.callback;

import java.awt.*;

public class PaintFrame {
    public static void drawFrame(MyFrame f) {
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");


        // 画窗口
        f.paint();

        System.out.println("启动缓存，增加效率");
    }

    public static void main(String[] args) {
        drawFrame( new GameFrame01());
        drawFrame( new GameFrame02());

        String str1 = new String("a");
        String str2 = new String("a");
        System.out.println(str1.equals(str2));
    }
}

class GameFrame01 extends MyFrame {
    @Override
    public void paint() {
        System.out.println("GameFrame01.paint()");
    }
}

class GameFrame02 extends MyFrame{
    @Override
    public void paint() {
        System.out.println("GameFrame02.paint()");
    }
}