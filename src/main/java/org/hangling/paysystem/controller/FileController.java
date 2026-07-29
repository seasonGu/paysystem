package org.hangling.paysystem.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileController {

    @PostMapping("/upload")
    public String upload(String nickName, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickName);
        System.out.println(photo.getSize());
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        saveFile(photo, path);
        return "上传成功";
    }

    public void saveFile(MultipartFile f, String path) throws IOException {
        File fileDir = new File(path);
        if (!fileDir.exists()) {
            fileDir.mkdir();
        }
        File file = new File(path + f.getOriginalFilename());
        f.transferTo(file);
    }
}
