package com.example.test10giugno;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;







@RestController
public class PaintingController {


    @Autowired
    PaintingRepository paintingRepository;




   // @GetMapping("/")
   // public List<Painting> printPainting() {
   //     return paintingRepository.findAll();
   // }
    
   
    


    @GetMapping("/")
    public String printPainting(Model model) {
        List<Painting> paintings=paintingRepository.findAll();
        model.addAttribute("paintings",  paintings);
        return "home";
    }

    
    @GetMapping("/add")
    public String addPainting(Model model){
    Painting painting= new Painting();
    model.addAttribute("painting", painting);
    return "add";}


    @PostMapping("/add")
    public String savePainting(Painting painting) {
        paintingRepository.save(painting);
        return "redirect:/";
    }
    
    
    @GetMapping("/{name}")
    public ResponseEntity<Painting> getPaintingByName(@PathVariable String nome,Long id) {
        Optional<Painting> painting = paintingRepository.findById(id);
        if (painting.isPresent()) {
            return ResponseEntity.ok(painting.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @GetMapping("/{year}")
    public ResponseEntity<Painting> getPaintingByyear(@PathVariable String year,Long id) {
        Optional<Painting> painting = paintingRepository.findById(id);
        if (painting.isPresent()) {
            return ResponseEntity.ok(painting.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
