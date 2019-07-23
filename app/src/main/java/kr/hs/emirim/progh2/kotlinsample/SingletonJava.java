package kr.hs.emirim.progh2.kotlinsample;

public class SingletonJava {
    private SingletonJava(){}
    private static SingletonJava instance = new SingletonJava();

    public static SingletonJava getInstance(){
        return instance;
    }

    public void log(String text){
        System.out.println(text);
    }

}
