import java.util.Arrays;
//import java.lang.*;

public class s9 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        int a1l = a1.length;
        int a2l = a2.length;
        int[] summ = new int[a1l + a2l];
        System.arraycopy(a1, 0, summ, 0, a1l);
        System.arraycopy(a2, 0, summ, a1l, a2l);

        //Самодельное заполнение массива summ из a1
        //for (int i = 0; i <= (a1.length - 1); i++){
        //    summ[i] = a1[i];
        //}
        //Самодельное заполнение массива summ из a2
        //for (int i = a1.length; i <= (summ.length - 1); i++){
        //    summ[i] = a2[i - a1.length];
        //}
        int summl = summ.length;
        System.out.println(summl);
        System.out.println(Arrays.toString(summ));
        // Попробовать реализовать последнюю из https://habrahabr.ru/post/204600/
        int shag = 0;
        int izm = 0;

        // Сортировка расчёской
        // и ... не работает, пишет
        // Failed test #1. Wrong answer
        // БЛИН!
        double d = summl / 1.247;
        int di = (int) (d + 0.5);
        /*System.out.println(di);
        d = di / 1.247;
        di = (int) (d + 0.5);
        System.out.println(di);*/
        int check = 0;
        int i = 0;
        //for (int i = 0; i < summl; i++){
        while (i == 0){
            System.out.println("Step: " +  shag++ + " " + Arrays.toString(summ));
            if (di != check & di > 1){
                check = di;
                for (int k = 0; (k + di) < summl; k++){
                    if (summ[k] > summ[k + di]){
                        int tmp = summ[k];
                        summ[k] = summ[k + di];
                        summ[k + di] = tmp;
                        System.out.println("Change (ras): " +  izm++ + " " + Arrays.toString(summ));
                    }
                }
                d = di / 1.247;
                di = (int) (d + 0.5);
                System.out.println("di = " +  di + " " + Arrays.toString(summ));
            }
            else {
                for(int t = 0; t < (summl - 1); t++){
                    if (summ[t] > summ[t + 1]){
                        int tmp = summ[t];
                        summ[t] = summ[t + 1];
                        summ[t + 1] = summ[t];
                        System.out.println("Change (puz): " +  izm++ + " " + Arrays.toString(summ));
                    }
                }
                i = 1;
            }
        }

        /*for (int i = 0; i < (summl - 1); i++){
           // Первый вариант, которому требуется 27 шагов цикла и 12 изменений в массиве [6, 8, 1, 3, 0, 0] для сортировки по возрастанию
           //if (summ[i] > summ[i + 1]){
           //    int tmp = summ[i];
           //    summ[i] = summ[i + 1];
           //    summ[i + 1] = tmp;
           //    i = i - 2;
           //    if (i == -2){
           //        i++;
           //    } 
           //    izm++;
           //    System.out.println("Change: " +  izm + " " + Arrays.toString(summ));
           //}

           // Второй вариант, которому требуется 5 шагов цикла и 12 изменений в массиве [6, 8, 1, 3, 0, 0] для сортировки по возрастанию
           for (int k = i; k < (summl - 1); k++){
               if (summ[i] > summ[k + 1]){
                   int tmp = summ[i];
                   summ[i] = summ[k + 1];
                   summ[k + 1] = tmp;
                   izm++;
                   System.out.println("Change: " +  izm + " " + Arrays.toString(summ));
               }
           }
           shag++;
           //System.out.println("Step: " +  shag + " " + Arrays.toString(summ));
        }*/
        System.out.println(Arrays.toString(summ));
        return summ;
    }
}
