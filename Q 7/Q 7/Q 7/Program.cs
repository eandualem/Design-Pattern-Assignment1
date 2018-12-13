using System;

// 7. Write a program using OOP language to illustrate the use of different properties.

namespace Q_7
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            User user = new User();
            
            user.Age = 5; 
            Console.WriteLine(user.Age); 
            
            user.Age = 23;
            Console.WriteLine(user.Age); 
        }
    }
    
    
    class User
    {
        int age;
        
        public int Age
        {
            get => this.age;
            set
            {
                if (value > 18)
                {
                    age = value;
                }
                else
                {
                    Console.WriteLine("At least you must be 18!");
                }
            }
        }
    }
}