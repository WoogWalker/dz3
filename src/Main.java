import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {

        int menuSelect;
        boolean menuStatus = true;

        while (menuStatus){
            System.out.println("task # 1");
            System.out.println("task # 2");
            System.out.println("task # 3");

            menuSelect = sc.nextInt();

            switch (menuSelect){
                case 1:
                    firstTak();
                    break;

                case 2:
                    break;

                case 3:
                    break;
            }
        }
    }

    public static void firstTak (){
        System.out.println("arr size .. ");
        int arrSize = sc.nextInt();

        int [] intArr = new int[arrSize];

        for (int i = 0; i < intArr.length; i++){
            System.out.println("arr index " + i + " = ..");
            intArr[i] = sc.nextInt();
        }


        int minNum = intArr[0];
        int maxNum = intArr[0];

        for (int i = 0; i < intArr.length; i++){
            if (minNum > intArr[i]){
                minNum = intArr[i];
            }

            if (maxNum < intArr[i]){
                maxNum = intArr[i];
            }
        }
        System.out.println("min number = " + minNum);
        System.out.println("max number = " + maxNum);

        int[] counter = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            counter[intArr[i]]++;
        }

        System.out.println("value\tcount");

        for (int i = 0; i < intArr.length; i++ ){
            System.out.println(i);
        }

        int tmp = 0;

        for (int i = 0; i < intArr.length; i++){
            for (int y = 0; y < intArr.length-1; y++){
                if (intArr[y] > intArr[y+1]){
                    tmp = intArr[y];
                    intArr[y] = intArr[y+1];
                    intArr[y+1] = tmp;
                }
            }
        }

        System.out.println("sort array min > max:");

        int counter1 = 0;

        for (int i = 0; i < intArr.length; i++){
            if (intArr [i] == 5){
                counter1++;
            }
            System.out.println(intArr[i]);
        }

        System.out.println("число 5 встречается: " + counter1);

    }
}