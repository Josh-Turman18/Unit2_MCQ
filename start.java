public class Start
{
  

    /**
     * Constructor for objects of class Start
     */
    public Start()
    {
        
    }

    public static void main (String[] args)
   {
       System.out.print('\u000C');
       
       Question3 question3_solution = new Question3();
       Question5 question5_solution = new Question5();
       Question6 question6_solution = new Question6();
       
       question3_solution.go();
       question5_solution.go();
       question6_solution.original();
       question6_solution.corrected();
       
    }
}
