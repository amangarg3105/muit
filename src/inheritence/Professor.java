package inheritence;

/**
 * @author amgarg
 */
public class Professor implements ProfessionOperations, CovidProtocols {


    @Override
    public void show() {
        ProfessionOperations.super.show();
        CovidProtocols.super.show();
    }

    @Override
    public void getDetails() {

    }

    @Override
    public void computerSalary() {

    }

    @Override
    public void sanitizeHands() {

    }

    @Override
    public void maintainSocialDistancing() {

    }

    @Override
    public void wearingMasks() {

    }
}
