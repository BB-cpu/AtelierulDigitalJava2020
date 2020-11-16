package lab1;

public class challenge1 {
    public static void main(String[] args) {
        System.out.print("Callenge1");

        for(int i=1;i<=100;i++){
            if(i%3!=0 && i%5!=0) {
                System.out.print(i);
                continue;
            }
            if(i % 3 == 0){
                System.out.print("frizz");
            }
            if (i % 5 == 0){
                System.out.print("buzz");
            }
            System.out.print(", ");


        }
    }
}
