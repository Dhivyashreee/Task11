public class ArrIndex {



        public static void main(String [] args) {

            int [] arr= new int[3];
            arr[0]=100;
            arr[1]=101;
            arr[2]=102;
            try {
                arr[2]=103;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index is out of bonds");
            }
            System.out.println(1+2);

        }
    }

