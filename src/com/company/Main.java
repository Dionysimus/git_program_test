package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// Количество строк первой матрицы
        int m=sc.nextInt();
        // Количество столбцов в первой матрице и количество строк во второй матрице
        int k=sc.nextInt();// Количество столбцов во второй матрицы
        int Maze[][]=new int[m][k];
        int Maze1[][]=new int[m][k];
        int Maze2[][]=new int[n][k];
        for(int i=0;i<n;i++)// Вводим данные первой матрицы
        {
            for(int j=0;j<m;j++)
            {
                Maze[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)// Вводим данные второй матрицы
        {
            for(int j=0;j<k;j++)
            {
                Maze1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int u=0;u<k;u++)
            {
                for(int j=0;j<m;j++)
                {
                    Maze2[i][u]+=Maze[i][j]*Maze1[j][u];
                }
            }
        }
        for(int i=0;i<n;i++)// Вывод третьей матрицы
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(Maze2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
