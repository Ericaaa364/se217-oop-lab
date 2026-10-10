public class AgeCategory {
    public static void main(String[] args) {
        int age = 22;
        if (age < 1) {
            System.out.println("You are an infant");
        }
        else if (age <= 12){
            System.out.println("You are a child");
        }
        else if (age <=19) {
            System.out.println("You are a teenager");
        }
        else if (age <= 59) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are a senior citizen");
        }
    }

}
