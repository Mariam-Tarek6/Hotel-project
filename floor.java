package com.company;

import java.util.ArrayList;

public class floor extends  hotel{

    public floor(int floorNum, int roomNum) {
        super(floorNum, roomNum);
    }

public floor(){

}
    public static void rooms(ArrayList<String> lines){
        ArrayList<String> roomType=new ArrayList<String>();
        int a=0;
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
            if(lines.get(i).startsWith("Standard")){
                roomType.add(a,lines.get(i).substring(0,12));
                System.out.println(roomType.get(a));

                a++;
            }
            if (lines.get(i).startsWith("Sweet")){
                roomType.add(a,lines.get(i));
                System.out.println(roomType.get(a).substring(0,9));
                a++;
            }
            if (lines.get(i).startsWith("Conference")){
                roomType.add(a,lines.get(i).substring(0,14));
                System.out.println(roomType.get(a));
                a++;
            }
        }
    }
}

