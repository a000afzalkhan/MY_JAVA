package Basic_Understand;

public class ConstructioN_1 {
    String name;

    ConstructioN_1(){
        System.out.println("Non Parameter Construction");
    }
    ConstructioN_1(String name){
        this.name=name;
        System.out.println(name + " Your name");
    }
    static void main(String[] args) {
        ConstructioN_1 x = new ConstructioN_1("Afzal");
      // String h= x.name = "Zohra";
        //System.out.println(h);
        System.out.println(x.name);
    }
}
