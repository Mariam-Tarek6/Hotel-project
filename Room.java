package com.company;

import java.util.ArrayList;

public class Room   {
    private int roomNum;
    private int daysOfReservation;
    private boolean isReserved;
    private double roomPrice;

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
//static ArrayList<Room> a =new ArrayList<>();

    public Room(int roomNum, int daysOfReservation, boolean isReserved, double roomPrice) {
        this.roomNum = roomNum;
        this.daysOfReservation = daysOfReservation;
        this.isReserved = isReserved;
        this.roomPrice = roomPrice;
    }
    public Room(){}
        /*public static void sweetRoom(ArrayList<String> lines){
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
        }public static void standardRoom(ArrayList<String> lines) {
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


    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getDaysOfReservation() {
        return daysOfReservation;
    }

    public void setDaysOfReservation(int daysOfReservation) {
        this.daysOfReservation = daysOfReservation;
    }

    public boolean getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum=" + roomNum +
                ", daysOfReservation=" + daysOfReservation +
                ", isReserved=" + isReserved +
                ", roomPrice=" + roomPrice +
                '}';
    }
}