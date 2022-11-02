package Java;

import java.util.Arrays;

public class TCT1_1_Execution_Time {
    public static void main(String[] args) {
        int[] array = new int[10000];


        // �ݺ����� ���� ���� ���� ���α׷� �ҽ��ڵ�

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
        System.out.println("���� ���� ���� ����: " + (endTime - startTime));


        // �⺻ ���� ���̺귯�� ���

        for (int i = 0; i < 10000; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }

        startTime = System.currentTimeMillis();

        Arrays.sort(array);

        endTime = System.currentTimeMillis();
        System.out.println("�⺻ ���� ���̺귯�� ����: " + (endTime - startTime));
    }
}