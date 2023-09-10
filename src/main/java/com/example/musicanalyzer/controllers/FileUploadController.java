package com.example.musicanalyzer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileUploadController {

    @GetMapping("/upload")
    public String showUploadForm(){
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
        //save file
        //...
        redirectAttributes.addFlashAttribute("message", "Datei erfolgreich hochgeladn: " + file.getOriginalFilename());
        return "redirect:/upload";
    }
}
