public class Calculator {
    public void Calculator(){

    }
public int add(int a, int b){
        return a + b;
}
public  int sub(int a, int b){
        return a - b;
}
public int mul(int a, int b){
        return a * b;
}
public int div(int a, int b){
        return a / b;
}
public int modulo(int a, int b){
        return a % b;
}
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.sub(45,11));
        System.out.println(myCalculator.mul(12,34));
        System.out.println(myCalculator.div(10,2));
    }
}
