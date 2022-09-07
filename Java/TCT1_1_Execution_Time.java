package Java;

import java.util.Arrays;

public class TCT1_1_Execution_Time {
    public static void main(String[] args) {
        int[] array = new int[10000];


        // 반복문을 통한 선택 정렬 프로그램 소스코드

        for (int i = 0; i < 10000; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("선택 정렬 성능 측정: " + (endTime - startTime));


        // 기본 정렬 라이브러리 사용

        for (int i = 0; i < 10000; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }

        startTime = System.currentTimeMillis();

        Arrays.sort(array);

        endTime = System.currentTimeMillis();
        System.out.println("기본 정렬 라이브러리 측정: " + (endTime - startTime));
    }
}