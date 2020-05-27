import java.util.Arrays;

public class BubbleSort {
	static void sortArrayAsc(int[]studentGrades) {
		int n = studentGrades.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(studentGrades[j-1] > studentGrades[j]) {
					temp = studentGrades[j-1];
					studentGrades[j-1] = studentGrades[j];
					studentGrades[j] = temp;
				}
			}
		}
	}
	
	static void sortArrayDesc(int[]studentGrades) {
		int n = studentGrades.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(studentGrades[j-1] < studentGrades[j]) {
					temp = studentGrades[j-1];
					studentGrades[j-1] = studentGrades[j];
					studentGrades[j] = temp;
				}
			}
		}
	}
	static void printArray() {
		
	}
	public static void main(String[] args) {
		int studentGrades[] = {65, 95, 75, 55, 56, 90, 88, 97, 78};
		
		sortArrayAsc(studentGrades);
		
		System.out.println("Bubble Sort Ascending: ");
		for(int i = 0; i < studentGrades.length; i++) {
			System.out.print(studentGrades[i] + " ");	
		}
		System.out.println(" ");
		
		sortArrayDesc(studentGrades);
		
		System.out.println("Bubble Sort Descending: ");
		for(int i = 0; i < studentGrades.length; i++) {
			System.out.print(studentGrades[i] + " ");
		}
		}
	}

