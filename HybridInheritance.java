
interface GrandFather{
    void height();
}

interface GrandMother{
    void eyeColor();
}

interface Father extends GrandFather,GrandMother{
    void hairColor();
}

class Son implements Father{

    public void height(){
        System.out.println("My height is 5'5 inherited from my Father who has inherited from my Grandfather");
    }
    public void eyeColor(){
        System.out.println("My eye color is Blonde inherited from my Father who has inherited from my Grandmother");
    }
    public void hairColor(){
        System.out.println("My hair color is Black inherited from my Father");
    }

}

public class HybridInheritance {
    public static void main(String[] args) {

        Son obj_HybridInheritance = new Son();
        obj_HybridInheritance.height();
        obj_HybridInheritance.eyeColor();
        obj_HybridInheritance.hairColor();
    }
}
