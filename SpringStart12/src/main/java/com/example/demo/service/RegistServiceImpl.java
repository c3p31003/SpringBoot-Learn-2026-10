package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Review;
import com.example.demo.repository.RegistRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService {

	private final RegistRepository repository;
	
	@Override
	public void regist(Review review) {
		// TODO 自動生成されたメソッド・スタブ
		repository.add(review);
	}

}
