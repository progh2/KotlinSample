package kr.hs.emirim.progh2.kotlinsample;

public class SampleClass {
    int outerField1 = 0;
    class InnerClass{
        int myField = outerField1;
    }
    public static class NestedClass{
       // int myField = outerField1;
    }
}
