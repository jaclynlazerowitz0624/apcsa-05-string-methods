public class EmailParser {
    public static void main(String[] args) {
        String email = "maya.cohen@school.org";
        // 1. length  2. index of @  3. user and domain
        // 4. first and last name  5. "Cohen, M."  6. first and last char
        
        System.out.println(email.length());

        int at = email.indexOf("@");
        System.out.println(at);
        int a = email.indexOf("m");
        int b = email.indexOf("a");
        int c = email.indexOf("y");
        int d = email.indexOf("a");
        int e = email.indexOf(".");
        int f = email.indexOf("c");
        int g = email.indexOf("o");
        int h = email.indexOf("h");

        user = email.substring(0, at); 
        System.out.println(user);
        domain = email.substring(at + 1);
        System.out.println(domain);

        String first = user.substring(0, e);
        String last = user.substring(e + 1);

        System.out.println(first);
        System.out.println(last);

        String formatted = last.substring(0, 1).toUpperCase() + last.substring(1) + ", " + first.substring(0, 1).toUpperCase() + ".";
        System.out.println(formatted);
        System.out.println(email.charAt(0));
        System.out.prinbtln(email.charAt(email.length() - 1));

        String email2 = "sam.lee@yofhs.org";
        String email3 = "samlee@yofhs.org";
        int error1 = email2.indexOf(".");
        int error2 = email3.indexOf("."); // causes a crash for index out of bounds





    }
}
