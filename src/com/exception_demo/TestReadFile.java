package com.exception_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
    /**
     * 执行顺序：
     * 1、执行 try, catch, 给返回值赋值,
     * 2、执行finally
     * 3、再 return
     * @return
     */
    public static String openFile() {
        try {
            System.out.println("aaaa");
            FileInputStream fs = new FileInputStream("/Users/antonyx/antony/java/java-learn/src/learn/内存分析.md");
            int a = fs.read();
            System.out.println("bbbbb");
            return "step1";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "step2";
        } catch (IOException e) {
            e.printStackTrace();
            return "step3";
        }finally {
            System.out.println("finally!!!");
        }
    }

    public static void main(String[] args) {
        String str = openFile();
        System.out.println(str);
//        FileReader reader = null;
//        try {
//            reader = new FileReader("/Users/antonyx/antony/java/java-learn/src/learn/内存分析.md");
//            char c = (char) reader.read();
//            System.out.println(c);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
