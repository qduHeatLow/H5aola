package Fight;

import Fuction.Data;
import Fuction.functions;
import MainFrame.Mainframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//结束
public class End_Qingming implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Mainframe.textArea_Info.setText("已结束运行");
        Data.is_end = true;
        try {
            functions.delay();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        Mainframe.t.stop();
        Mainframe.Button_Start.setEnabled(true);

    }
}
