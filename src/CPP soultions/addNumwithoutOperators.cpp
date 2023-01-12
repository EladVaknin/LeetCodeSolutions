#include <stdio.h>
// solution 1 - for loop
int add (int num1 ,int num2){
    for (int i = 0; i < num2; i++)
    {
       num1++;
    }
    return num1;
}

/// solution 2 - use XOR and AND logical gates
// in XOR - 0 = true (same values) ,1 = false (different values)
int addWithBits (int num1 ,int num2) {
    int carry,sum;
    while (num2 !=0 ){
        sum = num1^num2;// here we made the XOR
        carry = (num1&num2)<<1; //here we use the AND to shift the carry to the next XOR iteration

        // updates the values
        num1 = sum;
        num2 = carry;
    }
    return sum;
}