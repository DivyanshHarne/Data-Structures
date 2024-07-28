class ParentClass{
    void greeting(){
        System.out.println("Hello, there!");
    }
}

class ChildClass extends ParentClass{
    void greeting(){
        System.out.println("Yo");
    }
}

public class March16  {
    

    public static void main(String[] args) {
        // ChildClass b = new ChildClass();

        // b.greeting();

        ParentClass obj = new ParentClass();
        obj.greeting();
    }
}
