package programs;

public class hcf_lcm {
    public static void main(String[] args) {
        int num1=6;
        int num2=12;
        int lcm,hcf;
        int a=num1;
        int b=num2;
        int temp;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        hcf=a;
        lcm=(num1*num2)/hcf;
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
