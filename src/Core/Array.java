package Core;

import View.InputArr;
import View.OutputArr;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Array implements InputArr, OutputArr {
    int[] arr;

    @Override
    public void inputArr() {
        System.out.println("������� ����������� �������");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) arr = new int[scanner.nextInt()];
        else  throw new InputMismatchException("������! ����������� ������� ������ ���� �������������");

        System.out.println("������������� ������ �������������? � ��� �?");
        if (!scanner.hasNext("�") && !scanner.hasNext("�")) throw new InputMismatchException("������! ������ �� ���������� �����");
        else {

            if (scanner.next().equals("�")) {
                for (int i = 0; i < arr.length; i++) {
                    Random random = new Random();
                    arr[i] = random.nextInt(100);
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("������� ��������� ����� �������:");
                    arr[i] = scanner.nextInt();
                }
            }
        }
        System.out.println("�������� ������:");
        this.printArr();
    }

    @Override
    public void printArr() {
        for (Integer x: this.arr) {
            System.out.printf("%d ", x);
        }
    }
}
