public class SearchTester{

  public static void main(String [] args){
  
    String names = "Evan Akshata Danny Conway Adam George Veda Benjy Christian Shashank Marcus Ian Hunter Toby Natalie John Ted";
    
    Group period1 = new Group(names);
    
    period1.printList();
    
    System.out.println("\nDanny is found : " + period1.sequentialSearch("Danny"));
  
  }

}