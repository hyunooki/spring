package com.yedam.app.di;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MapTest {

	@Test
	public void test1() {
		Map <String, String> map = new HashMap<>();
		List<Map<String,String>> list = new ArrayList<>();
		
		map.put("FIRST_NAME", "scott");
		map.put("LAST_NAME", "king");
		list.add(map);
		//만약 map key값이 같으면 덮어쓰니 다시 초기화를 진행 후 map에 담아준다.
		map=new HashMap<>();
		map.put("FIRST_NAME", "길동");
		map.put("LAST_NAME", "홍");
		list.add(map);
		
		list.forEach(name -> {
			System.out.println(name.get("FIRST_NAME"));
		});
		
	}
}
