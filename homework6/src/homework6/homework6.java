package homework6;

import java.util.Scanner;

public class homework6 {

    public static void main(String[] args) {
        while(true)
        { 
        System.out.println("type in your drivers licesnce");
            Scanner a = new Scanner(System.in);
            String b = a.nextLine();
            int len = b.length();
            
        if(len!=6)
        {
         System.out.println("wrong number of digits");  
        
        }
        else if(len==6)
        {
         System.out.println("SA"+ b); 
        break;
        }
        }
        
        while(true)
        {
        System.out.println("type in birth date dd/mm/yyyy");
        Scanner c = new Scanner(System.in);
        String d = c.nextLine();
        int x = d.length();
        
        if(x!=8)
        {
             System.out.println("wrong number of digits");   
        }
        else if(x==8)
        {
         break;  
        }
        }
        
        while(true)
        { 
        System.out.println("type in username");
            Scanner a = new Scanner(System.in);
            String b = a.nextLine();
            int len = b.length();
              
        if(len<6)
        {
         System.out.println("needs more digits");  
        }
        else
        {
         System.out.println("your username is "+ b); 
        break;
        }
        }
        
        while(true)
        { 
        System.out.println("type in Age");
            Scanner a = new Scanner(System.in);
            String b = a.nextLine();
            int len = b.length();
              
        if(126<=len)
        { 
        break;
        }
        else
        {
         System.out.println("invaled age"); 
        }
        }
        
        while(true)
        { 
        System.out.println("type in your SEX. 1 for male, 2 for female, 3 for other.");
            Scanner a = new Scanner(System.in);
            int gender = a.nextInt();
            
        if(gender==1)
        {
        System.out.println("Male");    
        break;
        }
        else if(gender==2)
        {
         System.out.println("Female");    
        break;
        }
        else if(gender==3)
        {
         System.out.println("Other");    
        break;
        }
        else
        {
         System.out.println("wrong number");
        }
        }
        
        while(true)
        { 
        System.out.println("type in your password");
            Scanner a = new Scanner(System.in);
            String b = a.nextLine();
            int len = b.length();
            
        if(len<8)
        {
         System.out.println("needs more digits");  
        }
        else
        {
         System.out.println("your are logged in"); 
        break;
        }
        }
        System.out.println("hi my name is jeff"); 
    }
} 
