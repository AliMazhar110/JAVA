class Cars{
    private String name;
    public Cars(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class GarbageCollection{
    public static void main(String[] args){
        Cars c1 = new Cars("Mercedes");
        Cars c2 = new Cars("Audi");
        Cars c3 = new Cars("BMW");
        Cars c4 = new Cars("Lamborghini");

        System.out.println("Car1 -> "+c1);
        System.out.println("Car2 -> "+c2);
        System.out.println("Car3 -> "+c3);
        System.out.println("Car4 -> "+c4);
        //dereferencing c1
        c1 = null;
        //copying value of c2 into c3
        c3=c2;
        //dereferencing value of c4 and c2
        c4 = null;
        c2 = null;
        System.gc();
        // assigning null to an object takes its
        // original value to garbage collector
        // copying value into another object does the same for the object
        // which will be storing the copied value
        System.out.println("\nAfter automatic garbage collection.");
        System.out.println("Car1 -> "+c1);
        System.out.println("Car2 -> "+c2);
        System.out.println("Car3 -> "+c3);
        System.out.println("Car4 -> "+c4);
    }
}