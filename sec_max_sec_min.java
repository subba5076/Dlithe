int arr[]= {99,-5,4,980,34343434,-100};
int max,min;
int secmax=0,secmin=0;
if(arr[0]<arr[1]) {
	min=arr[0];
	max=arr[1];
}else {
	max=arr[0];
	min=arr[1];
	
}
for(int x =2;x<arr.length;x++) {
	if(arr[x]>max) {
		secmax=max;
		max=arr[x];
		
		
	}else if(arr[x]<min) {
		secmin=min;
		min=arr[x];
	}
}
System.out.println(max+"->Max");
System.out.println(min+"->min");
System.out.println(secmax+"->secMax");
System.out.println(secmin+"->secmin");
