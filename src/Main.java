public class Main {
    public static void main(String[] args) {
        int [] arr1;
        arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = ((int)(Math.random() * 100));
            System.out.println(arr1[i]);
        }
    int j = arr1[1] + arr1[2] + arr1[3] + arr1[4] + arr1[5] + arr1[6] + arr1[7] + arr1[8] + arr1[9] + arr1[0];
            System.out.println(j);
    }
    }

