package designpattern.singleton;

public class SingletonBasic {
    public static void main(String[] args) {
        System.out.println("Hello World");
        CustomSingleton customSingleton = CustomSingleton.getObject();
    }
}

class CustomSingleton{

    private static CustomSingleton customObject = null;

    private CustomSingleton() {}

    public static CustomSingleton getObject() {
        if(customObject == null){
            customObject = new CustomSingleton();
        }
        return customObject;
    }
}