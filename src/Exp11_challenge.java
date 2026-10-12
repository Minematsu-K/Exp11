
public class Exp11_challenge {

	public static void main(String[] args) {
		LiveReservation reserve=new LiveReservation();
		
		reserve.reserve();
		reserve.reserve("あおい");
		reserve.reserve(205);
		reserve.reserve("れん", 3);
		reserve.reserve(2, "みさき");
		System.out.println();
		reserve.showTotal();
	}

}
