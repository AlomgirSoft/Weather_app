package com.example.weather_app2;

import com.google.gson.annotations.SerializedName;

public class Rain{

	@SerializedName("3h")
	private Object jsonMember3h;

	public void setJsonMember3h(Object jsonMember3h){
		this.jsonMember3h = jsonMember3h;
	}

	public Object getJsonMember3h(){
		return jsonMember3h;
	}

	@Override
 	public String toString(){
		return 
			"Rain{" + 
			"3h = '" + jsonMember3h + '\'' + 
			"}";
		}
}