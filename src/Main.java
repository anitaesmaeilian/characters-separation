import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=0,z=0;
        StringBuilder chars = new StringBuilder();

        String str = sc.nextLine();
        char[] arr = new char[str.length()];

        for (int i=0 ; i<str.length();i++)
            arr[i] = str.charAt(i);

        for(int i=0;i< arr.length;i++)
        {
            if (arr[i] > 47 && arr[i] < 58)
                j++;
            else
                continue;
        }
        char[] numsarr = new char[j];

        for(int i=0;i< arr.length;i++)
        {
            if (arr[i] > 47 && arr[i] < 58)
            {
                numsarr[z] = arr[i];
                z++;
            }
            else if ((arr[i] > 64 && arr[i] < 91)  || (arr[i] > 96 && arr[i] < 123))
                chars.append(arr[i]);
            else
                continue;
        }
        Arrays.sort(numsarr);
        Arrays.toString(numsarr);
        System.out.println(chars);
        System.out.println(numsarr);

    }


}
