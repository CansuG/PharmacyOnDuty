public class Pharmacy {
    static double[] Phar_x_coordinates={4, 50, 8, 12, 5, 20, 53, 85, 3, 47};
    static double[] Phar_y_coordinates={8, 10, 55, 20, 31, 30, 12, 40, 45, 5};
    static String[] name_array={"Alice Pharmacy"," Berthold Pharmacy","Chandler Pharmacy"
            ,"Daniel Pharmacy","Emily's Pharmacy","Fritz Pharmacy","Gaby Pharmacy","Helen Pharmacy",
            "Indra Pharmacy","Janice Pharmacy" };
    static String[] address={"939  West Side Avenue , GORE SPRINGS , Mississippi ",
            "343  Heron Way , Portland , Oregon ",
            "3745  Pinnickinnick Street , New Brunswick , New Jersey ",
            "4850  Briarhill Lane , Cuyahoga Falls , Ohio ",
            "4327  Rodney Street , Saint Louis , Missouri ",
            "189  Coolidge Street, RUBY , New Jersey ",
            "75  Bryan Avenue, Eagan, Minnesota ",
            "3224  Rainbow Drive, Columbiana , Ohio ",
            "2107  Little Acres Lane , Jacksonville , Illinois ",
            "2424  Fieldcrest Road , Shoreham, New York "};
    static String[] telephoneNumber={"518-791-8686","216-857-5196", "248-867-0461",
            "347-320-7626","360-739-6111","706-732-7983",
            "248-388-7858","513-884-1152","717-515-4178","917-660-9902"};
    static String[] workingHours={"Monday to Friday 08:00 am to 04:30 pm",
            "Monday to Friday 08:00 am to 04:30 pm",
            "Monday to Friday 09:00 am to 05:30 pm",
            "Monday to Friday 10:00 am to 06:30 pm",
            "Monday to Sunday 08:00 am to 04:00 pm",
            "Monday to Friday 08:00 am to 12:30 pm",
            "Monday to Friday 07:00 am to 05:00 pm",
            "Monday to Friday 08:30 am to 04:30 pm",
            "Monday to Friday 09:30 am to 04:30 pm",
            "Monday to Saturday 08:00 am to 02:30 pm"};


    public static void listInfo(){
        System.out.println("\nThe top 3 closest pharmacies to you with their information: ");
        Location.calculateDistance();

    }

}