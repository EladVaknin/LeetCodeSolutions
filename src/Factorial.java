public class Factorial {

    // regular version
    public int factorial (int num){
        if (num ==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <num ; i++) {
            fact*=i;
        }
        return fact;
    }


    /// recursion version
    public int recursivFactorial (int num){
        if (num==0){
            return 1;
        }else{
            return (num*recursivFactorial(num-1));
        }
    }

}
