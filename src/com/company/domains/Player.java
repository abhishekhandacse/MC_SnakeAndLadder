package com.company.domains;



import java.util.ArrayList;

public class Player {
        String name;
        int pos;

        public Player(String name,int pos){
            this.name=name;
            this.pos=pos;
        }

        public int getPos(){
            return pos;
        }

        public void setPos(int pos){
            this.pos=pos;
        }

        public String getName(){
            return this.name;
        }
}
