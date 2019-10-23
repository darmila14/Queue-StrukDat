

public class queue {

	private int head;
	private int tail;
	private int size;
	private String data[];
	public queue(int ukuran) {
		head =-1;
		tail=-1;
		size=ukuran;
		data= new String[size];
	System.out.println("Antrian lamaran kerja");	
		}
	public boolean isEmpty() {
		return tail==-1;
	}
	public boolean isFull() {
		return tail >= size-1;
	}
	public void add(String input) {
		if(isEmpty()) {
			data[++head]=input;
			tail++;
			System.out.println("antrian lamaran" +input+ " masuk");
		}else {
			if(isFull()) {
				System.out.println("antrian lamaran penuh");
			}else {
			data[++tail]=input;
			System.out.println("antrian lamaran" +input+ " masuk");
				}
	 
	}
	
	}
	public void remove() {
		if(isEmpty()) {
			System.out.println("antrian kosong");
		} else {
			String temp=data[head];
			for(int i=0;i<tail;i++) {
				data[i]=data[i+1];
				
			} tail--;
			System.out.println("antrian "+temp+ " keluar");
		}

	}
	public void infoqueue() {
		for(int i=0;i<=tail;i++) {
			System.out.println("antrian "+ i +" = " +data[i]);
		}
	}

		public static void main(String[] args) {
			queue a=  new queue(5);
			a.add(" 1");
			a.add(" 2");
			a.add(" 3");
			a.add(" 4");	
			a.add(" 5");
			a.add(" 6");
			a.infoqueue();
			a.remove();
			a.remove();
			a.infoqueue();
			a.remove();
			a.remove();
			a.remove();
			
			

		}




}
