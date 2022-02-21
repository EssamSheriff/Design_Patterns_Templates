package bridge.model;

public class Tv implements implementation {

    @Override
    public void isEnabled() {
        System.out.println("isEnabled TV");
    }

    @Override
    public void Enabled() {
        System.out.println("Enabled TV");
    }

    @Override
    public void diEnabled() {
        System.out.println("diEnabled TV");
    }

    @Override
    public void getVolume() {
        System.out.println("getVolume TV");
    }

    @Override
    public void setVolume() {
        System.out.println("getVolume TV");
    }

    @Override
    public void getChannel() {
        System.out.println("getChannel TV");
    }

    @Override
    public void setChannel() {
        System.out.println("setChannel TV");
    }

}
