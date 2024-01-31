public class StringIndex {


        public static void main(String[] args) {
            String s = "example";

            try {
                String substring = s.substring(2, 8); // throws StringIndexOutOfBoundsException
            } catch (StringIndexOutOfBoundsException e) {
                // catch the exception and log an error message
                System.out.println("String index is out of bounds: " + e.getMessage());
            }
        }

    }

