package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Stamp {
	/**
	 * フィールにアノテーションを付けることでどういう制約がある
	 * 絡むなのか定義できる。
	 * Idアノテーションで主キーであること、
	 * GeneratedValueアノテーションで自動採番することを示している。
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * こちらはNotNullでnullではないこと、Sizeで
	 * 最大文字が255文字であることを示している。
	 */
	@NotNull
	@Size(max=255)
	private String title;
}
