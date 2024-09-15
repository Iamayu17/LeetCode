import java.util.*;

class palindrome {
    public boolean isPalindrome(int x) {
        
        StringBuilder object = new StringBuilder (String.valueOf(x));
        object.reverse();
        if((String.valueOf(x)).equals(object.toString())){
            return true;
        }
        return false;
    }
}

//StringBuilder 
// StringBuilder is a class in Java that provides a mutable sequence of characters. 
// Unlike the String class, which is immutable (meaning once a String object is created, it cannot be changed), 
// StringBuilder allows you to modify the contents of the string without creating new objects. 
// This can lead to better performance when concatenating strings or making multiple modifications.

//*Any object to String "toString()"*
//*Any int to String "String.valueOf()"*

// Second Solution

// int temp = 0,rev = 0,n = x;

//         if(x<0){
//             return false;
//         }
//         while(x!=0){
//             temp  = x%10;
//             rev = rev * 10 + temp;
//             x = x/10;
//         }

//         if(n!=rev){
//             return false;
//         }
//         return true;

