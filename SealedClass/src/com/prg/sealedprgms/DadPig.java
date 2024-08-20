package com.prg.sealedprgms;

public sealed class DadPig permits PebbaPig,GeorgePig{
	public void roll() {
		System.out.println("DadPig Rolling ");
	}

}
