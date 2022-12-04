public class BmiService {
    public static float calculate(float m, float h) {
       float height =  h *  h;  // h в квадрате
       float bmi = m / height; // м делить на h в квадрате
       return bmi;

    }
}
