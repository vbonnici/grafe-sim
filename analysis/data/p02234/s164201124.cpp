#include<cstdio>
#include<cstring>

int r[105];
int c[105];
int cache[105][105];

int f(int a, int b){
	if(a==b)
		return 0;
	if(cache[a][b] == -1)
	{
		cache[a][b] = 1000000000; 
		for(int i = a; i<b; i++){
			int res = f(a,i) +f(i+1, b) +r[a]*c[i]*c[b];
			if(res<cache[a][b])
				cache[a][b] = res;
		}
	}
	return cache[a][b];
	
}

int  main(){
	int n;
	scanf("%d",&n);
	for(int i = 0; i<n; i++){
		scanf("%d %d",&r[i], &c[i]);	
	}
	memset(cache, -1, sizeof(cache));
	printf("%d\n",f(0,n-1));
}
