public class Application  {
    static String APHA = "American Public Health Association";
    static int openingYear = 1872;
    static String closingLine = "Stay home, stay healthy!";

    public static void open() {
        System.out.println("\n"+APHA + " - since " + openingYear);

    }

    public static void close() {
        System.out.println("\n" + closingLine);

    }

    public static void main(String[] args) {
        open();
        Pharmacy.listInfo();
        SearchSection.search_name("Alice Pharmacy");
        SearchSection.search_state("New Jersey");
        Button.copy_direct_telNumber();
        Button.copy_direct_address();
        close();


    }
}