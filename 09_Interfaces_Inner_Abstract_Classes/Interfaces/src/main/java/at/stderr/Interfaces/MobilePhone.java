package at.stderr.Interfaces;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobilephone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobilephone.");
        } else {
            System.out.println("Mobilephone is turned off.");
        }

    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering mobilephone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && this.isOn) {
            isRinging = true;
            System.out.println("Ring ring.");
        } else {
            System.out.println("Mobilephone not on or number different");
            this.isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }
}
