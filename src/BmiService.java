public class BmiService {
    public int calculete(int weight, int height) {
        int m = weight * 10000;     //вес          // m / (h*h)
        int h = height * height;    //рос
        int result = m / h;
        return result;

    }

}
