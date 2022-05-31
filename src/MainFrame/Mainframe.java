package MainFrame;

import Fight.End_Qingming;
import Fight.FightThread;
import Fight.Start_Qingming;
import Fuction.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Mainframe {

    public static Thread t = new FightThread();

    public static JFrame frame = new JFrame();;
    public static JLabel Label_introduce = new JLabel();
    public static JLabel Label_Info = new JLabel("运行信息:");
    public static JComboBox comboBox = new JComboBox();;
    public static JRadioButton is_threestar = new JRadioButton("使用三星技能");
    public static JComboBox comboBox_skill = new JComboBox();
    public static JTextArea textArea_Info = new JTextArea();
    public static JButton Button_Start = new JButton("开始");
    public static JButton Button_End = new JButton("结束");
    public static JMenuBar menuBar = new JMenuBar();
    public static JMenu FightMenu = new JMenu("战斗");

    public static JMenuItem Qingming = new JMenuItem("晴明挂机");

    public static JMenu AboutMenu = new JMenu("关于");
    public static JMenuItem AboutItem = new JMenuItem("关于程序");

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public Mainframe() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        JOptionPane.showMessageDialog(null,"请注意：每次点击不同功能最好重启软件\n" +
                "另外 本软件各功能仅开发者个人日常使用 如遇问题请联系\n" +
                "时间精力以及个人能力所限 软件实属简陋 请谅解" +
                "\n最重要的：使用说明请认真阅读与操作 一般问题不再进行解释");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setJMenuBar(menuBar);


        menuBar.add(FightMenu);
        FightMenu.add(Qingming);



        menuBar.add(AboutMenu);
        AboutMenu.add(AboutItem);
        frame.getContentPane().setLayout(null);



        Label_Info = new JLabel("运行信息:");
        Label_Info.setFont(new Font("宋体", Font.BOLD, 15));
        Label_Info.setBounds(32, 105, 98, 32);
        textArea_Info.setEditable(false);
        textArea_Info.setBounds(140, 110, 248, 28);
        textArea_Info.setFont(new Font("Monospaced", Font.PLAIN, 16));
        Button_Start.setBounds(46, 170, 125, 44);
        Button_End.setBounds(247, 170, 125, 44);

        frame.getContentPane().add(textArea_Info);

        //页面
        Qingming.addActionListener(new Qingming_menu());
        AboutItem.addActionListener(new AboutItemaction());
    }
    private static class __Tmp {
        private static void __tmp() {
            JPanel __wbp_panel = new JPanel();
        }
    }

    class Set_Skill_menu implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"初版问题：每次更换技能最好重启软件\n每次选择技能可能会弹窗多次 属于正常情况" +
                    "\n (8.5问题：)选择三星技能后请重新选择小技能来进行数据缓冲 直到弹窗");
            Mainframe.frame.getContentPane().removeAll();
            Mainframe.frame.getContentPane().repaint();

            JLabel Label_Choice = new JLabel("技能选择:");
            Label_Choice.setFont(new Font("宋体", Font.BOLD, 15));
            Label_Choice.setBounds(32, 38, 98, 32);

            frame.getContentPane().add(Label_Choice);



            frame.getContentPane().add(Label_Info);


            frame.getContentPane().add(textArea_Info);


            comboBox_skill.setFont(new Font("宋体", Font.PLAIN, 14));
            comboBox_skill.setBounds(140, 32, 248, 44);
            frame.getContentPane().add(comboBox_skill);
            is_threestar.setBounds(140, 80, 248, 32);
            frame.getContentPane().add(is_threestar);

            comboBox_skill.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent itemEvent) {
                    int index = comboBox_skill.getSelectedIndex()+1;
                    boolean is = is_threestar.isSelected();
                    Data.threestar = is;
                    Data.skill_loc = index;
                    if(is){
                        JOptionPane.showMessageDialog(null,"首选技能已经选择为" + index+"\n使用三星");
                    }else{
                        JOptionPane.showMessageDialog(null,"首选技能已经选择为" + index+"\n不使用三星");
                    }
                }

            });
        }
    }
    //点击菜单中的清明挂机
    class Qingming_menu implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Mainframe.frame.getContentPane().removeAll();
            Mainframe.frame.getContentPane().repaint();

            JLabel Label_Choice = new JLabel("模式选择:");
            Label_Choice.setFont(new Font("宋体", Font.BOLD, 15));
            Label_Choice.setBounds(32, 38, 98, 32);
            frame.getContentPane().add(Label_Choice);


            frame.getContentPane().add(Label_Info);


            frame.getContentPane().add(textArea_Info);


            comboBox.setFont(new Font("宋体", Font.PLAIN, 14));
            comboBox.setBounds(140, 32, 248, 44);
            frame.getContentPane().add(comboBox);
            String sm[] = {"仅占卜回魂","占卜回魂与三星","小技能+三星（优先打魂）"};
            for(int i=0;i<sm.length;i++) {
                comboBox.addItem(sm[i]);
            }


            frame.getContentPane().add(Button_Start);

            frame.getContentPane().add(Button_End);

            //选择
            Button_Start.addActionListener(new Start_Qingming());
            Button_End.addActionListener(new End_Qingming());
        }
    }





    class AboutItemaction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            About window = new About();
            window.frame.setVisible(true);
        }
    }

    public class About {

        private JFrame frame;

        public About() {
            initialize();
        }

        private void initialize() {
            frame = new JFrame();
            frame.setBounds(100, 100, 450, 300);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.getContentPane().setLayout(null);

            JLabel lblNewLabel = new JLabel("\u672C\u7A0B\u5E8F\u7531\u4E2A\u4EBA\u7F16\u5199\u5F00\u53D1 \u4F9B\u65E5\u5E38\u5B66\u4E60\u4EA4\u6D41\u4F7F\u7528\r\n");
            lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
            lblNewLabel.setFont(new Font("宋体", Font.BOLD, 15));
            lblNewLabel.setBounds(10, 34, 414, 24);
            frame.getContentPane().add(lblNewLabel);

            JLabel lblNewLabel_1 = new JLabel("\u7531\u4E8E\u65F6\u95F4\u6709\u9650 \u6280\u672F\u4E0D\u8DB3");
            lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
            lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 15));
            lblNewLabel_1.setBounds(10, 68, 414, 24);
            frame.getContentPane().add(lblNewLabel_1);

            JLabel lblNewLabel_1_1 = new JLabel("\u76EE\u524D\u7248\u672C\u529F\u80FD\u8F83\u5C11 \u4E14\u96BE\u514D\u5B58\u5728bug\r\n");
            lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
            lblNewLabel_1_1.setFont(new Font("宋体", Font.BOLD, 15));
            lblNewLabel_1_1.setBounds(10, 102, 414, 24);
            frame.getContentPane().add(lblNewLabel_1_1);

            JLabel lblNewLabel_1_1_1 = new JLabel("\u5982\u6709\u95EE\u9898 \u8BF7\u53CA\u65F6\u52A0\u7FA4 863983419");
            lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.TOP);
            lblNewLabel_1_1_1.setFont(new Font("宋体", Font.BOLD, 15));
            lblNewLabel_1_1_1.setBounds(10, 136, 414, 24);
            frame.getContentPane().add(lblNewLabel_1_1_1);
        }
    }






}





