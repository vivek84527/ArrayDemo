package dslab01.sech.main;

public class ArrayProcessing {
    public static void main(String[] args) {
        // create an array to store integer
        int[] arrInt = new int[10];

        // print the array
        /*for(int i:arrInt){
            System.out.println(i);
        }
         */
        System.out.println("Default value of an array");
        for(int i=0;i<arrInt.length;i++) {
            System.out.print(arrInt[i]);
            System.out.print(",");
        }


        // static initialization of array
        arrInt[0]=100;
        arrInt[1]=200;
        arrInt[2]=1080;
        arrInt[3]=400;
        arrInt[4]=1040;
        arrInt[5]=1500;
        arrInt[7]=1008;
        arrInt[8]=1080;
        arrInt[9]=1050;
        System.out.println();
        // print the array
        System.out.println("Static value of an array");
        for(int i=0;i<arrInt.length;i++) {
            System.out.print(arrInt[i]);
            System.out.print(",");
        }


        // command line initialization of array
        for(int i=0;i<args.length && i<arrInt.length;i++){
            arrInt[i]=Integer.parseInt(args[i]);
        }
        System.out.println();
        System.out.println("Array initialize by command line value");
        for(int i=0;i<arrInt.length;i++) {
            System.out.print(arrInt[i]);
            System.out.print(",");
        }



        // user initialization of array using scanner class
        

        // sum and average of aal element
    }
}
