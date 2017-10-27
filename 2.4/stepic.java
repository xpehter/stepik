import java.util.Arrays;

class stepic {
    public static void main(String[] args) {
        //System.out.println(s8.factorial(1));
        //System.out.println(s9.mergeArrays(new int[] {6, 8}, new int[] {1, 3, 0, 0}));
        //System.out.println(s9.mergeArrays(new int[] {}, new int[] {1, 5, 2, 0}));
        //System.out.println(s9.mergeArrays(new int[] {}, new int[] {}));
        
        // Длинна тестового массива
        int dtm = 50;
        int [] tmsj = new int [dtm];
        int [] tmsi = new int [dtm];
        
        // Заполняем массивы
        for (int i = 0; dtm > i; i++) {
            tmsj[i] = tmsi[i] = (int) (Math.random() * 10);
        }
        // Массивы заполнеы одинаково?
        System.out.println("Odinakovo?: " + Arrays.equals(tmsj, tmsi));

        Arrays.sort(tmsj);
        System.out.println(Arrays.toString(tmsj));
        
        System.out.println(s9.mergeArrays(tmsi, new int[] {}));
        System.out.println(Arrays.equals(tmsj, tmsi));
    }
}
