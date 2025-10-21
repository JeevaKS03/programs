package programs;

public class leap_year {
    public static void main(String[] args) {
        int year = 2016;
        if (year%400==0 || (year%100!=0 && year%4==0)){
            System.out.println("The year "+year+" is leap year");
        }
        else{
            System.out.println("The year "+year+" is not leap year");
        }
    }
}
