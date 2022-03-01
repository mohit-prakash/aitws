package com.mps.binding;

public class Products {
		private Integer productId;
		private String productName;
		private String productCost;
		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductCost() {
			return productCost;
		}
		public void setProductCost(String productCost) {
			this.productCost = productCost;
		}
		@Override
		public String toString() {
			return "Products [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
					+ "]";
		}
		
}
