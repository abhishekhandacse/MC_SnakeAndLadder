package com.company;

import com.company.domains.Board;
import com.company.domains.Ladder;
import com.company.domains.Player;
import com.company.domains.Snake;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int SIZE=101;
        Board board=new Board(SIZE);

        Player player1=new Player("Ramesh",1);
        Player player2=new Player("Suresh",1);

        boolean turn=false;
        int dice=0;
        while(player1.getPos()!=SIZE-1 && player2.getPos()!=SIZE-1){

            dice= (int)(Math.floor((6*Math.random()) +1));
            System.out.println("  Dice Output is  -> " + dice);
            if(turn==true){//Player 1 Turn
               int position=player1.getPos();
               if(position+dice>SIZE-1){
                   //Do Nothing
               }else{
                   position=position+dice;
               }
               if(board.getDestination(position)!=-1){

                   position=board.getDestination(position);
               }

               player1.setPos(position);

               System.out.println(player1.getName() + " "+ player1.getPos());

            }else{// Player 2 Turn
                int position=player2.getPos();
                if(position+dice>SIZE-1){
                    //Do Nothing
                }else{
                    position=position+dice;
                }
                if(board.getDestination(position)!=-1){
                    position=board.getDestination(position);
                }
                player2.setPos(position);

                System.out.println(player2.getName() + " "+ player2.getPos());



            }

            turn=!turn;

        }

        if(player1.getPos()==SIZE-1)
            System.out.println(player1.getName() + " won !!!");
        else System.out.println(player2.getName()+ " won !!!");

    }
}
