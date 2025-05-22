public class StringMethod {
    public static void main (String[] args) {
        String rr = "Rakesh";

        //int a = rr.length();
        //boolean a = rr.equals("Rakesh"); checks if the given string matches the actual string or not
        //boolean a = rr.equalsIgnoreCase("rakesh"); same like above but ignores the case
        //char a = rr.charAt(5); returns the char at the given index here the given index is "5"
        //String a = rr.trim(); if the string is "  Rakesh  " it will ignore the spaces..
        //int a = rr.indexOf("a"); returns the index of given char here its "a"
        //String a = rr.toUpperCase(); returns the stirng in all Upper cases
        //String a = rr.toLowerCase(); returns the stirng in all Lower cases
        //String a = rr.replace("e", "i"); rr.replace("old_char","new_char") it will replace and will return the string 
        //String a = rr.concat(" Apple"); similar to Syso()"Rakesh" + "Apple");
        //String a = rr.substring(3); will return the string after from the given index i.e "3" here
        //String a = rr.substring(1, 5); same as above but will have an ending point to
        
        int hash = rr.hashCode();
        String a = Integer.toString(hash);

        System.out.println(a);
        System.out.println(hash);
    }
}
