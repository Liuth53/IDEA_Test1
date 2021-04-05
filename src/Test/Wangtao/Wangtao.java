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

//    public void eat(String s){
//        if (s.equals("meat")){
//            System.out.println("I am "+ name + ",I like eating "+"vegetable,because "+s+" makes me fat!");
//        }
//        else{
//            System.out.println("I am "+ name + ",I like eating "+s);
//        }
//    }
//    public void sleep(String sex){
//        System.out.println("I am a sleepy "+ sex );
//    }
    public void shangHao(String s){
        System.out.println("I like to play "+s+" in the dormitory");
    }
//    public  void State(){
//        System.out.println(Comment);
//    }
}
