String x = "10501";
		char arr[] = new char[x.length()];
		arr=x.toCharArray();
		int first=0;
		String ans= "palindrome";
		int last=arr.length-1;
		while(first<last) {
			if(arr[first]!=arr[last]) {
				ans="not"+ans;
				break;
				
			}else {
				first++;
				last--;
				
			}
		}
		System.out.println(ans);
