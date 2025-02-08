package Lambda_expression;

interface StringLengths{
	public void slength(String str);
}
public class Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengths s = (str)-> System.out.println("Length of String:"+str.length());
		s.slength("Nilesh");
		s.slength("Length of this string");
	}

}
