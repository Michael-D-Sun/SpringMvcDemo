package cn.michael.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class FileUploadController {
    @RequestMapping("/upload")
    public String fileupload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest req) throws IOException {
        String path = req.getRealPath("/");
        System.out.println(path);
        InputStream in= file.getInputStream();
        OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));
        int len = 0;
        byte[] buffer = new byte[400];
        while((len=in.read(buffer)) != -1){
            os.write(buffer,0, len);
        }
        os.close();
        in.close();

        return "/index.jsp";
    }
}
