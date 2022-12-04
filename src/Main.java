public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass =70.5F; // масса килограммы
        float height = 1.74F; // рост метры
        float bmi = BmiService.calculate(mass, height);
        System.out.println(bmi);

    }
}