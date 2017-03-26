
class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void say() {
        System.out.println("私の名前は" + name + "です。年齢は" + age + "歳で、住所は" + address + "です。");
    }
}

class PersonTest {
    public static void main(String[] arg) {
        Person taro = new Person("太郎", 21, "東京都港区");
        taro.say();

        Person hanako = new Person("花子", 18, "北海道札幌市");
        hanako.say();
    }
}
