public class Main {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * 66) - 15;
                    System.out.println(randomNum);
        }
        System.out.println(LuckyNumbers.getLuckyNumbers());
    }
}