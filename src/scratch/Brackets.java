package scratch;

public class Brackets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean v = isValid("(}");
		System.out.println(v);
	}
	
	public static boolean isValid(String s) {

		int n = -1;
        while (s.length() != n) {
            n = s.length();
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        if (s.length() == 0) return true;
        else return false;
    }
	
	}



