public abstract class Abstraction {
abstract void show();

}
class B extends Abstraction{
    void show(){
        System.out.println("implimentation");
    }
    public static void main(String args[]){
        B Data = new B();
        Data.show();
    }
}
