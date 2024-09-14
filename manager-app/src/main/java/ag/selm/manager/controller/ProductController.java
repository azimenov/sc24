package ag.selm.manager.controller;

import ag.selm.manager.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(("catalogue/products/{productId:\\d+}"))
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getProductList(Model model){
        model.addAttribute("products", productService.findAllProducts());
        return "catalogue/products/list";
    }

}
