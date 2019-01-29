package java.com.jamesmhare.javadesignpatterns.StrategyPattern;

/**
 * Serves as a class for the Lightning Boy character.
 */
public class ThunderGirl extends Hero {

    ThunderGirl(){
        super();
        power = new ThunderKick();
    }
}
