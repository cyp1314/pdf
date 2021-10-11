package com.chen;

import com.chen.util.PdfUtilException;
import com.chen.util.SignUtil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class UtilTest {

    private static final int x = 500;
    private static final int y = 20;
    private static final float imgWidth = 50;
    private static final float imgHeight = 50;
    private static final float rotation = 25F;
//    private static final float rotation = 0F;

    /**
     * itext
     */

    public static void main(String[] args) {
        try (InputStream docIn = new FileInputStream("D:/iTextDemo/xxx.pdf");
             InputStream imgIn = new FileInputStream("D:/iTextDemo/sign.png");
             OutputStream out = new FileOutputStream("D:/iTextDemo/result.pdf")) {

            out.write(SignUtil.sign(docIn, imgIn, x, y, imgWidth, imgHeight, rotation,  1,3,5,7,9));
        } catch (Exception e) {
            throw new PdfUtilException(e.getMessage(), e);
        }
    }

}
