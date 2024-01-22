//public class HienThiNguyenTo20 {
//    public static void main(String[] args) {
//        int count = 0;
//        if (num<2) {
//            System.out.println("Không phải số nguyên tố");
//        } else {
//            for (int i=2; i<=Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    count++;
//                }
//            }
//            if (count == 0) {
//                System.out.println(num + " là số nguyên tố");
//            } else {
//                System.out.println("Không phải số nguyên tố");
//            }
//        }
//    }
//}
public class HienThiNguyenTo20 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("20 số nguyên tố đầu tiên là:");
        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}