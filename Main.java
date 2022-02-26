package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        File files = new File("files/file1");
        //file.read(files);
        Scanner c=new Scanner(System.in);
        Scanner sc = new Scanner(files);
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
Room r=new Room();
floor xx=new floor();
//xx.rooms(lines);

do {
    int a;
    System.out.println("1- To book a room");
    System.out.println("2- To checkout");
    System.out.println("3-To find out the profit");
    System.out.println("4-To find out whether the room is booked or not");
    System.out.println("5-To display details");
    System.out.print("6- EXIT");
    System.out.print("     Select Your Option (1-6): ");
    a=c.nextInt();
    if(a==1){
        System.out.println("1- STANDARD ROOM");
        System.out.println("2-SWEET ROOM");
        System.out.println("3-CONFERENCE ROOM");

        System.out.println(" Select Your Option (1-3):");
        int t;
        t= c.nextInt();
        if(t==1){
            Standard s=new Standard();
            s.availableRoom(lines);
            s.reserve();
        }
        if(t==2){
            SweetRoom s=new SweetRoom();
            s.sweetRoom(lines);
            s.reserve();
        }
        if(t==3){
            ConferenceRoom s=new ConferenceRoom();
            s.conferenceRoom(lines);
            s.reserve();
        }

    }
    if(a==2){
        System.out.println("1- STANDARD ROOM");
        System.out.println("2-SWEET ROOM");
        System.out.println("3-CONFERENCE ROOM");

        System.out.println(" Select Your Option (1-3):");
        a= c.nextInt();
        if(a==1){
            Standard s=new Standard();

            s.checkOut();
        }
        if(a==2){
            SweetRoom s=new SweetRoom();

            s.checkOut();
        }
        if(a==3){
            ConferenceRoom s=new ConferenceRoom();

            s.checkOut();
        }
    }
    if (a == 3) {
        System.out.println("1- STANDARD ROOM");
        System.out.println("2-SWEET ROOM");
        System.out.println("3-CONFERENCE ROOM");

        System.out.println(" Select Your Option (1-3):");
        a= c.nextInt();
        if(a==1){
            Room s=new Standard();
            Standard cc=(Standard)s;
            cc.TotalPrice();
        }
        if(a==2){
            SweetRoom s=new SweetRoom();

            s.TotalPrice();
        }
        if(a==3){
            ConferenceRoom s=new ConferenceRoom();

            s.TotalPrice();
        }
    }
    if (a==4){
        System.out.println("1- STANDARD ROOM");
        System.out.println("2-SWEET ROOM");
        System.out.println("3-CONFERENCE ROOM");

        System.out.println(" Select Your Option (1-3):");
        a= c.nextInt();
        if(a==1){
            Standard s=new Standard();

            s.reservedOrNot();
        }
        if(a==2){
            SweetRoom s=new SweetRoom();

            s.reservedOrNot();
        }
        if(a==3){
            ConferenceRoom s=new ConferenceRoom();

            s.reservedOrNot();
        }
    }
    if (a==5){
        System.out.println("1- STANDARD ROOM");
        System.out.println("2-SWEET ROOM");
        System.out.println("3-CONFERENCE ROOM");
        System.out.println(" Select Your Option (1-3):");
        a= c.nextInt();
        if(a==1){
            Room s=new Standard();
            Standard x=(Standard) s;
            x.display();
        }
        if (a==2){
           Room x=new SweetRoom();
           SweetRoom s=(SweetRoom)x;
           s.display();
        }
        if (a==3){
            Room s=new ConferenceRoom();

            ((ConferenceRoom) s).display();

        }
    }
    if(a==6){

        break;
    }
}while(true);



    }

   /* public static void standardRoom(ArrayList<String> lines) {
        ArrayList<Integer> standardRoom=new ArrayList<Integer>();
        ArrayList<Integer> standardBed=new ArrayList<Integer>();
        ArrayList<Integer> standardBedPrice=new ArrayList<Integer>();
        int j=0;
            for (int i = 0; i < lines.size(); i++) {
                //System.out.println(lines.get(i));
                if (lines.get(i).startsWith("Standard")) {
                      //System.out.println(lines.get(i));
                    standardRoom.add(j, Integer.parseInt(lines.get(i).substring(9, 12)));
                    System.out.println("room num.:"+ standardRoom.get(j));
                    standardBed.add(j, Integer.parseInt(lines.get(i).substring(13, 14)));
                    System.out.println("num.of bed:"+standardBed.get(j));
                    standardBedPrice.add(j, Integer.parseInt(lines.get(i).substring(15, 17)));
                    System.out.println("num.of bed:"+standardBedPrice.get(j));
                    j++;
            }
        }
    }*/
   public  static void printFloor(ArrayList<String> lines) {
       int floorNum = 0;
       int roomNum;
       ArrayList<Integer> room=new ArrayList<Integer>();

       for (int i = 0; i < lines.size(); i++) {
           if (lines.get(i).startsWith("#floor:")) {
               floorNum = Integer.parseInt(lines.get(i).substring(7));
               System.out.println("floor:" + floorNum);
               break;
           }
       }
      int j=0;
           for (int i = 0; i < lines.size(); i++) {
               if (lines.get(i).startsWith("Floor#")) {
                   room.add(j,Integer.parseInt(lines.get(i).substring(14)));
                   System.out.println("in" + " " + room.get(j));
                   j++;
               }
           }
       }
       public static void sweetRoom(ArrayList<String> lines){
           ArrayList<Integer> sweetRoom=new ArrayList<Integer>();
           ArrayList<Integer> sweetPrice=new ArrayList<Integer>();
           int j=0;
           for (int i = 0; i < lines.size(); i++) {
               if (lines.get(i).startsWith("Sweet")) {
                   sweetRoom.add(j,Integer.parseInt(lines.get(i).substring(6,9)));
                   System.out.println("room num.:"+sweetRoom.get(j));
                   sweetPrice.add(j,Integer.parseInt(lines.get(i).substring(10,13)));
                   System.out.println("room price.:"+sweetPrice.get(j));
                   j++;
               }
           }
       }
       public static void conferenceRoom(ArrayList<String> lines){
           ArrayList<Integer> conferenceRoom=new ArrayList<Integer>();
           ArrayList<Integer> conferenceSeat=new ArrayList<Integer>();
           ArrayList<Integer> searPrice=new ArrayList<Integer>();
           int j=0;
           for (int i = 0; i < lines.size(); i++) {
               if (lines.get(i).startsWith("Conference")) {
                   conferenceRoom.add(j,Integer.parseInt(lines.get(i).substring(11,14)));
                   System.out.println("room num.:"+conferenceRoom.get(j));
                   conferenceSeat.add(j,Integer.parseInt(lines.get(i).substring(15,17)));
                   System.out.println("seat num.:"+conferenceSeat.get(j));
                   searPrice.add(j,Integer.parseInt(lines.get(i).substring(18,19)));
                   System.out.println("seat price:"+searPrice.get(j));
                   j++;
               }
       }
   }
}



