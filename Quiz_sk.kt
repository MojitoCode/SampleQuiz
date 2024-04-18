//Project: Quiz
//Student project on Codecademy.com
//Date: 4/17/2024
//Author: Sam K.


fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  // Write your code below
  //Question 1
  println("What is 75 / 5?")
  val studentAnswer1 = Integer.valueOf(readLine())

  //Question 2
  println("In the equation: 6 * 2y = 36, what is the value of y?")
  var studentAnswer2 = Integer.valueOf(readLine())

  //Question 3
  println("What is the name of a triangle that has two equal sides?")
  val studentAnswer3 = readLine()

  //Question 4
  println("What is the value of: 8 * 6 - (3 - 2)?")
  val studentAnswer4 = Integer.valueOf(readLine())

  //initialize points variable
  var points = 0

  //Question 1 - if correct, assign 25 points to the points variable
  if (studentAnswer1 == quizAnswer1){
    points += 25
  }
  //Question 2 - if correct, increase the student's total points by 25
  if (studentAnswer2 == quizAnswer2){
    points += 25
  }
  //else, if the studentAnswer2 is within one point of the quizAnswer2 (plus or minus 1), increase the total points by 20, and output the following:
  else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--){
    points += 20
    println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
  }
  //else, increase total points by 1
  else{
    points += 1
  }

  //Question 3 - if correct, increase the student's total points by 25
  if (studentAnswer3 == quizAnswer3){
    points += 25
  }
  //else, if answer is equal to "equilateral", increase total points by 10
  else if (studentAnswer3 == "equilateral"){
    points += 10
  }
  //else, increase total points by 1
  else{
    points += 1
  }

  //Question 4 - if correct, increase the student's total points by 25
  if (studentAnswer4 == quizAnswer4){
    points += 25
  }
  //else, if answer is between 44 and 54, increase total points by 20
  else if(studentAnswer4 > 44 && studentAnswer4 < 54){
    points += 20
  }
  //otherwise, increase total points by 1
  else{
    points += 1
  }

  //grade scale based on points total
  //print response based on student's total number of points
  when (points){
    in 0..59 -> println("$points points is an F.")
    in 60..69 -> println("$points points is a D.")
    in 70..79 -> println("$points points is a C.")
    in 80..89 -> println("$points points is a B.")
    in 90..100 -> println("$points points is an A.")
    in 101..110 -> println("$points points is an A+.")
  }
}
