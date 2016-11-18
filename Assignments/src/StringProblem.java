import org.testng.Assert;

public class StringProblem {
	public static String removeCharacter(String s, char ch) {
		StringBuilder sb = new StringBuilder();
		for(char c:s.toCharArray()) {
			if(ch!=c) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String removeCharacter2(String s, char ch) {
		return s.replaceAll(String.valueOf(ch), "");
	}

	public static void main(String args[]) {
		Assert.assertEquals(removeCharacter("Apple", 'p'), "Ale");
		Assert.assertEquals(removeCharacter("Apple", 'A'), "pple");
		Assert.assertEquals(removeCharacter("Apple", 'e'), "Appl");
		Assert.assertEquals(removeCharacter("Apple", 'P'), "Apple");
		Assert.assertEquals(removeCharacter("Apple", ' '), "Apple");
		Assert.assertEquals(removeCharacter("", ' '), "");
		Assert.assertEquals(removeCharacter("Ap ple ", 'p'), "A le ");
		Assert.assertEquals(removeCharacter("Apple16", '1'), "Apple6");

		Assert.assertEquals(removeCharacter2("Apple", 'p'), "Ale");
		Assert.assertEquals(removeCharacter2("Apple", 'A'), "pple");
		Assert.assertEquals(removeCharacter2("Apple", 'e'), "Appl");
		Assert.assertEquals(removeCharacter2("Apple", 'P'), "Apple");
		Assert.assertEquals(removeCharacter2("Apple", ' '), "Apple");
		Assert.assertEquals(removeCharacter2("", ' '), "");
		Assert.assertEquals(removeCharacter2("Ap ple ", 'p'), "A le ");
		Assert.assertEquals(removeCharacter2("Apple16", '1'), "Apple6");
	}
}


