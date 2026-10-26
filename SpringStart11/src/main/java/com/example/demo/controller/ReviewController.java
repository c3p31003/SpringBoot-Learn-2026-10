package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;
import com.example.demo.service.RegistService;

import lombok.RequiredArgsConstructor;

//↓コントローラーであることを示すアノテーション
@Controller
@RequiredArgsConstructor
public class ReviewController {
	
	private final RegistService service;

	//@Autowired
//	public ReviewController(RegistService service) {
//		this.service = service;
//	}



	//レビュー画面表示リクエスト
	@GetMapping("/show-review-form")
	public String showReviewForm(@ModelAttribute ReviewRegistForm form) {
		return "regist-review";
	}
	
	
	
	//レビュー画面表示リクエスト(確認画面からの戻り)
	@PostMapping("/show-review-form-ret")
	public String showReviewFormRet(@ModelAttribute ReviewRegistForm form){
		return "regist-review";
	
	}
	
	//レビュー登録リクエスト(登録画面より)
	@PostMapping("/regist-review")
		public String registReview(@Validated @ModelAttribute ReviewRegistForm form, BindingResult result) {
			System.out.println(form);
			if(result.hasErrors()) {
				return "regist-review";
			}
			return "confirm-regist-review";
	}
	
	//レビュー登録リクエスト(確認画面より)
	@PostMapping("/confirm-regist-review")
	public String confirmRegistReview(@Validated ReviewRegistForm form, BindingResult result, Model model) {
		//ここでform内容でDB登録処理を行う
		
		//RegistService service = new RegistServiceMock();
		String msg = service.regist();
		
		model.addAttribute("msg", msg);
		if(result.hasErrors()) {
			return "regist-review";
		}
		return "complete-regist-review";
		
	}

	
}

