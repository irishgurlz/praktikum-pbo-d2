/* Nama File            : FrekNilTabel.c */
/* Deskripsi            : Menampilkan elemen yang memiliki kemunculan lebih dari satu */
/* Pembuat              : Aniqah Nursabrina - 24060122120036 */
/* Tanggal pembuatan    : 13 Maret 2024*/

#include <stdlib.h>
#include <stdio.h>

int main(){
    int *T;
    int N;
    int count;
    int i;
    int j;
    
    printf("Masukkan N: ");
    scanf("%d", &N);
    if (N < 0) {
        printf("Masukan harus positif\n");
    }
    else {
        T = (int*)malloc(N * sizeof(int));
        for (i = 0; i < N; i++) {
            printf("Masukkan elemen array: ");
            scanf("%d", &T[i]);
        }
    }
    for (i=0;i<N;i++)
    {
        count = 1;
        if(T[i]!=0)
        {
        for (j=1;j<N;j++){
            if ((T[i] == T[j]) && (i != j)){
                count = count + 1;
                T[j] = 0;
            }
        } 
        if (count >= 2){
            printf ("%d", T[i]);
        }
        }
    } 
    return 0;
    
}