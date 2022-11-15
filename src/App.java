class ProgrammDataNumber01
 {
    public static void main (String entrada[])
    {
    //Declaration of variables
    int NumInt;
    double NumReal, addition;
    char Caracter;

    //Data input
    NumInt = Integer.parseInt(entrada[0]);
    NumReal = Double.parseDouble(entrada[1]);
    Caracter = (entrada[2]) .charAt(0);
    //proccess
    addition = (double)NumInt + NumReal;
    //output 
    System.out.println((double)NumInt + "+" + NumReal + "=" + addition + "signal" + Caracter);

    System.exit(0);
    
    }
 }