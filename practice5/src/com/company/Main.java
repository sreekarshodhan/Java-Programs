package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Average of array Elements:
       /*int[] number = {1,2,3,4,5};
       int n = number.length;
       int sum = 0;
       for(int i=0; i< n; i++){
           sum+= number[i];
       }
        System.out.println("The sum of the array elements is : " +sum);
       double average = (double)(sum)/(double)(number.length);
        System.out.println("The average of array elements is : " +average);*/
    //LARGEST ELEMENT IN ARRAY:
       /*int[] num = {1,2,15,4,5,6};
       int n = num.length;
       int largest = num[0];

       for(int i=0; i<n; i++){
           if(largest < num[i]){
               largest = num[i];
           }
       }
        System.out.println("The largest number is: " +largest);*/
    // SUM OF MATRIX:
       /*int rows = 2, columns =3;
       int[][] matrix1 = {{1,2,3},{2,3,4}};
       int[][] matrix2 = {{3,4,5},{4,5,6}};

       int[][] Matrix = new int[rows][columns];
       for(int i=0; i<rows; i++){
           for(int j =0;j<columns; j++){
                Matrix[i][j] = matrix1[i][j] + matrix2[i][j];
           }
       }
       for(int[] row :Matrix){
           for(int column:row){
               System.out.print(column+ " ");
           }
           System.out.println();
       }*/
    //Multiplication of Two matrices
        /*int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }*/
    //Multiplication of Two matrices using Function
        /*int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);

        // Displaying the result
        displayProduct(product);
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }*/

    }
}
