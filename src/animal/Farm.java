package animal;

import animal.Animal;

import java.util.Arrays;

public class Farm {
    private  String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String OwnerName;
    public Farm(){

    }

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}
