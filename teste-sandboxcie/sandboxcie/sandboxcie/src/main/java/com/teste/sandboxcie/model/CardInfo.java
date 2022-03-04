package com.teste.sandboxcie.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardInfo {
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("Provider")
	private String provider;
	
	@JsonProperty("CardType")
	private String cardType;
	
	@JsonProperty("ForeignCard")
	private String foreignCard;
	
	@JsonProperty("CorporateCard")
	private String corporateCard;
	
	@JsonProperty("Issuer")
	private String issuer;
	
	@JsonProperty("IssuerCode")
	private String issuerCode;

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getForeignCard() {
		return foreignCard;
	}

	public void setForeignCard(String foreignCard) {
		this.foreignCard = foreignCard;
	}

	public String getCorporateCard() {
		return corporateCard;
	}

	public void setCorporateCard(String corporateCard) {
		this.corporateCard = corporateCard;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuerCode() {
		return issuerCode;
	}

	public void setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
	}
		
//	{
//	    "Status": "00",
//	    "Provider": "VISA",
//	    "CardType": "Multiplo",
//	    "ForeignCard": false,
//	    "CorporateCard": false,
//	    "Issuer": "Bradesco",
//	    "IssuerCode": "237"
//	}
	

}
