package Fight;

import Fuction.Data;
import MainFrame.Mainframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//开始
public class Start_Qingming implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Data.is_end = false;

        Mainframe.Button_Start.setEnabled(false);
        Mainframe.t = new FightThread();
        Mainframe.t.start();

    }
}
