import java.util.Date;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void say() {
        String str = "私の名前は" + name + "です。年齢は" + age + "歳で、住所は" + address + "です。";
        System.out.println(str);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
            Date date = new Date();
            System.out.println(date.toString() + " [ERROR] 年齢が負の値です");
        }
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
}
