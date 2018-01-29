package Algorithmus_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMain {
	public static void main(String[] args) {

        List<String> mList = new ArrayList<String>();
        mList.add("1");
        mList.add("2");
        mList.add("3");

        // List -> String[]
        String[] sArrays = mList.toArray(new String[mList.size()]);
        for(String s : sArrays){
            System.out.println(s);
        }
        // String[] -> List
        ArrayList<String> mNewList = new ArrayList<String>(Arrays.asList(sArrays));

        for(String s : mNewList){
            System.out.println(s);
        }
    }	
}
