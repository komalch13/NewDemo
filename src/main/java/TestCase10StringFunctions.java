public class TestCase10StringFunctions {


    public static void main(String[] args) {
        String a= "JavaTraining";


        System.out.println(a);
        System.out.println(a.charAt(2));//v
       System.out.println(a.indexOf("r")) ;//5
        System.out.println(a.substring(3,7));//a T r a i
        System.out.println(a.substring(4));//Training
        System.out.println(a.concat("RahulTeacher"));
        System.out.println(a.toLowerCase());

      //  System.out.println(a.trim());
        //split- a.split("t"), t will split JAvaTraining into 2 parts Java and Raining so we will store these into arrayand array return type will be string bcz
        //it is string and first part will be stored into 0 index of Array

        String [] arr=a.split("T");
        //a.equalsIgnoreCase(String.valueOf(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("a", "b"));



    }
}
