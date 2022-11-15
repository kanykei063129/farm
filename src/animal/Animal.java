package animal;

public abstract class Animal {
    private  int weight;
    private int age;
    private char genger;
    private String niceName;

    public Animal(int weight, int age, char genger, String niceName) {
        this.weight = weight;
        this.age = age;
        this.genger = genger;
        this.niceName = niceName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenger() {
        return genger;
    }

    public void setGenger(char genger) {
        this.genger = genger;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", genger=" + genger +
                ", niceName='" + niceName + '\'' +
                '}';
    }
}
