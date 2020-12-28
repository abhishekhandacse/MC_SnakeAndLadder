package com.company.domains;

import com.company.exceptions.snakeNotFoundException;

import java.util.HashMap;

public class Snake {
            int id=0;


            HashMap<Integer,Pair> snakes;

            public Snake(){
                snakes=new HashMap<>();
                id=0;
            }

           public void addSnake(int start,int end){
                snakes.put(id,new Pair(start,end));
                id++;
            }

           public void deleteSnake(int id) throws snakeNotFoundException {
                if(snakes.get(id)==null)throw new snakeNotFoundException("Snake id not found");
                snakes.remove(id);
            }

            public HashMap<Integer,Pair> getSnakeList(){
                return snakes;
            }

}
