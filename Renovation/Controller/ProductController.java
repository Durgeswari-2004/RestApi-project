package com.ex.Renovation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ex.Renovation.Model.Products;
import com.ex.Renovation.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@GetMapping("/show")
	public List<Products> showinfo()
	{
		return productService.getproducts();
	}
	@PostMapping("/post")
	public List<Products> putinfo(@RequestBody List<Products> products)
	{
		return productService.saveinfo(products);
	}
	@GetMapping("sort/{name}")
    public List<Products> getsortinfo(@PathVariable String name)
    {
   	 return productService.sortinfo(name);
    }
@GetMapping("paging/{pageno}/{pagesize}")
	public List<Products> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return productService.getbypage(pageno, pagesize);
	}
}