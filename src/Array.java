public class Array {
}
 void main(String[] args) {
     // 2 olculu array (3 sətir, 4 sütun)
     /*int[][] matrix = {
             {1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12}
     };

     // Çap

     for (int i = 0; i < matrix.length; i++) { // sətirlər
         for (int j = 0; j < matrix[i].length; j++) { // sütunlar
             System.out.print(matrix[i][j] + " ");
         }
         System.out.println(); // her setirden sonra alt setire dusmek
     } */

     // Ev tapsiriqlari:
     // Task 1:
     /*

        int[] array1 = {1, 3, 4, 9, 15};
        int[] array2 = {2, 3, 5, 9, 14};

        System.out.print("Ortaq elementlər: ");

        for (int num1 : array1) {         // array1-in hər elementini götür
            for (int num2 : array2) {     // array2-də axtar
                if (num1 == num2) {       // əgər elementlər eynidirsə
                    System.out.print(num1 + " ");
                }
            }

       */
     //Task 2:
     int [] array1 = {1, 3, 4, 9, 15};
     int sum = array1[0] + array1[1] + array1[2] + array1[3] + array1[4];
     double average = (double) sum / array1.length;
     System.out.println("Ortalama 1: " + average );

     int [] array2 = {2, 3, 5, 9, 14};
     int cem = array2[0] + array2[1] + array2[2] + array2[3] + array2[4];
     double ortalama = (double) cem / array2.length;
     System.out.println("Ortalama 2: " + ortalama);
 }

