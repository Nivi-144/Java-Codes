

public class MickeyMouse {
    public static void main(String[] args){
        String name = "Mickey Mouse";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        System.out.println(name.replace("M", "N"));
        System.out.println(name.startsWith("Mi"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("y"));
        System.out.println(name.lastIndexOf("e",3));
        System.out.println(name.equals("Mickey Mouse"));
        System.out.println(name.equalsIgnoreCase("mIckey mousE"));

    }

}

