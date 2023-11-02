package com.example.musicanalyzer.controllers;

import com.example.musicanalyzer.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
public class FileUploadController {

    @Autowired
    private FileService fileService;


    @GetMapping("/upload")
    public String showUploadForm(){
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Bitte wähle eine Datei zum Hochladen aus.");
            return "redirect:/upload";
        }

        try {
            fileService.saveFile(file);
            redirectAttributes.addFlashAttribute("message", "Datei erfolgreich hochgeladen: " + file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace(); // Im echten Projekt diesen Fehler loggen, aber was anderes finden, scheinbar keine gute Methode
            redirectAttributes.addFlashAttribute("message", "Fehler beim Hochladen der Datei. Bitte versuche es später erneut.");
        }

        return "redirect:/upload";
    }

}
