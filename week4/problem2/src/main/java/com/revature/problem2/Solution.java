package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {


    public List<String> autoComplete(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            newList.add(list.get(i));
        }

        ArrayList ans = new ArrayList<>();
        int count = 0;
        String prefix = list.get(0);
        int pLen = prefix.length();
        for(String ele: newList){
            if(ele.indexOf(prefix) == 0) {
                ans.add(ele);
            }
        }
        return ans;
    }
}
