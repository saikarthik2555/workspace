package com.practise;

 class Player extends Object{
	int playerId;
	String playerName;
	public Player(){
		super();
		this.playerId=13;
		System.out.println("I am second");
	}
	{
		this.playerId=12;
		this.playerName="Jadeja";
		System.out.println("I am First : Instance block");
	}
	public Player(int id,String name) {
		this.playerId=id;
		this.playerName=name;
		return ;
	}
	public String getPlayerDetails() {
		return playerId+" "+playerName;
	}

	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
	

}
