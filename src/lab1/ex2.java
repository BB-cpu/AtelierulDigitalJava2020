package lab1;

public class ex2  {
    public static void main(String[] args) {
        System.out.print("ex2 ");
        compute();
    }
    public static void compute(){
        for(int i=1;i<=53;i++){
            if(i%3!=0 && i%5!=0 && i%7!=0) {
                System.out.print(i);
            }
            if(i % 3 == 0){
                System.out.print("FooFoo");
            }
            if (i % 5 == 0){
                System.out.print("BarBar");
            }
            if (i % 7 == 0){
                System.out.print("QixOix");
            }
            System.out.print(", ");
        }
    }
}

