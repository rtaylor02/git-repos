package chapter5.lesson2point4;

public class Main {
    public static void main(String[] args) {
        //region
//        int[][] iaa = {
//                {1, 3, 5,},
//                {11, 4,},
//                {12, 13, 45, 23,},
//                {13, 33, 35,},
//        };

//        show2DimensionaArray(iaa);
        //endregion

        //region
//        show2DimensionaArray(new int[][] {
//                {1, 3, 5,},
//                {11, 4,},
//                {12, 13, 45, 23,},
//                {13, 33, 35,},
//        });
        //endregion

        //region
        int[][][] iaaa = new int[2][][];
        iaaa[0]= new int[3][];
        iaaa[0][0] = new int[]{1, 2, 3,};
        iaaa[0][1] = new int[]{11, 12,};
        iaaa[0][2] = new int[]{21,};
        show2DimensionaArray(iaaa[0]);
        //endregion
    }

    //region show2DimensionaArray
    private static void show2DimensionaArray(int[][] iaa) {
        System.out.println("Array contains: ");
        // Extract major array
        for (int i = 0; i < iaa.length; i++) {
            System.out.print(iaa[i].length + " items: ");
            for (int j = 0; j < iaa[i].length; j++) {
                System.out.print(" " + iaa[i][j]);
            }
            System.out.println();
        }
        System.out.println("==========================");
    }
    //endregion
}
