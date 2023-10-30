package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {
	    @Autowired
	    @Qualifier("ad1")
		private Address ad;

		public Address getAd() {
			return ad;
		}

		public void setAd(Address ad) {
			this.ad = ad;
		}

		@Override
		public String toString() {
			return "Emp [ad=" + ad + "]";
		}
		
		public Emp1(Address ad) {
			super();
			this.ad = ad;
		}

		public Emp1() {
			super();
			// TODO Auto-generated constructor stub
		}

	}

