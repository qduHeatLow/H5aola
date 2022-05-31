package Fuction;



import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.util.ByteArrayDataSource;
import java.io.IOException;
import java.util.Properties;


public class SendMail {
    public void sendMailDemo() throws Exception {
        //设置参数
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.host", "smtp.qq.com");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.debug", "true");

        //session连接
        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress("1442984671@qq.com"));
        message.addRecipients(Message.RecipientType.TO, "1442984671@qq.com");
        message.setSubject("挑战完成截图");

        // 文本部分
        MimeBodyPart textPart = new MimeBodyPart();
        textPart.setContent("挑战完成截图：<br><img src='cid:image'>",
                "text/html;charset=UTF-8");
        // 图片部分
        MimeBodyPart imagePart = new MimeBodyPart();
        // 图片读入
        DataHandler dh = new DataHandler(new FileDataSource(functions.getPath()+"screens\\1.jpg"));
        imagePart.setDataHandler(dh);
        imagePart.setContentID("image");

        // 将文本部分和图片部分合体
        MimeMultipart mpart = new MimeMultipart();
        mpart.addBodyPart(textPart);
        mpart.addBodyPart(imagePart);
        mpart.setSubType("related");

        //message设置内容和保存
        message.setContent(mpart);
        message.saveChanges();

        //邮件端口、连接和发送 最后关闭端口
        Transport transport=session.getTransport("smtp");
        transport.connect("1442984671@qq.com", "esgnnmgtrijrbaeh");
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}