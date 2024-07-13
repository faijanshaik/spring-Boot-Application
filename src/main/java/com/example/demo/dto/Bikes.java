package com.example.demo.dto;

	public class Bikes {
		public String bikeName;
		public String bikePrice;
		public String bikeModel;
		
		public Bikes() {
			
		}
		
		public Bikes(String bikeName, String bikePrice, String bikeModel) {
			super();
			this.bikeName = bikeName;
			this.bikePrice = bikePrice;
			this.bikeModel = bikeModel;
		}
		
		public String getBikeName() {
			return bikeName;
		}
		public void setBikeName(String bikeName) {
			this.bikeName = bikeName;
		}
		public String getBikePrice() {
			return bikePrice;
		}
		public void setBikePrice(String bikePrice) {
			this.bikePrice = bikePrice;
		}
		public String getBikeModel() {
			return bikeModel;
		}
		public void setBikeModel(String bikeModel) {
			this.bikeModel = bikeModel;
		}
		
		

	}

