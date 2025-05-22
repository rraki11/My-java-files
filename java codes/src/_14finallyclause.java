public class _14finallyclause {
    public static void main (String[] args) {
        try {

            int a = 19, b = 5, c = 5;
            int result;

            result = a / (b-c) ;//after this it will directly go to the "catch" block
            System.out.println(result);//this line will not be executed

        }
        finally {

            System.out.println("\ncant divide by zero and this is \"finally\" block");
            System.out.println("the \"finally\" block will be executed for sure after the \"try\" block");
            System.out.println("we need to write a \"catch\" block for sure if we dont use \"finally\" block, caue it will give us an error \n");

        }
    }
}
