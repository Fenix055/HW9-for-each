public class Main {
    public static void main(String[] args) {
        /// Task 1
        short[] paymentDay = new short[]{10_000, 11_000, 12_000, 13_000, 14_000};
        int sum = 0;

        for (short i : paymentDay) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        /// Task 2
        short[] paymentWeek = new short[]{10_000, 11_000, 12_000, 13_000, 14_000};
        short minWeek = 32_767;
        short maxWeek = 0;

        for (short i : paymentWeek) {
            if (i > maxWeek) {
                maxWeek = i;
            }
            if (i < minWeek) {
                minWeek = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeek + " рублей. Максимальная сумма трат за неделю составила " + maxWeek + " рублей");

        /// Task 3
        short[] paymentWeek2 = new short[]{10_000, 11_000, 12_000, 13_000, 14_000};
        sum = 0;

        for (short i : paymentWeek2) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + (float) (sum / paymentWeek2.length) + " рублей");

        /// Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (byte i = 0; i <= reverseFullName.length / 2; i++) {
            char x = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = x;
        }
        System.out.println(reverseFullName);
    }
}