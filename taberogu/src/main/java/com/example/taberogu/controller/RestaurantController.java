package com.example.taberogu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.taberogu.entity.Category;
import com.example.taberogu.entity.Restaurant;
import com.example.taberogu.repository.CategoryRepository;
import com.example.taberogu.repository.RestaurantRepository;

@Controller
@RequestMapping("/")
public class RestaurantController {
	@Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RestaurantRepository restaurantRepository; 
    
    @GetMapping
    public String index(@RequestParam(name = "categoryId", required = false) Integer categoryId, 
    		@RequestParam(name = "page", defaultValue = "0")int page,
    		@RequestParam(name = "size", defaultValue = "5")int size,
    		Model model) {
        // カテゴリーデータを取得
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);
        
     //検索条件が空なら検索を実行せずリストを返す
        Page<Restaurant>restaurantPage;
        if(categoryId == null) {
        	restaurantPage = Page.empty();
        }else {
        	Pageable pageable = PageRequest.of(page,size);
        	restaurantPage = restaurantRepository.findBycategory_id(categoryId, pageable);
        }
       
        model.addAttribute("restaurantPage", restaurantPage);
        model.addAttribute("restaurant", restaurantPage.getContent()); // 実際のデータ
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", restaurantPage.getTotalPages());

        return "index";
        
       
        
    }
    
    @GetMapping("/terms")
    public String showTerms() {
    	return "terms";
    }
    
    @GetMapping("/company")
    public String showCompany() {
    	return "company";
    }

    

}
