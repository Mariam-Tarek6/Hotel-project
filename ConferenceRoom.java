package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ConferenceRoom extends Room {
    private int numOfSeat;
    private double seatsPrice;
   // private double roomPrice;



    static ArrayList<Room> c =new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public ConferenceRoom(){}
    public ConferenceRoom(int numOfSeat, double seatPrice,int roomNum, int daysOfReservation, boolean isReserved,double roomPrice)
    {
        super( roomNum, daysOfReservation, isReserved, roomPrice);
        this.numOfSeat = numOfSeat;
        this.seatsPrice = seatPrice;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public double getSeatPrice() {
        return seatsPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatsPrice = seatPrice;
    }
    //static ArrayList<Integer> conferenceRoom=new ArrayList<Integer>();
    //static ArrayList<Integer> conferenceSeat=new ArrayList<Integer>();
    //static ArrayList<Integer> seatPrice=new ArrayList<Integer>();
    static ArrayList<Room> f=new ArrayList<>();
    public static void conferenceRoom(ArrayList<String> lines){
ConferenceRoom cc=new ConferenceRoom();
        int j=0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("Conference")) {
               cc.setRoomNum(Integer.parseInt(lines.get(i).substring(11,14)));
                System.out.println("room num.:"+cc.getRoomNum());
                cc.setNumOfSeat(Integer.parseInt(lines.get(i).substring(15,17)));
                System.out.println("seat num.:"+cc.getNumOfSeat());
                cc.setSeatPrice(Integer.parseInt(lines.get(i).substring(18,19)));
                System.out.println("seat price:"+cc.getSeatPrice());
                cc.setDaysOfReservation(0);
                cc.setIsReserved(false);
                cc.setRoomPrice(0.0);
                f.add(j,cc);
                j++;
            }
        }
    }
    public  void  reserve(){
        int j=0;
        ConferenceRoom s=new ConferenceRoom();

        System.out.println("enter room number:");
        s.setRoomNum(sc.nextInt());
        System.out.println("Enter Days of reservation:");
        s.setDaysOfReservation(sc.nextInt());
        s.setIsReserved(true);
        System.out.println("enter number of seat:");
        setNumOfSeat(sc.nextInt());
        System.out.println("enter seat price:");
        s.setSeatPrice(sc.nextInt());
        s.setRoomPrice(s.getSeatPrice()*s.getNumOfSeat()* s.getDaysOfReservation());
              System.out.println("room price: "+s.getRoomPrice());

        f.add(j,s);
        c.add(j,s);
        j++;
    }
    public void reservedOrNot(){
        int hh;
        boolean zz=false;
        System.out.println("Enter room number");
        hh= sc.nextInt();
        for (int i=0;i<f.size();i++){
            if(hh== f.get(i).getRoomNum()){
                if(f.get(i).getIsReserved()==true){

                    zz=true;
                }
                if(f.get(i).getIsReserved()==false)
                {
                    zz=false;
                }
            }
        }
        if (zz){
            System.out.println("***Room  reserved ****");
        }
        if (!zz){
            System.out.println("***Room  not reserved ****");
        }
    }
    public void TotalPrice(){

        double total=0;
        StandardRoom s =new StandardRoom();
        StandardRoom ss=(StandardRoom) s;
        var v = this.getRoomPrice() + total;
        for (int i=0;i<c.size();i++){

            double v1 = this.getRoomPrice() + total;
            total= this.getRoomPrice()+total;

        }
        System.out.println( "total price:"+ total);
    }
    public void checkOut(){
        int x;
        System.out.println("enter room number :");
        x= sc.nextInt();
        for(int i=0;i<c.size();i++){
            if (x== c.get(i).getRoomNum()){
           // if(Objects.equals(a.get(i).roomNum, c)){
                c.remove(c.get(i));
            }
        }
    }
    @Override
    public String toString() {
        return "ConferenceRoom{" +super.toString()+
                "numOfSeat=" + numOfSeat +
                ", seatPrice=" + seatsPrice +
                '}';
    }
    public void display(){
        for (int i=0;i<c.size();i++){
            System.out.println(c.get(i));
        }
    }
}
