package libros.demo.com_tuuniversidad_controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import libros.demo.com_tuuniversidad_models.Libro;
import libros.demo.com_tuuniversidad_service.LibroService;

@RestController
public class LibroController {

    //@Autowired
    //private LibroRepositoryImpl LibroRepository;

    @Autowired
    private LibroService libroService;

    @RequestMapping("/libros")
    public List<Libro> getLibros() {
        return libroService.getLibros();
    }

    @GetMapping("libros/{id}")
    public Libro getLibro(@PathVariable int id) {
        Libro libro = libroService.getLibro(id);
        return libro;
    }

    @PostMapping("libros/crearlibros")
    public void postLibro(@RequestBody Libro libro) {
        libroService.postLibro(libro);
    }
    
    
}
