public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();


        int weight = 200;  // вес
        int height = 180;  //рост
        int result = service.calculete(weight, height);
        System.out.println(result);

    }
}
