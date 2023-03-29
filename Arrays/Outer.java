package Arrays;

class Outer {
    class Inner {
        int a = 10;
        int b = 20;
    }

    int c;

    void display() {
        Inner i = new Inner();
        System.out.println(i.a);
        System.out.println(i.b);
    }

    public static void main(String args[]) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        // System.out.print(o.display());
        o.display();
        System.out.println(i.a);
    }
}