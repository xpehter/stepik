import java.util.Arrays;
public class s9 {
    public static int[] mergeArrays(int[] a1, int[] a2) {

        //Создаём итоговый массив необходимой длинны
        int dlinna_a1 = a1.length;
        int dlinna_a2 = a2.length;
        int[] itogoviy_mas = new int[dlinna_a1 + dlinna_a2];

        int k = 0;
        int a1n = 0;
        int a2n = 0;

        //Сортировка слиянием
        while (a1n < dlinna_a1 && a2n < dlinna_a2) {
            if (a1[a1n] >= a2[a2n]) {
                itogoviy_mas[k] = a2[a2n];
                a2n++;
                k++;
            } else {
                itogoviy_mas[k] = a1[a1n];
                a1n++;
                k++;
            }
        }

        //Если в одном из исходных массивов остались элементы,
        //копируем их в отсортированный массив
        if (a1n == dlinna_a1) {
            System.arraycopy(a2, a2n, itogoviy_mas, k, itogoviy_mas.length - k);
        }
        if (a2n == dlinna_a2) {
            System.arraycopy(a1, a1n, itogoviy_mas, k, itogoviy_mas.length - k);
        }

        return itogoviy_mas;
    }
}
/*
==Реализация сортировки расчёской==
Отработало моё за 353093
Отработало чужое за 25410

Замена переменной int dlinna_itog_mas = itogoviy_mas.length; на itogoviy_mas.length;
Отработало моё за 366365
Отработало чужое за 22989

Замена типа данных double на float и
d = shag_srav / 1.247;
shag_srav = (int) (d + 0.5);
на shag_srav /= fac_um;
Отработало моё за 326628
Отработало чужое за 22497

==Реализация сортировки слиянием==
(не помню сколько элементов сортировалось,
потому лишь для понимания относительной разницы)
Отработало моё за 76575
Отработало чужое за 196473

При этом моя лучшая реализация сортировки расчёской
на Stepic набрала 38.65 баллов, а сортировка слиянием лишь 41.01 бал
*/
