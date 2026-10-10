public class Countryswitch {
    public static void main(String[] args) {
        String country = "Bangladesh";
        switch (country) {
            case "Bangladesh":
                System.out.println(" The capital isDhaka");
                break;
            case "India":
                System.out.println("The capital is New Delhi");
                break;
            case "Pakistan":
                System.out.println("The capital is Islamabad");
                break;
            case "Nepal":
                System.out.println("The capital is Kathmandu");
                break;
            default:
                System.out.println("Unknown Country");
        }
    }
}
