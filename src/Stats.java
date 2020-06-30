/**
 * The purpose of this class is to analyze the values of 
 * the grade and calculate it to provide the mean and medium.
 * @author Thien Nguyen
 * 
 */
public class Stats {

	private int grades[];
	private int count;
	
	/**
	 * Constructor for the grades array. It initialize an array for containing grades and the count
	 * to keep track of the number of grade input.
	 */

	public Stats() {
		grades = new int[100];
		count = 0;
	}
	/**
	 * add() allows the user to input the grade and store it into the pre defined array and update the counter as it goes.
	 * @param grade : is the grade that the user input.
	 */
	public void add(int grade) {
		this.grades[this.count] = grade;
		this.count += 1;
	}
	/**
	 * getMean() calculates the mean of the total grades that input into the array.
	 * For loops was used because the bound and condition is known.
	 * @return mean : The calculated mean
	 */
	public double getMean() {
		double mean;
		double sum = 0;
		for(int i =0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		mean = sum/this.count;
		return mean;
	}

	/**
	 * INSERTION SORT OF THE FIRST n ELEMENTS OF ARRAY arr 
	 * SEE PAGE 407 TO PAGE 410
	 * FOR A DISCUSSION
	 * 
	 * @param grades
	 * @param count
	 */
	public void sort(int[] grades, int count) {
		int temp, j, k;
		for (j = 1; j < count; j++) {
			temp = grades[j];
			for (k = j - 1; (k >= 0) && (grades[k] > temp); k--) {
				grades[k + 1] = grades[k];
			}
			grades[k + 1] = temp;
		}
	}
	/**
	 * this method will find the median and return it to the user based on the user input
	 * @return median : the evaluated median
	 */
	public double getMedian() {
		/**first step is to sort the array in ascending order.
		 * this is done using the sort function
		*/
		sort(this.grades,count);
		double median;
		/**
		 * variable middle in initialize to find the approximate middle.
		 * The variable is an int so that the result will be truncated.
		 */
		int middle = count/2;
		/**
		 * The modulus operator is used to identify if the count is odd or even.
		 */
		if((count%2) == 0) {
			/**
			 * Because the array index starts at 0, middle represents the upper bound index of the median
			 * It is then subtracted to get the lower bound index of the median and an average will be taken.
			 */
			median = ((grades[middle]+grades[middle-1])/2);
		}
		else {
			/**
			 * if the count is odd, then the median is simply the middle.
			 */
			median = grades[middle];
		}
		return median;
	}
	/**
	 * toString() allows the class to print the result to the user in a string form.
	 */
	public String toString() {
		sort(grades, count);
		String gradeList= "";
		for(int i = 0; i < count;i++) {
			String g = grades[i]+ " ";
			gradeList = gradeList+g;
		}
		return("The grade list is below:\n"+ gradeList+"\n"+"The mean is: "+ getMean()+ "\n"+"The median is: "+ getMedian());
	}
}
