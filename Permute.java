import java.util.Arrays;

public class Permute {

    static void swap(int a[], int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }

    static void permute(int a[], int currentIndex) {
	if (currentIndex == a.length-1) {
	    // if currentIndex is last index, there is nothing to swap so prints the array
	    System.out.println(Arrays.toString(a));
	    return;
	}

	for(int i = currentIndex; i < a.length; i++) {
	    swap(a, currentIndex, i);
	    permute(a, currentIndex+1);
	    swap(a, currentIndex, i);
	}
    }

    public static void main(String[] args) {
	int a[] = {3,4,5,9};
	permute(a, 0);

    }

}
