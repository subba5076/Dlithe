ArrayList<Integer> al = new ArrayList<>();
Scanner sc = new Scanner(System.in);
int flag=0;
int times=sc.nextInt();
for(int x=0;x<times;x++) {
	int z= sc.nextInt();
	if(z<flag) {
		System.out.println(x);
		break;
	}else {
		flag=z;
		al.add(z);
	}

}
