package abstraction;

interface functional {
    void A();
}

class B implements functional {
    @Override
    public void A() {
        System.out.println("print A");
    }
}

public class func {   
    public static void main(String[] args) {
        B b = new B();
        b.A();
    }
}