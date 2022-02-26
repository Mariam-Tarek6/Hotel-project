package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class hotel {
    int floorNum = 0;
    int roomNum;

    public hotel(int floorNum, int roomNum) {
        this.floorNum = floorNum;
        this.roomNum = roomNum;
    }

    public hotel() {
    }

    public  static void numberOfFloor(ArrayList<String> lines) {
       int floorNum = 0;
       int roomNum;


       for (int i = 0; i < lines.size(); i++) {
           if (lines.get(i).startsWith("#floor:")) {
               floorNum = Integer.parseInt(lines.get(i).substring(7));
               System.out.println("There are " + floorNum + " floors in te hotel ");
               break;
           }
       }
   }
       public static void floor(ArrayList<String> lines){
           int j=0;
           int z=1;
           ArrayList<Integer> room=new ArrayList<Integer>();
           for (int i = 0; i < lines.size(); i++) {
               if (lines.get(i).startsWith("Floor#")) {
                   room.add(j,Integer.parseInt(lines.get(i).substring(14)));
                   System.out.println("on the "+z +" floor there are  "+ room.get(j)+" rooms");
                   j++;
                   z++;

               }
           }
   }

   /* @Override
    public String toString() {
        return "hotel{" +
                "floorNum=" + floorNum +
                ", roomNum=" + roomNum +
                '}';
    }*/
}
