package bean;

public class paymentBean {
		private int payment_id;
		private int user_id;
		private int amount;
		private String payment_date;
		private String card_name;
		private int gateway_no;
		public int getPayment_id() {
			return payment_id;
		}
		public void setPayment_id(int payment_id) {
			this.payment_id = payment_id;
		}
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getPayment_date() {
			return payment_date;
		}
		public void setPayment_date(String payment_date) {
			this.payment_date = payment_date;
		}
		public String getCard_name() {
			return card_name;
		}
		public void setCard_name(String card_name) {
			this.card_name = card_name;
		}
		public int getGateway_no() {
			return gateway_no;
		}
		public void setGateway_no(int gateway_no) {
			this.gateway_no = gateway_no;
		}
		
	

}
