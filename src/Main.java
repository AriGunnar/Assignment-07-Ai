import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String[] options = {
                "skæri", "blað", "steinn"
        };

        System.out.println("Vinsamlegast velja skæri, blað eða stein.");

        //spyr notanda um næsta val
        String val = s.next();

        //býr til val tölvu
        int TolvaChoiceIndex = r.nextInt(options.length);
        String TolvaChoice = options[TolvaChoiceIndex];

        //Sýna hvað spilariof tölva völdu
        System.out.println("Þú valdir " + val + ".");
        System.out.println("Tölvan valdi " + TolvaChoice + ".");

        if (val.equals(TolvaChoice)) {
            System.out.println("jafnt!");
        } else if ((val.equals("steinn") && TolvaChoice.equals("skæri"))
                || (val.equals("blað") && TolvaChoice.equals("steinn"))
                || (val.equals("skæri") && TolvaChoice.equals("blað"))) {
            System.out.println("Þú vannst! :)");
        } else {
            System.out.println("Tölvan vann! :(");


        }
    }
}
