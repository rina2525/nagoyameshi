package com.example.taberogu.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.example.taberogu.entity.Category;

import lombok.Data;

@Data
public class RestaurantRegisterForm {
	
	private MultipartFile imageFile;
	
	@NotNull(message = "カテゴリーを選んでください")
	private Category category;
	
	@NotBlank(message = "店舗名を入力してください。")
	private String name;
	
	@NotBlank(message = "説明を入力してください。")
	private String description;
	
	@NotNull(message = "金額を入力してください。")
	@Min(value = 1, message = "店舗料金は1円以上に設定してください。")
	private Integer price;
	
	@NotBlank(message = "営業時間を入力してださい。")
	private String hours;
	
	@NotBlank(message = "郵便番号を入力してください。")
	private String postalcode;
	
	@NotBlank(message = "県名から入力してください。")
	private String address;
	
	@NotBlank(message = "電話番号を入力してください。")
	private String phonenumber;
	
	@NotBlank(message = "定休日を入力してください。")
	private String regularholiday;
	
}
