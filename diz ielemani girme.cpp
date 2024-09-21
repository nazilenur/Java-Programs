#include<stdio.h>
#define a 5
main(){
	
	int dizi[a];
	
	for(int i=0;i<5;i++){
		printf("%d. dizi elemanini giriniz\n",i+1);
		scanf("%d",&dizi[i]);			
	}
	printf("dizinin 4.elemani su:%d",dizi[3]);
	

}
