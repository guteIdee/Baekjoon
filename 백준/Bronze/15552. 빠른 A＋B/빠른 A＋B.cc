#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int a, b, n;
	scanf("%d", &n);

	int sum = 0;

	for (int i = 0; i < n; i++)
	{
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}


	return 0;
}