package Fuction;

import Dm.Idmsoft;
import MainFrame.Mainframe;
import utils.JdmUtil;


public class Data {
    public static Idmsoft dm;
    public static String picpath = "";
    public static String FIND_PIC_COLOR;
    public static String FIND_CH_COLOR;
    public static double FIND_PARTIAL;
    public static boolean is_end = true;
    public static boolean is_Attribute  = true;//是不是属性技能
    public static boolean is_attack_soul = true; //是否用技能攻击灵魂
    public static int centerx = 904;
    public static int centery = 701;
    public static int threestarx = 1047;
    public static int threestary = 963;
    public static int skill_loc = 1; //技能
    public static boolean threestar = false;//是否三星
    public Data() throws Exception {
        /*
        初始化相关数据：
        初始化大漠插件
        定义全局找图颜色
        定义全局找字颜色
        定义全局偏色
        字库
         */
        JdmUtil.setLibPath();
        dm = new Idmsoft("dm.dmsoft");
        String ver = dm.Ver();
        Mainframe.textArea_Info.setText(ver);
        //functions.delay(5);

        String lib = functions.getPath();
        dm.SetDict(0, functions.getPath()+"txt_zk\\dm_soft.txt");
        Mainframe.textArea_Info.setText(functions.getPath()+"pics\\");

        int dm_ret = dm.SetPath(functions.getPath()+"pics\\");
        FIND_PIC_COLOR = "121212";
        FIND_PARTIAL = 0.9;
        FIND_CH_COLOR = "ffffff";
    }

    public static void findwindow() throws Exception {
        /*
        寻找窗口绑定窗口 并调用收缩窗口
         */
        //Mainframe.textArea_Info.setText("已绑定并调整后台");
        int hwnd = dm.FindWindow("Chrome_WidgetWin_1", "奥拉星 - Google Chrome");
//        Data.dm.MoveWindow(hwnd, 0, 0);
        Data.dm.GetWindow(hwnd, 1);
        //Data.dm.BindWindowEx(hwnd, "dx2", "windows3", "windows", "", 0);
        Data.dm.BindWindowEx(hwnd, "normal", "windows3", "windows", "", 4);
        Mainframe.textArea_Info.setText("已绑定并调整后台");

    }





}
