package com.company.domains;

import java.util.HashMap;
import java.util.Map;

public class Board {

        Snake snake;
        Ladder ladder;

        int size;
        Pair[] board;

        public Board(int size){
            this.size=size;
            board=new Pair[size];
            for(int i=0;i<size;i++)
                board[i]=new Pair(0,0);

            snake=new Snake();
            ladder=new Ladder();

            // Add Snakes
            snake.addSnake(1,10);
            snake.addSnake(30,50);
            snake.addSnake(60,100);
            snake.addSnake(11,99);
            // Add Ladder
            ladder.addLadder(88,20);
            ladder.addLadder(60,20);
            ladder.addLadder(45,19);
            ladder.addLadder(25,5);
            // Add both in board array
            HashMap<Integer,Pair> snakeList=snake.getSnakeList();
            HashMap<Integer,Pair> ladderList=ladder.getLadderList();

            for(Map.Entry<Integer,Pair> iter:snakeList.entrySet()){
                Pair p=iter.getValue();
                board[p.start].start=p.start;
                board[p.start].end=p.end;
            }

            for(Map.Entry<Integer,Pair> iter:ladderList.entrySet()){
                Pair p=iter.getValue();
                board[p.start].start=p.start;
                board[p.start].end=p.end;
            }
        }

        public int getDestination(int score){
            if(board[score].end==0)return -1;
            return board[score].end;
        }

}
