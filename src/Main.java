public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(55.0f, 1.83f);

        System.out.format("Индекс массы тела равен %.2f.", index);
    }
}
