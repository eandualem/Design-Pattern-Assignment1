using System;

// 5. Write a program using any OOP language demonstrate delegates

namespace Q_5
{
    
    delegate void Calculator(int x, int y);
    internal class Program
    {
        static void AddNum (int x, int y) { Console.WriteLine( x + y); }
        static void MulNum (int x, int y) { Console.WriteLine( x * y); }
        static void SubNum (int x, int y) { Console.WriteLine( x - y); }
        static void DivNum (int x, int y) { Console.WriteLine( x / y); }
        
        static void Main(string[] args)
        {
            int x = 7;
            int y = 9;
            
            //creating delegate instances
            Calculator add = new Calculator(AddNum);
            Calculator sub = new Calculator(SubNum);
            Calculator mul = new Calculator(MulNum);
            Calculator div = new Calculator(DivNum);
            
            // Calling each deligate independently
            Console.WriteLine("Individual Deligate:");
            add(x, y);
            sub(x, y);
            mul(x, y);
            div(x, y);

            // Multicasting of a Delegate
            Console.WriteLine("Multicast:");
            Calculator calc;
            calc = add;
            calc += sub;
            calc += div;
            calc += mul;
            
            // It executes all of them at once.
            calc(x, y);

        }
    }
}