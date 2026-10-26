package com.example.demo.mock;

import org.springframework.stereotype.Service;

import com.example.demo.service.RegistService;

@Service
public class RegistServiceMock implements RegistService {

	@Override
	public String regist() {
		// TODO 自動生成されたメソッド・スタブ
		return "テスト的に動きました";
	}

}
