package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Stamp;
import com.example.demo.repository.MainRepository;

import lombok.RequiredArgsConstructor;

/**
 * ビジネスロジックを記述するクラス。
 * ServiceからRepositoryを使うようにする。
 */
@Service
@RequiredArgsConstructor
public class MainService {

	private final MainRepository repository;
	
	/**
	 * 入力したタイトルを書籍データベースに登録する。
	 * @param title
	 */
	public void save(String title) {
		Stamp stamp = new Stamp();
		stamp.setTitle(title);
		this.repository.save(stamp);
	}
	
	/**
	 * すべての書籍データを返す
	 * @return 書籍データ
	 */
	public List<Stamp> findAll(){
		return this.repository.findAll();
	}
}
