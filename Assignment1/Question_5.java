public class Question_5 {
    public static void main(String[] args) {

        double[] weights= {50, 60, 80.50, 38.34, 65.45, 105.80, 90.87, 30.38, 67.38, 84.26};
        double totalWeight = sum(weights);
        double average= totalWeight/weights.length;
        System.out.println("Average weight of the give "+weights.length+" people is "+ average);
    }

    public static double sum(double[] values)
    {
        double total=0;

        for(double weight:values)
            total+=weight;

        return total;
    }
}