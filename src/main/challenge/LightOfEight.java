package main.challenge;

import java.util.ArrayList;
import java.util.Random;

public class LightOfEight {
    public void runLightOfEight() {
        Random rand = new Random();
        ArrayList<Integer> dataArr = new ArrayList<>();
        dataArr.add(rand.nextInt(8));

        while (dataArr.size() < 8) {
            int random = rand.nextInt(9);

            if (!dataArr.contains(random)) {
                dataArr.add(random);
            }
        }
        System.out.println(dataArr);

    }

}
