import animal.Cow;
import animal.Farm;
import animal.Horse;
import animal.Sheep;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(33, 1, 'M', "Adil");
        Cow cow2 = new Cow(45, 2, 'F', "Kani");
        Cow cow3 = new Cow(87, 3, 'F', "Laki");
        Cow cow4 = new Cow(145, 6, 'M', "Rex");
        Cow cow5 = new Cow(120, 4, 'F', "Ferdinant");
        Cow cow6 = new Cow(65, 2, 'M', "Archi");

        Sheep sheep1 = new Sheep(47, 2, 'F', "Koy1");
        Sheep sheep2 = new Sheep(56, 3, 'M', "Koy2");
        Sheep sheep3 = new Sheep(12, 1, 'M', "Koy3");
        Sheep sheep4 = new Sheep(12, 1, 'F', "Koy4");

        Horse horse1 = new Horse(125, 2, 'F', "Ahilex");
        Horse horse2 = new Horse(150, 3, 'M', "Pulia");
        Horse horse3 = new Horse(100, 1, 'F', "Lazer");


        Cow[] cows = {cow1,cow2,cow3,cow4,cow5};
        Cow[] cows1 = {cow6};
        Sheep[] sheep = {sheep1,sheep2,sheep3};
        Sheep[] shep1 = {sheep4};
        Horse[] horse = {horse1,horse2};
        Horse[] horses = {horse3};

        Farm farm1 = new Farm("Naryn",cows,horse,sheep,"Kanykei");
        Farm farm2 = new Farm("Talas",cows1,horses,shep1,"Adil");

        System.out.println(farm1);
        System.out.println(farm2);
    }
}