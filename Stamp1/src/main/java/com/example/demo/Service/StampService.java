package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Stamp;
import com.example.demo.Repository.StampRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StampService {

	private final StampRepository repository;
	
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
