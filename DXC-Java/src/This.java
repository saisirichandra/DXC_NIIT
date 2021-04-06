
class This{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    This(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
    //constructor to initialize another object  
    This(Switch s){  
    s.extracted(10);  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	This s1 = new This(111,"Karan");    
    s1.display();  
     
   }  
}  