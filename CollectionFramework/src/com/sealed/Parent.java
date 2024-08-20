package com.sealed;

public sealed class Parent  permits Sparrow,Peacock,Piegeon{

}
non-sealed class Sparrow extends Parent{
	
}
final class Peacock extends Parent{
	
}
non-sealed class Piegeon extends Parent{
	
}
