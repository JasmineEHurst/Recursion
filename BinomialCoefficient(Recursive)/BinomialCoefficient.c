/*
 * BinomialCoefficient.c
 *
 *  Created on: Jul 9, 2016
 *      Author: Jazz
 */

#include <stdio.h>

int binomialCoefficient(int n, int k);

int main(){
	int n = 4, k = 2;
    printf("Coefficient of C(%d, %d) is %d ", n, k, binomialCoefficient(n, k));

    return 0;
}

int binomialCoefficient(int n, int k){

	/* Base cases */
	if(k == 0 || k == n)
		return 1;
	else{
		return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
	}

}

