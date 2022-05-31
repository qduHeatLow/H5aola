package Fuction;

public class testmain {
    public static void main(String[] args) throws Exception {
        ScreenShot screenShot = new ScreenShot();
        screenShot.screeShot();
        SendMail sendMail = new SendMail();
        sendMail.sendMailDemo();
    }
}
