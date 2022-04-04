package automationtest;

public class IfThenElse_Q3 {

    public boolean isTeen(int age) {

        if (age <= 18) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        IfThenElse_Q3 obj1 = new IfThenElse_Q3();
        System.out.println(obj1.isTeen(25));

    }
}
