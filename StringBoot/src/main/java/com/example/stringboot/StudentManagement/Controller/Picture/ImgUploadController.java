//package com.example.stringboot.StudentManagement.Controller.Picture;
//
//
//import org.springframework.core.io.ByteArrayResource;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//@Controller
//public class ImgUploadController {
//    @RequestMapping(value = "getimage/{photo}",method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<ByteArrayResource> getImage(@PathVariable("photo") String photo){
//        if (!photo.equals("")|| photo != null){
//            try {
//                Path filename = Paths.get("uploads",photo);
//                byte[] buffer = Files.readAllBytes(filename);
//                ByteArrayResource byteArrayResource = new ByteArrayResource(buffer);
//                return ResponseEntity.ok()
//                        .contentLength(buffer.length)
//                        .contentType(MediaType.parseMediaType("image/png"))
//                        .body(byteArrayResource);
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return ResponseEntity.badRequest().build();
//    }
//
//
//}
