import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cannang, chieucao, bmi;
        System.out.println("nhap can nang ");
        cannang = scanner.nextDouble();
        System.out.println("nhap chieu cao");
        chieucao = scanner.nextDouble();
        bmi = cannang/(chieucao*chieucao);
        if (bmi < 18) {
            System.out.println("thieu can");
        } else if (bmi < 25){
            System.out.println("binh thuong");
        }else if (bmi < 30){
            System.out.println("thua can");
        }else {
            System.out.println("beo phi");
        }
    }
}
