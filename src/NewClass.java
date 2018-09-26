//import java.util.Scanner;
public class NewClass {
 static public void main(String... args){
  int arr[] = {2,1,3,2,4,5,1,6,8,6,7,9,4};
  String str = "apostrophie";
  uniqueArr(arr);
  sortedStr(str);
}    

    private static void uniqueArr(int[] arr) {
       //To change body of generated methods, choose Tools | Templates.
    for(int i=0;i<arr.length;i++){
        boolean b = false;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                b = true;
            }
        }
        if(!b)
            System.out.println(arr[i]);
    }
    
    
    }

    private static void sortedStr(String str) {
         //To change body of generated methods, choose Tools | Templates.
         char ch[] = str.toCharArray();
         char charr;
         String answer = null;
        str = str.replaceAll("a","");
         str = str.replaceAll("i","");
          str = str.replaceAll("e","");
           str = str.replaceAll("o","");
            str = str.replaceAll("u","");
             str = str.replaceAll("A","");
              str = str.replaceAll("E","");
               str = str.replaceAll("I","");
                str = str.replaceAll("O","");
                 str = str.replaceAll("U","");
        System.out.println(str);
         
        
         
    }
}
