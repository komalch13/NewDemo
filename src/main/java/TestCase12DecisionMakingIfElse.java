public class TestCase12DecisionMakingIfElse {

    public void performAction(String option){
        if(option.equals("Yes")){
            System.out.println("Yes option selected") ;
        } else if(option.equals("No")){
            System.out.println(" No option is selected");
        }
        else{
            System.out.println("Invalid option is selected");
        }
    }

    public static void main(String[] args) {
        TestCase12DecisionMakingIfElse dm= new TestCase12DecisionMakingIfElse();
        dm.performAction("Yes");
        dm.performAction("I dont know");
        dm.performAction("Hello");
        dm.performAction("No");
    }
}
