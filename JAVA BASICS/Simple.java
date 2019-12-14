//program3(b)
    class G{  
    private int data=40;  
    private void msg()
		{
		System.out.println("we can not access private member outside the class");
		}  
    }  
      
     class Simple{  
     public static void main(String args[]){  
       G z =new G();  
       System.out.println(z.data);
       z.msg();
       }  
    }  