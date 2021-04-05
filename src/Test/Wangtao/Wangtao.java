package Test.Wangtao;

public class Wangtao extends Lth {
//    private String name;
//    private int age ;
//    private  String sex ;

    public Wangtao(String name,int age,String Sex,String Comment) {
        super(name,age,Sex,Comment);
        this.name = name;
        this.age = age;
        this.Sex = Sex;
        this.Comment = this.Comment="...";
    }

    public void shangHao(String s){
//        super.eat("baba");
        System.out.println("I like to play "+s+" in the dormitory");
    }
    public void State() {
        System.out.println("123");
    }
}
