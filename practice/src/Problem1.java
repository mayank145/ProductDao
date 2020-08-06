
class Problem1{
	
		public int solution(String S, int K) {
			if(K<1)
				return -1;
			String words[] = S.split(" ");
			int count = 0;
			int splits = 1;
			for (int i = 0; i < words.length; i++) {
				if(words[i].length() > K)
					return -1;
				count += words[i].length();
				if(count >= K) {
					splits++;
					count = words[i].length();
				}
			}
			return splits;
		}
		public static void main(String[] args) {
			System.out.println(new Problem1().solution("SMS messages are really short", 12));
			System.out.println(new Problem1().solution("Hello", 1));
			System.out.println(new Problem1().solution("Hello", 2));
			System.out.println(new Problem1().solution("Hello", 5));
			System.out.println(new Problem1().solution("Hello Everyone welcome to India", 12));
			System.out.println(new Problem1().solution("Hello Everyone", 8));
			  
	}
}