public class IT24104240Lab4Q2{
  public static void main (String[] args){
    scanner scanner=new
scanner(system.in);
    System.out.print("Enter exam mark (out of 100):");
    double exam mark=
scanner.nextDouble();
     if(exammark<0||exammark>100){
     System.out.println("Invalidexam mark!must be between 0and100.");\
     return;
}
//Input and validate lab submission mark
  System.out.print("Enter lab submiisonmark(out of 100):");
 double lab mark=scanner.nextDouble();
if(labmark<0||labmark>100){
System.out.println("Invalid lab submiison mark!must be between0 and100.");
       return;

}
//Input and validate exam mark percentage
   System.out.print(Enter percentage weight for exam mark:");
       double exampercentage=
scanner.nextdouble():

//Inputand validate lab submission mark percentage
    System.out.print("Enter percentage weight for labmark:");
         doublelabpercentage=
   scanner.nextdouble();
//check if the percentage add up to 100
   if(exampercentage+labpercentage!=100){
        system.out.println("Error:Thepercentages must add up to100.");
           return;
   }
//calculate final mark
  double final mark=(exammark*exampercentage/100)+(labmark*labpercentage/100)
      System.out.printf("The final mark is:
  %.2f%n"finalmark);
  
     }
}
  
  