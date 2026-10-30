/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Gordon Guo
*****************************************************************************************************
*/

public class Main {
    public static int add(int a, int b){
        return a+b;

    }
    public static int add(int a, int b, int c, int d){
        return add(add(add(a,b), c), d);
    }
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    public static String triple(String text){
        return text+text+text;
    }
    public static double half(int n){
        return (double) n/2;
    }
    public static int roundPositiveValueToNearestInteger(double n){
        return (int) (n+0.5);
    }
    public static int roundNegativeValueToNearestInteger(double n){
        return (int) (n-0.5);
    }
    public static void main(String[] args) {

    }

    // 1. add

    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger

}
