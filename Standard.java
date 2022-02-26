package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Standard extends Room{
    Scanner sc;
    static ArrayList<Room> a = new ArrayList();
    private static int NumOfBeds;
    private static double roomPrice;
    private static double bedPrice;
    static ArrayList<Room> q = new ArrayList();

    public double getBedPrice() {
        return bedPrice;
    }

    public void setBedPrice(double bedPrice) {
        Standard.bedPrice = bedPrice;
    }

    public Standard() {
        this.sc = new Scanner(System.in);
    }

    public void setNumOfBeds(int numOfBeds) {
        NumOfBeds = numOfBeds;
    }

    public void setRoomPrice(int roomPrice) {
        Standard.roomPrice = (double)roomPrice;
    }

    public int getNumOfBeds() {
        return NumOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public Standard(int numOfBeds, double roomPrice, int roomNum, int daysOfReservation, boolean isReserved, double bedPrice) {
        super(roomNum, daysOfReservation, isReserved, roomPrice);
        this.sc = new Scanner(System.in);
        NumOfBeds = numOfBeds;
        Standard.roomPrice = roomPrice;
        Standard.bedPrice = bedPrice;
    }

    public static void availableRoom(ArrayList<String> lines) {
        int j = 0;
        Standard s = new Standard();

        for(int i = 0; i < lines.size(); ++i) {
            if (((String)lines.get(i)).startsWith("Standard")) {
                s.setRoomNum(Integer.parseInt(((String)lines.get(i)).substring(9, 12)));
                System.out.print("   room num.:" + s.getRoomNum());
                s.setNumOfBeds(Integer.parseInt(((String)lines.get(i)).substring(13, 14)));
                System.out.print("  num.of bed:" + s.getNumOfBeds());
                s.setBedPrice((double)Integer.parseInt(((String)lines.get(i)).substring(15, 17)));
                System.out.println("  Room price :" + s.getBedPrice());
                s.setDaysOfReservation(0);
                s.setIsReserved(false);
                q.add(j, s);
                ++j;
            }
        }

    }

    public void reserve() {
        int j = 0;
        StandardRoom s = new StandardRoom();
        System.out.println("enter room number:");
        s.setRoomNum(this.sc.nextInt());
        System.out.println("Enter Days of reservation:");
        s.setDaysOfReservation(this.sc.nextInt());
        s.setIsReserved(true);
        System.out.println("enter number of bed:");
        s.setNumOfBeds(this.sc.nextInt());
        System.out.println("enter bed price:");
        s.setBedPrice((double)this.sc.nextInt());
        s.setRoomPrice(s.getDaysOfReservation() * s.getBedPrice() * s.getNumOfBeds());
        System.out.println("The price of bed is: " + s.getRoomPrice());
        q.add(j, s);
        a.add(j, s);
        j++;
    }

    public void TotalPrice() {
        double total = 0.0D;
        StandardRoom s = new StandardRoom();
        double v = this.getRoomPrice() + total;

        for(int i = 0; i < a.size(); ++i) {
            double v1 = this.getRoomPrice() + total;
            total += this.getRoomPrice();
        }

        System.out.println("total price:" + total);
    }

    public void reservedOrNot() {
        boolean zz = false;
        System.out.println("Enter room number");
        int hh = this.sc.nextInt();

        for(int i = 0; i < q.size(); ++i) {
            if (hh == ((Room)q.get(i)).getRoomNum()) {
                if (((Room)q.get(i)).getIsReserved()) {
                    zz = true;
                }

                if (!((Room)q.get(i)).getIsReserved()) {
                    zz = false;
                }
            }
        }

        if (zz) {
            System.out.println("***Room  reserved ****");
        }

        if (!zz) {
            System.out.println("***Room  not reserved ****");
        }

    }

    public void checkOut() {
        System.out.println("enter room number :");
        int c = this.sc.nextInt();

        for(int i = 0; i < a.size(); ++i) {
            if (c == ((Room)a.get(i)).getRoomNum()) {
                a.remove(a.get(i));
                System.out.println("DONE");
            }
        }

    }

    public String toString() {
        String var10000 = super.toString();
        return "StandardRoom{" + var10000 + "NumOfBeds=" + this.getNumOfBeds() + ", roomPrice=" + this.getRoomPrice() + "}";
    }

    public void display() {
        for(int i = 0; i < a.size(); ++i) {
            System.out.println(a.get(i));
        }

    }
}
