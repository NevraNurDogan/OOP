public class Soru4 {
        public static void main(String[] args) {
            double pi = Math.PI;
            int count = 0;

            for (int x = 11; count < 10; x++) {
                for (int y = 11; y <= x; y++) {
                    double leftSide = pi * Math.sqrt(x) * y;
                    double rightSide = x * Math.log(y);
                    if (leftSide > rightSide) {
                        System.out.println("x = " + x + ", y = " + y + " uygun bir çözümdür.");
                        count++;
                    }
                }
            }
        }
}
