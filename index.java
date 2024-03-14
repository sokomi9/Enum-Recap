enum Day {
    MONDAY("English"), TUESDAY("Mathematics"), WEDNESDAY("Kiswahili"), THURSDAY("Science"), FRIDAY;
     private String subject;

    private Day() {
        subject = "Coding";
    }

    private Day(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    

     
}
public class index{
   
    public static void main(String[] args) {
        Day d = Day.MONDAY;
        Day[] all = Day.values();


        // System.out.println(d.ordinal());
        // d.setSubject("Social Studies");
        // System.out.println(d.getSubject());
        
        // for (Day day : all) {
        //     System.out.println(day + " : " + day.getSubject());
        // }
        // for(Day day : Day.values())
        // System.out.println(day + " : " + day.getSubject());

        // if(d == Day.MONDAY)
        // System.out.println("Introduction to Java");
        // else if(d == Day.TUESDAY)
        // System.out.println("What is JDK");
        // else if(d == Day.WEDNESDAY)
        // System.out.println("My First Java Program");
        // else if(d == Day.THURSDAY)
        // System.out.println("Data Types in Java");
        // else
        // System.out.println("Quiz");

        // switch(d){
        //       case MONDAY: 
        //       System.out.println("Introduction to Java");
        //       break;

        //       case TUESDAY: 
        //       System.out.println("What is JDK");
        //        break;

        //       case WEDNESDAY: 
        //       System.out.println("My First Java Program");
        //       break;

        //       case THURSDAY: 
        //       System.out.println("Data Types in Java");
        //       break;

        //       default:
        //       System.out.println("Quiz");
        //       break;
        //     }
    }
}