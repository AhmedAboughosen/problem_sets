import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelBookings {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(20);
        arrayList1.add(42 );
        arrayList1.add(24);
        arrayList1.add(28);


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(28);
        arrayList2.add(35);
        arrayList2.add(36);
        arrayList2.add(30);
        System.out.println(hotel(arrayList1, arrayList2, 4));
    }

    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

        int n=arrive.size();
        Collections.sort(arrive);
        Collections.sort(depart);
        for(int i=0;i<n-K;i++)
        {
            if(arrive.get(i+K)<depart.get(i))
                return false;
        }
        return true;

//        List<Hotel> hotelList = new ArrayList<>();
//        for (int i = 0; i < arrive.size(); i++) {
//            hotelList.add(new Hotel(arrive.get(i), depart.get(i)));
//        }
//
//        Collections.sort(hotelList);
//
//        int max = hotelList.get(0).getDepart();
//        int c = K - 1;
//        int start = 0;
//        for (int i = 1; i < hotelList.size(); i++) {
//
//            if (hotelList.get(i).getArrive() >= max) {
//                c = K - 1;
//                start = i + 1;
//                max = hotelList.get(i).getDepart();
//                continue;
//            }
//
//            for (int j = i - 1; j >= start; j--) {
//                if (hotelList.get(j).getDepart() <= hotelList.get(i).getArrive()) {
//                    ++c;
//                }
//            }
//
//            if (c-- == 0) return false;
//
//        }
//        return true;
    }
}

class Hotel implements Comparable<Hotel> {

    private int arrive;
    private int depart;

    Hotel(int arrive, int depart) {
        this.arrive = arrive;
        this.depart = depart;
    }

    public int getArrive() {
        return arrive;
    }

    public int getDepart() {
        return depart;
    }

    public int compareTo(Hotel hotel) {

        int compareArrive = ((Hotel) hotel).getArrive();

        //ascending order
        return this.arrive - compareArrive;


    }
}
