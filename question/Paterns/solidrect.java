public class solidrect {

    public static void main(String[] args) {    // ****
                                                // ****
                                                // **** this pattern should be drwan
       int n = 4;
       int m = 5;
       for(int i = 0 ; i<=n ; i++){       //outer loop
        for(int j = 0 ; j<=m ; j++){      //innner loop
            System.out.print(" * ");      //here should not be println becoz it will print in sequential wise
       }
          System.out.println(" "); //for new line or space
    }
}
}
