import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Location extends Pharmacy {
    static Double[] distance=new Double[10];
    static double x_coordinates = (Math.random() * 100);
    static double y_coordinates = (Math.random() * 100);

    public static void calculateDistance() {
        //will take input from Pharmacies coordinates

        ArrayList list=new ArrayList();
        Map information =new LinkedHashMap();

        for (int i = 0; i < 10; i++) {
            distance[i] = Math.pow((Math.pow(Phar_x_coordinates[i] - x_coordinates, 2) +
                    Math.pow(Phar_y_coordinates[i] - y_coordinates, 2)), 0.5);
            //System.out.println(distance[i]);
            list.add(distance[i]);
            information.put(distance[i],"Name: "+name_array[i]+"  Address: "+address[i]+
                    "  Telephone Number: "+telephoneNumber[i]+"  Working Hours: "+workingHours[i]);
        }

        Collections.sort(list);

        for(int i =0;i<3;i++){
            System.out.println("\t"+information.get(list.get(i)));
        }

    }

}