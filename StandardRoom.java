package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class StandardRoom extends  Room {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Room> a =new ArrayList<>();
   static private int NumOfBeds;
   static private double roomPrice;//The price of the reserved bed in the room
static private double bedPrice;

    public double getBedPrice() {
        return bedPrice;
    }

    public void setBedPrice(double bedPrice) {
        this.bedPrice = bedPrice;
    }

    public StandardRoom(){ }

    public void setNumOfBeds(int numOfBeds) {
        NumOfBeds = numOfBeds;
    }

   public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getNumOfBeds() {
        return NumOfBeds;
    }

   public double getRoomPrice() {
        return roomPrice;
    }

    public StandardRoom(int numOfBeds, double roomPrice , int roomNum , int daysOfReservation, boolean isReserved,double bedPrice){
        super( roomNum, daysOfReservation, isReserved,roomPrice);
        NumOfBeds = numOfBeds;
        this.roomPrice = roomPrice;
        this.bedPrice=bedPrice;
    }



   /* static ArrayList<Integer> standardRoom=new ArrayList<Integer>();
    static ArrayList<Boolean> standardReservedOrNot=new ArrayList<Boolean>();
    static ArrayList<Integer> standardBed=new ArrayList<Integer>();
    static ArrayList<Integer> standardBedPrice=new ArrayList<Integer>();*/
static ArrayList<Room> q=new ArrayList<>();
    public static void availableRoom(ArrayList<String> lines) {

        int j=0;
        StandardRoom s=new StandardRoom();
        for (int i = 0; i < lines.size(); i++) {
            //System.out.println(lines.get(i));
            if (lines.get(i).startsWith("Standard")) {
               s.setRoomNum( Integer.parseInt(lines.get(i).substring(9, 12)));
                System.out.print("   room num.:"+ s.getRoomNum());
                s.setNumOfBeds( Integer.parseInt(lines.get(i).substring(13, 14)));
                System.out.print("  num.of bed:"+s.getNumOfBeds());
                s.setBedPrice( Integer.parseInt(lines.get(i).substring(15, 17)));
                System.out.println("  price of bed:"+ s.getBedPrice());
                s.setDaysOfReservation(0);
                s.setIsReserved(false);
                q.add(j,s);
                j++;
            }
        }
    }
    public  void  reserve(){
        int j=0;

    StandardRoom s=new StandardRoom();
    System.out.println("enter room number:");
        s.setRoomNum(sc.nextInt());
        System.out.println("Enter Days of reservation:");
        s.setDaysOfReservation(sc.nextInt());
        s.setIsReserved(true);
        System.out.println("enter number of bed:");
        s.setNumOfBeds(sc.nextInt());
        System.out.println("enter bed price:");
        s.setBedPrice(sc.nextInt());

        s.setRoomPrice(s.getDaysOfReservation() * s.getBedPrice() * s.getNumOfBeds());
                System.out.println("The price of bed is:" + " " + s.getRoomPrice());

        q.add(j,s);
            a.add(j,s);
            j++;
    }
    public void TotalPrice(){

        double total=0;
        StandardRoom s =new StandardRoom();
StandardRoom ss=(StandardRoom) s;
        var v = this.getRoomPrice() + total;
        for (int i=0;i<a.size();i++){

            double v1 = this.getRoomPrice() + total;
            total= this.getRoomPrice()+total;

        }
        System.out.println( "total price:"+ total);
    }
    public void reservedOrNot(){
        int hh;
        boolean zz=false;
        System.out.println("Enter room number");
        hh= sc.nextInt();
        for (int i=0;i<q.size();i++){
            if(hh== q.get(i).getRoomNum()){
                if(q.get(i).getIsReserved()==true){
                    //System.out.println("Room  booked****");
                    zz=true;
                }
                if(q.get(i).getIsReserved()==false)
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
    public void checkOut(){
        int c;
        System.out.println("enter room number :");
        c= sc.nextInt();
        for(int i=0;i<a.size();i++){
            if (c== a.get(i).getRoomNum()){
                //System.out.println(a.get(i).toString());
                // if(Objects.equals(a.get(i).roomNum, c)){
                a.remove(a.get(i));
                System.out.println("DONE");
            }
        }
    }
    @Override
    public String toString() {
        return "StandardRoom{" +super.toString()+
                "NumOfBeds=" + getNumOfBeds() +
                ", roomPrice=" + getRoomPrice() +
                '}';
    }
    public void display(){
        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
