      public class LabDemo{
          public static void main(String[] args){
           //creating objects using different constructors
        Lab lab1 = new Lab();
        Lab lab2 = new Lab("COMSATS");
        Lab lab3 = new Lab("COMSATS","BSCS");
        Lab lab4 = new Lab("COMSATS","BSCS","C","Lab-A");
        Lab lab5 = new Lab("COMSATS","BSCS","C","Lab-B",40,20,new Date(1,1,2026));
        Lab lab6 = new Lab("COMSATS","BSCS","C","Lab-C",40,20,new Date(4,1,2026));
        Lab lab7 = new Lab("COMSATS","BSCS","C","Lab-D",40,20,new Date(1,1,2026));
        Lab lab8 = new Lab("COMSATS","BSCS","C","Lab-E",40,20,new Date(2,1,2026));
        Lab lab9 = new Lab("COMSATS","BSCS","C","Lab-F",40,20,new Date(3,1,2026));
        Lab lab10 = new Lab("COMSATS","BSCS","C","Lab-G",40,20,new Date(1,1,2026));


           // creating an object using copy constructor
          Lab lab11 = new Lab(lab5);

           //comparison
          if(lab11.equals(lab5))
            System.out.println("Both objects are equal");  
          else
            System.out.println("Objects are not equal");  


          lab6.bookComputers(5);
          lab7.cancelBooking(5);

          System.out.println("Total labs created: " + Lab.getCreatedObjects());
          System.out.println(lab1); 
          System.out.println(lab2); 
          System.out.println(lab3); 
          System.out.println(lab4); 
          System.out.println(lab5); 
          System.out.println(lab6); 
          System.out.println(lab7);
          System.out.println(lab8);
          System.out.println(lab9);
          System.out.println(lab10);
          System.out.println(lab11);

      }



    }