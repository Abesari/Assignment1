package firstSet;

public class Assignment1 {
	public static void main(String[] args) {
		
	System.out.println("1.");
    for(int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  
    System.out.println("2.");
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    
    System.out.println("3:");
    for (int i = 1; i <= 4; i++) {
      
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

   
    System.out.println("4:");
    for (int i = 4; i >= 1; i--) {
      
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= 2*i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}