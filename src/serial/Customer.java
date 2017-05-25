        package serial; 
		import java.io.Serializable;
		//import java.beans.Transient;

		public class Customer implements Serializable
		{
		      int id;
		      String name;
		 //String address;
		      transient String address;
		public Customer(int id, String name, String address)
		{
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", address=" + address
					+ "]";
		}


		


	}


