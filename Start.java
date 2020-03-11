
/**
 * Calls the methods that show the commonly missed questions in unit 2 MCQ
 *
 * @Josh Turman
 * @1.0
 */
public class Start
{

    public Start()
    {
        
    }

    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        Question2 question2_solution = new Question2();
        Question9 question9_solution = new Question9();
        
        question2_solution.go();
    }
}
