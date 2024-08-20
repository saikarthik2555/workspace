package com.prg.sealedprgms;

public sealed  class PebbaPig extends DadPig permits GrandPig {
	@Override
	public void roll() {
		System.out.println("PebbaPig Rolling");
	}

}
