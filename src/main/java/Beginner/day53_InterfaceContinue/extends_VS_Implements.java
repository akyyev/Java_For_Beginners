package Beginner.day53_InterfaceContinue;

interface B {

    void method3();

}

public interface extends_VS_Implements extends B {
    //  subtype					 supertype

    void method1();  // public

    void method2(); // public

    // void method3();

    // public void method3() { }


}

class A implements extends_VS_Implements {

    public void method1() {

    }

    public void method2() {

    }

    public void method3() {

    }

}


class C extends A implements extends_VS_Implements {


}




