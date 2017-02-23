package playground;

import village.SomeVillage;

class HW {
    int value;
    HW() {
        value = 77;
    }
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
    
    public static void main(String args[]) {
        HelloWorld hw = new HelloWorld();
        hw.main1(args);
        
        CC a, b;
        a = b = new CC();
        System.out.println(a.toString() + " " + b.toString());
    }
}
