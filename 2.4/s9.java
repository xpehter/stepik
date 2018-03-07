import java.util.Arrays;

public class s9 {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        //Без сортировки сливаем оба массива в один
        int dlinna_a1 = a1.length;
        int dlinna_a2 = a2.length;
        int[] itogoviy_mas = new int[dlinna_a1 + dlinna_a2];
        System.arraycopy(a1, 0, itogoviy_mas, 0, dlinna_a1);
        System.arraycopy(a2, 0, itogoviy_mas, dlinna_a1, dlinna_a2);

        int dlinna_itog_mas, shag_srav;
        dlinna_itog_mas = shag_srav = itogoviy_mas.length;

        //Вычисляем первоначальный разрыв между сравниваемыми элементами с учётом фактора уменьшения
        float fac_um = 1.247f;
        shag_srav /= fac_um;

        //Сортируем до значения фактора сравнения 1, потому как 1/1.247f->0
        while (shag_srav >= 1) {
            int tmp;
            for (int i = 0; i + shag_srav < dlinna_itog_mas; i++) {
                if (itogoviy_mas[i] > itogoviy_mas[i + shag_srav]) {
                    tmp = itogoviy_mas[i];
                    itogoviy_mas[i] = itogoviy_mas[i + shag_srav];
                    itogoviy_mas[i + shag_srav] = tmp;
                }
            }
            shag_srav /= fac_um;
        }
        return itogoviy_mas;
    }
}
