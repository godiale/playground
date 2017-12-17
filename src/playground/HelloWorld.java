package playground;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import village.SomeVillage;

class HW {
    int value;
    HW() {
        value = 77;
    }
}

class QQ {
    QQ() {
    }
    QQ(int a) {
    }
    void builder() {
        StringBuilder sb = new StringBuilder();
    }
}

class BB extends java.lang.Object {

}

abstract class AC {
    public String str() {
        return "bang!";
    }

    public abstract String str1();
}

class CC extends AC {

    @Override
    public String str1() {
        // TODO Auto-generated method stub
        return "bubu";
    }
}

class HelloWorld extends SomeVillage {

    public void main1(String args[]) {
        for (int i = 0; i < args.length; ++i) {
            java.util.ArrayList<String> s = new java.util.ArrayList<String>();
            s.add("me");
            s.add("you");
            HW hw = new HW();
            AC ac = new CC();
            System.out.println(args[i] + s.toString() + hw.value
                    + this.counter + ac.str() + ac.str1());
        }
    }

    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String args[]) {
        HelloWorld hw = new HelloWorld();
        hw.main1(args);

        CC a, b;
        a = b = new CC();
        System.out.println(a.toString() + " " + b.toString());

        Double d = new Double(7);
        Character c = new Character('a');

        String s1 = new String("Sasha");
        String s2 = "Sasha";
        System.out.println("Sasha" == s2);

        StringBuilder sb = new StringBuilder();

        System.out.println("Formatting array");
        int [][] arr = new int[5][7];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 7; ++j) {
                System.out.print(", " + arr[i][j]);
            }
            System.out.println("");
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.addAll(Arrays.asList(new Integer[] {2, 3, 4}));
        for (int i = 0; i < arr3.size(); ++i) {
            System.out.println("" + i + ", " + arr3.get(i));
        }
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();

        Period pr = Period.parse("P80D");
        pr = pr.minusDays(1);
        System.out.println(pr);
        System.out.println(pr.toTotalMonths());

        DateTimeFormatter f = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(f.format(ldt));
    }
}
