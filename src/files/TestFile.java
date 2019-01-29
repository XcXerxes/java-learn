package files;


import java.io.File;

/**
 * 测试 File 类
 */

public class TestFile {
    public static void main(String[] args) {
        File f = new File("/Users/antonyx/antony/java/java-learn/src/learn/内存分析.md");
        File f2 = new File("/Users/antonyx/antony/java/java-learn/src");
        File f3 = new File(f2, "learn");

        if(f.isFile()) {
            System.out.println("这是一个文件!!!");
        }
        if(f.isDirectory()) {
            System.out.println("这是一个目录");
        }
        printFile(f2, 0);
    }

    /**
     * 递归树状 结构
     * @param file
     * @param level
     */
    public static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for(File temp: files) {
                printFile(temp, level + 1);
            }
        }
    }

}
