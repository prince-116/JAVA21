package StringTemplate;

import static java.lang.StringTemplate.STR;

public class StringTemplate {


    private static void Template() {

        String name = "java21";

        String usingPlusOperator = "Welcome to, " + name + " String Template Demo";

        String format = String.format("Welcome to, %s String Template Demo", name);

        String stringBuilder = new StringBuilder().append("Welcome to,")
                .append(name)
                .append(" String Template" + "Demo")
                .toString();


        String newString = STR."""
        Welcome to, \{name} String Template Demo
        """;

        String firstname = "JAVA JSON";

        String newJson = STR."""
       {
           "FirstName": "\{firstname}",
           "MSG" : "Welcome to the Demo"
       }
       """;

        System.out.println(STR."Using Plus Operator:\{usingPlusOperator}");

        System.out.println(STR."Using String Format:\{format}");

        System.out.println(STR."Using String Builder:\{stringBuilder}");

        System.out.println(STR."Using String Template:\{newString}");

        System.out.println(STR."printing JSON using string template: \n\{newJson}"); //interpolation
    }

    public static void main(String[] args) {
        Template();



        Boolean result = false;
        String name = "Prince";
        String msg = STR."The record for \{name} \{result ? "does" : "does not"} exist in the database.";
        System.out.println(msg);
    }

}
