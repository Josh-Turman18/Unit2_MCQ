
/**
 * calls the methods that execute the mehtods that show the unit 2 MCQ
 *
 * @Josh Turman
 * @1.0
 */
public class begin
{
    
    public begin()
    {
        
    }

    public static void main(String [] args)
    {
        Question2 question2_solution = new Question2();
        Question9 question9_solution = new Question9();
        
        question2_solution.go();
        question9_solution.go();
    }
}
