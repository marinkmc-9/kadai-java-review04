package animal;

public class Animal {

    private String name;    //名前を格納するフィールド
    private int age;        //年齢を格納するフィールド

//引数無しのコンストラクタ
    public Animal() {
    }

//引数有りのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println(getName() + "です。" + getAge() + "歳です。");
    }
}
