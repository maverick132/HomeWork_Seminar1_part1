package Core;

import View.InputArr;
import View.OutputArr;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Array implements InputArr, OutputArr {
    int[] arr;

    private void createRandomArr(){
        for (int i = 0; i < this.arr.length; i++) {
            Random random = new Random();
            this.arr[i] = random.nextInt(100);
        }
    }

    private void enterArr(Scanner scanner){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("������� ��������� ����� �������:");
            if (scanner.hasNextInt()) this.arr[i] = scanner.nextInt();
            else throw new InputMismatchException("���� ������� �� ����� �����");
        }
    }


    public void printElement(int index) {
        if (index > this.arr.length - 1 || index <= 0) throw new ArrayIndexOutOfBoundsException("������ ������� �� ������� �������");
        else System.out.printf("������� ����� %d � ������� ����� %d \n", index, this.arr[index]);
    }

    public void createArr(int size) {
        this.arr = new int[size];
        createRandomArr();
    }
    public void createArr(int[] tempArr) {
        this.arr = new int[tempArr.length];
        for (int i = 0; i < tempArr.length; i++) {
            this.arr[i] = tempArr[i];
        }
    }
    @Override
    public void inputArr() {
        System.out.println("������� ����������� �������");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (temp > 0) this.arr = new int[temp];
            else throw new NegativeArraySizeException("����������� ������� ������ ���� �������������");
        }
        else  throw new InputMismatchException("����������� ������� ������ ���� ����� ������");

        System.out.println("������������� ������ �������������? � ��� �?");

        if (!scanner.hasNext("�") && !scanner.hasNext("�")) throw new InputMismatchException("������ �� ���������� �����");
        else {
            if (scanner.next().equals("�"))  createRandomArr();
            else enterArr(scanner);
        }
        System.out.println("�������� ������:");
        this.printArr();
    }

    @Override
    public void printArr() {
        for (Integer x: this.arr) {
            System.out.printf("%d ", x);
        }
        System.out.println();
    }

}
