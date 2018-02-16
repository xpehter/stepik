import java.util.Arrays;

public class s9 {
    public static int[] mergeArrays(int[] a1, int[] a2) {

        //Без сортировки сливаем оба массива в один
        int dlinna_a1 = a1.length;
        int dlinna_a2 = a2.length;
        int[] itogoviy_mas = new int[dlinna_a1 + dlinna_a2];
        System.arraycopy(a1, 0, itogoviy_mas, 0, dlinna_a1);
        System.arraycopy(a2, 0, itogoviy_mas, dlinna_a1, dlinna_a2);
        int dlinna_itog_mas = itogoviy_mas.length;

        //Вычисляем первоначальный разрыв между сравниваемыми элементами с учётом фактора уменьшения
        double d = dlinna_itog_mas / 1.247;
        int shag_srav = (int) (d + 0.5);

        //Сортируем до значения фактора сравнения 2, потому как 2/1.247=1,6->2
        while (shag_srav > 2) {
            int tmp;
            for (int i = 0; i + shag_srav < dlinna_itog_mas; i++) {
                if (itogoviy_mas[i] > itogoviy_mas[i + shag_srav]) {
                    tmp = itogoviy_mas[i];
                    itogoviy_mas[i] = itogoviy_mas[i + shag_srav];
                    itogoviy_mas[i + shag_srav] = tmp;
                }
            }
            d = shag_srav / 1.247;
            shag_srav = (int) (d + 0.5);
        }

        //Досортировываем при значении фактора сравнения 2 и 1
        while (shag_srav >= 1) {
            int tmp;
            for (int i = 0; i + shag_srav < dlinna_itog_mas; i++) {
                if (itogoviy_mas[i] > itogoviy_mas[i + shag_srav]) {
                    tmp = itogoviy_mas[i];
                    itogoviy_mas[i] = itogoviy_mas[i + shag_srav];
                    itogoviy_mas[i + shag_srav] = tmp;
                }
            }
            shag_srav--;
        }
        return itogoviy_mas;
    }
}

