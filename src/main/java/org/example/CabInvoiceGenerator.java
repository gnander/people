package org.example;

    public class CabInvoiceGenerator {
        public static final double costperkm = 10.0;
        public static final double costpermin = 1.0;
        public static final double min_fare =5;

        public double calculateFare(double distance,int time){    // 20   5 = 25
//                              2 * 10        +  5 *1
            double totalfare = (distance*costperkm)+(time*costpermin);
            if(totalfare<5){
                return min_fare;
            }
            return totalfare;  //25
        }
}
