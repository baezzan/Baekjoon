#include <stdio.h>
int main(void) {
	int n = 0;
	int res[41] = {};
	int rest;
	int cnt = 0;
	for (int i = 0; i < 10; i++) {
		scanf("%d", &n);
		rest = n % 42;
		res[rest] = 1;
		
	}
	for (int i = 0; i < 42; i++) {
		if (res[i] == 1) {
			cnt++;

		}
	}
	printf("%d", cnt);
}