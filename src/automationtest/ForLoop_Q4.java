package automationtest;

public class ForLoop_Q4 {

    public void printMyName(int howManyTime, String name) {


        for (int i = 1; i <= howManyTime; i++) {
            System.out.println(name);
        }
    }


    public static void main(String[] args) {

        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName(4,"Chintan");

    }
}
