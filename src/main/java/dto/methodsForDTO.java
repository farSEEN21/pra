package dto;

import java.util.Random;

public class methodsForDTO {

    public int randomizer(int till){
        Random random = new Random();
        return  random.nextInt(till);
    }
public int randomnumber(){
        return  (int)(Math.random())*100;
}



}
