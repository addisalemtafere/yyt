package djava;

/**
 *
 * @author addisalem
 */
public class DJava {

    /**
     * @param args the command line arguments
     * @return
     */
    public static int[] fix45(int[] nums) {
        int[] value = nums;
        int[] sorted;
        int start = 0, k;

        for (int i = 0; i < value.length; i++) {
            if (value[i] == 4 && value[i + 1] != 5) {

                Boolean check = true;
                for (int j = start; j < value.length && check == true; j++) {

                    if (value[0] == 5) {
                        k = j + 1;
                    } else {
                        k = j;
                    }

                    if (value[j] == 5 && value[k - 1] != 4) {

                        value[j] = value[i + 1];

                        value[i + 1] = 5;
                        check = false;

                        start = j + 1;

                    }
                }

            }
        }

        return value;
    }

    public static void main(String[] args) {
        int[] data = new int[]{5, 2, 4, 7, 5, 8,};
        int[] value = fix45(data);
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + ",");
        }

    }
}
