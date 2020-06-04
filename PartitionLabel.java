package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabel {
public List<Integer> partitionLabels(String S) {
        
        List<Integer> li = new ArrayList<Integer>();
        int[] last = new int[26];
        for(int i = 0; i < S.length(); i++){
            last[S.charAt(i)-'a']=i;
        }
        int start = -1;
        int x = 0;
        for(int i = 0; i < S.length(); i++){
             x = Math.max(x, last[S.charAt(i)-'a']);
            
            if(i==x){
                li.add(x-start);
                start = x;
            }
        }
        return li;
    }

}
