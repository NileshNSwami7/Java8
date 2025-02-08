package Double_Colon_Operator;

class Sample{
	Sample(){
		System.out.println("Sample constructor expession and object creation.");
	}
}
interface interf{
	public Sample get();
}
public class Sampletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf i = ()->{
			Sample s = new Sample();
			return s;
		};
		Sample s = i.get();
	}

}
