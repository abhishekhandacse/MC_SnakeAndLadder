package com.company.domains;

import com.company.exceptions.ladderNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;

public class Ladder {
    int id=0;

    HashMap<Integer, Pair> ladder;

    public Ladder(){
        ladder=new HashMap<>();
        id=0;
    }

    public void addLadder(int start,int end){
        ladder.put(id,new Pair(start,end));
        id++;
    }

    public void deleteLadder(int id) throws ladderNotFoundException {
        if(ladder.get(id)==null)throw new ladderNotFoundException("ladder id not found");
        ladder.remove(id);
    }

    public HashMap<Integer,Pair> getLadderList(){
        return ladder;
    }
}
