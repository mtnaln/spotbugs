import java.util.Arrays;
import java.util.List;

/**
 * Created by Metin on 5.05.2019.
 */

public class Class2ExampleWithBugs {

    public void thisMethodContainsSomeBugs(){

        System.out.println("Class2ExampleWithBugs#thisMethodContainsSomeBugs...");

        List<String> cities = Arrays.asList("Ankara","Bursa","Samsun");

        String citiesConcat = "";

        for (String city : cities) {
            citiesConcat = citiesConcat + city + " ";
        }
    }
}
