import java.util.Arrays;

class stepic {

    public static void main(String[] args) {
        //System.out.println(s8.factorial(1));
        //System.out.println(s9.mergeArrays(new int[] {6, 8}, new int[] {1, 3, 0, 0}));
        //System.out.println(s9.mergeArrays(new int[] {}, new int[] {1, 5, 2, 0}));
        //System.out.println(s9.mergeArrays(new int[] {}, new int[] {}));


        // Произвольная длинна тестового массива
/*
        int dtm = 1000;
        int[] one = new int[1 + (int) (Math.random() * dtm)];
        int[] two = new int[1 + (int) (Math.random() * dtm)];
*/



        // Постоянная длинна тестового массива
        int dtm = 1000;
        int[] one = new int[dtm];
        int[] two = new int[dtm];



        // Заполняем массивы
        for (int i = 0; i < one.length; i++) {
            one[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(one);
        //System.out.println(Arrays.toString(one));
        for (int i = 0; i < two.length; i++) {
            two[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(two);
        //System.out.println(Arrays.toString(two));
        // Массивы заполнеы одинаково?
        //System.out.println("Odinakovo?: " + Arrays.equals(one, two));

        //Без сортировки сливаем оба массива в один
        int dlinna_one = one.length;
        int dlinna_two = two.length;
        int[] itogoviy_test_mas = new int[dlinna_one + dlinna_two];
        System.arraycopy(one, 0, itogoviy_test_mas, 0, dlinna_one);
        System.arraycopy(two, 0, itogoviy_test_mas, dlinna_one, dlinna_two);


        Arrays.sort(itogoviy_test_mas);
        //System.out.println("Ne moya sortirovka");
        //System.out.println(Arrays.toString(one));

        //System.out.println(Arrays.toString(s9.mergeArrays(two, new int[]{})));
        System.out.println("Rabotaet moya sortirovka:");
        System.out.println(Arrays.equals(itogoviy_test_mas, s9.mergeArrays(one, two)));
    }

}
