public class Lab{
       //declaring static variables common to class only, final acts as constant
    private static int counter = 0; //initialize counter with 0
    private static final String ID_PREFIX = "LB-"; // ID_PREFIX in uppercase to show it is constant
       //instance variables

    private String id;
    private String universityName;
    private String departmentName;
    private String sectionName;
    private String labName;
    private int totalComputers;
    private int bookedComputers;
    private Date labDate;


        //Default Constructor

      public Lab (){
        this("Unknown");
        System.out.println("Default constructor called"); 

         }
         
       // the main constructor being referred to that initializes the attributes, it is used to avoid code redundancy
         // 6-parameterized constructor
       public Lab (String universityName, String departmentName,String sectionName, String labName, int totalComputers,int bookedComputers){
              this(universityName, departmentName,sectionName, labName, totalComputers, bookedComputers, new Date(25,1,26));   //default date

         } 

        //full constructor
      public Lab (String universityName, String departmentName,String sectionName, String labName, int totalComputers,int bookedComputers, Date labDate ){
      this.id = generateId();
      setUniversityName(universityName); 
      setDepartmentName(departmentName);
      setSectionName(sectionName);
      setLabName(labName);
      setTotalComputers(totalComputers);
      setBookedComputers(bookedComputers);
      this.labDate = labDate; // from Date class

       } 


      // constructor overloading...constructors with different parameters
         //One-parameter Constructor
         public Lab(String universityName){
             this(universityName, "undefined"); //default department

          }  
           //Two-parameter Constructor
         public Lab(String universityName, String departmentName){
              this(universityName, departmentName, "A","General Lab"); // default section

           }
            //Four-parameter Constructor
         public Lab(String universityName, String departmentName,String sectionName, String labName){
                this(universityName, departmentName,sectionName, labName,0,0); // set total and booked computers to 0 by default   
           
         }

            //copy constructor
         public Lab(Lab other){
           this(other.universityName, other.departmentName, other.sectionName, other.labName, other.totalComputers, other.bookedComputers, new Date(other.labDate));
          }
        




          //id generation and return total number of objects created

       public static String generateId(){

             return ID_PREFIX + String.format("%03d",counter++);
   
       }

       public static int getCreatedObjects(){
              return counter;  
           
       }

           //setters with validation
        public void setUniversityName(String universityName){
               this.universityName = universityName; 
 
        }  

        public void setDepartmentName(String departmentName){
               this.departmentName = departmentName; 
 
        } 

        public void setSectionName(String sectionName){
               this.sectionName = sectionName; 
 
        } 

        public void setLabName(String labName){
               this.labName = labName; 
 
        } 

         public void setTotalComputers(int totalComputers){
             if(totalComputers>0)  
             this.totalComputers = totalComputers; 
 
        } 

         public void setBookedComputers(int bookedComputers){
             if(bookedComputers>0)  
             this.bookedComputers = bookedComputers; 
 
        } 



        //getters
 
         public Date getLabDate(){
            return labDate;      
               
         } 

        public String getUniversityName(){
            return universityName;

       }

        public String getDepartmentName(){
            return departmentName;

       }

        public String getSectionName(){
            return sectionName;

       }

        public String getLabName(){
            return labName;

       }

        public int getTotalComputers(){
            return totalComputers;

       }

         public int getBookedComputers(){
            return bookedComputers;

       }

 
       public void bookComputers(int count){
    if(bookedComputers + count <= totalComputers){
        bookedComputers += count;
    }
   }

       public void cancelBooking(int count){
    if(bookedComputers - count >= 0){
        bookedComputers -= count;
    }
   }
  
       public int availableComputers(){
              int compAvail = totalComputers-bookedComputers;
              return compAvail;
               

       }
  
         // @override
        public String toString(){

        return String.format("%6s | %12s | %9s | %7s | %9s | Total Comp: %3d |Booked Comp: %3d |Available Comp: %3d | Date: %10s",id, universityName, departmentName,sectionName, labName, totalComputers, bookedComputers, availableComputers(),labDate);

       }
 
           //equals
     public boolean equals(Lab other){

    if(this.universityName.equals(other.universityName) &&
       this.departmentName.equals(other.departmentName) &&
       this.sectionName.equals(other.sectionName) &&
       this.labName.equals(other.labName) &&
       this.totalComputers == other.totalComputers &&
       this.bookedComputers == other.bookedComputers &&
       this.labDate.equals(other.labDate))
        return true;
    else
        return false;
}



}