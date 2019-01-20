package com.porkgame;

import java.util.*;

public class InitPlay {
    public List<Player> players;
    public InitPlay() {
        this.players = new ArrayList<Player>();
    }
    public void playCard() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< 2; i++) {
            System.out.println("请输入第" + (i+1) + "位玩家的ID 和姓名");
            System.out.println("请输入ID");
            String playId = input.next();
            System.out.println("请输入姓名");
            String name = input.next();
            Player player = new Player(playId, name);
            this.players.add(player);
        }
    }

    /**
     * 生成随机的纸牌数
     */
    public PorkNum randomCard(Pork pork) {
        Random random = new Random();
        // 纸牌的个数
        int porkLength = pork.porkNumList.size();
        PorkNum porkNum = pork.porkNumList.get(random.nextInt(porkLength));
        return porkNum;
    }

    /**
     * 开始发牌
     */
    public void startPlay() {
        System.out.println("开始发牌！！");
        Pork pork = new Pork();
        for (Player player: players) {
            System.out.println("玩家："+player.getName() + "拿牌");
            player.ownPorks.add(randomCard(pork));
        }
        System.out.println("------------------ 开始游戏 ------------------");
        Player player1 = this.players.get(0);
        Player player2 = this.players.get(1);
        System.out.println("玩家：" + player1.getName() + "手牌为：" + player1.ownPorks.get(0).getColor()+player1.ownPorks.get(0).getNum());
        System.out.println("玩家：" + player2.getName() + "手牌为：" + player2.ownPorks.get(0).getColor()+player2.ownPorks.get(0).getNum());
    }
    public static void main(String[] args) {
        InitPlay play = new InitPlay();
        play.playCard();
        play.startPlay();
    }
}
