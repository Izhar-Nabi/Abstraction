package Abstract;

public abstract class ShowFunctionality {
    String name= "johan"; //we can also initialize the value here.
    abstract void show();
}
class Implementation extends ShowFunctionality{
    void show(){
        System.out.println("Welcome To implemention method ");
        //super.name="johan";
        System.out.println("Name is "+super.name); // we can also call the direct instance variable here or also initialize the value her by super keyword
    }
    public static void main(String args[]){
        Implementation data = new Implementation();
        //data.name="Johan";
        //System.out.println("Name is "+data.name);
        data.show();
    }
}
