import java.util.Scanner;

class StudentGradeReport 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        	int studentAmount;
        	System.out.print("Enter the number of students: ");
        	studentAmount = input.nextInt();
        	String[] studentNames = new String[studentAmount];
        	int[] studentIDs = new int[studentAmount];
        	int[] testScores = new int[studentAmount];
        	double[] avg = new double[studentAmount];
        	char[] grade = new char[studentAmount];
        
        
        	for (int i = 0; i < studentAmount; i++)
        	{
            		studentNames[] = getStudentsNames();
            		studentIDs[] = getStudentID( idArray);
            		testScores[] = getstudentTestScores();
            		avg[] = calculateAverageGrade();
            		grade[] = assignLetterGrade();
            		displayStudentGradeReport();
        	}
    	}
        /*public static void getStudentsNames(i, name[]);
        {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        return name;
        } */
        /*public static int getStudentID(int idArray)
        {
	
        } */
        /*public static int getstudentTestScores()
        {
        
        } */
        /*public static double calculateAverageGrade()
        {
        
        } */
        /*public static char assignLetterGrade(averageGrades,letterGrades,index)
        {
        
        } */
        /*public static void displayStudentGradeReport()
        {
        
        }*/
}
