#include <stdio.h>
int main(void) {
	int student[30] = {};
	int n = 0;
	for (int i = 1; i <= 28; i++) {
		scanf("%d", &n);
		student[n] = 1;
		
	}
	for (int j = 1; j <= 30; j++) {
		if (student[j] != 1) {
			printf("%d\n", j);
		}
	}

	return 0;
}