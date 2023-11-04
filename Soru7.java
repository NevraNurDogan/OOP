public class Soru7 {
        public static void main(String[] args) {
            String kelime = "45abcxcba36_";

            kelime = kelime.replaceAll("[^a-zA-Z]", ""); // Harf olmayan karakterleri temizle

            int bas = 0;
            int son = kelime.length() - 1;

            while (bas < son) {
                if (kelime.charAt(bas) != kelime.charAt(son)) {
                    kelime = kelime.substring(0, son) + kelime.charAt(bas) + kelime.substring(son);
                }
                bas++;
                son--;
            }

            System.out.println("Palindrom kelime: " + kelime);
        }
    }


