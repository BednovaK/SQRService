package ru.netology.sqr;

public class SQRService {
    public int calculateNumbers(int start, int finish) {
        int count = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= start && i * i <= finish) {
                count++;
            }
        return count;

    }
}