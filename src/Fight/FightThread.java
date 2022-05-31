package Fight;

import Fuction.Data;
import Fuction.functions;
import MainFrame.Mainframe;

//供启动线程 赋值参数 然后调用fight
public class FightThread extends Thread {
    public void run() {
        try {
            if (Mainframe.comboBox.getSelectedIndex() == 0) { //一技能不用三星
                Fight fight = new Fight();
                Data.skill_loc = 1;
                Data.threestar = false;
                Data.is_Attribute = true;
                Data.is_attack_soul = false;

                fight.fight_inround();
            } else if (Mainframe.comboBox.getSelectedIndex() == 1) {//一技能用三星
                Fight fight = new Fight();
                Data.skill_loc = 1;
                Data.threestar = true;
                Data.is_Attribute = true;
                Data.is_attack_soul = false;

                fight.fight_inround();
            } else if (Mainframe.comboBox.getSelectedIndex() == 2) {    //二技能用三星
                Fight fight = new Fight();
                Data.skill_loc = 2;
                Data.threestar = true;
                Data.is_Attribute = false;//攻击技能
                Data.is_attack_soul = true;
                fight.fight_inround();
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
