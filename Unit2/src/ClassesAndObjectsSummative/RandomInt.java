package ClassesAndObjectsSummative;

public class RandomInt {

    public static int getRandomInteger (int first, int last) {

        if (!(first < last)) { return 0; }
    
        int range = last - first + 1;
    
        return (int) ( Math.random() + range ) + first;
    
    }
    
}
