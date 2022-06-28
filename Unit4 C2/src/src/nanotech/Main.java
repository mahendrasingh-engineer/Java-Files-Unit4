package nanotech;

public class Main {
    public static void main(String[] args) {

    }
}
class Demo{
    Demo(){
        System.out.println("cunsrroctor 1");
        this(" eeee ");
    }
    public Demo(int a){
        System.out.println("cunsrroctor 2");
        this(1.0f);
    }
    Demo(float b){
        System.out.println("cunsrroctor 3");
        this("1.0f");
    }
    Demo(String s){
        System.out.println("cunsrroctor 4");
    }

    public static void main(String[] args) {
        Demo d1=new Demo();
    }
}

class Lion {

    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;
    public static void printKilling(){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }

    public static void thinking(String name,boolean isHungry,int age){

        if(!isHungry){
            System.out.println(name + "is sleeping");
        } else if (isHungry && age>12) {
            totalDeaths += 2;
            System.out.println(name + "has eaten two animal");
        } else if (isHungry && age<=12 && age>=2) {
            totalDeaths += 1;
            System.out.println(name + " has eaten one animal");
        }
        else{
            System.out.println(name + "is calling Mom");
        }
    }

    public static void main(String[] args){
        Lion obj = new Lion();

        Lion Lion1 = new Lion();
        Lion Lion2 = new Lion();
        Lion Lion3 = new Lion();

        Lion1.thinking("Lion1",true,15);
        Lion2.thinking("Lion2",true,10);
        Lion3.thinking("Lion3",false,14);
        printKilling();
    }
}
