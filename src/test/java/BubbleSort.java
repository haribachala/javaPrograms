public class BubbleSort {

    public static void main(String[] args) {
        int [] numbers ={2,5,1,0,2,8};
        boolean numbersSwitched;
        int COUNT =0;
       do {

            numbersSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbersSwitched = true;
                }
                ++COUNT;
            }
        } while (numbersSwitched);
        for (int j :numbers) {
            System.out.println(j);
        }
        System.out.println("i= " +COUNT);
        }

        }


