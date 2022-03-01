package com.mps.binding;

public class Invoice {
		private String invoiceId;
		private String customerName;
		private String paidAmt;
		private String customerPhn;
		private String customerMail;
		public String getInvoiceId() {
			return invoiceId;
		}
		public void setInvoiceId(String invoiceId) {
			this.invoiceId = invoiceId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getPaidAmt() {
			return paidAmt;
		}
		public void setPaidAmt(String paidAmt) {
			this.paidAmt = paidAmt;
		}
		public String getCustomerPhn() {
			return customerPhn;
		}
		public void setCustomerPhn(String customerPhn) {
			this.customerPhn = customerPhn;
		}
		public String getCustomerMail() {
			return customerMail;
		}
		public void setCustomerMail(String customerMail) {
			this.customerMail = customerMail;
		}
		@Override
		public String toString() {
			return "Invoice [invoiceId=" + invoiceId + ", customerName=" + customerName + ", paidAmt=" + paidAmt
					+ ", customerPhn=" + customerPhn + ", customerMail=" + customerMail + "]";
		}
		
}
