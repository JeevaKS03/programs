package programs;

public class simple_interest_compound_interest {
    public static void main(String[] args) {
        double p=10000; //principal amount
        double r=2; //rate of interest
        double t=10; //time period

        double SI = (p*r*t)/100;
        double n=2; //number of times compounded
        double CI = p * Math.pow((1+(r/(100*n))),(n*t)) - p;
        System.out.printf("Simple Interest: %.2f\n",SI);
        System.out.printf("Compound Interest: %.2f\n",CI);
    }
}
