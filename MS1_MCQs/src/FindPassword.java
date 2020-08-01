class A11
    {
        int i;
        void display() 
        {
            System.out.println(i);
        }
    }    
    class B11 extends A11 
    {
        int j;
        void display() 
        {
            System.out.println(j);
        }
    }    
    class FindPassword
    {
        public static void main(String args[])
        {
            B11 obj = new B11();
            obj.i=1;
            obj.j=2;   
            obj.display();     
        }
   }
