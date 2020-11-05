package inheritence;

/**
 * @author amgarg
 */
public interface CovidProtocols {

    default void show() {
        System.out.println("This method is used for show for covid");
    }

    void sanitizeHands();

    void maintainSocialDistancing();

    void wearingMasks();


}
