package com.example.demo;

public class GenericService {

	//ind/us/turk/
	private String tokenIdentifier;
	
	//Token id 11 for india, 12 for Turkey, 13 for Japan, 14 for USA
	private String tokenId;

	public String getTokenIdentifier() {
		return tokenIdentifier;
	}

	public void setTokenIdentifier(String tokenIdentifier) {
		this.tokenIdentifier = tokenIdentifier;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	
}
