/**

AP Computer Science

11/1/22

@author Mac Lawson

This class represents a calculator for calculating the average of two grades.
*/
public class V8 {
// Declare private instance variables
private int gradeOne;
private int gradeTwo;

// Default constructor
public V8() {
gradeOne = 0;
gradeTwo = 0;
}

// Overloaded constructor
public V8(int gradeOne, int gradeTwo) {
gradeOne = gradeOne;
gradeTwo = gradeTwo;
}

// Getter and setter methods for gradeOne
public int getGradeOne() {
return gradeOne;
}
public void setGradeOne(int gradeOne) {
gradeOne = gradeOne;
}

// Getter and setter methods for gradeTwo
public int getGradeTwo() {
return gradeTwo;
}
public void setGradeTwo(int gradeTwo) {
gradeTwo = gradeTwo;
}

// Method to calculate the average of the two grades
public double average() {
return Math.abs((Double.valueOf(gradeOne) + (Double.valueOf(gradeTwo))) / 2);
}

// Overloaded method to calculate the average of two provided grades
public static double average(int gradeOne, int gradeTwo) {
return Math.abs((Double.valueOf(gradeOne) + (Double.valueOf(gradeTwo))) / 2);
}
}