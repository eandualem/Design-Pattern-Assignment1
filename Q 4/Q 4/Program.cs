using System;
// 4. Demonstrate use of virtual and override key words in OOP with simple program

namespace Q_4
{
    class Program
    {
        static BaseClass dr_class1 = new DerivedClass();
        static DerivedClass dr_class2 = new DerivedClass();
        public static void Main(string[] args)
        {
            dr_class1.Method1();
            dr_class1.Method2();    // Base - Method2
            dr_class1.Method3();
            
            dr_class2.Method1();
            dr_class2.Method2();    // Derived - Method2
            dr_class2.Method3();
        }
    }
    
    class BaseClass  
    {  
        public void Method1()  
        {  
            Console.WriteLine("Base - Method1");  
        }  
        
        public void Method2()  
        {  
            Console.WriteLine("Base - Method2");  
        }
        
        // virtual indicates subclass can override this method 
        public virtual void Method3()  
        {  
            Console.WriteLine("Base - Method3");  
        }
    }  
  
    class DerivedClass : BaseClass  
    {  
        // Method2 is not overriding Method2 in the base class
        public new void Method2()  
        {  
            Console.WriteLine("Derived - Method2");  
        }  
        
        public override void Method3()  
        {  
            Console.WriteLine("Derived - Method3");  
        } 
    }  
}