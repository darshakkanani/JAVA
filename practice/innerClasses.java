class OuterClass {
    private int outerValue = 10;

    class InnerClass {
        void display() {
            System.out.println("Value from InnerClass: " + outerValue);
        }
    }

    void useInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class  innerClasses {
    public static void main(String[] args) {
        System.out.println("Prince_Chhodavadiya");
        OuterClass outer = new OuterClass();
        outer.useInnerClass();
    }
}

