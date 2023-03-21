public class Main {
    public static void main(String[] args) {

        // .equals() compares 2 strings to see if they are equal
        // returns a boolean value. see below: returns true
        // to ignore case sensitivity - .equalsIgnoreCase()

         String name = "Michael";
         // System.out.println(result);

         // boolean result = name.equals("Michael");


        // .length() returns an integer based on the length of a string
        // int result = name.length(); - returns integer of 7

        // .charAt(index) returns a certain character from string based on index (starts at 0)
        // char result = name.charAt(3); - returns character of "c"

        // .indexOf() returns an integer displaying the index of a specific character
        // int result = name.indexOf("M"); - returns int of "0"

        // .isEmpty() returns a boolean telling whether or not string is empty
        // boolean result = name.isEmpty(): - returns boolean of false (true if string = "")

        // .toUpperCase() returns a string with uppercase letters | .toLowerCase() does the opposite
        // String result = name.toUpperCase() - MICHAEL

        // .trim() returns a string with all of its empty characters omitted
        // String result = name.trim();

        // .replace(a,b) returns string that switches an old character (a) to a new one (b)
        // String result = name.replace('a','o'); - Michoel


    }
}