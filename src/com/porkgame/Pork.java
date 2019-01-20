package com.porkgame;

import java.util.ArrayList;
import java.util.List;

public class Pork {
    private static final String num_string = "2,3,4,5,6,7,8,9,10,J,Q,K,A";
    private String color;
    private String porkNum;
    public List<PorkNum> porkNumList;
    public Pork() {
        this.porkNumList = new ArrayList<PorkNum>();
        String[] numList =  num_string.split(",");
        String[] colorList = {"方块", "梅花", "红桃", "黑桃"};
        for (int i = 0; i<numList.length; i++) {
            for (int j = 0; j<colorList.length; j++) {
                PorkNum porkNum = new PorkNum(colorList[j], numList[i]);
                this.porkNumList.add(porkNum);
            }
        }
    }

    /**
     * 比较颜色的大小
     * @param
     */
    public int getColorSort(String color) {
        switch (color) {
            case "方块":
                return 1;
            case "梅花":
                return 2;
            case "红桃":
                return 3;
            case "黑桃":
                return 4;
                default:
               return 4;
        }
    }
    public static void main(String[] args) {
        Pork pork = new Pork();
        for (PorkNum porkNum:pork.porkNumList) {
            System.out.println("输出的卡牌是======" + porkNum.getColor()+ " " + porkNum.getNum());
        }
    }

}
