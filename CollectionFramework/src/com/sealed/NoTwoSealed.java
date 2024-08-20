package com.sealed;

public sealed class NoTwoSealed  permits Sparroww,Peacockk,Piegeonn{

}
non-sealed class Sparroww extends NoTwoSealed{
	
}
final class Peacockk extends NoTwoSealed{
	
}
final class Piegeonn extends NoTwoSealed{
	//we cannot declare child as sealed
	//no class or interface in the same compilation unit 
	//declares more than one direct super class or direct super interface
}
sealed class Child permits Son{
	
}
non-sealed class Son extends Child{
	
}