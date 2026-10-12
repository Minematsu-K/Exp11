
public class LiveReservation {
	int totalGuests=0;
	
	void reserve() {
		totalGuests++;
		System.out.println("当日券を1名分予約しました");
	}
	
	void reserve(String guestName) {
		totalGuests++;
		System.out.println(guestName+"さんのチケットを1名分予約しました");
	}
	
	void reserve(int memberNumber) {
		totalGuests++;
		System.out.println("ファンクラブ会員番号"+memberNumber+"のチケットを1名分予約しました");
	}
	
	void reserve(String guestName,int people) {
		totalGuests+=people;
		System.out.println(guestName+"さんのチケットを"+people+"名分予約しました");
	}
	
	void reserve (int people, String guestName) {
		totalGuests+=people;
		System.out.println(guestName+"さんのチケットを"+people+"名分予約しました");
	}
	
	void showTotal() {
		System.out.println("現在の予約人数："+totalGuests+"名");
	}
}
