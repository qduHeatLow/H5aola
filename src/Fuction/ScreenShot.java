package Fuction;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public void screeShot(){
        try {
            //获取电脑屏幕的大小
            Toolkit tk=Toolkit.getDefaultToolkit();
            //屏幕
            Dimension ds=tk.getScreenSize();
            int height=(int) ds.getHeight();
            int width=(int) ds.getWidth();
            //拷贝屏幕到一个BufferedImage对象bi中
            Robot robot = new Robot();
            BufferedImage bi=robot.createScreenCapture(new Rectangle(width, height));
            //将bi对象写入图像文件中，并保存到磁盘上
            ImageIO.write(bi, "jpg",new File(functions.getPath()+"screens\\1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
