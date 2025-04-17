import java.util.Scanner;


public class Question {
    /*
    *String question: Stores the actual text of the question (e.g., "What is the capital of Manitoba?").

    int totalMarks: Stores the integer number of marks this question is worth (e.g., 5).

    String answer: Stores the exact, correct answer for the question (e.g., "Winnipeg").

    String studentAnswer: Stores the answer provided by the user. It's good practice to initialize this to an empty string ("") or null in the constructor.
    *
    */

    private String question;
    public int totalMarks;
    private String answer;
    private String studentAnswer;

    //constructor
    public Question(String question, int totalMarks, String answer){
        this.question = question;
        this.totalMarks = totalMarks;
        this.answer = answer;

    }

    //getters and setters
    public String getQuestion(){
        return this.question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public int getTotalMarks(){
        return this.totalMarks;
    }

    public void setTotalMarks(int totalMarks){
        this.totalMarks = totalMarks;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getStudentAnswer(){
        return this.studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer){
        this.studentAnswer = studentAnswer;
    }

    //methods

    public void AskQuestion(Scanner scanner){
        System.out.println(question + " (" + totalMarks + " marks)");
        System.out.println("Your Answer: ");
        String studentAnswer = scanner.nextLine();
        this.studentAnswer = studentAnswer;
    }

    public int CheckAnswer(){
        if (studentAnswer.equals(answer)){
            return totalMarks;
        }

        return 0;
    }

  
}