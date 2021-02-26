package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import services.ProductService;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;


    @GetMapping
    public String showAll () {
        return "products";
    }

    @DeleteMapping("delete/{id}")
    public String deleteProductById (@PathVariable Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }


}
