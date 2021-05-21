import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınız: ");
        int year = input.nextInt();
        int x = year % 12;
        String burc;
        if (year>0){
            switch (x) {
                case 0:
                    burc = "Maymun";
                    break;
                case 1:
                    burc = "Horoz";
                    break;
                case 2:
                    burc = "Köpek";
                    break;
                case 3:
                    burc = "Domuz";
                    break;
                case 4:
                    burc = "Fare";
                    break;
                case 5:
                    burc = "Öküz";
                    break;
                case 6:
                    burc = "Kaplan";
                    break;
                case 7:
                    burc = "Tavşan";
                    break;
                case 8:
                    burc = "Ejderha";
                    break;
                case 9:
                    burc = "Yılan";
                    break;
                case 10:
                    burc = "At";
                    break;
                case 11:
                    burc = "Koyun";
                    break;
                default:
                    burc = "null";
            }
            System.out.println("Çin Zodyağı Burcunuz: " + burc);
        } else {
            System.out.println("Yıl değeri eksili değer alamaz.");
        }
    }
}
