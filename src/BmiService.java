public class BmiService {
    public int calculate(int weightInKg, double heightInM) {
        int result = (int) (weightInKg / heightInM / heightInM);
        return result;
    }
}
