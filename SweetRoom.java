package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SweetRoom  extends Room{
   private double pricePerNight;
    //double roomPrice;
    static ArrayList<Room> b =new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public SweetRoom()
    {
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }


    public SweetRoom(double pricePerNight, int roomNum , int daysOfReservation, boolean isReserved,double roomPrice) {
        super( roomNum, daysOfReservation, isReserved,roomPrice);

        this.pricePerNight = pricePerNight;
    }

    static ArrayList<Room> w=new ArrayList<>();
    public static void sweetRoom(ArrayList<String> lines){
        int j=0;
        SweetRoom s=new SweetRoom();
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("Sweet")) {
                s.setRoomNum(Integer.parseInt(lines.get(i).substring(6,9)));
                System.out.print("  room num.: "+s.getRoomNum());
                s.setPricePerNight(Integer.parseInt(lines.get(i).substring(10,13)));
                System.out.println("  room price per night: "+s.getPricePerNight());
                s.setDaysOfReservation(0);
                s.setIsReserved(false);
                s.setRoomPrice(0);
                w.add(j,s);
                j++;
            }
        }
    }
    public  void reserve(){
        int j=0;
        SweetRoom s=new SweetRoom();
        System.out.println("enter room number:");
        s.setRoomNum(sc.nextInt());
        System.out.println("Enter Days of reservation:");
        s.setDaysOfReservation(sc.nextInt());
        s.setIsReserved(true);
        System.out.println("enter room price per night:");
        s.setPricePerNight(sc.nextInt());

                s.setRoomPrice(s.getPricePerNight()*s.getDaysOfReservation());
                System.out.println("The room price is:" + " " + s.getRoomPrice());


        w.add(j,s);
            b.add(j,s);
            j++;
        }

    public void reservedOrNot(){
        int hh;
        boolean zz=false;
        System.out.println("Enter room number");
        hh= sc.nextInt();
        for (int i=0;i<w.size();i++){
            if(hh== w.get(i).getRoomNum()){
                if(w.get(i).getIsReserved()==true){
                    zz=true;
                }
                if(w.get(i).getIsReserved()==false)
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
        for (int i=0;i<b.size();i++){
            total= b.get(i).getRoomPrice()+total;
        }
        System.out.println( "total price:"+ total);
    }
    public void checkOut(){
        int c;
        System.out.println("enter room number :");
        c= sc.nextInt();
        for(int i=0;i<b.size();i++){
            if (c== b.get(i).getRoomNum()){
                // if(Objects.equals(a.get(i).roomNum, c)){
                //    if (a.get(i).roomNum.equals(c))
                b.remove(b.get(i));
            }
        }
    }
    @Override
    public String toString() {
        return "SweetRoom{" +super.toString()+
                "pricePerNight=" + getPricePerNight() +
                "roomPrice"+getRoomPrice()+
                '}';
    }
    public void display(){
        for (int i=0;i<b.size();i++){
            System.out.println(b.get(i));
        }
    }
}

