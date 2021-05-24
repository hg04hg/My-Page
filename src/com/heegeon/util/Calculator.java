package com.heegeon.util;

public class Calculator {

	public int add(int su1, int su2) {
		return su1 + su2;
	}

	public int minus(int su1, int su2) {
		return su1 - su2;
	}

	public int mul(int su1, int su2) {
		return su1 * su2;
	}

	public int div(int su1, int su2) {
		return su1 / su2;
	}
}

// static 키워드 사용할 수 있는 경우
// 매서드 안에서 멤버변수를 사용하지 않을 때

// static 키워드가 붙으면 프로그램 실행시 바로 사용 가능한 상태가 됨
// 프로그램 실행전에  static이 먼저 메모리에 올라옴

// static이 아닌 매서드들은 메모리에 올라가는 작업인 new하는 과정을 해야 사용할 수 있음