import java.util.Scanner;
//import java.util.Random;

class StudentGradeReport 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        int studentAmount;
        System.out.print("Enter the number of students: ");
        studentAmount = input.nextInt();
        String[] studentNames = new String[studentAmount];
        int[] studentID = new int[studentAmount];
        int[] score1 = new int[studentAmount];
        int[] score2 = new int[studentAmount];
        int[] score3 = new int[studentAmount];
        int[] score4 = new int[studentAmount];
        int[] score5 = new int[studentAmount];
        double[] avg = new double[studentAmount];
        char[] grade = new char[studentAmount];
        
        
        for (int i = 0; i < studentAmount; i++)
        {
            getStudentsNames(i, studentNames);
            getStudentID(i, studentID);
            getstudentTestScores(i, score1);
            getstudentTestScores(i, score2);
            getstudentTestScores(i, score3);
            getstudentTestScores(i, score4);
            getstudentTestScores(i, score5);
            avg[i] = calculateAverageGrade(i, score1, score2, score3,
            score4, score5);
            grade[i] = assignLetterGrade(avg[i]);
            displayStudentGradeReport(i, studentNames, studentID, score1, score2,
            		score3, score4, score5, avg, grade);
        }
    }
    public static void getStudentsNames(int i, String name[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        name[i] = input.next();
    } 
    public static void getStudentID(int i, int idArray[])
    {
        idArray[i] = 10000000 + (int)(Math.random() * 9999999);
    } 
    public static void getstudentTestScores(int i,int score1[])
    {
    	score1[i] = (int) (50 + (Math.random()*51));
    } 
    public static double calculateAverageGrade(int i, int grade1[], int grade2[],
    		int grade3[], int grade4[], int grade5[])
    {
        double avg;
        avg = (grade1[i] + grade2[i] + grade3[i] + grade4[i] + grade5[i]) / 5;
        return avg;
    } 
    public static char assignLetterGrade(double avgGrade)
    {
    	char grade;
        if (avgGrade >= 90)
        	grade = 'A';
        else if (avgGrade >= 80)
        	grade = 'B';
        else if (avgGrade >= 70)
        	grade = 'C';
        else if (avgGrade >= 60)
        	grade = 'D';
        else
        	grade = 'F';
        return grade;
    }
    public static void displayStudentGradeReport(int i, String name[], int studentID[], int score1[], int score2[],
    		int score3[], int score4[], int score5[], double avg[], char grade[])
    {
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s %12s\n","Student name", "Student ID", "Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Average", "Grade");
        System.out.printf("%12s %12d %12d %12d %12d %12d %12d %12.2f %12c\n", name[i], studentID[i], score1[i], score2[i], score3[i], score4[i], score5[i], avg[i], grade[i]);
    }
}
