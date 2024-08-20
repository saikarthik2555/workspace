package com.prg.annonymous_innerclass;

class Test {
	public static void main(String[] args) {
		Get g=new Get() {
			@Override
			public void show() {
				System.out.println("see the data");
			}
		};
		g.show();
	}
}
