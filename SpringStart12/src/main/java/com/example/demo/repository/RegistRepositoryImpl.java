package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Review;


@Repository
public class RegistRepositoryImpl implements RegistRepository {

	@Override
	public void add(Review review) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("登録しました！！！！！！");
		System.out.println(review);
	}

}
