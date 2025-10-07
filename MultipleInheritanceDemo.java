interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Printing");
    }

    public void show() {
        System.out.println("Showing");
    }
}

class MultipleInheritanceDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    }
}
