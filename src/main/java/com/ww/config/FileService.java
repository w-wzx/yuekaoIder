package com.ww.config;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.OutputStream;

public class FileService {

    public static void downLoad(HttpServletResponse response, HttpServletRequest request){
        OutputStream output = null;
        FileInputStream input = null;
        try {
            output = response.getOutputStream();
            String str = request.getParameter("fileName");//pic2.png
            if (StringUtils.isEmpty(str)) {
                return;
            }
            str = "D://pic//" + str;
            //biye[] -->InputStream-->out
            input = new FileInputStream(str);//D:\temp\pic2.png
            int actual = 0;
            byte[] b = new byte[1024];
            while ((actual = input.read(b)) > 0) {
                output.write(b, 0, actual);
            }
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
