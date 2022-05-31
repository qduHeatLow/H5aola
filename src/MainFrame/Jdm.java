package MainFrame;

import Fuction.Data;

/**
 * @Auth wanghuiqin
 * @Date 2022/3/20 11:22
 **/

public class Jdm {

    public static void main(String[] args) throws Exception {
        Mainframe window;
        try {
            window = new Mainframe();
            window.frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Data data = new Data();
        Data.findwindow();

    }













}
