   public class Date{
    // instance variables --> private variables using encapsulation
   private int day;
   private int month;
   private int year;

   //constructors
     public Date(int day, int month, int year){
            setday(day);
            setmonth(month);
            setyear(year);

     }

     public Date(Date other){
            this.day=other.day;
            this.month=other.month;
            this.year = other.year;
     }



   //setters with validation
     public void setday(int day){
         if(day>=1 && day<=30){
            this.day=day; 
          }   

     }

      public void setmonth(int month){
         if(month>=1 && month<=12){
            this.month=month; 
          }   

     }

      public void setyear(int year){
         if(year>=1){
            this.year=year; 
          }   

     }



    // getters
       public int getday(){
          return day;         
       }

       public int getmonth(){
          return month;         
       }

       public int getyear(){
          return year;         
       }

    //@override toString()

      public String toString(){

      return String.format("%02d-%02d-%d", day, month,year); //String.format is used for proper formatting %02d, d--> integers, 02--> padd with 2 zeros
   
     } 

    // overiding equals inorder to compare all the contents of date, otherwise it will behave as == and compare addresses not the contents

      // equals is used to compare objects, while for primitive data types we use == for comparison 
      public boolean equals(Date other){
    if(this.day == other.day &&
       this.month == other.month &&
       this.year == other.year)
        return true;
    else
        return false;
   }
       
       }

