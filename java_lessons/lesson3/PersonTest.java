
class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    String say() {
        String str = "私の名前は" + name + "です。年齢は" + age + "歳で、住所は" + address + "です。";
        return str;
    }
}

class PersonTest {
    public static void main(String[] arg) {
        Person taro = new Person("太郎", 21, "東京都港区");
        System.out.println(taro.say());

        Person hanako = new Person("花子", 18, "北海道札幌市");
        System.out.println(hanako.say());
    }
}
