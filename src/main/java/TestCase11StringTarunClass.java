public class TestCase11StringTarunClass {


    static long value;
    static int [] arr= new int[100];
    // or you can also write int[] abc= new int[]{1,2,3,4,5,6,7,8,9,10}, you can give value of array in curley braces so you dont have to
    // write separate arr[0]= 100;

    // declare and intilize array with new word and mention size
    // Ststic bcz qw are using int[]=new int[3] is global variable
    // you can access it in method

    public static void main(String[] args) {
        arr[0]= 100;// storing value in 0 index of an array
        arr[50]= 99;

        value= arr[50];// retreive the value like this right hand side varible and index of value
        System.out.println(value);
       System.out.println(arr[0]);
        System.out.println(arr[80]);
        // we have not assigned any value to index 80 so the value will be 0, 0 bcz its global variable and by default// global variable value if not assigned will be 0 .
       // String d= "KomalChhabra";
        //String [] stg= new String []{"KomalChhabra"};
       // System.out.println(d.substring(2));
      //  System.out.println(d.replace("k", "A"));

        int[] intArray= new int[]{1,2,3,4,5,6,7,8,9};
        String [] names = new String[]{"komalchhabra", "EkamSingh", "HArsimranSingh"};


       for(int i=0; i<intArray.length; i++){
            //System.out.print(intArray[i]);
           System.out.print(intArray[i] + "\t"); //"\t" is for tab means 4 spaces in middle while printing
           //intArray[i]= i;
        }

      // int[] hello= new int[]{10,20,30,40,50};


       //for(int i=0; i>hello.length; i--) {
         //  System.out.println(hello[i] + "\t");

       // }

    }
}
